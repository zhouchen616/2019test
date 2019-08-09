package com.holyrobot.con_product.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_common.mapper.CommFileMapper;
import com.holyrobot.con_common.mapper.CommParameterMapper;
import com.holyrobot.con_common.mapper.CrmAccountMrgMapper;
import com.holyrobot.con_common.mapper.CrmAccountMrgUserMapper;
import com.holyrobot.con_common.pojo.*;
import com.holyrobot.con_common.server.CommNationalityService;
import com.holyrobot.con_fin.mapper.FinOrderCostPaidMapper;
import com.holyrobot.con_order.mapper.*;
import com.holyrobot.con_order.pojo.*;
import com.holyrobot.con_order.server.BusinessService;
import com.holyrobot.con_order.server.OrdOrderInfoService;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.con_res.mapper.ResBusProductMapper;
import com.holyrobot.con_res.mapper.ResFlightProductMapper;
import com.holyrobot.con_res.mapper.ResShipProductMapper;
import com.holyrobot.con_res.mapper.ResTrainProductMapper;
import com.holyrobot.con_res.pojo.*;
import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.*;
import com.holyrobot.con_product.mapper.*;
import com.holyrobot.con_product.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_product.server.*;
import com.holyrobot.util.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 周陈
 * @Title: 外发产品服务类
 * @date 2018/12/4 14:01
 */
@Service
@Slf4j
public class ProProductDepartureServiceImpl implements ProProductDepartureService {

    @Autowired
    private ProProductDepartureMapper proProductDepartureMapper;
    @Autowired
    ProTourMapper tourMapper;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
    @Autowired
    private OrdOrderinfoMapper ordOrderInfoMapper;
    @Autowired
    private ProProductMapper proProductMapper;
    @Autowired
    private ProTourMapper proTourMapper;
    @Autowired
    private OrdOrderTouristMapper ordOrderTouristMapper;
    @Autowired
    private ProTourPricepolicyMapper proTourPricePolicyMapper;
    @Autowired
    private ProProductDestinationMapper proProductDestinationMapper;
    @Autowired
    private OrdOrderPriceMapper ordOrderPriceMapper;
    @Autowired
    private OrdOrderLogMapper ordOrderLogMapper;
    @Autowired
    private CrmAccountMrgUserMapper crmAccountMrgUserMapper;
    @Autowired
    private CommParameterMapper commParameterMapper;
    @Autowired
    private ProTourVenueMapper proTourVenueMapper;
    @Autowired
    private CrmAccountMrgMapper crmAccountMrgMapper;
    @Autowired
    private CommFileMapper commFileMapper;
    @Autowired
    private FinOrderCostPaidMapper finOrderCostPaidMapper;
    @Autowired
    private OrdPaymentRequestMapper ordPaymentRequestMapper;
    @Autowired
    private OrdPaymentRequestFileMapper ordPaymentRequestFileMapper;
    @Autowired
    private OrdPaymentRequestItemMapper ordPaymentRequestItemMapper;
    @Autowired
    private OrdOrderTouristImgMapper ordOrderTouristImgMapper;
    @Autowired
    private OrdOrderCollectionMapper ordOrderCollectionMapper;
    @Autowired
    private ProTourTrafficMapper proTourTrafficMapper;
    @Autowired
    private OrdOrderTrainMapper ordOrderTrainMapper;
    @Autowired
    private OrdOrderFlightMapper ordOrderFlightMapper;
    @Autowired
    private OrdOrderBusMapper ordOrderBusMapper;
    @Autowired
    private OrdOrderShipMapper ordOrderShipMapper;
    @Autowired
    private ResFlightProductMapper resFlightProductMapper;
    @Autowired
    private ResBusProductMapper resBusProductMapper;
    @Autowired
    private ResShipProductMapper resShipProductMapper;
    @Autowired
    private ResTrainProductMapper resTrainProductMapper;
    @Autowired
    RedisClient jedisService;
    @Autowired
    private ProTourTrafficService proTourTrafficService;
    @Autowired
    private OrdOrderInfoService ordOrderInfoService;
    @Autowired
    private ProProductDirectSalesItemMapper productDirectSalesItemMapper;
    @Autowired
    private ProProductDirectSalesProductMapper proProductDirectSalesProductMapper;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private CommNationalityService commNationalityService;
    @Autowired
    private ProProductDirectSalesMapper proProductDirectSalesMapper;
    @Autowired
    private ProProductDirectVenueMapper proProductDirectVenueMapper;
    @Autowired
    private OrgInfoService orgInfoService;

    @Value("${airPortUrl.getUserUrl}")
    private String getUserUrl;
    @Value("${JWrouteTypeId}")
    private String jw;
    @Value("${CXrouteTypeId}")
    private String cx;
    @Value("${DXrouteTypeId}")
    private String dx;
    @Value("${airPortUrl.getOrgInfoUrl}")
    private String orgInfoUrl;
    @Value("${airPortUrl.getOrgInfoUrl}")
    private String getOrgInfoUrl;
    @Value("${airPortUrl.getDept}")
    private String getDept;
    /**
     　　* @Description: 查询外发次数
     　　* @author 周陈
     　　* @date 2019/2/22 16:02
     　　*/
    public int getProdutOuterTimes(String proId,String receiverID){
        return proProductDirectSalesProductMapper.selectProdutOuterTimes(proId, receiverID);
    }
    @Override
    public ProductDetailPriceDto findDeparturePrice(String proId, String siteId, Integer userType, String orgId) {
        ProProductDeparturePriceDto departurePrice = proProductDepartureMapper.findDeparturePrice(proId, siteId, orgId);
        if (userType == 1) {
            //设置现价等于原价
            //B端
            return new ProductDetailPriceDto(departurePrice.getSalesPrice(), departurePrice.getSalesPrice());
        } else if (userType == 2) {
            return new ProductDetailPriceDto(departurePrice.getDirectPrice(), departurePrice.getDirectPrice());
        }
        //C端
        return new ProductDetailPriceDto(new BigDecimal(0), new BigDecimal(0));
    }

    /**
     * 　　* @Description: 外发产品团期查询
     * 　　* @author 周陈
     * 　　* @date 2018/12/4 21:13
     */
    @Override
    public Response getTourList(String siteId, String proId, String orgId, int userType) {
        //获取当前日期后四个月
        List<String> dateList = DateUtil.getCalendarMonth("yyyy-MM", new Date(), 4);
        //查询4个月的团期
/*       此方法实现了一次查询四个月团期，但是当月最小价格无法返回，所以放弃
        List<TourBo> tourBos = proProductDepartureMapper.selectTourListAll(dateList, proId, siteId);*/
        List<Map<String, Object>> returnList = new ArrayList<>();
        for (String date : dateList) {
            Map<String, Object> tourBoMap = new HashMap<>();
            List<TourBo> listTours = proProductDepartureMapper.selectTourList(date, proId, siteId, orgId);
            //TODO BUG：后期如果出现一天有两个团期，需要进行去重处理
            Map<Date, List<TourBo>> collect = listTours.stream().collect(Collectors.groupingBy(TourBo::getTourDate));
            List<TourBo> distinctTours = new ArrayList<>();
            if(userType == 2){
                for (List<TourBo> tourBoList : collect.values()) {
                    if (tourBoList.size() > 1) {
                        List<TourBo> collect1 = tourBoList.stream().sorted(Comparator.comparing(TourBo::getDirectPrice)).collect(Collectors.toList());
                        collect1.get(0).setIsMore(1);
                        distinctTours.add(collect1.get(0));
                    } else {
                        tourBoList.get(0).setIsMore(0);
                        distinctTours.add(tourBoList.get(0));
                    }
                }
            }else {
                for (List<TourBo> tourBoList : collect.values()) {
                    if (tourBoList.size() > 1) {
                        List<TourBo> collect1 = tourBoList.stream().sorted(Comparator.comparing(TourBo::getSalesPrice)).collect(Collectors.toList());
                        collect1.get(0).setIsMore(1);
                        distinctTours.add(collect1.get(0));
                    } else {
                        tourBoList.get(0).setIsMore(0);
                        distinctTours.add(tourBoList.get(0));
                    }
                }
            }

            tourBoMap.put("month", date);
            BigDecimal minPrice = new BigDecimal(0);
            //按照月分销价价格排序
            List<TourBo> salesPriceCollect = distinctTours.stream().sorted(Comparator.comparing(TourBo::getSalesPrice)).collect(Collectors.toList());
            //获取当前月分销价最小的价格
            if (salesPriceCollect.size() > 0) {
                minPrice = salesPriceCollect.get(0).getSalesPrice();
            }
            //设置月分销价最小价格
            tourBoMap.put("minSalePrice", minPrice);
            //按照月直客价格排序
            List<TourBo> directPriceCollect = distinctTours.stream().sorted(Comparator.comparing(TourBo::getDirectPrice)).collect(Collectors.toList());
            //获取当月直客价最小的价格
            if (directPriceCollect.size() > 0) {
                minPrice = directPriceCollect.get(0).getDirectPrice();
            }
            //设置月直客价最小价格
            tourBoMap.put("minDirectPrice", minPrice);
            if (distinctTours.size() == 0) {
                tourBoMap.put("tourList", null);
            } else {
                tourBoMap.put("tourList", distinctTours.stream()//按时间排序
                        .sorted(Comparator.comparing(TourBo::getTourDate))
                        .collect(Collectors.toList()));
            }
            returnList.add(tourBoMap);
        }
        List<TourBo> tourBos = ProTourServiceImpl.getTop7Tours(returnList);
        return new Response().success(new TourInfoDto(tourBos, returnList));
    }

    @Override
    public Response getProductPriceList(String tourDate, String siteId, String tourId, String orgId) {
        List<TourInfoVo> tourInfoVoList = new ArrayList<>();
        ProTour proTour = tourMapper.selectByPrimaryKey(tourId);
        //业务返回对象
        TourInfoVo tourInfoVo = new TourInfoVo();
        //团期的部分数据设置到返回值中
        TourBo tourBo = new TourBo();

        tourBo.setId(proTour.getId());
        tourBo.setTourDate(proTour.getTourdate());
        tourBo.setTourName(proTour.getTourname());
        tourBo.setDueDate(proTour.getDuedate());
        tourBo.setTourNo(proTour.getTourno());
        tourInfoVo.setTourInfo(tourBo);

        //开始获取 外发产品-团次价格策略
        List<TourPricePolicyBo> listPricePolicy = proProductDepartureMapper.listPricePolicy(tourId, siteId, orgId);
        int j = 0;
        if (Objects.nonNull(listPricePolicy) && !listPricePolicy.isEmpty()) {
            for (int i = 0; i < listPricePolicy.size(); i++) {
                if (listPricePolicy.get(i).isDef()) {//设置团期的默认价格
                    tourInfoVo.setTourPrice(listPricePolicy.get(i).getSalesPrice());
                }
                if (listPricePolicy.get(i).isDef() && i != 0) {
                    j = i;
                }
            }
        }
        TourPricePolicyBo tourPricePolicyBo = listPricePolicy.get(j);
        listPricePolicy.remove(j);
        listPricePolicy.add(0, tourPricePolicyBo);
        if (StringUtils.isBlank(tourDate)) {
            tourInfoVo.setPricePolicyList(null);
        } else {
            tourInfoVo.setPricePolicyList(listPricePolicy);
        }
        tourInfoVoList.add(tourInfoVo);
        return new Response().success(tourInfoVoList);
    }

    @Override
    @Transactional
    public Response addOrderInfo(JSONObject json, HttpServletRequest request) {

        OrdOrderinfo orderInfo = new OrdOrderinfo();
        String proid = json.getString("proid");//获取产品id
        String tourid = json.getString("tourid");//获取团次id
        String policyid = json.getString("policyid");//价格策略id
        String num = json.getString("num");//价格策略对应人数
        String departure = json.getString("departure");//出发地
        String nameList = json.getString("nameList");//旅客名
        String codeList = json.getString("codeList");//旅客证件号
        String telList = json.getString("telList");//旅客电话
        JSONArray telList1 = json.getJSONArray("telList");
        List<String> telList2 = telList1.toJavaList(String.class);
        String mainTel = json.getString("mainTel");//联系人电话
        String mainName = json.getString("mainName");//联系人姓名
        String pidList = json.getString("policyList");//游客对应价格策略
        String remark = json.getString("remark");//联系人备注
        String sexList = json.getString("sexList");//旅客性别
        String cardList = json.getString("cardtypeList");//旅客证件类型
        String venList = json.getString("venueidList");//旅客接送地点id
        String totalprice = json.getString("totalprice");//订单价格
        String siteid = json.getString("siteid");//站点id
        String imgUrl = json.getString("tourImgs");//h5 游客信息图片上传
        String isSingleRoom = json.getString("isSingleRoom");//游客是否选择单房差， 约定 1是 ， 2否
        String ageList = json.getString("ageList");//年龄
        Boolean isUseDiscount = json.getBoolean("useDiscount"); //是否有优惠
        String userName = json.getString("userName");//销售人员名称
        String iD = json.getString("iD");//销售人员Id
        String orgId = json.getString("orgId");//销售人员Id
        String deptID = json.getString("deptID");//销售人员部门ID
        String deptName = json.getString("deptName");//销售人员部门名称
        if (StringUtils.isBlank(nameList) && StringUtils.isBlank(imgUrl)) {
            return new Response().failure("游客信息未上传！");
        }
        if (StringUtils.isBlank(policyid)) {
            return new Response().failure("价格策略信息未上传！");
        }
        String directSalesSendId = json.getString("directSalesSendId");//外发产品发送人id
        //设置外放产品外发人id
//        orderInfo.setDirectSalesSendId(directSalesSendId);

        String[] policyidList = policyid.substring(1, policyid.length() - 1).trim().split(", ");//价格策略id
        String[] spiltNumList = num.substring(1, num.length() - 1).trim().split(", ");         //拆分价格策略对应的人数

        //        下单页面新增国籍、英语姓名等
        String englishSurnameList = json.getString("englishSurnameList");//英语 姓
        String englishNameList = json.getString("englishNameList");//英语 名
        String nationalityNameList = json.getString("nationalityNameList");//国籍
        JSONArray dateOfBirthList = json.getJSONArray("dateOfBirthList");//生日

        //计算成人儿童数量
        int adultNum = 0;
        int childNum = 0;
        for (int i = 0; i < policyidList.length; i++) {
            ProProductDirectSalesItem proTourPricePolicy = productDirectSalesItemMapper.selectByPrimaryKey(policyidList[i].toUpperCase());
            if (Objects.nonNull(proTourPricePolicy) && proTourPricePolicy.getTouristtype() == 1) {
                adultNum += Integer.parseInt(spiltNumList[i]);
            }
            if (Objects.nonNull(proTourPricePolicy) && proTourPricePolicy.getTouristtype() == 2) {
                childNum += Integer.parseInt(spiltNumList[i]);
            }
        }
        //当前登录人信息
        WxUser wxUser = (WxUser) request.getSession().getAttribute("wxUserInfo");
        Integer userType = wxUser.getUserType();
        log.info("当前登录人信息:{}", wxUser);
        log.info("当前登录人信息toString:{}", JSONObject.toJSONString(wxUser));
        //查外发产品相关属性
        ProProductDirectSalesProduct proProductDirectSalesProduct = null;
        ProProductDirectSalesProductExample example2 = new ProProductDirectSalesProductExample();
        example2.or().andProidEqualTo(proid).andReceiveridEqualTo(orgId);;
        List<ProProductDirectSalesProduct> proProductDirectSalesProducts = proProductDirectSalesProductMapper.selectByExample(example2);
        if (proProductDirectSalesProducts != null && proProductDirectSalesProducts.size() > 0) {
            proProductDirectSalesProduct = proProductDirectSalesProducts.get(0);
        } else {
            log.error("外发产品查询异常，产品Id={}", proid);
            proProductDirectSalesProduct = new ProProductDirectSalesProduct();
            proProductDirectSalesProduct.setSuppliercityid(Constants.UUID_DEFAULT);
            proProductDirectSalesProduct.setReceivername("暂无");
            proProductDirectSalesProduct.setReceiverid(Constants.UUID_DEFAULT);
        }

        //根据产品id查询产品信息
        ProProduct product = proProductMapper.selectByPrimaryKey(proid);
        //根据团次ID查询团次
        ProTour proTour = proTourMapper.selectByPrimaryKey(tourid);
        //查询目的地id
        ProProductDestinationExample example = new ProProductDestinationExample();
        example.or().andProidEqualTo(proid);
        List<ProProductDestination> proProductDestinations = proProductDestinationMapper.selectByExample(example);
        //回团日期计算
        Calendar cl = Calendar.getInstance();
        Date date = proTour.getTourdate();
        cl.setTime(date);
        cl.add(Calendar.DATE, product.getTourdays() - 1);
        Date time = cl.getTime();
        //生成订单编号
        String orderNo = businessService.getOrderNumber(proTour.getTourdate());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
//        if (cx.equals(product.getProcategoryid())) {
//            orderNo = "CX" + simpleDateFormat.format(proTour.getTourdate()) + "0" + product.getTourdays() + RandomStringUtils.randomNumeric(4);
//            ;
//        }
//        if (jw.equals(product.getProcategoryid())) {
//            orderNo = "JW" + simpleDateFormat.format(proTour.getTourdate()) + "0" + product.getTourdays() + RandomStringUtils.randomNumeric(4);
//            ;
//        }
//        if (dx.equals(product.getProcategoryid())) {
//            orderNo = "DX" + simpleDateFormat.format(proTour.getTourdate()) + "0" + product.getTourdays() + RandomStringUtils.randomNumeric(4);
//            ;
//        }
        log.info("订单编号:{}", orderNo);
        //查询出发地id
        ProProductDepartureExample example1 = new ProProductDepartureExample();
        example1.or().andProidEqualTo(proid).andSiteidEqualTo(siteid).andDepartureEqualTo(departure);
        List<ProProductDeparture> departures = proProductDepartureMapper.selectByExample(example1);
        String departureId = null;
        if (Objects.nonNull(departures) && !departures.isEmpty()) {
            departureId = departures.get(0).getDepartureid();
        }

        String ordid = UUID.randomUUID().toString();
        try {
            //订单信息存储
            orderInfo.setId(ordid);//生成主键ID
            orderInfo.setRouteid(proid);//行程ID（暂未有表）可为空
            orderInfo.setTourid(proTour.getId());//团次ID
            orderInfo.setOrdername(product.getAliasename());//订单名称
            orderInfo.setScheduledays(product.getTourdays());//行程的总天数
//            orderInfo.setCategory(4);//1，商城采购2.内部下单3.手工录入4.微店直客 5微店erp用户
            orderInfo.setOrdertype(1);//订单类型（团队、散客、单项业务的订单）
            orderInfo.setTourdate(proTour.getTourdate());//出团日期
            orderInfo.setReturndate(time);//回团日期
            orderInfo.setDepname(departure);//出发地
            orderInfo.setDestname(product.getDestination());//目的地
            if (Objects.nonNull(proProductDestinations) && !proProductDestinations.isEmpty()) {
                orderInfo.setDestid(proProductDestinations.get(0).getDestinationid());//目的地id
            }
            orderInfo.setOrderno(orderNo);//订单编号

//			orderInfo.setOrdersourceid(UUID.randomUUID().toString());//订单来源ID 暂时为空
//			orderInfo.setOrdersource("");//暂时为空
            orderInfo.setContact(mainName);//联系人
            orderInfo.setMobile(mainTel);//联系人手机号
//			orderInfo.setEmail("");//obp订单无联系人邮箱 ， h5微商城有
            orderInfo.setHastraffic(proTour.getHastraffic());//是否含有机票
            orderInfo.setAdjustamt(new BigDecimal(0));//调整金额
            orderInfo.setPayableamt(new BigDecimal(totalprice));//应付金额

            orderInfo.setReceivableamt(new BigDecimal(0));//应收金额
            orderInfo.setAdultnum(adultNum);//成人数量
            orderInfo.setChildnum(childNum);//儿童数量
//			orderInfo.setGuidenum();//全陪人数暂时为空
            orderInfo.setComment(remark);//备注
            orderInfo.setCreateddate(new Date());//创建日期
            if (1 == userType) {
                ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                log.info("erpUserInfo信息:{}", erpUser);
                log.info("erpUserInfo信息toJSONString:{}", JSONObject.toJSONString(erpUser));
                orderInfo.setCreatedby(erpUser.getUserName());//创建人
                orderInfo.setCreatedbyid(erpUser.getUserID());//创建人ID
                orderInfo.setDeptid(erpUser.getDeptID());//创建人所在部门ID
                orderInfo.setRevisedby(erpUser.getUserName());//最后修改人
                orderInfo.setOrgid(erpUser.getOrgID());//子系统标识
                orderInfo.setOrgname(erpUser.getTravelName());
                orderInfo.setCategory(4);//1，商城采购2.内部下单3.手工录入4.微店erp用户 5微店直客
//                orderInfo.setTurnbeforecategory(4);
//                System.out.println("proproduct 微店erp用户："+orderInfo.getTurnbeforecategory());

                orderInfo.setCustomerunitid(erpUser.getOrgID());//客户单位ID,obp 无法录入，给定值
                orderInfo.setCustomername(erpUser.getTravelName());//客户单位名称
                orderInfo.setNewcategory(24);

            } else {
                orderInfo.setCreatedby(wxUser.getMobile());//创建人
                orderInfo.setCreatedbyid(wxUser.getUserId());//创建人ID
                orderInfo.setDeptid("00000000-0000-0000-0000-000000000000");//创建人所在部门ID
                orderInfo.setRevisedby(wxUser.getNickname());//最后修改人
                orderInfo.setOrgid("00000000-0000-0000-0000-000000000000");//子系统标识
                orderInfo.setOrgname("直客无机构");
                orderInfo.setCategory(5);//1，商城采购2.内部下单3.手工录入4.微店erp用户 5微店直客
//                orderInfo.setTurnbeforecategory(5);
//                System.out.println("proproduct微店直客：" + orderInfo.getTurnbeforecategory());

                orderInfo.setCustomerunitid("00000000-0000-0000-0000-000000000000");//客户单位ID,obp 无法录入，给定值
                orderInfo.setCustomername("暂无");//客户单位名称
                orderInfo.setNewcategory(25);

            }

            orderInfo.setNeworderstatus(10);
            orderInfo.setNewticketstatus(0);
            orderInfo.setReviseddate(new Date());//最后修改日期
            orderInfo.setDatastatus((proTour.getIsack() == null || proTour.getIsack() == 0) ? 0 : 1);//订单状态，二次确认显示以保存：2 ，直销显示报名确认 ：1
            orderInfo.setSignstatus(0);//默认未发单
            orderInfo.setSupplierid(proProductDirectSalesProduct.getReceiverid());//供应商id,判别
            orderInfo.setSuppliername(proProductDirectSalesProduct.getReceivername());//供应商name
            orderInfo.setSiteid(siteid);//站点id
            orderInfo.setTicketstatus(0);//票务 0 未安排
            orderInfo.setRoutetypeid(product.getProcategoryid());//线路类型id
            orderInfo.setRoutetypename(product.getProcategory());//线路类型名
            orderInfo.setCustomerunittype(wxUser.getUserType());//客户单位类型
            orderInfo.setPricetype(wxUser.getUserType());//客户单位类型
            orderInfo.setDepid(departureId);
            //设置外放产品外发人id
            orderInfo.setDirectSalesSendId(directSalesSendId);
            if (isUseDiscount != null) {
                orderInfo.setIsusediscount(false);//是否有优惠
            } else {
                orderInfo.setIsusediscount(isUseDiscount);//是否有优惠
            }
            if (userName != null && !userName.equals("")) {
                orderInfo.setOrdersaler(userName);//销售人员名称
                orderInfo.setSalerdeptname(deptName);//销售人员部门
                if (StringUtil.isUUID(deptID)) {
                    orderInfo.setSalerdeptid(deptID);//销售人员部门I
                }
                if (StringUtil.isUUID(iD)) {
                    orderInfo.setOrdersalerid(iD);//销售人员ID
                }
            }

            orderInfo.setProducttype(product.getProducttype());
            orderInfo.setRoutedescription(product.getRoutedescription());

            //查询转发次数
            int produtOuterTimes = this.getProdutOuterTimes(proid, proProductDirectSalesProduct.getReceiverid());
            orderInfo.setProdutoutertimes(produtOuterTimes+1);
            //写入之前，设置门店父ID
            ordOrderInfoService.setOrderInfoParentOrgID(orderInfo);
            //写入之前，设置是否总店收标识
            boolean headShopOrgIdByOrderManage = orgInfoService.getHeadShopOrgIdByOrderManage(orderInfo.getSupplierid(), orderInfo.getDirectSalesSendId());
            if(headShopOrgIdByOrderManage){
                orderInfo.setIsShopOrderManage(1);
            }
            log.info("开始写入订单信息！");
            ordOrderInfoMapper.insert(orderInfo);

            //若当前为erp 用户 判断是否有客户信息
            if (1 == userType) {
                ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                String userOrgId = erpUser.getOrgID();
                //根据用户的orgid，获取用户的注册信息
                HttpResponse httpResponse = HttpUtils.httpClientGet(orgInfoUrl + userOrgId);
                JSONObject omOrgInfoExtension = JSONObject.parseObject(httpResponse.getData());
                log.info("当前登录人orgid:{}", userOrgId);
                log.info("当前登录人注册信息:{}", omOrgInfoExtension);
                String cityid = omOrgInfoExtension.getString("CityID");
                String cityname = omOrgInfoExtension.getString("CityName");
                //旅行社联系人
                String tacontact = omOrgInfoExtension.getString("TAContact");
                //旅行社联系电话
                String tacontactmobile = omOrgInfoExtension.getString("TAContactMobile");
                /*
                判断买家是否存在客户单位
                */

                CrmAccountMrgExample crmAccountMrgExample = new CrmAccountMrgExample();
                CrmAccountMrgExample.Criteria criteria = crmAccountMrgExample.createCriteria();
                //判断产品的orgid相等
                criteria.andOrgidEqualTo(orderInfo.getSupplierid());
                //判断买家的orgid相等
                //criteria.andPurchaserorgidEqualTo(userOrgId);

                //依据orgId 和手机号码去重
                criteria.andMobileEqualTo(tacontactmobile);
                List<CrmAccountMrg> crmAccountMrgs = crmAccountMrgMapper.selectByExample(crmAccountMrgExample);
                //往来单位ID
                String acctmrgId;
                log.info("查询返回的客户信息:{}", crmAccountMrgs);
                if (crmAccountMrgs == null || crmAccountMrgs.size()==0) {
                    //客户单位表中，没有该客户信息，保存其用户
                    log.info("开始写入客户信息！");
                    CrmAccountMrg crmAccountMrg = new CrmAccountMrg();
                    acctmrgId = UUID.randomUUID().toString();
                    crmAccountMrg.setId(acctmrgId);
                    crmAccountMrg.setPurchaserorgid(userOrgId);
                    crmAccountMrg.setParentid("00000000-0000-0000-0000-000000000000");
                    //查询同行人信息
                    CommParameterExample commParameterExample = new CommParameterExample();
                    commParameterExample.or().andOrgidEqualTo(userOrgId).andPtypeEqualTo(3).andDatastatusEqualTo(1).andPnameLike("同行");
                    List<CommParameter> commParameters = commParameterMapper.selectByExample(commParameterExample);
                    if(commParameters!=null&&commParameters.size()>0){
                        crmAccountMrg.setCategoryid(commParameters.get(0).getId());
                        crmAccountMrg.setCategoryname("旅游同行");
                    }else{
                        crmAccountMrg.setCategoryname("其他");
                        CommParameterExample commParameterExample1 = new CommParameterExample();
                        commParameterExample1.or().andOrgidEqualTo(userOrgId).andPtypeEqualTo(3).andDatastatusEqualTo(1).andPnameLike("其他");
                        List<CommParameter> commParameters1 = commParameterMapper.selectByExample(commParameterExample);
                        if(commParameters1!=null&&commParameters1.size()>0){
                            crmAccountMrg.setCategoryid(commParameters.get(0).getId());
                        }else{
                            crmAccountMrg.setCategoryid("00000000-0000-0000-0000-000000000000");
                        }
                    }
                    crmAccountMrg.setSource(2);
                    crmAccountMrg.setUnitname(erpUser.getTravelName());
                    crmAccountMrg.setCityid(cityid);
                    crmAccountMrg.setCityname(cityname);
                    //隶属管理部门  -  卖方开班人所在的部门
                    ProTour proTour1 = proTourMapper.selectByPrimaryKey(tourid);
                    String createdbyid = proTour1.getCreatedbyid();
                    // TODO: 2019-3-18 有空指针
                    HttpResponse httpResponse1 = HttpUtils.httpClientGet(getDept + proTour1.getDeptid());
                    log.info("请求API参数userId={},返回结果={}", proTour1.getDeptid(), httpResponse1);
                    JSONObject jsonObject = JSON.parseObject(httpResponse1.getData());
                    crmAccountMrg.setBelongtodeptid(proTour1.getDeptid());
                    if (jsonObject != null) {
                        crmAccountMrg.setDelongtodept(jsonObject.getString("DeptName"));
                    } else {
                        crmAccountMrg.setDelongtodept("无");
                    }
                    crmAccountMrg.setInblacklist(false);
                    crmAccountMrg.setContact(tacontact);
                    crmAccountMrg.setMobile(tacontactmobile);
                    crmAccountMrg.setComment(null);
                    crmAccountMrg.setCreateddate(new Date());
                    crmAccountMrg.setCreatedby(product.getCreatedby());
                    crmAccountMrg.setCreatedbyid(product.getCreatedbyid());
                    crmAccountMrg.setDeptid(product.getDeptid());
                    crmAccountMrg.setOrgid(orderInfo.getSupplierid());
                    crmAccountMrg.setReviseddate(new Date());
                    crmAccountMrg.setRevisedby(product.getCreatedby());
                    crmAccountMrg.setDatastatus(1);
                    crmAccountMrg.setCreditamt(new BigDecimal(0));
                    crmAccountMrg.setCreditnumber(0);
                    crmAccountMrg.setPurchaserorgid(userOrgId);
                    crmAccountMrgMapper.insert(crmAccountMrg);
                }else{
                    acctmrgId = crmAccountMrgs.get(0).getId();
                }
                //新增用戶到客戶表
                if(erpUser.getUserType()!=1) {
                    CrmAccountMrgUserExample crmAccountMrgUserExample = new CrmAccountMrgUserExample();
                    CrmAccountMrgUserExample.Criteria criteria1 = crmAccountMrgUserExample.createCriteria();
                    //依据orgId 和手机号码去重
                    criteria1.andMobileEqualTo(erpUser.getMobile());
                    criteria1.andOrgidEqualTo(orderInfo.getSupplierid());
                    List<CrmAccountMrgUser> crmAccountMrgUsers = crmAccountMrgUserMapper.selectByExample(crmAccountMrgUserExample);
                    if (crmAccountMrgUsers == null || crmAccountMrgUsers.size() == 0) {
                        CrmAccountMrgUser crmAccountMrgUser = new CrmAccountMrgUser();
                        crmAccountMrgUser.setId(UUID.randomUUID().toString());
                        crmAccountMrgUser.setUsername(erpUser.getUserName());
                        crmAccountMrgUser.setGender(3);
                        crmAccountMrgUser.setMobile(erpUser.getMobile());
                        crmAccountMrgUser.setAcctmrgid(acctmrgId);
                        crmAccountMrgUser.setUsertype(1);
                        crmAccountMrgUser.setDatastatus(1);
                        crmAccountMrgUser.setCreateddate(new Date());
                        crmAccountMrgUser.setCreatedby(product.getCreatedby());
                        crmAccountMrgUser.setCreatedbyid(product.getCreatedbyid());
                        crmAccountMrgUser.setDeptid(product.getDeptid());
                        crmAccountMrgUser.setOrgid(orderInfo.getSupplierid());
                        crmAccountMrgUser.setReviseddate(new Date());
                        crmAccountMrgUser.setRevisedby(product.getCreatedby());
                        crmAccountMrgUser.setSource(2);
                        crmAccountMrgUserMapper.insert(crmAccountMrgUser);
                    }
                }
            }else{
                //游客存入
                CrmAccountMrgUserExample  crmAccountMrgUserExample = new CrmAccountMrgUserExample();
                CrmAccountMrgUserExample.Criteria criteria = crmAccountMrgUserExample.createCriteria();
                //依据orgId 和手机号码去重
                criteria.andMobileEqualTo(wxUser.getMobile());
                criteria.andOrgidEqualTo(orderInfo.getSupplierid());
                List<CrmAccountMrgUser> crmAccountMrgUsers = crmAccountMrgUserMapper.selectByExample(crmAccountMrgUserExample);
                if (crmAccountMrgUsers==null||crmAccountMrgUsers.isEmpty()){
                    CrmAccountMrgUser crmAccountMrgUser = new CrmAccountMrgUser();
                    crmAccountMrgUser.setId(UUID.randomUUID().toString());
                    crmAccountMrgUser.setUsername(wxUser.getMobile());
                    crmAccountMrgUser.setMobile(wxUser.getMobile());
                    crmAccountMrgUser.setGender(3);
                    crmAccountMrgUser.setAcctmrgid("00000000-0000-0000-0000-000000000000");
                    crmAccountMrgUser.setUsertype(2);
                    crmAccountMrgUser.setDatastatus(1);
                    crmAccountMrgUser.setCreateddate(new Date());
                    crmAccountMrgUser.setCreatedby(product.getCreatedby());
                    crmAccountMrgUser.setCreatedbyid(product.getCreatedbyid());
                    crmAccountMrgUser.setDeptid(product.getDeptid());
                    crmAccountMrgUser.setOrgid(orderInfo.getSupplierid());
                    crmAccountMrgUser.setReviseddate(new Date());
                    crmAccountMrgUser.setRevisedby(product.getCreatedby());
                    crmAccountMrgUser.setSource(2);
                    crmAccountMrgUserMapper.insert(crmAccountMrgUser);
                }

            }

            //订单游客写入
            List<OrdOrderTourist> orderTourists = new ArrayList<>();

            if (StringUtils.isNotBlank(nameList)) {//循环写入游客信息（后期改为批量）
                //旅客信息拆分
                String[] splitName = nameList.substring(1, nameList.length() - 1).trim().split(", ");      //拆分获取旅客姓名
                String[] splitTel = telList.substring(1, telList.length() - 1).split(", ");         //拆分获取旅客电话
                String[] splitCode = codeList.substring(1, codeList.length() - 1).trim().split(", ");      //拆分获取旅客证件号
                String[] splitpid = pidList.substring(1, pidList.length() - 1).trim().split(", ");         //旅客对应的价格策略
                String[] spiltSexList = sexList.substring(1, sexList.length() - 1).trim().split(", ");     //拆分性别
                String[] spiltVenList = venList.substring(1, venList.length() - 1).trim().split(", ");     //拆分旅客接送地点
                String[] spiltCardList = cardList.substring(1, cardList.length() - 1).trim().split(", ");  //拆分旅客证件类型地点
                String[] splitIsSingleRoomList = isSingleRoom.substring(1, isSingleRoom.length() - 1).trim().split(", ");  //拆分旅客对应是否有单房差
                String[] spiltAgeList = ageList.substring(1, ageList.length() - 1).trim().split(", ");//拆分年龄spiltAgeList[i]

//                新增游客国籍、英语姓名等
                if (StringUtils.isNotBlank(englishSurnameList)){
                    String[] splitEnglishSurnameList = englishSurnameList.substring(1, englishSurnameList.length() - 1).trim().split(", ");//拆分旅客英语 姓
                }
                if (StringUtils.isNotBlank(englishNameList)){
                    String[] splitEnglishNameList = englishNameList.substring(1, englishNameList.length() - 1).trim().split(", ");//拆分旅客英语 名
                }
                if (StringUtils.isNotBlank(nationalityNameList)){
                    String[] splitNationalityNameList = nationalityNameList.substring(1, nationalityNameList.length() - 1).trim().split(", ");//拆分旅客英语 国籍
                }
                String[] splitEnglishNameList = null;
                String[] splitEnglishSurnameList = null;
                String[] splitNationalityNameList = null;

                int j = 0;
                for (int i = 0; i < splitName.length; i++) {
                    OrdOrderTourist orderTourists1 = new OrdOrderTourist();
                    orderTourists1.setId(UUID.randomUUID().toString());//游客id
                    orderTourists1.setOrderid(ordid);//订单id
                    orderTourists1.setGuestcard(splitCode[i]);//证件号
                    //计算年龄
                    orderTourists1.setGuestage(spiltAgeList[i]);
//                    if (i + 1 > splitTel.length) {//判断
//                        orderTourists1.setGuesttelphone("");//联系方式
//                    } else {
//                        orderTourists1.setGuesttelphone(splitTel[i]);
//                    }
                    orderTourists1.setGuesttelphone(telList2.get(i));
                    orderTourists1.setGuestname(splitName[i]);//旅客姓名
                    orderTourists1.setGuestsex(spiltSexList[i]);//旅客性别
                    if (!spiltVenList[i].equals("-1")) {
                        orderTourists1.setPickupid(spiltVenList[i]);//旅客接送地点
                        ProTourVenue proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
                        String venueName = "";
                        String pickupTime = "";
                        BigDecimal jamt ;
                        BigDecimal samt ;
                        if(proTourVenue ==null){
                            ProProductDirectVenue proProductDirectVenue = proProductDirectVenueMapper.selectByPrimaryKey(spiltVenList[i]);
                            orderTourists1.setPickupid(proProductDirectVenue.getProtourvenueid());
                            venueName = proProductDirectVenue.getVenue();
                            pickupTime = proProductDirectVenue.getCollectiontime();
                            jamt = proProductDirectVenue.getShuttlepricecost();
                            samt = proProductDirectVenue.getDropoffpricecost();
                        }else {
                            venueName = proTourVenue.getVenue();
                            pickupTime = proTourVenue.getCollectiontime();
                            jamt = proTourVenue.getShuttleprice();
                            samt = proTourVenue.getDropoffprice();
                        }

                        orderTourists1.setPickname(venueName);
                        orderTourists1.setPickuptime(pickupTime);
                        orderTourists1.setJamt(jamt);//回程车费（接机价）
                        orderTourists1.setSamt(samt);//去程车费（送机价）
                    }
                    orderTourists1.setGuestcardtype(spiltCardList[i]);//证件类型
                    orderTourists1.setPriceid(splitpid[i]);//价格策略
                    if (1 == userType) {
                        ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                        orderTourists1.setCreatedby(erpUser.getUserName());
                        orderTourists1.setCreatedid(erpUser.getUserID());
                        orderTourists1.setDeptid(erpUser.getDeptID());
                        orderTourists1.setRevisedby(erpUser.getUserName());
                    } else {
                        orderTourists1.setCreatedby(wxUser.getNickname());
                        orderTourists1.setCreatedid(wxUser.getUserId());
                        orderTourists1.setDeptid("00000000-0000-0000-0000-000000000000");
                        orderTourists1.setRevisedby(wxUser.getNickname());
                    }

                    orderTourists1.setCreateddate(new Date());
                    orderTourists1.setReviseddate(new Date());
                    orderTourists1.setIssingleroom("1".equals(splitIsSingleRoomList[i]));

////                    新增游客国籍、英语姓名等
//                    if (StringUtil.whatDocument(spiltCardList[i])){
//                        orderTourists1.setEngelishName(splitEnglishNameList[i]);
//                        orderTourists1.setEnglishSurname(splitEnglishSurnameList[i]);
//                    }
//
//                    if (!spiltCardList[i].equals("身份证") && !spiltCardList[i].equals("其他")) {
//                        orderTourists1.setDateOfBirth(dateOfBirthList.getDate(j));
//                        j++;
//                    }
//
//                    orderTourists1.setNationalityName(splitNationalityNameList[i]);
//                    orderTourists1.setNationalityId(commNationalityService.getNationalityId(splitNationalityNameList[i]));
//                    新增游客国籍、英语姓名等
//                    if (StringUtil.whatDocument(spiltCardList[i]) && splitEnglishNameList.length > 0 && splitEnglishSurnameList.length > 0){
//                        orderTourists1.setEngelishName(splitEnglishNameList[i]);
//                        orderTourists1.setEnglishSurname(splitEnglishSurnameList[i]);
//                    } else {
//                        orderTourists1.setEngelishName("");
//                        orderTourists1.setEnglishSurname("");
//                    }
//
//                    if (!spiltCardList[i].equals("身份证") && !spiltCardList[i].equals("其他")) {
//                        orderTourists1.setDateOfBirth(dateOfBirthList.getDate(j));
//                        j++;
//                    }
//
//                    orderTourists1.setNationalityName(splitNationalityNameList[i]);
//                    orderTourists1.setNationalityId(commNationalityService.getNationalityId(splitNationalityNameList[i]));

                    orderTourists.add(orderTourists1);
                }
            }
            log.info("开始写入游客信息！");
            if (Objects.nonNull(orderTourists) && !orderTourists.isEmpty()) {
                for (OrdOrderTourist orderTourist : orderTourists) {
                    ordOrderTouristMapper.insert(orderTourist);//插入
                }
            }

            //若上传图片保存游客信息 ，存储图片
            List<OrdOrderTouristImg> ordOrderTouristImgs = new ArrayList<>();
            if (StringUtils.isNotBlank(imgUrl)) {//判断是否为空
                String[] splitImgList = imgUrl.substring(1, imgUrl.length() - 1).trim().split(", ");//拆分游客信息照片
                for (int i = 0; i < splitImgList.length; i++) {
                    OrdOrderTouristImg ordOrderTouristImg = new OrdOrderTouristImg();
                    ordOrderTouristImg.setId(UUID.randomUUID().toString());
                    ordOrderTouristImg.setOrderid(ordid);
                    ordOrderTouristImg.setImgurl(splitImgList[i]);
                    ordOrderTouristImgs.add(ordOrderTouristImg);
                }

            }
            if (Objects.nonNull(ordOrderTouristImgs) && !ordOrderTouristImgs.isEmpty()) {
                for (OrdOrderTouristImg ordOrderTouristImg : ordOrderTouristImgs) {
                    ordOrderTouristImgMapper.insert(ordOrderTouristImg);
                }
            }
            //订单价格表插入
            List<OrdOrderPrice> ordOrderPrices = new ArrayList<>();
            if (policyidList.length > 0) {
                for (int i = 0; i < policyidList.length; i++) {
                    //查询对应的价格策略信息
//                    ProTourPricepolicy proTourPricePolicy = proTourPricePolicyMapper.selectByPrimaryKey(policyidList[i]);
                    ProProductDirectSalesItem proTourPricePolicy = productDirectSalesItemMapper.selectByPrimaryKey(policyidList[i]);
                    OrdOrderPrice ordOrderPrice = new OrdOrderPrice();
                    ordOrderPrice.setId(UUID.randomUUID().toString());//主键id
                    ordOrderPrice.setOrderid(ordid);//关联订单主键id
                    ordOrderPrice.setTourpriceid(policyidList[i]);//关联价格策略id
                    ordOrderPrice.setPricename(proTourPricePolicy.getPolicyname());//价格策略名称
                    ordOrderPrice.setVisitornum(Integer.parseInt(spiltNumList[i]));//价格策略对应人数
                    ordOrderPrice.setRebateavg(proTourPricePolicy.getRebateprice());//返佣
                    ordOrderPrice.setRebatenum(Integer.parseInt(spiltNumList[i]));//返佣人数
                    ordOrderPrice.setRoomprice(proTourPricePolicy.getSingleroomprice());//单房差
                    ordOrderPrice.setIsseat(proTourPricePolicy.getIsoccupyseat());//是否占座
                    ordOrderPrice.setIschild(proTourPricePolicy.getTouristtype() == 2);//是否儿童
                    if (1 == userType) {
                        ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                        ordOrderPrice.setSaleprice(proTourPricePolicy.getSalesprice());//对挺销售价格
                        ordOrderPrice.setOrgid(erpUser.getOrgID());//orgid
                    } else {
                        ordOrderPrice.setSaleprice(proTourPricePolicy.getDirectprice());//对挺销售价格
                        ordOrderPrice.setOrgid("00000000-0000-0000-0000-000000000000");//orgid
                    }
                    ordOrderPrices.add(ordOrderPrice);
                }
            }
            log.info("开始写入游客价格信息！");
            for (OrdOrderPrice ordOrderPrice : ordOrderPrices) {
                if (ordOrderPrice.getVisitornum() != 0) {//没人的价格策略不写入
                    ordOrderPriceMapper.insert(ordOrderPrice);//插入
                }
            }
            log.info("开始写入订单日志！");
            OrdOrderLog ordOrderLog = new OrdOrderLog();
            ordOrderLog.setId(UUID.randomUUID().toString());
            ordOrderLog.setOrderid(ordid);
            ordOrderLog.setOplog("提交新订单");
            ordOrderLog.setOpip(PublicipUtils.getIpAddr(request));
            ordOrderLog.setOpbrowser(PublicipUtils.getBrowser(request));
            if (1 == userType) {
                ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                ordOrderLog.setOrgid(erpUser.getOrgID());
                ordOrderLog.setCreatedbyid(erpUser.getUserID());
                ordOrderLog.setCreatedby(erpUser.getUserName());
            } else {
                ordOrderLog.setOrgid("00000000-0000-0000-0000-000000000000");
                ordOrderLog.setCreatedbyid(wxUser.getUserId());
                ordOrderLog.setCreatedby(wxUser.getNickname());
            }
            ordOrderLog.setCreateddate(new Date());
            ordOrderLogMapper.insert(ordOrderLog);

            //若当前为erp 用户 判断是否有客户信息
            if (1 == userType) {
                ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                String userOrgId = erpUser.getOrgID();
                //根据用户的orgid，获取用户的注册信息
                HttpResponse httpResponse = HttpUtils.httpClientGet(orgInfoUrl + userOrgId);
                JSONObject omOrgInfoExtension = JSONObject.parseObject(httpResponse.getData());
                String cityid = omOrgInfoExtension.getString("CityID");
                String cityname = omOrgInfoExtension.getString("CityName");
                //旅行社联系人
                String tacontact = omOrgInfoExtension.getString("TAContact");
                //旅行社联系电话
                String tacontactmobile = omOrgInfoExtension.getString("TAContactMobile");
                /*
                判断买家是否存在客户单位
                */
                CrmAccountMrgExample crmAccountMrgExample = new CrmAccountMrgExample();
                CrmAccountMrgExample.Criteria criteria = crmAccountMrgExample.createCriteria();
                //判断产品的orgid相等
                criteria.andOrgidEqualTo(proProductDirectSalesProduct.getReceiverid());
                //判断买家的orgid相等
                criteria.andPurchaserorgidEqualTo(userOrgId);
                List<CrmAccountMrg> crmAccountMrgs = crmAccountMrgMapper.selectByExample(crmAccountMrgExample);
                log.info("查询返回的客户信息:{}", crmAccountMrgs);
                //客户单位表中，没有该客户信息，保存其用户
                log.info("开始写入客户信息！");
                if (crmAccountMrgs == null || crmAccountMrgs.size() == 0) {
                    CrmAccountMrg crmAccountMrg = new CrmAccountMrg();
                    crmAccountMrg.setId(UUID.randomUUID().toString());
                    crmAccountMrg.setPurchaserorgid(userOrgId);
                    crmAccountMrg.setParentid("00000000-0000-0000-0000-000000000000");
                    crmAccountMrg.setCategoryid("00000000-0000-0000-0000-000000000000");
                    crmAccountMrg.setCategoryname("暂无");
                    crmAccountMrg.setUnitname(erpUser.getTravelName());
                    crmAccountMrg.setCityid(cityid);
                    crmAccountMrg.setCityname(cityname);
                    //隶属管理部门  -  卖方开班人所在的部门
                    ProTour proTour1 = proTourMapper.selectByPrimaryKey(tourid);
                    String createdbyid = proTour1.getCreatedbyid();
                    HttpResponse httpResponse1 = HttpUtils.httpClientGet(getUserUrl + createdbyid);
                    ErpUserDto erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse1.getData()), ErpUserDto.class);
                    crmAccountMrg.setBelongtodeptid(proTour1.getDeptid());
                    crmAccountMrg.setDelongtodept(erpUserDto.getDeptName());

                    crmAccountMrg.setInblacklist(false);
                    crmAccountMrg.setContact(tacontact);
                    crmAccountMrg.setMobile(tacontactmobile);
                    crmAccountMrg.setComment(null);
                    crmAccountMrg.setCreateddate(new Date());
                    crmAccountMrg.setCreatedby(product.getCreatedby());
                    crmAccountMrg.setCreatedbyid(product.getCreatedbyid());
                    crmAccountMrg.setDeptid(product.getDeptid());
                    crmAccountMrg.setOrgid(proProductDirectSalesProduct.getReceiverid());
                    crmAccountMrg.setReviseddate(new Date());
                    crmAccountMrg.setRevisedby(product.getCreatedby());
                    crmAccountMrg.setDatastatus(1);
                    crmAccountMrg.setCreditamt(new BigDecimal(0));
                    crmAccountMrg.setCreditnumber(0);
                    crmAccountMrgMapper.insert(crmAccountMrg);
                }
            }
            //订单大交通表写入
            if (proTour.getHastraffic() != null && proTour.getHastraffic() != 0 && proTour.getHastraffic() < 16) {//是否需要写入大交通
                businessService.addOrderTraffic(proTour.getHastraffic(), tourid, ordid, request, userType, wxUser);

            } else if (proTour.getHastraffic() != null && proTour.getHastraffic() != 0 && proTour.getHastraffic() > 16) {
                String hexString = proTour.getHastraffic().toHexString(proTour.getHastraffic()); //转成16进制
                char[] chars = hexString.toCharArray();
                String goValue = String.valueOf(chars[0]);
                String backVlaue = String.valueOf(chars[1]);
                Integer goTraffic = Integer.parseInt(goValue, 16);
                Integer backTraffic = Integer.parseInt(backVlaue, 16);

                businessService.addOrderTraffic(goTraffic, tourid, ordid, request, userType, wxUser);
                businessService.addOrderTraffic(backTraffic, tourid, ordid, request, userType, wxUser);

            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("订单保存异常！");
        }

        businessService.addOrdInfoFile(product.getOrgid(), ordid, proid);

        log.info("订单相关信息写入完成！");

        HttpResponse httpResponse = HttpUtils.httpClientGet(getOrgInfoUrl + proProductDirectSalesProduct.getReceiverid());
        OrgInfoExtensionDto orgInfoExtensionDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), OrgInfoExtensionDto.class);

        Map map = new HashMap();
        map.put("orderNo", orderNo);
        map.put("orderId", orderInfo.getId());
        map.put("travelAgencyPhone", orgInfoExtensionDto.getPhone());

        return new Response().success(map);
    }

    @Override
    public Response validatePrice(JSONObject params, HttpServletRequest request) {
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        log.info("当前登录人信息:{}", wxUserInfo);
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("用户未登录！");
        }
        Integer userType = wxUserInfo.getUserType();
//        Integer userType = 2;
        BigDecimal realPrice = new BigDecimal(0);
        int paramStock = 0;
        String totalprice = params.getString("totalprice");
        String tourid = params.getString("tourid");
        String policyId = params.getString("policyid");
        String personnumber = params.getString("num");
        String singleroomprice = params.getString("singleroomprice");
        String venList = params.getString("venueidList");//旅客接送地点id
        String codeList = params.getString("codeList");//旅客证件号
        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", ");
        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");
        String[] splitCode = null;
        if (StringUtils.isNotBlank(codeList)) {
            splitCode = codeList.substring(1, codeList.length() - 1).trim().split(", ");      //拆分获取旅客证件号
        }

        //计算出游人数
        for (int i = 0; i < splitPersonnumber.length; i++) {
            paramStock += Integer.parseInt(splitPersonnumber[i]);
        }
        //计算价格
        for (int i = 0; i < splitPolicyid.length; i++) {
            String policyid = splitPolicyid[i];//价格策略id
            int personNum = Integer.parseInt(splitPersonnumber[i]);//价格策略对应的人数
            BigDecimal perNum = BigDecimal.valueOf(personNum);
            ProProductDirectSalesItem pricePolicy = productDirectSalesItemMapper.selectByPrimaryKey(policyid.toUpperCase());
            BigDecimal salesPrice = null;
            BigDecimal rebateprice = null;
            if (1 == userType) {
                salesPrice = pricePolicy.getSalesprice();
                realPrice = realPrice.add(perNum.multiply(salesPrice));
//                //市场价
//                salesPrice = pricePolicy.getSalesprice();
//                //返佣
//                rebateprice = pricePolicy.getRebateprice();
//                realPrice = realPrice.add(perNum.multiply(salesPrice));
//                realPrice = realPrice.subtract(perNum.multiply(rebateprice));
            } else {
                //市场价
                salesPrice = pricePolicy.getDirectprice();
                //计算实际总价
                realPrice = realPrice.add(perNum.multiply(salesPrice));
            }
        }
        if (StringUtils.isNotBlank(venList)) {
            String[] spiltVenList = venList.substring(1, venList.length() - 1).trim().split(", ");     //拆分旅客接送地点
            for (int i = 0; i < spiltVenList.length; i++) {
                ProTourVenue proTourVenue = null;
                if (!spiltVenList[i].equals("-1")) {
                    ProProductDirectVenue proProductDirectVenue = proProductDirectVenueMapper.selectByPrimaryKey(spiltVenList[i]);
                    if(proProductDirectVenue!=null){
                        realPrice = realPrice.add(proProductDirectVenue.getDropoffpricesales());
                        realPrice = realPrice.add(proProductDirectVenue.getShuttlepricesales());
                    }else {
                        proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
                        //接送机
                        if (Objects.nonNull(proTourVenue)) {
                            realPrice = realPrice.add(proTourVenue.getDropoffprice());
                            realPrice = realPrice.add(proTourVenue.getShuttleprice());
                        }
                    }
                }
            }
        }
        if (StringUtils.isNotBlank(singleroomprice)) {//单房差计算（直客验证单房差的准确性暂未做）
            realPrice = realPrice.add(new BigDecimal(singleroomprice));
        }
        log.info("计算价格:{},前端提交价格:{}", realPrice, totalprice);
        //验证库存
        ProTour proTour = proTourMapper.selectByPrimaryKey(tourid.toUpperCase());
        int planNum = proTour.getPlannum();
        //订单预定人数
        int orderNum = 0;
        //根据团期id和团期日期获取订单数据
        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(tourid);
        for (OrdOrderinfo orderinfo : orderinfos) {
            int adultNum = orderinfo.getAdultnum();
            int childNum = orderinfo.getChildnum();
            orderNum += adultNum + childNum;
        }
        //剩余库存数
        int stock = planNum - orderNum;
        //大交通库存验证
        int ticketStock1 = 0;
        int ticketStock2 = 0;
        if (proTour.getIsack() != null && proTour.getIsack() == 1) {//判断是否需要查询大交通库存
            ProTourTrafficExample trafficExample = new ProTourTrafficExample();
            trafficExample.or().andTouridEqualTo(tourid);
            List<ProTourTraffic> proTourTraffics = proTourTrafficMapper.selectByExample(trafficExample);
            List<String> resTrafficId = proTourTraffics.stream().map(ProTourTraffic::getTrafficproductid).collect(Collectors.toList());
            if (proTour.getHastraffic() == 9) {//机票
                ResFlightProductExample example = new ResFlightProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResFlightProduct> resFlightProducts = resFlightProductMapper.selectByExample(example);//机票都是固定计划位
                ticketStock1 = resFlightProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resFlightProducts.get(0).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 10) {//火车票
                ResTrainProductExample example = new ResTrainProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResTrainProduct> resTrainProducts = resTrainProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resTrainProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(0).getTicketnumber();
                ticketStock2 = resTrainProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(1).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 11) {//汽车票
                ResBusProductExample example = new ResBusProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResBusProduct> resBusProducts = resBusProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resBusProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(0).getTicketnumber();
                ticketStock2 = resBusProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(1).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 12) {//船票
                ResShipProductExample example = new ResShipProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResShipProduct> resShipProducts = resShipProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resShipProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(0).getTicketnumber();
                ticketStock2 = resShipProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(1).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else {
                log.info("产品为直售，但未录入大交通信息！");
            }

        } else if (stock < paramStock) {
            return new Response().failure("该产品库存不足！");
        }

        //价格验证成功,开始插入
        BigDecimal total = new BigDecimal(totalprice);
        if (realPrice.compareTo(total) != 0) {
            return new Response().failure("价格有变动，请重新下单！");
        }
        log.info("价格验证成功！");
        //查询当前班期所有订单
        OrdOrderinfoExample ordOrderinfoExample = new OrdOrderinfoExample();
        ordOrderinfoExample.or().andTouridEqualTo(tourid);
        List<OrdOrderinfo> orderInfoTour = ordOrderInfoMapper.selectByExample(ordOrderinfoExample);
        if (Objects.isNull(orderInfoTour) || orderInfoTour.isEmpty()) {//团期没有订单，返回true
            return new Response().success();
        }


        //获取订单id
        List<String> orderIds = orderInfoTour.stream().map(OrdOrderinfo::getId).collect(Collectors.toList());
        //查询当前班期所有旅客
        OrdOrderTouristExample example = new OrdOrderTouristExample();
        example.or().andOrderidIn(orderIds);

        List<OrdOrderTourist> ordOrderTourists = ordOrderTouristMapper.selectByExample(example);
//        if (Objects.nonNull(ordOrderTourists) && !ordOrderTourists.isEmpty() && Objects.nonNull(splitCode)) {
//            //身份证重复验证
//            List<String> code = new ArrayList<>();
//            Collections.addAll(code, splitCode);//封装到list
//            //获取游客的证件号
//            List<String> guestcards = ordOrderTourists.stream().map(OrdOrderTourist::getGuestcard).collect(Collectors.toList());
//            //验证是否重复
//            for (String codePage : code) {
//                for (String card : guestcards) {
//                    if (codePage.equals(card)) {
//                        return new Response().failure("证件号为：" + card + "的旅客已预订过本次团期！");
//                    }
//                }
//            }
//        }
        return new Response().success();
    }

    @Override
    public Response newAddOrderInfo(JSONObject params, HttpServletRequest request) {
        log.info("当前登录人信息:{}", request.getSession().getAttribute("wxUserInfo"));
        Response response1 = null;
        Response response = this.validatePrice(params, request);
        log.info("添加订单验证价格结果:{}", JSONObject.toJSONString(response));
        if (response.getMeta().isSuccess()) {
            log.info("验证通过，开始写入订单！");
            try {
                response1 = this.addOrderInfo(params, request);//插入订单 ，返回订单编号
            } catch (RuntimeException e) {
                return new Response().failure(e.getMessage());
            }
        } else {
            return new Response().failure(response.getMeta().getMessage());
        }
        if (Objects.nonNull(response1) && response1.getMeta().isSuccess()) {
            return new Response().success(response1.getData());
        }
        return new Response().failure(response1.getMeta().getMessage());
    }

    @Override
    public Response validateDetail(JSONObject param, HttpServletRequest request) {
        log.info("外发产品·提交订单验证开始！");
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        log.info("当前登录人信息:{}", wxUserInfo);
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("用户未登录！");
        }
        Integer userType = wxUserInfo.getUserType();
//        Integer userType = 2;
        log.info("/validateDetail接口参数：{}", param.toJSONString());
        int paramStock = 0;
        String tourid = param.getString("tourid");
        String policyId = param.getString("policyid");
        String personnumber = param.getString("personnum");
        String policyPrice = param.getString("policyprice");
        String siteId = param.getString("siteid");
        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", ");
        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");
        String[] spiltPolicyPrice = policyPrice.substring(1, policyPrice.length() - 1).trim().split(", ");
        log.info("对应价格：" + spiltPolicyPrice);
        //计算出游人数
        for (int i = 0; i < splitPersonnumber.length; i++) {
            paramStock += Integer.parseInt(splitPersonnumber[i]);
        }
//计算价格
        for (int i = 0; i < splitPolicyid.length; i++) {
            String policyid = splitPolicyid[i];//价格策略id
            BigDecimal webPrice = new BigDecimal(spiltPolicyPrice[i]);
            ProProductDirectSalesItem pricePolicy = productDirectSalesItemMapper.selectByPrimaryKey(policyid.toUpperCase());
            BigDecimal salesPrice = new BigDecimal(0);
            if (1 == userType) {
                //市场价
                salesPrice = pricePolicy.getSalesprice();
            } else {
                salesPrice = pricePolicy.getDirectprice();
            }
            //判断价格是否变化
            if (salesPrice.compareTo(webPrice) != 0) {
                log.info("后台查询价格：{},前台传输价格:{}", salesPrice.toString(), webPrice.toString());
                return new Response().failure("价格发生变化，请刷新！");
            }
        }
        //验证库存
        ProTour proTour = proTourMapper.selectByPrimaryKey(tourid);
        int planNum = proTour.getPlannum();
        //订单预定人数
        int orderNum = 0;
        //根据团期id和团期日期获取订单数据
        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(tourid);
        for (OrdOrderinfo orderinfo : orderinfos) {
            int adultNum = orderinfo.getAdultnum();
            int childNum = orderinfo.getChildnum();
            orderNum += adultNum + childNum;
        }
        //剩余库存数
        int stock = planNum - orderNum;
        //大交通库存验证
        int ticketStock1 = 0;
        int ticketStock2 = 0;
        if (proTour.getIsack() != null && proTour.getIsack() == 1) {//判断是否需要查询大交通库存
            ProTourTrafficExample trafficExample = new ProTourTrafficExample();
            trafficExample.or().andTouridEqualTo(tourid);
            List<ProTourTraffic> proTourTraffics = proTourTrafficMapper.selectByExample(trafficExample);
            List<String> resTrafficId = proTourTraffics.stream().map(ProTourTraffic::getTrafficproductid).collect(Collectors.toList());
            if (proTour.getHastraffic() == 9) {//机票
                ResFlightProductExample example = new ResFlightProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResFlightProduct> resFlightProducts = resFlightProductMapper.selectByExample(example);//机票都是固定计划位
                ticketStock1 = resFlightProducts.get(0).getTicketnumber() == -1 ? 999 : resFlightProducts.get(0).getTicketnumber() - orderNum;
                if (stock < paramStock || ticketStock1 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 10) {//火车票
                ResTrainProductExample example = new ResTrainProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResTrainProduct> resTrainProducts = resTrainProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resTrainProducts.get(0).getTicketnumber() == -1 ? 999 : resTrainProducts.get(0).getTicketnumber() - orderNum;
                ticketStock2 = resTrainProducts.get(1).getTicketnumber() == -1 ? 999 : resTrainProducts.get(1).getTicketnumber() - orderNum;
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 11) {//汽车票
                ResBusProductExample example = new ResBusProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResBusProduct> resBusProducts = resBusProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resBusProducts.get(0).getTicketnumber() == -1 ? 999 : resBusProducts.get(0).getTicketnumber() - orderNum;
                ticketStock2 = resBusProducts.get(1).getTicketnumber() == -1 ? 999 : resBusProducts.get(1).getTicketnumber() - orderNum;
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 12) {//船票
                ResShipProductExample example = new ResShipProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResShipProduct> resShipProducts = resShipProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resShipProducts.get(0).getTicketnumber() == -1 ? 999 : resShipProducts.get(0).getTicketnumber() - orderNum;
                ticketStock2 = resShipProducts.get(1).getTicketnumber() == -1 ? 999 : resShipProducts.get(1).getTicketnumber() - orderNum;
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else {
                log.info("产品为直售，但未录入大交通信息！");
            }

        } else if (stock < paramStock) {
            return new Response().failure("该产品库存不足！");
        }

        return new Response().success();
    }


//    周
    @Override
    public Response validateTotalPrice(JSONObject params, HttpServletRequest request) {
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        log.info("当前登录人信息:{}", wxUserInfo);
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("用户未登录！");
        }
        Integer userType = wxUserInfo.getUserType();
//        Integer userType = 2;
        log.info("validateTotalPrice:{}", params);
        //验证价格库存信息
        BigDecimal realPrice = new BigDecimal(0);
        int paramStock = 0;
        String totalprice = params.getString("totalprice");
        String tourid = params.getString("tourid");
        String policyId = params.getString("policyid");
        String personnumber = params.getString("personnum");


        String singleroomprice = params.getString("singleroomprice");
        String siteId = params.getString("siteid");
        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", ");
        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");
//        String[] paramSingleroompricenum = singleroompricenum.substring(1, singleroompricenum.length() - 1).trim().split(", ");

        //单房差
        /*ProTourPricepolicyExample example = new ProTourPricepolicyExample();
        example.or().andTouridEqualTo(tourid).andIsdefaultEqualTo(true).andSiteidEqualTo(siteId);
        List<ProTourPricepolicy> proTourPricepolicies = proTourPricePolicyService.selectByExample(example);*/
        List<Map> listp = new ArrayList<>();
        //计算出游人数
        for (int i = 0; i < splitPersonnumber.length; i++) {
            paramStock += Integer.parseInt(splitPersonnumber[i]);
        }
        //计算价格
        for (int i = 0; i < splitPolicyid.length; i++) {
            String policyid = splitPolicyid[i];//价格策略id
            int personNum = Integer.parseInt(splitPersonnumber[i]);//价格策略对应的人数
            BigDecimal perNum = BigDecimal.valueOf(personNum);
            ProProductDirectSalesItem pricePolicy = productDirectSalesItemMapper.selectByPrimaryKey(policyid.toUpperCase());
            BigDecimal salesPrice = null;
            BigDecimal rebateprice = null;
            if (1 == userType) {
                //市场价
                salesPrice = pricePolicy.getSalesprice();
                //返佣
                rebateprice = pricePolicy.getRebateprice();
                realPrice = realPrice.add(perNum.multiply(salesPrice));
//                realPrice = realPrice.subtract(perNum.multiply(rebateprice));
            } else {
                //市场价
                salesPrice = pricePolicy.getDirectprice();
                //计算实际总价
                realPrice = realPrice.add(perNum.multiply(salesPrice));
            }
            //存储信息返回给前端
            Map map = new HashMap();
            map.put("policyid", policyid);
            map.put("personnum", personNum);
            listp.add(map);

        }
        /*if(StringUtils.isNotBlank(singleroomprice)){//单房差不为空加上单房差
            BigDecimal singPrice = new BigDecimal(singleroomprice);
            realPrice = realPrice.add(singPrice);
        }*/
        //验证库存
        ProTour proTour = proTourMapper.selectByPrimaryKey(tourid);
        int planNum = proTour.getPlannum();
        //订单预定人数
        int orderNum = 0;
        //根据团期id和团期日期获取订单数据
        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(tourid);
        for (OrdOrderinfo orderinfo : orderinfos) {
            int adultNum = orderinfo.getAdultnum();
            int childNum = orderinfo.getChildnum();
            orderNum += adultNum + childNum;
        }
        //剩余库存数
        int stock = planNum - orderNum;
        //大交通库存验证
        int ticketStock1 = 0;
        int ticketStock2 = 0;
        if (proTour.getIsack() != null && proTour.getIsack() == 1) {//判断是否需要查询大交通库存
            ProTourTrafficExample trafficExample = new ProTourTrafficExample();
            trafficExample.or().andTouridEqualTo(tourid);
            List<ProTourTraffic> proTourTraffics = proTourTrafficMapper.selectByExample(trafficExample);
            List<String> resTrafficId = proTourTraffics.stream().map(ProTourTraffic::getTrafficproductid).collect(Collectors.toList());
            if (proTour.getHastraffic() == 9) {//机票
                ResFlightProductExample example = new ResFlightProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResFlightProduct> resFlightProducts = resFlightProductMapper.selectByExample(example);//机票都是固定计划位
                ticketStock1 = resFlightProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resFlightProducts.get(0).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 10) {//火车票
                ResTrainProductExample example = new ResTrainProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResTrainProduct> resTrainProducts = resTrainProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resTrainProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(0).getTicketnumber();
                ticketStock2 = resTrainProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(1).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 11) {//汽车票
                ResBusProductExample example = new ResBusProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResBusProduct> resBusProducts = resBusProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resBusProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(0).getTicketnumber();
                ticketStock2 = resBusProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(1).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else if (proTour.getHastraffic() == 12) {//船票
                ResShipProductExample example = new ResShipProductExample();
                example.or().andIdIn(resTrafficId);
                List<ResShipProduct> resShipProducts = resShipProductMapper.selectByExample(example);//往返，两条
                ticketStock1 = resShipProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(0).getTicketnumber();
                ticketStock2 = resShipProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(1).getTicketnumber();
                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
                    return new Response().failure("该产品库存不足！");
                }
            } else {
                log.info("产品为直售，但未录入大交通信息！");
            }
        } else if (stock < paramStock) {
            return new Response().failure("该产品库存不足！");
        }


        //价格验证成功,开始插入
        BigDecimal total = new BigDecimal(totalprice);
        if (realPrice.compareTo(total) == 0) {
            //价格及参数存入redis，前端需要参数
            String key = UUID.randomUUID().toString();
            Map m = new HashMap();
//            m.put("singleRoomPrice",singleroomprice);
            m.put("price", realPrice);
            m.put("param", listp);
            Map resultMap = new HashMap();
            resultMap.put("key", key);
            jedisService.addObjectToList(key, m);
            return new Response().success(resultMap);
        } else {
            return new Response().failure("价格有变动，请重新下单！");
        }
    }

    @Override
    public Response manyTours(String tourDate, String orgId, String proId, String siteId) {
        List<ManyToursDto> manyToursDtos = proProductDepartureMapper.manyTours(tourDate,siteId,orgId,proId);
        return new Response().success(manyToursDtos);
    }

    @Override
    public ProProductDirectSales getProProductDirectSales(String tourId, String proId, String directSalesSendId, String orgId) {
        ProProductDirectSalesExample example = new ProProductDirectSalesExample();
        example.or().andTouridEqualTo(tourId).andProidEqualTo(proId).andSupplieridEqualTo(directSalesSendId).andReceiveridEqualTo(orgId);
        List<ProProductDirectSales> proProductDirectSales = proProductDirectSalesMapper.selectByExample(example);
        if(proProductDirectSales!=null && proProductDirectSales.size()>0){
             return proProductDirectSales.get(0);
        }
        return null;
    }
}
