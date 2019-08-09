package com.holyrobot.con_volunteer.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_common.mapper.*;
import com.holyrobot.con_common.pojo.*;
import com.holyrobot.con_order.mapper.*;
import com.holyrobot.con_order.pojo.*;
import com.holyrobot.con_order.server.BusinessService;
import com.holyrobot.con_order.server.OrdOrderInfoService;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.con_product.mapper.*;
import com.holyrobot.con_product.pojo.*;
import com.holyrobot.con_res.mapper.ResBusProductMapper;
import com.holyrobot.con_res.mapper.ResFlightProductMapper;
import com.holyrobot.con_res.mapper.ResShipProductMapper;
import com.holyrobot.con_res.mapper.ResTrainProductMapper;
import com.holyrobot.con_res.pojo.*;
import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.ErpUser;
import com.holyrobot.dto.OrgInfoExtensionDto;
import com.holyrobot.dto.WxUser;
import com.holyrobot.con_volunteer.mapper.*;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerOrderService;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import com.holyrobot.util.PublicipUtils;
import com.holyrobot.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName： VolunteerOrderServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-26 11:20
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class VolunteerOrderServiceImpl implements VolunteerOrderService {

    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private VolunteerProductMapper volunteerProductMapper;
    @Autowired
    private VolunteerProductTourMapper volunteerProductTourMapper;
    @Autowired
    private VolunteerProductTourPriceMapper volunteerProductTourPriceMapper;
    @Autowired
    private ProProductDepartureMapper proProductDepartureMapper;
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
    private ProTourVenueMapper proTourVenueMapper;
    @Autowired
    private CrmAccountMrgMapper crmAccountMrgMapper;
    @Autowired
    private OrdOrderInfoService ordOrderInfoService;
    @Autowired
    private ProProductDirectSalesItemMapper productDirectSalesItemMapper;
    @Autowired
    private ProProductDirectSalesProductMapper proProductDirectSalesProductMapper;
    @Autowired
    private ResFlightProductMapper resFlightProductMapper;
    @Autowired
    private ResBusProductMapper resBusProductMapper;
    @Autowired
    private ResShipProductMapper resShipProductMapper;
    @Autowired
    private ResTrainProductMapper resTrainProductMapper;
    @Autowired
    private ProTourTrafficMapper proTourTrafficMapper;
    @Autowired
    private OrdOrderTouristImgMapper ordOrderTouristImgMapper;
    @Autowired
    private CrmAccountMrgUserMapper crmAccountMrgUserMapper;
    @Autowired
    private CommParameterMapper commParameterMapper;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private RedisClient jedisService;
    @Autowired
    private VolunteerCommissionRecordMapper volunteerCommissionRecordMapper;
    @Autowired
    private VolunteerParentMapper volunteerParentMapper;
    @Autowired
    private TravelerRewardRecordingMapper travelerRewardRecordingMapper;
    @Autowired
    private ProProductDirectVenueMapper proProductDirectVenueMapper;
    @Autowired
    private CrmAccountMrgIntermediateMapper crmAccountMrgIntermediateMapper;
    @Autowired
    private CrmAccountMrgUserIntermediateMapper crmAccountMrgUserIntermediateMapper;


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
    @Autowired
    private OrgInfoService orgInfoService;
    @Value("${airPortUrl.getDept}")
    private String getDept;

    /**
     * 　　* @Description: 查询外发次数
     * 　　* @author 周陈
     * 　　* @date 2019/2/22 16:02
     */
    public int getProdutOuterTimes(String proId, String receiverID) {
        return proProductDirectSalesProductMapper.selectProdutOuterTimes(proId, receiverID);
    }


    /**
     * @Description: 旅游志愿者--非外发产品订单插入与验证
     * @auther: 史迪旻
     * @date: 11:35 2019-2-28
     * @param: [params, request]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response volunteerAddOrdInfo(JSONObject params, HttpServletRequest request) {
        log.info("当前登录人信息:{}", request.getSession().getAttribute("wxUserInfo"));
        Response response1 = null;
        Response response = this.validateVolOrderPrice(params, request);
        log.info("添加订单验证价格结果:{}", JSONObject.toJSONString(response));
        if (response.getMeta().isSuccess()) {
            log.info("volunteerAddOutOrdInfo 验证通过，开始写入订单！");
            try {
                response1 = this.addVolOrderInfo(params, request);//插入订单 ，返回订单编号
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

    /**
     * @Description: 旅游志愿者--外发产品下单
     * @auther: 史迪旻
     * @date: 16:06 2019-2-26
     * @param: [params, request]
     * @return: com.holyrobot.response.Response
     */
//    @Override
//    public Response volunteerAddOutOrdInfo(JSONObject params, HttpServletRequest request) {
//        log.info("当前登录人信息:{}", request.getSession().getAttribute("wxUserInfo"));
//        Response response1 = null;
//        Response response = this.validateOutOrderPrice(params, request);
//        log.info("添加订单验证价格结果:{}", JSONObject.toJSONString(response));
//        if (response.getMeta().isSuccess()) {
//            log.info("volunteerAddOutOrdInfo 验证通过，开始写入订单！");
//            try {
//                response1 = this.addOutOrderInfo(params, request);//插入订单 ，返回订单编号
//            } catch (RuntimeException e) {
//                return new Response().failure(e.getMessage());
//            }
//        } else {
//            return new Response().failure(response.getMeta().getMessage());
//        }
//        if (Objects.nonNull(response1) && response1.getMeta().isSuccess()) {
//            return new Response().success(response1.getData());
//        }
//        return new Response().failure(response1.getMeta().getMessage());
//    }


    /**
     * @Description: 旅游志愿者--验证非外发产品
     * @auther: 史迪旻
     * @date: 10:50 2019-2-27
     * @param: [params, request]
     * @return: com.holyrobot.response.Response
     */
    @Transactional
    public Response validateVolOrderPrice(JSONObject params, HttpServletRequest request) {
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        log.info("validateVolOrderPrice 当前登录人信息:{}", wxUserInfo);
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("用户未登录！");
        }
        Integer userType = wxUserInfo.getUserType();
        BigDecimal realPrice = new BigDecimal(0);
        int paramStock = 0;
        String totalprice = params.getString("totalprice");
        String tourid = params.getString("tourid");
        String policyId = params.getString("policyid");
        String personnumber = params.getString("num");
        String singleroomprice = params.getString("singleroomprice");
        String venList = params.getString("venueidList");//旅客接送地点id
        String codeList = params.getString("codeList");//旅客证件号
        Integer isOutgoing = params.getInteger("isOutgoing");
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
//            ProTourPricepolicy pricePolicy = proTourPricePolicyMapper.selectByPrimaryKey(policyid.toUpperCase());
            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());

            BigDecimal salesPrice = null;
//            if (1 == userType) {
//                  直客价
            salesPrice = volunteerProductTourPrice.getDirectprice();
//                  计算实际总价
            realPrice = realPrice.add(perNum.multiply(salesPrice));
//            }
        }

        if (StringUtils.isNotBlank(venList)) {
            String[] spiltVenList = venList.substring(1, venList.length() - 1).trim().split(", ");     //拆分旅客接送地点
            for (int i = 0; i < spiltVenList.length; i++) {
                ProTourVenue proTourVenue = null;
                if (!spiltVenList[i].equals("-1")) {
                    if (isOutgoing != null && isOutgoing == 1) {
                        ProProductDirectVenue proProductDirectVenue = proProductDirectVenueMapper.selectByPrimaryKey(spiltVenList[i]);
                        if (proProductDirectVenue != null) {
                            realPrice = realPrice.add(proProductDirectVenue.getDropoffpricesales());
                            realPrice = realPrice.add(proProductDirectVenue.getShuttlepricesales());
                        } else {
                            proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
                            //接送机
                            if (Objects.nonNull(proTourVenue)) {
                                realPrice = realPrice.add(proTourVenue.getDropoffprice());
                                realPrice = realPrice.add(proTourVenue.getShuttleprice());
                            }
                        }
                    } else {
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
        log.info("validateVolOrderPrice 计算价格:{},前端提交价格:{}", realPrice, totalprice);
        //验证库存
        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid.toUpperCase());
//        int planNum = volunteerProductTour.getPlannum();
        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
        int planNum = proTour.getPlannum();
        int tourEscortNum = proTour.getTourescortnum() == null ? 0 : proTour.getTourescortnum().intValue();

        //订单预定人数
        int orderNum = 0;
        //根据团期id和团期日期获取订单数据
        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(volunteerProductTour.getTourid());
        for (OrdOrderinfo orderinfo : orderinfos) {
            int adultNum = orderinfo.getAdultnum();
            int childNum = orderinfo.getChildnum();
            orderNum += adultNum + childNum;
        }
        //剩余库存数
        int stock = planNum - orderNum - tourEscortNum;
        //大交通库存验证
        int ticketStock1 = 0;
        int ticketStock2 = 0;
//        通过志愿者团次表查询团次主表

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
                log.info("validateVolOrderPrice 产品为直售，但未录入大交通信息！");
            }

        } else if (stock < paramStock) {
            return new Response().failure("validateVolOrderPrice 该产品库存不足！");
        }

        //价格验证成功,开始插入
        BigDecimal total = new BigDecimal(totalprice);
        if (realPrice.compareTo(total) != 0) {
            return new Response().failure("价格有变动，请重新下单！");
        }
        log.info("validateVolOrderPrice 价格验证成功！");
        //查询当前班期所有订单
        OrdOrderinfoExample ordOrderinfoExample = new OrdOrderinfoExample();
        ordOrderinfoExample.or().andTouridEqualTo(volunteerProductTour.getTourid());
        List<OrdOrderinfo> orderInfoTour = ordOrderInfoMapper.selectByExample(ordOrderinfoExample);
        if (Objects.isNull(orderInfoTour) || orderInfoTour.isEmpty()) {//团期没有订单，返回true
            return new Response().success();
        }


//        //获取订单id
//        List<String> orderIds = orderInfoTour.stream().map(OrdOrderinfo::getId).collect(Collectors.toList());
//        //查询当前班期所有旅客
//        OrdOrderTouristExample example = new OrdOrderTouristExample();
//        example.or().andOrderidIn(orderIds);

//        List<OrdOrderTourist> ordOrderTourists = ordOrderTouristMapper.selectByExample(example);
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


    /**
     * @Description: 旅游志愿者--非外发产品插入订单
     * @auther: 史迪旻
     * @date: 10:52 2019-2-27
     * @param: [json, request]
     * @return: com.holyrobot.response.Response
     */
    @Transactional
    public Response addVolOrderInfo(JSONObject json, HttpServletRequest request) {

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
        String shopUserName = json.getString("shopUserName");//志愿者名称
        String shopUserId = json.getString("shopUserId");//志愿者ID
        Integer isOutgoing = json.getInteger("isOutgoing");
        String iD = json.getString("iD");//销售人员Id
        String orgId = json.getString("orgId");//销售人员Id
        String deptID = json.getString("deptID");//销售人员部门ID
        String deptName = json.getString("deptName");//销售人员部门名称
        String directSalesSendId = json.getString("directSalesSendId");//销售人员部门名称
        Boolean isUseDiscount = json.getBoolean("useDiscount"); //是否有优惠

//            接送机价格与单房差总和
        BigDecimal count = new BigDecimal(0);

        int countSingle = 0;

        if (StringUtils.isBlank(nameList) && StringUtils.isBlank(imgUrl)) {
            return new Response().failure("游客信息未上传！");
        }
        if (StringUtils.isBlank(policyid)) {
            return new Response().failure("价格策略信息未上传！");
        }

        String[] policyidList = policyid.substring(1, policyid.length() - 1).trim().split(", ");//价格策略id
        String[] spiltNumList = num.substring(1, num.length() - 1).trim().split(", ");         //拆分价格策略对应的人数

//        下单页面新增国籍、英语姓名等
//        String englishSurnameList = json.getString("englishSurnameList");//英语 姓
//        String englishNameList = json.getString("englishNameList");//英语 名
//        String nationalityNameList = json.getString("nationalityNameList");//国籍
//        JSONArray dateOfBirthList = json.getJSONArray("dateOfBirthList");//生日

        //计算成人儿童数量
        int adultNum = 0;
        int childNum = 0;
        for (int i = 0; i < policyidList.length; i++) {
            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyidList[i]);
            if (Objects.nonNull(volunteerProductTourPrice) && volunteerProductTourPrice.getTouristtype() == 1) {
                adultNum += Integer.parseInt(spiltNumList[i]);
            }
            if (Objects.nonNull(volunteerProductTourPrice) && volunteerProductTourPrice.getTouristtype() == 2) {
                childNum += Integer.parseInt(spiltNumList[i]);
            }
        }
        //当前登录人信息
        WxUser wxUser = (WxUser) request.getSession().getAttribute("wxUserInfo");
        Integer userType = wxUser.getUserType();
        log.info("addVolOrderInfo 当前登录人信息:{}", wxUser);
        log.info("addVolOrderInfo 当前登录人信息toString:{}", JSONObject.toJSONString(wxUser));
      /* WxUser wxUser = new WxUser();
       wxUser.setUserId("cf94048d-50ea-4ff5-9d29-6a7c4e82e954");
       wxUser.setUserType(1);
       wxUser.setNickname("小马哥0721");
       Integer userType = wxUser.getUserType();*/

        //根据产品id查询产品信息
        ProProduct product = proProductMapper.selectByPrimaryKey(proid);
        //根据团次ID查询团次
        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
        //查询目的地id
        ProProductDestinationExample example = new ProProductDestinationExample();
        example.or().andProidEqualTo(proid);
        List<ProProductDestination> proProductDestinations = proProductDestinationMapper.selectByExample(example);
        //回团日期计算
        Calendar cl = Calendar.getInstance();
        Date date = volunteerProductTour.getTourdate();
        cl.setTime(date);
        cl.add(Calendar.DATE, product.getTourdays() - 1);
        Date time = cl.getTime();
        //生成订单编号
        String orderNo = businessService.getOrderNumber(proTour.getTourdate());
        log.info("订单编号:{}", orderNo);
//        生成订单id
        String ordid = UUID.randomUUID().toString();

        //查询出发地id
        ProProductDepartureExample example1 = new ProProductDepartureExample();
        example1.or().andProidEqualTo(proid).andSiteidEqualTo(siteid).andDepartureEqualTo(departure);
        List<ProProductDeparture> departures = proProductDepartureMapper.selectByExample(example1);
        String departureId = null;
        if (Objects.nonNull(departures) && !departures.isEmpty()) {
            departureId = departures.get(0).getDepartureid();
        }

//        查询奖励金
        VolunteerProductTourPriceExample volunteerProductTourPriceExample = new VolunteerProductTourPriceExample();
        volunteerProductTourPriceExample.or().andSiteidEqualTo(siteid).andOrgidEqualTo(orgId).andVolunteerproductidEqualTo(tourid).andDatastatusEqualTo(1);
        List<VolunteerProductTourPrice> volunteerProductTourPrices = volunteerProductTourPriceMapper.selectByExample(volunteerProductTourPriceExample);
        BigDecimal allowance = new BigDecimal(0); //奖励金
        if (Objects.nonNull(volunteerProductTourPrices) && volunteerProductTourPrices.size() > 0) {
            for (int i = 0; i < volunteerProductTourPrices.size(); i++) {
                VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPrices.get(i);
                Integer touristType = volunteerProductTourPrice.getTouristtype();
                if (touristType == 1) { //成人
                    allowance = allowance.add((volunteerProductTourPrice.getAllowance().multiply(new BigDecimal(adultNum))).setScale(3, BigDecimal.ROUND_HALF_UP));
                }
                if (touristType == 2) { //儿童
                    allowance = allowance.add((volunteerProductTourPrice.getAllowance().multiply(new BigDecimal(childNum))).setScale(3, BigDecimal.ROUND_HALF_UP));
                }
            }
        }

//            判断上下级关系是否存在
        VolunteerParentExample volunteerParentExample = new VolunteerParentExample();
        volunteerParentExample.or().andChildidEqualTo(shopUserId).andOrgidEqualTo(orgId).andParentstatusEqualTo(1);
        List<VolunteerParent> volunteerParents = volunteerParentMapper.selectByExample(volunteerParentExample);

        if (Objects.nonNull(volunteerParents) && volunteerParents.size() > 0) {
            VolunteerParent volunteerParent = volunteerParents.get(0);
            if (allowance.compareTo(new BigDecimal(0)) == 1) {
                TravelerRewardRecording travelerRewardRecording = new TravelerRewardRecording();
                String id = UUID.randomUUID().toString();
                travelerRewardRecording.setId(id);
                travelerRewardRecording.setParentid(volunteerParent.getParentid());
                travelerRewardRecording.setChildid(shopUserId);
                travelerRewardRecording.setOrderid(ordid);
                travelerRewardRecording.setOrderno(orderNo);
                travelerRewardRecording.setAllowance(allowance);//奖励金
                travelerRewardRecording.setDatastatus(0);
                travelerRewardRecording.setCreateddate(new Date());
                travelerRewardRecording.setOrgid(orgId);

                int i = travelerRewardRecordingMapper.insertSelective(travelerRewardRecording);
                if (i != 1) {
                    log.info("VolunteerOrderServiceImpl：奖励金记录插入失败！奖励金={}", allowance);
                    return new Response().failure("系统繁忙");
                }
                log.info("VolunteerOrderServiceImpl：奖励金记录插入成功！奖励金={}", allowance);
            } else {
                log.info("VolunteerOrderServiceImpl：无奖励金");
            }
        } else {
            log.info("VolunteerOrderServiceImpl：无上级信息");
        }


        try {
            //订单信息存储
            orderInfo.setId(ordid);//生成主键ID
            orderInfo.setRouteid(proid);//行程ID（暂未有表）可为空
            orderInfo.setTourid(volunteerProductTour.getId());//团次ID
            orderInfo.setOrdername(product.getAliasename());//订单名称
            orderInfo.setScheduledays(product.getTourdays());//行程的总天数
//            orderInfo.setCategory(4);//1，商城采购2.内部下单3.手工录入4.微店直客 5微店erp用户
            orderInfo.setOrdertype(1);//订单类型（团队、散客、单项业务的订单）
            orderInfo.setTourdate(volunteerProductTour.getTourdate());//出团日期
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
            if (userType==1){
                orderInfo.setCreatedby(wxUser.getNickname());//创建人
            }else{
                orderInfo.setCreatedby(wxUser.getMobile());//创建人
            }
            orderInfo.setCreatedbyid(wxUser.getUserId());//创建人ID
            orderInfo.setDeptid("00000000-0000-0000-0000-000000000000");//创建人所在部门ID
            orderInfo.setRevisedby(wxUser.getMobile());//最后修改人
            orderInfo.setOrgid("00000000-0000-0000-0000-000000000000");//子系统标识
            orderInfo.setOrgname("直客无机构");
            orderInfo.setCategory(8);//1：商城采购 2：内部下单  3：手工录单 4：微店B用户 5：微店C 6：pc商城B端用户 7：pc商城C端用户   8: 志愿者微店
//                orderInfo.setTurnbeforecategory(5);
//                System.out.println("微店直客"+orderInfo.getTurnbeforecategory());

            orderInfo.setCustomerunitid("00000000-0000-0000-0000-000000000000");//客户单位ID,obp 无法录入，给定值
            orderInfo.setCustomername("暂无");//客户单位名称

            orderInfo.setReviseddate(new Date());//最后修改日期
            orderInfo.setDatastatus((proTour.getIsack() == null || proTour.getIsack() == 0) ? 0 : 1);//订单状态，二次确认显示以保存：2 ，直销显示报名确认 ：1
            orderInfo.setSignstatus(0);//默认未发单
            orderInfo.setSiteid(siteid);//站点id
            orderInfo.setTicketstatus(0);//票务 0 未安排
            orderInfo.setRoutetypeid(product.getProcategoryid());//线路类型id
            orderInfo.setRoutetypename(product.getProcategory());//线路类型名
            orderInfo.setCustomerunittype(wxUser.getUserType());//客户单位类型
            orderInfo.setPricetype(wxUser.getUserType());//客户单位类型
            orderInfo.setDepid(departureId);
            orderInfo.setIsusediscount(isUseDiscount);//是否有优惠

//            VolunteerApplicationExample example2 = new VolunteerApplicationExample();
//            example2.or().andUseridEqualTo(wxUser.getUserId());
////            example2.or().andUseridEqualTo("00000000-0000-0000-0000-000000000000");
//            List<VolunteerApplication> applicationList = volunteerApplicationMapper.selectByExample(example2);
            //注意！销售人员ID  存放志愿者店铺UserId
            orderInfo.setOrdersaler(shopUserName);//销售人员名称
            orderInfo.setOrdersalerid(shopUserId);//销售人员ID
            orderInfo.setSalerdeptname("");//销售人员部门

            orderInfo.setNewcategory(28);
            orderInfo.setNeworderstatus(10);
            orderInfo.setNewticketstatus(0);

            if (StringUtil.isUUID(deptID)) {
                orderInfo.setSalerdeptid(deptID);//销售人员部门Id
            }
            //计算外发次数
            if (isOutgoing != null && isOutgoing == 1) {
                ProProductDirectSalesProduct proProductDirectSalesProduct = null;
                ProProductDirectSalesProductExample example2 = new ProProductDirectSalesProductExample();
                example2.or().andProidEqualTo(proid).andReceiveridEqualTo(orgId);
                ;
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
                int produtOuterTimes = this.getProdutOuterTimes(proid, orgId);
                orderInfo.setSupplierid(orgId);//供应商id,判别
                orderInfo.setSuppliername(proProductDirectSalesProduct.getReceivername());//供应商name
                orderInfo.setProdutoutertimes(produtOuterTimes + 1);
                //设置外放产品外发人id
                orderInfo.setDirectSalesSendId(directSalesSendId);
            } else {
                orderInfo.setProdutoutertimes(0);
                orderInfo.setSupplierid(product.getOrgid());//供应商id,判别
                orderInfo.setSuppliername(product.getTravelname());//供应商name
            }

            orderInfo.setProducttype(product.getProducttype());
            orderInfo.setRoutedescription(product.getRoutedescription());

            log.info("addVolOrderInfo 开始写入订单信息！");
            //写入之前，设置门店父ID
            ordOrderInfoService.setOrderInfoParentOrgID(orderInfo);
            //写入之前，设置是否总店收标识
            boolean headShopOrgIdByOrderManage = orgInfoService.getHeadShopOrgIdByOrderManage(orderInfo.getSupplierid(), orderInfo.getDirectSalesSendId());
            if (headShopOrgIdByOrderManage) {
                orderInfo.setIsShopOrderManage(1);
            }
            ordOrderInfoMapper.insert(orderInfo);

            //订单游客写入
            List<OrdOrderTourist> orderTourists = new ArrayList<>();
//            String[] splitIsSingleRoomList = null;
            String[] splitIsSingleRoom = null;
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
                splitIsSingleRoom = isSingleRoom.substring(1, isSingleRoom.length() - 1).trim().split(", ");
//                splitIsSingleRoomList = isSingleRoom.substring(1, isSingleRoom.length() - 1).trim().split(", ");  //拆分旅客对应是否有单房差
                String[] spiltAgeList = ageList.substring(1, ageList.length() - 1).trim().split(", ");//拆分年龄spiltAgeList[i]

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
                    if (!spiltVenList[i].equals("-1")) { // -1 = 没有接送
                        orderTourists1.setPickupid(spiltVenList[i]);//旅客接送地点
                        String pickName = "";
                        String pickUpTime = "";
                        BigDecimal jamt = new BigDecimal(0);
                        BigDecimal samt = new BigDecimal(0);
                        BigDecimal shuttle = new BigDecimal(0);
                        BigDecimal dropoff = new BigDecimal(0);
                        if (isOutgoing != null && isOutgoing == 1) {
                            ProProductDirectVenue proProductDirectVenue = proProductDirectVenueMapper.selectByPrimaryKey(spiltVenList[i]);
                            if (proProductDirectVenue != null) {
                                orderTourists1.setPickupid(proProductDirectVenue.getProtourvenueid());
                                pickName = proProductDirectVenue.getVenue();
                                pickUpTime = proProductDirectVenue.getCollectiontime();
                                jamt = proProductDirectVenue.getShuttlepricesales();
                                samt = proProductDirectVenue.getDropoffpricesales();
                                shuttle = proProductDirectVenue.getShuttlepricesales();
                                dropoff = proProductDirectVenue.getDropoffpricesales();
                            } else {
                                ProTourVenue proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
                                pickName = proTourVenue.getVenue();
                                pickUpTime = proTourVenue.getCollectiontime();
                                jamt = proTourVenue.getShuttleprice();
                                samt = proTourVenue.getDropoffprice();
                                shuttle = proTourVenue.getShuttleprice();
                                dropoff = proTourVenue.getDropoffprice();
                            }
                        } else {
                            ProTourVenue proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
                            pickName = proTourVenue.getVenue();
                            pickUpTime = proTourVenue.getCollectiontime();
                            jamt = proTourVenue.getShuttleprice();
                            samt = proTourVenue.getDropoffprice();
                            shuttle = proTourVenue.getShuttleprice();
                            dropoff = proTourVenue.getDropoffprice();
                        }


                        orderTourists1.setPickname(pickName);
                        orderTourists1.setPickuptime(pickUpTime);
                        orderTourists1.setJamt(jamt);//回程车费（接机价）
                        orderTourists1.setSamt(samt);//去程车费（送机价）

//                        计算1
                        count = count.add(shuttle);
                        count = count.add(dropoff);

                    }
                    orderTourists1.setGuestcardtype(spiltCardList[i]);//证件类型
                    orderTourists1.setPriceid(splitpid[i]);//价格策略

                    orderTourists1.setCreatedby(wxUser.getMobile());
                    orderTourists1.setCreatedid(wxUser.getUserId());
                    orderTourists1.setDeptid("00000000-0000-0000-0000-000000000000");
                    orderTourists1.setRevisedby(wxUser.getMobile());

                    orderTourists1.setCreateddate(new Date());
                    orderTourists1.setReviseddate(new Date());
                    orderTourists1.setIssingleroom("1".equals(splitIsSingleRoomList[i]));

                    orderTourists.add(orderTourists1);
                }
            }
            log.info("addVolOrderInfo 开始写入游客信息！");
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
                    VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyidList[i]);
                    OrdOrderPrice ordOrderPrice = new OrdOrderPrice();
                    ordOrderPrice.setId(UUID.randomUUID().toString());//主键id
                    ordOrderPrice.setOrderid(ordid);//关联订单主键id
                    ordOrderPrice.setTourpriceid(policyidList[i]);//关联价格策略id
                    ordOrderPrice.setPricename(volunteerProductTourPrice.getPolicyname());//价格策略名称
                    ordOrderPrice.setVisitornum(Integer.parseInt(spiltNumList[i]));//价格策略对应人数
                    ordOrderPrice.setRebateavg(volunteerProductTourPrice.getRebateprice());//返佣
                    ordOrderPrice.setRebatenum(Integer.parseInt(spiltNumList[i]));//返佣人数
                    ordOrderPrice.setRoomprice(volunteerProductTourPrice.getSingleroomprice() == null ? new BigDecimal(0) : volunteerProductTourPrice.getSingleroomprice());//单房差

//                    计算2
                    if (splitIsSingleRoom.length > i) {
                        if ("1".equals(splitIsSingleRoom[i])) {
                            BigDecimal man = BigDecimal.valueOf(Integer.parseInt(spiltNumList[i]));
                            count = count.add(volunteerProductTourPrice.getSingleroomprice() == null ? new BigDecimal(0) : volunteerProductTourPrice.getSingleroomprice());
//                        count = count.add(volunteerProductTourPrice.getSingleroomprice() == null ? new BigDecimal(0) : volunteerProductTourPrice.getSingleroomprice().multiply(man));
                        }
                    }


                    ordOrderPrice.setIsseat(volunteerProductTourPrice.getIsoccupyseat());//是否占座
//                    ordOrderPrice.setIsseat(true);//是否占座
                    ordOrderPrice.setIschild(volunteerProductTourPrice.getTouristtype() == 2);//是否儿童
                    ordOrderPrice.setSaleprice(volunteerProductTourPrice.getDirectprice());//市场销售价格
//                    ordOrderPrice.setOrgid("00000000-0000-0000-0000-000000000000");//orgid
                    ordOrderPrice.setOrgid(volunteerProductTour.getOrgid());

                    ordOrderPrices.add(ordOrderPrice);
                }
            }
            log.info("addVolOrderInfo 开始写入游客价格信息！");
            for (OrdOrderPrice ordOrderPrice : ordOrderPrices) {
                if (ordOrderPrice.getVisitornum() != 0) {//没人的价格策略不写入
                    ordOrderPriceMapper.insert(ordOrderPrice);//插入
                }
            }
            log.info("addVolOrderInfo 开始写入订单日志！");
            OrdOrderLog ordOrderLog = new OrdOrderLog();
            ordOrderLog.setId(UUID.randomUUID().toString());
            ordOrderLog.setOrderid(ordid);
            ordOrderLog.setOplog("提交新订单");
            ordOrderLog.setOpip(PublicipUtils.getIpAddr(request));
            ordOrderLog.setOpbrowser(PublicipUtils.getBrowser(request));
            ordOrderLog.setOrgid("00000000-0000-0000-0000-000000000000");
            ordOrderLog.setCreatedbyid(wxUser.getUserId());
            ordOrderLog.setCreatedby(wxUser.getMobile());

            ordOrderLog.setCreateddate(new Date());
            ordOrderLogMapper.insert(ordOrderLog);
            //是否插入客户中间表标识，默认true
            boolean crmUserIdentify = true;
            //客户对象
            CrmAccountMrgUser crmAccountMrgUser = new CrmAccountMrgUser();
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
                criteria.andOrgidEqualTo(product.getOrgid());
                //判断买家的orgid相等
                //criteria.andPurchaserorgidEqualTo(userOrgId);

                //依据orgId 和手机号码去重
                criteria.andMobileEqualTo(tacontactmobile);
                List<CrmAccountMrg> crmAccountMrgs = crmAccountMrgMapper.selectByExample(crmAccountMrgExample);
                //往来单位ID
                String acctmrgId;
                //是否插入客户单位中间表标识，默认true
                boolean crmIdentify = true;
                CrmAccountMrg crmAccountMrg = new CrmAccountMrg();
                log.info("查询返回的客户信息:{}", crmAccountMrgs);
                if (crmAccountMrgs == null || crmAccountMrgs.size()==0) {
                    //客户单位表中，没有该客户信息，保存其用户
                    log.info("开始写入客户信息！");
//                    CrmAccountMrg crmAccountMrg = new CrmAccountMrg();
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
                        CommParameterExample commParameterExample1 = new CommParameterExample();
                        commParameterExample1.or().andOrgidEqualTo(userOrgId).andPtypeEqualTo(3).andDatastatusEqualTo(1).andPnameLike("其他");
                        List<CommParameter> commParameters1 = commParameterMapper.selectByExample(commParameterExample);
                        if(commParameters1!=null&&commParameters1.size()>0){
                            crmAccountMrg.setCategoryid(commParameters.get(0).getId());
                        }else{
                            crmAccountMrg.setCategoryid("00000000-0000-0000-0000-000000000000");
                        }
                        crmAccountMrg.setCategoryname("其他");
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
                    crmAccountMrg.setOrgid(product.getOrgid());
                    crmAccountMrg.setReviseddate(new Date());
                    crmAccountMrg.setRevisedby(product.getCreatedby());
                    crmAccountMrg.setDatastatus(1);
                    crmAccountMrg.setCreditamt(new BigDecimal(0));
                    crmAccountMrg.setCreditnumber(0);
                    crmAccountMrg.setPurchaserorgid(userOrgId);
                    crmAccountMrgMapper.insert(crmAccountMrg);
                }else{
                    acctmrgId = crmAccountMrgs.get(0).getId();
                    crmAccountMrg = crmAccountMrgs.get(0);
                    //查询客户单位中间表是否有数据
                    CrmAccountMrgIntermediateExample example3 = new CrmAccountMrgIntermediateExample();
                    example3.or().andOrgidEqualTo(crmAccountMrg.getOrgid()).andCrmidEqualTo(crmAccountMrg.getId());
                    List<CrmAccountMrgIntermediate> crmAccountMrgIntermediates = crmAccountMrgIntermediateMapper.selectByExample(example3);
                    if(crmAccountMrgIntermediates.size()>0){
                        //如果中间表有数据,将客户单位中间表插入标识设置为false
                        crmIdentify = false;
                    }
                }
                //客户单位中间表数据写入
                if(crmIdentify){
                    CrmAccountMrgIntermediate crmAccountMrgIntermediate = new CrmAccountMrgIntermediate();
                    crmAccountMrgIntermediate.setId(UUID.randomUUID().toString());
                    crmAccountMrgIntermediate.setOrgid(orgId);
                    crmAccountMrgIntermediate.setCrmid(crmAccountMrg.getId());
                    crmAccountMrgIntermediate.setCrmorgid(erpUser.getOrgID());
                    crmAccountMrgIntermediateMapper.insert(crmAccountMrgIntermediate);
                    log.info("客户单位中间表数据写入成功！");
                }
                //新增用戶到客戶表
                if(erpUser.getUserType()!=1) {
                    CrmAccountMrgUserExample crmAccountMrgUserExample = new CrmAccountMrgUserExample();
                    CrmAccountMrgUserExample.Criteria criteria1 = crmAccountMrgUserExample.createCriteria();
                    //依据orgId 和手机号码+userType去重
                    criteria1.andMobileEqualTo(erpUser.getMobile());
                    criteria1.andOrgidEqualTo(orderInfo.getSupplierid());
                    //1：单位客户 2：个人客户
                    criteria1.andUsertypeEqualTo(1);
                    List<CrmAccountMrgUser> crmAccountMrgUsers = crmAccountMrgUserMapper.selectByExample(crmAccountMrgUserExample);
                    if (crmAccountMrgUsers == null || crmAccountMrgUsers.size() == 0) {
//                        CrmAccountMrgUser crmAccountMrgUser = new CrmAccountMrgUser();
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
                        crmAccountMrgUser.setOrgid(product.getOrgid());
                        crmAccountMrgUser.setReviseddate(new Date());
                        crmAccountMrgUser.setRevisedby(product.getCreatedby());
                        crmAccountMrgUser.setSource(2);
                        crmAccountMrgUserMapper.insert(crmAccountMrgUser);
                    }else{
                        crmAccountMrgUser = crmAccountMrgUsers.get(0);
                    }
                }else {
                    //管理员 不要插入用户表
                    crmUserIdentify = false;
                }
            }else{
                //游客存入
                CrmAccountMrgUserExample  crmAccountMrgUserExample = new CrmAccountMrgUserExample();
                CrmAccountMrgUserExample.Criteria criteria = crmAccountMrgUserExample.createCriteria();
                //依据orgId 和手机号码 + userType 去重
                criteria.andMobileEqualTo(wxUser.getMobile());
                criteria.andOrgidEqualTo(orderInfo.getSupplierid());
                //1：单位客户 2：个人客户
                criteria.andUsertypeEqualTo(2);
                List<CrmAccountMrgUser> crmAccountMrgUsers = crmAccountMrgUserMapper.selectByExample(crmAccountMrgUserExample);
                if (crmAccountMrgUsers==null||crmAccountMrgUsers.isEmpty()){
//                    CrmAccountMrgUser crmAccountMrgUser = new CrmAccountMrgUser();
                    crmAccountMrgUser.setId(UUID.randomUUID().toString());
                    crmAccountMrgUser.setMobile(wxUser.getMobile());
                    crmAccountMrgUser.setGender(3);
                    crmAccountMrgUser.setAcctmrgid("00000000-0000-0000-0000-000000000000");
                    crmAccountMrgUser.setUsertype(2);
                    crmAccountMrgUser.setDatastatus(1);
                    crmAccountMrgUser.setCreateddate(new Date());
                    crmAccountMrgUser.setCreatedby(product.getCreatedby());
                    crmAccountMrgUser.setCreatedbyid(product.getCreatedbyid());
                    crmAccountMrgUser.setDeptid(product.getDeptid());
                    crmAccountMrgUser.setOrgid(product.getOrgid());
                    crmAccountMrgUser.setReviseddate(new Date());
                    crmAccountMrgUser.setRevisedby(product.getCreatedby());
                    crmAccountMrgUser.setSource(2);
                    crmAccountMrgUser.setUsername(wxUser.getMobile());
                    crmAccountMrgUserMapper.insert(crmAccountMrgUser);
                }else{
                    crmAccountMrgUser = crmAccountMrgUsers.get(0);
                }

            }

            //管理员不能插入
            if(crmUserIdentify){
                // 查询客户单位中间表是否有数据
                CrmAccountMrgUserIntermediateExample example3 = new CrmAccountMrgUserIntermediateExample();
                example3.or().andOrgidEqualTo(orgId).andCrmuseridEqualTo(wxUser.getUserId());
                List<CrmAccountMrgUserIntermediate> crmAccountMrgUserIntermediates = crmAccountMrgUserIntermediateMapper.selectByExample(example3);
                if(crmAccountMrgUserIntermediates.size()>0){
                    //如果中间表有数据,将客户中间表插入标识设置为false
                    crmUserIdentify = false;
                }
            }

            //客户中间表数据写入
            if(crmUserIdentify){
                CrmAccountMrgUserIntermediate crmAccountMrgUserIntermediate = new CrmAccountMrgUserIntermediate();
                crmAccountMrgUserIntermediate.setId(UUID.randomUUID().toString());
                crmAccountMrgUserIntermediate.setOrgid(orgId);
                crmAccountMrgUserIntermediate.setCrmuserid(crmAccountMrgUser.getId());
                crmAccountMrgUserIntermediate.setUserid(wxUser.getUserId());
                crmAccountMrgUserIntermediateMapper.insert(crmAccountMrgUserIntermediate);
                log.info("客户中间表数据写入成功！");
            }

//            订单大交通表写入
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
            throw new RuntimeException("addVolOrderInfo 志愿者(非外发)订单保存异常！");
        }
        log.info("addVolOrderInfo 志愿者(非外发)订单相关信息写入完成！");

        HttpResponse httpResponse = HttpUtils.httpClientGet(getOrgInfoUrl + product.getOrgid());
        OrgInfoExtensionDto orgInfoExtensionDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), OrgInfoExtensionDto.class);

        Map map = new HashMap();
        map.put("orderNo", orderNo);
        map.put("orderId", orderInfo.getId());
        map.put("travelAgencyPhone", orgInfoExtensionDto.getPhone());

        businessService.addOrdInfoFile(product.getOrgid(), ordid, proid);

        log.info("addVolOrderInfo 开始写入佣金信息....");

        Integer quantity = this.insertCommRecord(json, request, orderInfo, count);
        if (quantity.equals(1)) {
            log.info("addVolOrderInfo 佣金写入成功!");
        } else {
            log.info("addVolOrderInfo 佣金写入失败!");
        }

        return new Response().success(map);

    }


    /**
     * @Description: 旅游志愿者--外发产品价格验证
     * @auther: 史迪旻
     * @date: 16:06 2019-2-26
     * @param: [params, request]
     * @return: com.holyrobot.response.Response
     */
//    @Transactional
//    public Response validateOutOrderPrice(JSONObject params, HttpServletRequest request) {
//        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
//        log.info("validateOutOrderPrice 当前登录人信息:{}", wxUserInfo);
//        if (Objects.isNull(wxUserInfo)) {
//            return new Response().failure("用户未登录！");
//        }
//        Integer userType = wxUserInfo.getUserType();
//        BigDecimal realPrice = new BigDecimal(0);
//        int paramStock = 0;
//        String totalprice = params.getString("totalprice");
//
//        String tourid = params.getString("tourid");
//        String policyId = params.getString("policyid");
//        String personnumber = params.getString("num");
//        String singleroomprice = params.getString("singleroomprice");
//        String venList = params.getString("venueidList");//旅客接送地点id
//        String codeList = params.getString("codeList");//旅客证件号
//        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", ");
//        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");
//        String[] splitCode = null;
//        if (StringUtils.isNotBlank(codeList)) {
//            splitCode = codeList.substring(1, codeList.length() - 1).trim().split(", ");      //拆分获取旅客证件号
//        }
//
//        //计算出游人数
//        for (int i = 0; i < splitPersonnumber.length; i++) {
//            paramStock += Integer.parseInt(splitPersonnumber[i]);
//        }
//        //计算价格
//        for (int i = 0; i < splitPolicyid.length; i++) {
//            String policyid = splitPolicyid[i];//价格策略id
//            int personNum = Integer.parseInt(splitPersonnumber[i]);//价格策略对应的人数
//            BigDecimal perNum = BigDecimal.valueOf(personNum);
//
//            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());
////            直客价
//            BigDecimal salesPrice = volunteerProductTourPrice.getDirectprice();
//            //计算实际总价
//            realPrice = realPrice.add(perNum.multiply(salesPrice));
//
//        }
//
//        if (StringUtils.isNotBlank(venList)) {
//            String[] spiltVenList = venList.substring(1, venList.length() - 1).trim().split(", ");     //拆分旅客接送地点
//            for (int i = 0; i < spiltVenList.length; i++) {
//                ProTourVenue proTourVenue = null;
//                if (!spiltVenList[i].equals("-1")) {
//                    proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
//                }
//                //接送机
//                if (Objects.nonNull(proTourVenue)) {
//                    realPrice = realPrice.add(proTourVenue.getDropoffprice());
//                    realPrice = realPrice.add(proTourVenue.getShuttleprice());
//                }
//            }
//        }
//        if (StringUtils.isNotBlank(singleroomprice)) {//单房差计算（直客验证单房差的准确性暂未做）
//            realPrice = realPrice.add(new BigDecimal(singleroomprice));
//        }
//        log.info("validateOutOrderPrice 计算价格:{},前端提交价格:{}", realPrice, totalprice);
//        //验证库存 旅游志愿者
//        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid.toUpperCase());
//        int planNum = volunteerProductTour.getPlannum();
//        //订单预定人数
//        int orderNum = 0;
//        //根据团期id和团期日期获取订单数据
//        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(volunteerProductTour.getTourid());
//        for (OrdOrderinfo orderinfo : orderinfos) {
//            int adultNum = orderinfo.getAdultnum();
//            int childNum = orderinfo.getChildnum();
//            orderNum += adultNum + childNum;
//        }
//        //剩余库存数
//        int stock = planNum - orderNum;
//        //大交通库存验证
//        int ticketStock1 = 0;
//        int ticketStock2 = 0;
////        通过志愿者团次表查询团次主表
//        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
//
//        if (proTour.getIsack() != null && proTour.getIsack() == 1) {//判断是否需要查询大交通库存
//            ProTourTrafficExample trafficExample = new ProTourTrafficExample();
//            trafficExample.or().andTouridEqualTo(tourid);
//            List<ProTourTraffic> proTourTraffics = proTourTrafficMapper.selectByExample(trafficExample);
//            List<String> resTrafficId = proTourTraffics.stream().map(ProTourTraffic::getTrafficproductid).collect(Collectors.toList());
//            if (proTour.getHastraffic() == 9) {//机票
//                ResFlightProductExample example = new ResFlightProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResFlightProduct> resFlightProducts = resFlightProductMapper.selectByExample(example);//机票都是固定计划位
//                ticketStock1 = resFlightProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resFlightProducts.get(0).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 10) {//火车票
//                ResTrainProductExample example = new ResTrainProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResTrainProduct> resTrainProducts = resTrainProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resTrainProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(0).getTicketnumber();
//                ticketStock2 = resTrainProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(1).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 11) {//汽车票
//                ResBusProductExample example = new ResBusProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResBusProduct> resBusProducts = resBusProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resBusProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(0).getTicketnumber();
//                ticketStock2 = resBusProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(1).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 12) {//船票
//                ResShipProductExample example = new ResShipProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResShipProduct> resShipProducts = resShipProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resShipProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(0).getTicketnumber();
//                ticketStock2 = resShipProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(1).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else {
//                log.info("validateOutOrderPrice 产品为直售，但未录入大交通信息！");
//            }
//
//        } else if (stock < paramStock) {
//            return new Response().failure("该产品库存不足！");
//        }
//
//        //价格验证成功,开始插入
//        BigDecimal total = new BigDecimal(totalprice);
//        if (realPrice.compareTo(total) != 0) {
//            return new Response().failure("价格有变动，请重新下单！");
//        }
//        log.info("validateOutOrderPrice 价格验证成功！");
//        //查询当前班期所有订单
//        OrdOrderinfoExample ordOrderinfoExample = new OrdOrderinfoExample();
//        ordOrderinfoExample.or().andTouridEqualTo(volunteerProductTour.getTourid());
//        List<OrdOrderinfo> orderInfoTour = ordOrderInfoMapper.selectByExample(ordOrderinfoExample);
//        if (Objects.isNull(orderInfoTour) || orderInfoTour.isEmpty()) {//团期没有订单，返回true
//            return new Response().success();
//        }
//
//
//        //获取订单id
//        List<String> orderIds = orderInfoTour.stream().map(OrdOrderinfo::getId).collect(Collectors.toList());
//        //查询当前班期所有旅客
//        OrdOrderTouristExample example = new OrdOrderTouristExample();
//        example.or().andOrderidIn(orderIds);
//
//        List<OrdOrderTourist> ordOrderTourists = ordOrderTouristMapper.selectByExample(example);
////        if (Objects.nonNull(ordOrderTourists) && !ordOrderTourists.isEmpty() && Objects.nonNull(splitCode)) {
////            //身份证重复验证
////            List<String> code = new ArrayList<>();
////            Collections.addAll(code, splitCode);//封装到list
////            //获取游客的证件号
////            List<String> guestcards = ordOrderTourists.stream().map(OrdOrderTourist::getGuestcard).collect(Collectors.toList());
////            //验证是否重复
////            for (String codePage : code) {
////                for (String card : guestcards) {
////                    if (codePage.equals(card)) {
////                        return new Response().failure("证件号为：" + card + "的旅客已预订过本次团期！");
////                    }
////                }
////            }
////        }
//        return new Response().success();
//    }


    /**
     * @Description: 旅游志愿者--外发产品订单写入方法
     * @auther: 史迪旻
     * @date: 16:07 2019-2-26
     * @param: [json, request]
     * @return: com.holyrobot.response.Response
     */
//    @Transactional
//    public Response addOutOrderInfo(JSONObject json, HttpServletRequest request) {
//
//        OrdOrderinfo orderInfo = new OrdOrderinfo();
//        String proid = json.getString("proid");//获取产品id
//        String tourid = json.getString("tourid");//获取团次id
//        String policyid = json.getString("policyid");//价格策略id
//        String num = json.getString("num");//价格策略对应人数
//        String departure = json.getString("departure");//出发地
//        String nameList = json.getString("nameList");//旅客名
//        String codeList = json.getString("codeList");//旅客证件号
//        String telList = json.getString("telList");//旅客电话
//        JSONArray telList1 = json.getJSONArray("telList");
//        List<String> telList2 = telList1.toJavaList(String.class);
//        String mainTel = json.getString("mainTel");//联系人电话
//        String mainName = json.getString("mainName");//联系人姓名
//        String pidList = json.getString("policyList");//游客对应价格策略
//        String remark = json.getString("remark");//联系人备注
//        String sexList = json.getString("sexList");//旅客性别
//        String cardList = json.getString("cardtypeList");//旅客证件类型
//        String venList = json.getString("venueidList");//旅客接送地点id
//        String totalprice = json.getString("totalprice");//订单价格
//        String siteid = json.getString("siteid");//站点id
//        String imgUrl = json.getString("tourImgs");//h5 游客信息图片上传
//        String isSingleRoom = json.getString("isSingleRoom");//游客是否选择单房差， 约定 1是 ， 2否
//        String ageList = json.getString("ageList");//年龄
//        Boolean isUseDiscount = json.getBoolean("useDiscount"); //是否有优惠
//        String userName = json.getString("userName");//销售人员名称
//        String iD = json.getString("iD");//销售人员Id
//        String orgId = json.getString("orgId");//销售人员Id
//        String deptID = json.getString("deptID");//销售人员部门ID
//        String deptName = json.getString("deptName");//销售人员部门名称
//        if (StringUtils.isBlank(nameList) && StringUtils.isBlank(imgUrl)) {
//            return new Response().failure("游客信息未上传！");
//        }
//        if (StringUtils.isBlank(policyid)) {
//            return new Response().failure("价格策略信息未上传！");
//        }
//        String directSalesSendId = json.getString("directSalesSendId");//外发产品发送人id
//        //设置外放产品外发人id
//        orderInfo.setDirectSalesSendId(directSalesSendId);
//
//        String[] policyidList = policyid.substring(1, policyid.length() - 1).trim().split(", ");//价格策略id
//        String[] spiltNumList = num.substring(1, num.length() - 1).trim().split(", ");         //拆分价格策略对应的人数
//
//        //        下单页面新增国籍、英语姓名等
////        String englishSurnameList = json.getString("englishSurnameList");//英语 姓
////        String englishNameList = json.getString("englishNameList");//英语 名
////        String nationalityNameList = json.getString("nationalityNameList");//国籍
////        JSONArray dateOfBirthList = json.getJSONArray("dateOfBirthList");//生日
//
//        //计算成人儿童数量
//        int adultNum = 0;
//        int childNum = 0;
//        for (int i = 0; i < policyidList.length; i++) {
//            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyidList[i].toUpperCase());
//
//            if (Objects.nonNull(volunteerProductTourPrice) && volunteerProductTourPrice.getTouristtype() == 1) {
//                adultNum += Integer.parseInt(spiltNumList[i]);
//            }
//            if (Objects.nonNull(volunteerProductTourPrice) && volunteerProductTourPrice.getTouristtype() == 2) {
//                childNum += Integer.parseInt(spiltNumList[i]);
//            }
//        }
//        //当前登录人信息
//        WxUser wxUser = (WxUser) request.getSession().getAttribute("wxUserInfo");
//        Integer userType = wxUser.getUserType();
//        log.info("addOutOrderInfo 当前登录人信息:{}", wxUser);
//        log.info("addOutOrderInfo 当前登录人信息toString:{}", JSONObject.toJSONString(wxUser));
////        查外发产品相关属性
//        ProProductDirectSalesProduct proProductDirectSalesProduct = null;
//        ProProductDirectSalesProductExample example2 = new ProProductDirectSalesProductExample();
//        example2.or().andProidEqualTo(proid).andReceiveridEqualTo(orgId);
//        List<ProProductDirectSalesProduct> proProductDirectSalesProducts = proProductDirectSalesProductMapper.selectByExample(example2);
//
//        if (proProductDirectSalesProducts != null && proProductDirectSalesProducts.size() > 0) {
//            proProductDirectSalesProduct = proProductDirectSalesProducts.get(0);
//        } else {
//            log.error("外发产品查询异常，产品Id={}", proid);
//            proProductDirectSalesProduct = new ProProductDirectSalesProduct();
//            proProductDirectSalesProduct.setSuppliercityid(Constants.UUID_DEFAULT);
//            proProductDirectSalesProduct.setReceivername("暂无");
//            proProductDirectSalesProduct.setReceiverid(Constants.UUID_DEFAULT);
//        }
//
//        //根据产品id查询产品信息
//        ProProduct product = proProductMapper.selectByPrimaryKey(proid);
//        //根据团次ID查询团次
////        ProTour proTour = proTourMapper.selectByPrimaryKey(tourid);
//        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
//        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid()); //获取主表团次信息
//        //查询目的地id
//        ProProductDestinationExample example = new ProProductDestinationExample();
//        example.or().andProidEqualTo(proid);
//        List<ProProductDestination> proProductDestinations = proProductDestinationMapper.selectByExample(example);
//        //回团日期计算
//        Calendar cl = Calendar.getInstance();
//        Date date = volunteerProductTour.getTourdate();
//        cl.setTime(date);
//        cl.add(Calendar.DATE, product.getTourdays() - 1);
//        Date time = cl.getTime();
//        //生成订单编号
//        String orderNo = businessService.getOrderNumber(proTour.getTourdate());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
////        if (cx.equals(product.getProcategoryid())) {
////            orderNo = "CX" + simpleDateFormat.format(volunteerProductTour.getTourdate()) + "0" + product.getTourdays() + RandomStringUtils.randomNumeric(4);
////            ;
////        }
////        if (jw.equals(product.getProcategoryid())) {
////            orderNo = "JW" + simpleDateFormat.format(volunteerProductTour.getTourdate()) + "0" + product.getTourdays() + RandomStringUtils.randomNumeric(4);
////            ;
////        }
////        if (dx.equals(product.getProcategoryid())) {
////            orderNo = "DX" + simpleDateFormat.format(volunteerProductTour.getTourdate()) + "0" + product.getTourdays() + RandomStringUtils.randomNumeric(4);
////            ;
////        }
//        log.info("addOutOrderInfo 订单编号:{}", orderNo);
//        //查询出发地id
//        ProProductDepartureExample example1 = new ProProductDepartureExample();
//        example1.or().andProidEqualTo(proid).andSiteidEqualTo(siteid).andDepartureEqualTo(departure);
//        List<ProProductDeparture> departures = proProductDepartureMapper.selectByExample(example1);
//        String departureId = null;
//        if (Objects.nonNull(departures) && !departures.isEmpty()) {
//            departureId = departures.get(0).getDepartureid();
//        }
//
//        try {
//            //订单信息存储
//            String ordid = UUID.randomUUID().toString();
//            orderInfo.setId(ordid);//生成主键ID
//            orderInfo.setRouteid(proid);//行程ID（暂未有表）可为空
//            orderInfo.setTourid(volunteerProductTour.getId());//团次ID
//            orderInfo.setOrdername(product.getAliasename());//订单名称
//            orderInfo.setScheduledays(product.getTourdays());//行程的总天数
////            orderInfo.setCategory(4);//1，商城采购2.内部下单3.手工录入4.微店直客 5微店erp用户
//            orderInfo.setOrdertype(1);//订单类型（团队、散客、单项业务的订单）
//            orderInfo.setTourdate(volunteerProductTour.getTourdate());//出团日期
//            orderInfo.setReturndate(time);//回团日期
//            orderInfo.setDepname(departure);//出发地
//            orderInfo.setDestname(product.getDestination());//目的地
//            if (Objects.nonNull(proProductDestinations) && !proProductDestinations.isEmpty()) {
//                orderInfo.setDestid(proProductDestinations.get(0).getDestinationid());//目的地id
//            }
//            orderInfo.setOrderno(orderNo);//订单编号
//
////			orderInfo.setOrdersourceid(UUID.randomUUID().toString());//订单来源ID 暂时为空
////			orderInfo.setOrdersource("");//暂时为空
//            orderInfo.setContact(mainName);//联系人
//            orderInfo.setMobile(mainTel);//联系人手机号
////			orderInfo.setEmail("");//obp订单无联系人邮箱 ， h5微商城有
//            orderInfo.setHastraffic(proTour.getHastraffic());//是否含有机票
//            orderInfo.setAdjustamt(new BigDecimal(0));//调整金额
//            orderInfo.setPayableamt(new BigDecimal(totalprice));//应付金额
//
//            orderInfo.setReceivableamt(new BigDecimal(0));//应收金额
//            orderInfo.setAdultnum(adultNum);//成人数量
//            orderInfo.setChildnum(childNum);//儿童数量
////			orderInfo.setGuidenum();//全陪人数暂时为空
//            orderInfo.setComment(remark);//备注
//            orderInfo.setCreateddate(new Date());//创建日期
//
//            orderInfo.setCreatedby(wxUser.getNickname());//创建人
//            orderInfo.setCreatedbyid(wxUser.getUserId());//创建人ID
//            orderInfo.setDeptid("00000000-0000-0000-0000-000000000000");//创建人所在部门ID
//            orderInfo.setRevisedby(wxUser.getNickname());//最后修改人
//            orderInfo.setOrgid("00000000-0000-0000-0000-000000000000");//子系统标识
//            orderInfo.setOrgname("直客无机构");
//            orderInfo.setCategory(8);//1：商城采购 2：内部下单  3：手工录单 4：微店B用户 5：微店C 6：pc商城B端用户 7：pc商城C端用户 8: 志愿者微店
//            orderInfo.setCustomerunitid("00000000-0000-0000-0000-000000000000");//客户单位ID,obp 无法录入，给定值
//            orderInfo.setCustomername("暂无");//客户单位名称
//
//            orderInfo.setReviseddate(new Date());//最后修改日期
//            orderInfo.setDatastatus((proTour.getIsack() == null || proTour.getIsack() == 0) ? 0 : 1);//订单状态，二次确认显示以保存：2 ，直销显示报名确认 ：1
//            orderInfo.setSignstatus(0);//默认未发单
//
//            orderInfo.setSupplierid(proProductDirectSalesProduct.getReceiverid());//供应商id,判别
//            orderInfo.setSuppliername(proProductDirectSalesProduct.getReceivername());//供应商name
//            orderInfo.setSiteid(siteid);//站点id
//            orderInfo.setTicketstatus(0);//票务 0 未安排
//            orderInfo.setRoutetypeid(product.getProcategoryid());//线路类型id
//            orderInfo.setRoutetypename(product.getProcategory());//线路类型名
//            orderInfo.setCustomerunittype(2);//客户单位类型 1：同行；2：直客
//            orderInfo.setDepid(departureId);
//            if (isUseDiscount != null) {
//                orderInfo.setIsusediscount(false);//是否有优惠
//            } else {
//                orderInfo.setIsusediscount(isUseDiscount);//是否有优惠
//            }
//
//            VolunteerApplicationExample example3 = new VolunteerApplicationExample();
//            example3.or().andUseridEqualTo(wxUser.getUserId());
//            List<VolunteerApplication> applicationList = volunteerApplicationMapper.selectByExample(example3);
//
//            orderInfo.setOrdersaler(applicationList.get(0).getUsername());//销售人员名称
//            orderInfo.setSalerdeptname(deptName);//销售人员部门
//            if (StringUtil.isUUID(deptID)) {
//                orderInfo.setSalerdeptid(deptID);//销售人员部门I
//            }
//            if (StringUtil.isUUID(wxUser.getUserId())) {
//                orderInfo.setOrdersalerid(wxUser.getUserId());//销售人员ID
//            }
//
//
//            //查询转发次数
//            int produtOuterTimes = this.getProdutOuterTimes(proid, proProductDirectSalesProduct.getReceiverid());
//            orderInfo.setProdutoutertimes(produtOuterTimes + 1);
//
//            log.info("addVolOrderInfo 开始写入佣金信息....");
//            Integer quantity = this.insertCommRecord(json, request, orderInfo);
//            if (quantity.equals(1)) {
//                log.info("addVolOrderInfo 佣金写入成功!");
//            } else {
//                log.info("addVolOrderInfo 佣金写入失败!");
//            }
//            log.info("addOutOrderInfo 开始写入订单信息！");
//            ordOrderInfoMapper.insert(orderInfo);
//
//            //订单游客写入
//            List<OrdOrderTourist> orderTourists = new ArrayList<>();
//
//            if (StringUtils.isNotBlank(nameList)) {//循环写入游客信息（后期改为批量）
//                //旅客信息拆分
//                String[] splitName = nameList.substring(1, nameList.length() - 1).trim().split(", ");      //拆分获取旅客姓名
//                String[] splitTel = telList.substring(1, telList.length() - 1).split(", ");         //拆分获取旅客电话
//                String[] splitCode = codeList.substring(1, codeList.length() - 1).trim().split(", ");      //拆分获取旅客证件号
//                String[] splitpid = pidList.substring(1, pidList.length() - 1).trim().split(", ");         //旅客对应的价格策略
//                String[] spiltSexList = sexList.substring(1, sexList.length() - 1).trim().split(", ");     //拆分性别
//                String[] spiltVenList = venList.substring(1, venList.length() - 1).trim().split(", ");     //拆分旅客接送地点
//                String[] spiltCardList = cardList.substring(1, cardList.length() - 1).trim().split(", ");  //拆分旅客证件类型地点
//                String[] splitIsSingleRoomList = isSingleRoom.substring(1, isSingleRoom.length() - 1).trim().split(", ");  //拆分旅客对应是否有单房差
//                String[] spiltAgeList = ageList.substring(1, ageList.length() - 1).trim().split(", ");//拆分年龄spiltAgeList[i]
//
//                for (int i = 0; i < splitName.length; i++) {
//                    OrdOrderTourist orderTourists1 = new OrdOrderTourist();
//                    orderTourists1.setId(UUID.randomUUID().toString());//游客id
//                    orderTourists1.setOrderid(ordid);//订单id
//                    orderTourists1.setGuestcard(splitCode[i]);//证件号
//                    //计算年龄
//                    orderTourists1.setGuestage(spiltAgeList[i]);
////                    if (i + 1 > splitTel.length) {//判断
////                        orderTourists1.setGuesttelphone("");//联系方式
////                    } else {
////                        orderTourists1.setGuesttelphone(splitTel[i]);
////                    }
//                    orderTourists1.setGuesttelphone(telList2.get(i));
//                    orderTourists1.setGuestname(splitName[i]);//旅客姓名
//                    orderTourists1.setGuestsex(spiltSexList[i]);//旅客性别
//                    if (!spiltVenList[i].equals("-1")) {
//                        orderTourists1.setPickupid(spiltVenList[i]);//旅客接送地点
//                        ProTourVenue proTourVenue = proTourVenueMapper.selectByPrimaryKey(spiltVenList[i]);//获取上车地点
//                        orderTourists1.setPickname(proTourVenue.getVenue());
//                        orderTourists1.setPickuptime(proTourVenue.getCollectiontime());
//                        orderTourists1.setJamt(proTourVenue.getShuttleprice());//回程车费（接机价）
//                        orderTourists1.setSamt(proTourVenue.getDropoffprice());//去程车费（送机价）
//                    }
//                    orderTourists1.setGuestcardtype(spiltCardList[i]);//证件类型
//                    orderTourists1.setPriceid(splitpid[i]);//价格策略
//                    orderTourists1.setCreatedby(wxUser.getNickname());
//                    orderTourists1.setCreatedid(wxUser.getUserId());
//                    orderTourists1.setDeptid("00000000-0000-0000-0000-000000000000");
//                    orderTourists1.setRevisedby(wxUser.getNickname());
//                    orderTourists1.setCreateddate(new Date());
//                    orderTourists1.setReviseddate(new Date());
//                    orderTourists1.setIssingleroom("1".equals(splitIsSingleRoomList[i]));
//
//                    orderTourists.add(orderTourists1);
//                }
//            }
//            log.info("addOutOrderInfo 开始写入游客信息！");
//            if (Objects.nonNull(orderTourists) && !orderTourists.isEmpty()) {
//                for (OrdOrderTourist orderTourist : orderTourists) {
//                    ordOrderTouristMapper.insert(orderTourist);//插入
//                }
//            }
//
//            //若上传图片保存游客信息 ，存储图片
//            List<OrdOrderTouristImg> ordOrderTouristImgs = new ArrayList<>();
//            if (StringUtils.isNotBlank(imgUrl)) {//判断是否为空
//                String[] splitImgList = imgUrl.substring(1, imgUrl.length() - 1).trim().split(", ");//拆分游客信息照片
//                for (int i = 0; i < splitImgList.length; i++) {
//                    OrdOrderTouristImg ordOrderTouristImg = new OrdOrderTouristImg();
//                    ordOrderTouristImg.setId(UUID.randomUUID().toString());
//                    ordOrderTouristImg.setOrderid(ordid);
//                    ordOrderTouristImg.setImgurl(splitImgList[i]);
//                    ordOrderTouristImgs.add(ordOrderTouristImg);
//                }
//
//            }
//            if (Objects.nonNull(ordOrderTouristImgs) && !ordOrderTouristImgs.isEmpty()) {
//                for (OrdOrderTouristImg ordOrderTouristImg : ordOrderTouristImgs) {
//                    ordOrderTouristImgMapper.insert(ordOrderTouristImg);
//                }
//            }
//            //订单价格表插入
//            List<OrdOrderPrice> ordOrderPrices = new ArrayList<>();
//            if (policyidList.length > 0) {
//                for (int i = 0; i < policyidList.length; i++) {
//                    //查询对应的价格策略信息
//                    VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyidList[i]);
//                    OrdOrderPrice ordOrderPrice = new OrdOrderPrice();
//                    ordOrderPrice.setId(UUID.randomUUID().toString());//主键id
//                    ordOrderPrice.setOrderid(ordid);//关联订单主键id
//                    ordOrderPrice.setTourpriceid(policyidList[i]);//关联价格策略id
//                    ordOrderPrice.setPricename(volunteerProductTourPrice.getPolicyname());//价格策略名称
//                    ordOrderPrice.setVisitornum(Integer.parseInt(spiltNumList[i]));//价格策略对应人数
//                    ordOrderPrice.setRebateavg(volunteerProductTourPrice.getRebateprice());//返佣
//                    ordOrderPrice.setRebatenum(Integer.parseInt(spiltNumList[i]));//返佣人数
//                    ordOrderPrice.setRoomprice(volunteerProductTourPrice.getSingleroomprice());//单房差
//                    ordOrderPrice.setIsseat(volunteerProductTourPrice.getIsoccupyseat());//是否占座
////                    ordOrderPrice.setIsseat(true);//是否占座
//                    ordOrderPrice.setIschild(volunteerProductTourPrice.getTouristtype() == 2);//是否儿童
//                    ordOrderPrice.setSaleprice(volunteerProductTourPrice.getDirectprice());//市场销售价格
////                    ordOrderPrice.setOrgid("00000000-0000-0000-0000-000000000000");//orgid
//                    ordOrderPrice.setOrgid(orgId);
//
//                    ordOrderPrices.add(ordOrderPrice);
//                }
//            }
//            log.info("addOutOrderInfo 开始写入游客价格信息！");
//            for (OrdOrderPrice ordOrderPrice : ordOrderPrices) {
//                if (ordOrderPrice.getVisitornum() != 0) {//没人的价格策略不写入
//                    ordOrderPriceMapper.insert(ordOrderPrice);//插入
//                }
//            }
//            log.info("addOutOrderInfo 开始写入订单日志！");
//            OrdOrderLog ordOrderLog = new OrdOrderLog();
//            ordOrderLog.setId(UUID.randomUUID().toString());
//            ordOrderLog.setOrderid(ordid);
//            ordOrderLog.setOplog("提交新订单");
//            ordOrderLog.setOpip(PublicipUtils.getIpAddr(request));
//            ordOrderLog.setOpbrowser(PublicipUtils.getBrowser(request));
//            ordOrderLog.setOrgid("00000000-0000-0000-0000-000000000000");
//            ordOrderLog.setCreatedbyid(wxUser.getUserId());
//            ordOrderLog.setCreatedby(wxUser.getNickname());
//
//            ordOrderLog.setCreateddate(new Date());
//            ordOrderLogMapper.insert(ordOrderLog);
//
//            //订单大交通表写入
//            if (proTour.getHastraffic() != null && proTour.getHastraffic() != 0 && proTour.getHastraffic() < 16) {//是否需要写入大交通
//                businessService.addOrderTraffic(proTour.getHastraffic(), tourid, ordid, request, userType, wxUser);
//
//            } else if (proTour.getHastraffic() != null && proTour.getHastraffic() != 0 && proTour.getHastraffic() > 16) {
//                String hexString = proTour.getHastraffic().toHexString(proTour.getHastraffic()); //转成16进制
//                char[] chars = hexString.toCharArray();
//                String goValue = String.valueOf(chars[0]);
//                String backVlaue = String.valueOf(chars[1]);
//                Integer goTraffic = Integer.parseInt(goValue, 16);
//                Integer backTraffic = Integer.parseInt(backVlaue, 16);
//
//                businessService.addOrderTraffic(goTraffic, tourid, ordid, request, userType, wxUser);
//                businessService.addOrderTraffic(backTraffic, tourid, ordid, request, userType, wxUser);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("订单保存异常！");
//        }
//        log.info("addOutOrderInfo 订单相关信息写入完成！");
//
//        HttpResponse httpResponse = HttpUtils.httpClientGet(getOrgInfoUrl + proProductDirectSalesProduct.getReceiverid());
//        OrgInfoExtensionDto orgInfoExtensionDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), OrgInfoExtensionDto.class);
//
//        Map map = new HashMap();
//        map.put("orderNo", orderNo);
//        map.put("orderId", orderInfo.getId());
//        map.put("travelAgencyPhone", orgInfoExtensionDto.getPhone());
//
//        return new Response().success(map);
//    }


    /**
     * @Description: 旅游志愿者--外发产品-下单前验证
     * @auther: 史迪旻
     * @date: 15:12 2019-2-27
     * @param: [params, request]
     * @return: com.holyrobot.response.Response
     */
//    @Override
//    public Response validateTotalPrice(JSONObject params, HttpServletRequest request) {
//        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
//        log.info("旅游志愿者--外发产品-下单前验证 validateTotalPrice,当前登录人信息:{}", wxUserInfo);
//        if (Objects.isNull(wxUserInfo)) {
//            return new Response().failure("用户未登录！");
//        }
//        Integer userType = wxUserInfo.getUserType();
////        Integer userType = 2;
//        log.info("旅游志愿者外发产品 validateTotalPrice:{}", params);
//        //验证价格库存信息
//        BigDecimal realPrice = new BigDecimal(0);
//        int paramStock = 0;
//        String totalprice = params.getString("totalprice");
//        String tourid = params.getString("tourid");
//        String policyId = params.getString("policyid");
//        String personnumber = params.getString("personnum");
//
//
//        String singleroomprice = params.getString("singleroomprice");
//        String siteId = params.getString("siteid");
//        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", ");
//        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");
////        String[] paramSingleroompricenum = singleroompricenum.substring(1, singleroompricenum.length() - 1).trim().split(", ");
//
//        //单房差
//        /*ProTourPricepolicyExample example = new ProTourPricepolicyExample();
//        example.or().andTouridEqualTo(tourid).andIsdefaultEqualTo(true).andSiteidEqualTo(siteId);
//        List<ProTourPricepolicy> proTourPricepolicies = proTourPricePolicyService.selectByExample(example);*/
//        List<Map> listp = new ArrayList<>();
//        //计算出游人数
//        for (int i = 0; i < splitPersonnumber.length; i++) {
//            paramStock += Integer.parseInt(splitPersonnumber[i]);
//        }
//        //计算价格
//        for (int i = 0; i < splitPolicyid.length; i++) {
//            String policyid = splitPolicyid[i];//价格策略id
//            int personNum = Integer.parseInt(splitPersonnumber[i]);//价格策略对应的人数
//            BigDecimal perNum = BigDecimal.valueOf(personNum);
//            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());
//            BigDecimal salesPrice = null;
//
//            //市场价
//            salesPrice = volunteerProductTourPrice.getDirectprice();
//            //计算实际总价
//            realPrice = realPrice.add(perNum.multiply(salesPrice));
//
//            //存储信息返回给前端
//            Map map = new HashMap();
//            map.put("policyid", policyid);
//            map.put("personnum", personNum);
//            listp.add(map);
//
//        }
//        /*if(StringUtils.isNotBlank(singleroomprice)){//单房差不为空加上单房差
//            BigDecimal singPrice = new BigDecimal(singleroomprice);
//            realPrice = realPrice.add(singPrice);
//        }*/
//        //验证库存
//        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
//        int planNum = volunteerProductTour.getPlannum();
//        //订单预定人数
//        int orderNum = 0;
//        //根据团期id和团期日期获取订单数据
//        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(volunteerProductTour.getTourid());
//        for (OrdOrderinfo orderinfo : orderinfos) {
//            int adultNum = orderinfo.getAdultnum();
//            int childNum = orderinfo.getChildnum();
//            orderNum += adultNum + childNum;
//        }
//        //剩余库存数
//        int stock = planNum - orderNum;
//        //大交通库存验证
//        int ticketStock1 = 0;
//        int ticketStock2 = 0;
//        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
//
//        if (proTour.getIsack() != null && proTour.getIsack() == 1) {//判断是否需要查询大交通库存
//            ProTourTrafficExample trafficExample = new ProTourTrafficExample();
//            trafficExample.or().andTouridEqualTo(tourid);
//            List<ProTourTraffic> proTourTraffics = proTourTrafficMapper.selectByExample(trafficExample);
//            List<String> resTrafficId = proTourTraffics.stream().map(ProTourTraffic::getTrafficproductid).collect(Collectors.toList());
//            if (proTour.getHastraffic() == 9) {//机票
//                ResFlightProductExample example = new ResFlightProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResFlightProduct> resFlightProducts = resFlightProductMapper.selectByExample(example);//机票都是固定计划位
//                ticketStock1 = resFlightProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resFlightProducts.get(0).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 10) {//火车票
//                ResTrainProductExample example = new ResTrainProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResTrainProduct> resTrainProducts = resTrainProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resTrainProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(0).getTicketnumber();
//                ticketStock2 = resTrainProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resTrainProducts.get(1).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 11) {//汽车票
//                ResBusProductExample example = new ResBusProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResBusProduct> resBusProducts = resBusProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resBusProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(0).getTicketnumber();
//                ticketStock2 = resBusProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resBusProducts.get(1).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 12) {//船票
//                ResShipProductExample example = new ResShipProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResShipProduct> resShipProducts = resShipProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resShipProducts.get(0).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(0).getTicketnumber();
//                ticketStock2 = resShipProducts.get(1).getTicketnumber() == -1 ? Constants.TICKET_STOCK : resShipProducts.get(1).getTicketnumber();
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else {
//                log.info("产品为直售，但未录入大交通信息！");
//            }
//        } else if (stock < paramStock) {
//            return new Response().failure("该产品库存不足！");
//        }
//
//
//        //价格验证成功,开始插入
//        BigDecimal total = new BigDecimal(totalprice);
//        if (realPrice.compareTo(total) == 0) {
//            //价格及参数存入redis，前端需要参数
//            String key = UUID.randomUUID().toString();
//            Map m = new HashMap();
////            m.put("singleRoomPrice",singleroomprice);
//            m.put("price", realPrice);
//            m.put("param", listp);
//            Map resultMap = new HashMap();
//            resultMap.put("key", key);
//            jedisService.addObjectToList(key, m);
//            return new Response().success(resultMap);
//        } else {
//            return new Response().failure("价格有变动，请重新下单！");
//        }
//    }
//
//
//    /**
//     * @Description: 旅游志愿者--非外发产品-下单前验证
//     * @auther: 史迪旻
//     * @date: 15:25 2019-2-27
//     * @param: [params, request]
//     * @return: com.holyrobot.response.Response
//     */
//    @Override
//    public Response checkCommProducts(JSONObject params, HttpServletRequest request) {
//        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
//        log.info("旅游志愿者--非外发产品-下单前验证 checkCommProducts,当前登录人信息:{}", wxUserInfo);
//        if (Objects.isNull(wxUserInfo)) {
//            return new Response().failure("用户未登录！");
//        }
//        Integer userType = wxUserInfo.getUserType();
////        Integer userType = 2;
//        log.info("validateTotalPrice:{}", params);
//        //验证价格库存信息
//        BigDecimal realPrice = new BigDecimal(0);
//        int paramStock = 0;
//        String totalprice = params.getString("totalprice");
//        String tourid = params.getString("tourid");
//        String policyId = params.getString("policyid");
//        String personnumber = params.getString("personnum");
//
//
//        String singleroomprice = params.getString("singleroomprice");
//        String siteId = params.getString("siteid");
//        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", ");
//        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");
////        String[] paramSingleroompricenum = singleroompricenum.substring(1, singleroompricenum.length() - 1).trim().split(", ");
//
//        //单房差
//        /*ProTourPricepolicyExample example = new ProTourPricepolicyExample();
//        example.or().andTouridEqualTo(tourid).andIsdefaultEqualTo(true).andSiteidEqualTo(siteId);
//        List<ProTourPricepolicy> proTourPricepolicies = proTourPricePolicyService.selectByExample(example);*/
//        List<Map> listp = new ArrayList<>();
//        //计算出游人数
//        for (int i = 0; i < splitPersonnumber.length; i++) {
//            paramStock += Integer.parseInt(splitPersonnumber[i]);
//        }
//        //计算价格
//        for (int i = 0; i < splitPolicyid.length; i++) {
//            String policyid = splitPolicyid[i];//价格策略id
//            int personNum = Integer.parseInt(splitPersonnumber[i]);//价格策略对应的人数
//            BigDecimal perNum = BigDecimal.valueOf(personNum);
//            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());
//            BigDecimal salesPrice = null;
//
//            //市场价
//            salesPrice = volunteerProductTourPrice.getDirectprice();
//            //计算实际总价
//            realPrice = realPrice.add(perNum.multiply(salesPrice));
//
//            //存储信息返回给前端
//            Map map = new HashMap();
//            map.put("policyid", policyid);
//            map.put("personnum", personNum);
//            listp.add(map);
//
//        }
//        /*if(StringUtils.isNotBlank(singleroomprice)){//单房差不为空加上单房差
//            BigDecimal singPrice = new BigDecimal(singleroomprice);
//            realPrice = realPrice.add(singPrice);
//        }*/
//        //验证库存
//        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
//        int planNum = volunteerProductTour.getPlannum();
//        //订单预定人数
//        int orderNum = 0;
//        //根据团期id和团期日期获取订单数据
//        List<OrdOrderinfo> orderinfos = ordOrderInfoService.getOrderByTourId(volunteerProductTour.getTourid());
//        for (OrdOrderinfo orderinfo : orderinfos) {
//            int adultNum = orderinfo.getAdultnum();
//            int childNum = orderinfo.getChildnum();
//            orderNum += adultNum + childNum;
//        }
//        //剩余库存数
//        int stock = planNum - orderNum;
//        //大交通库存验证
//        int ticketStock1 = 0;
//        int ticketStock2 = 0;
//        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
//
//        if (proTour.getIsack() != null && proTour.getIsack() == 1) {//判断是否需要查询大交通库存
//            ProTourTrafficExample trafficExample = new ProTourTrafficExample();
//            trafficExample.or().andTouridEqualTo(tourid);
//            List<ProTourTraffic> proTourTraffics = proTourTrafficMapper.selectByExample(trafficExample);
//            List<String> resTrafficId = proTourTraffics.stream().map(ProTourTraffic::getTrafficproductid).collect(Collectors.toList());
//            if (proTour.getHastraffic() == 9) {//机票
//                ResFlightProductExample example = new ResFlightProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResFlightProduct> resFlightProducts = resFlightProductMapper.selectByExample(example);//机票都是固定计划位
//                ticketStock1 = resFlightProducts.get(0).getTicketnumber() - orderNum;
//                if (stock < paramStock || ticketStock1 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 10) {//火车票
//                ResTrainProductExample example = new ResTrainProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResTrainProduct> resTrainProducts = resTrainProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resTrainProducts.get(0).getTicketnumber() - orderNum;
//                ticketStock2 = resTrainProducts.get(1).getTicketnumber() - orderNum;
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 11) {//汽车票
//                ResBusProductExample example = new ResBusProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResBusProduct> resBusProducts = resBusProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resBusProducts.get(0).getTicketnumber() - orderNum;
//                ticketStock2 = resBusProducts.get(1).getTicketnumber() - orderNum;
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else if (proTour.getHastraffic() == 12) {//船票
//                ResShipProductExample example = new ResShipProductExample();
//                example.or().andIdIn(resTrafficId);
//                List<ResShipProduct> resShipProducts = resShipProductMapper.selectByExample(example);//往返，两条
//                ticketStock1 = resShipProducts.get(0).getTicketnumber() - orderNum;
//                ticketStock2 = resShipProducts.get(1).getTicketnumber() - orderNum;
//                if (stock < paramStock || ticketStock1 < paramStock || ticketStock2 < paramStock) {
//                    return new Response().failure("该产品库存不足！");
//                }
//            } else {
//                log.info("产品为直售，但未录入大交通信息！");
//            }
//        } else if (stock < paramStock) {
//            return new Response().failure("该产品库存不足！");
//        }
//
//
//        //价格验证成功,开始插入
//        BigDecimal total = new BigDecimal(totalprice);
//        if (realPrice.compareTo(total) == 0) {
//            //价格及参数存入redis，前端需要参数
//            String key = UUID.randomUUID().toString();
//            Map m = new HashMap();
////            m.put("singleRoomPrice",singleroomprice);
//            m.put("price", realPrice);
//            m.put("param", listp);
//            m.put("discountPrice", params.getDoubleValue("discountPrice"));
//            Map resultMap = new HashMap();
//            resultMap.put("key", key);
//            jedisService.addObjectToList(key, m);
//            return new Response().success(resultMap);
//        } else {
//            return new Response().failure("价格有变动，请重新下单！");
//        }
//    }


    /**
     * @Description: 佣金写入方法--计算佣金
     * @auther: 史迪旻
     * @date: 13:48 2019-2-28
     * @param: [params, request, ordOrderinfo]
     * @return: java.lang.Integer
     */
    @Transactional
    public Integer insertCommRecord(JSONObject params, HttpServletRequest request, OrdOrderinfo ordOrderinfo, BigDecimal count) {
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");

        String totalprice = params.getString("totalprice");//订单价格
        String tourid = params.getString("tourid");
        String policyId = params.getString("policyid"); //价格策略
        String personnumber = params.getString("num"); //人数
        String[] splitPolicyid = policyId.substring(1, policyId.length() - 1).trim().split(", "); //分割 价格策略
        String[] splitPersonnumber = personnumber.substring(1, personnumber.length() - 1).trim().split(", ");//分割 人数

//        计算成本总价
        BigDecimal realPrice = new BigDecimal(0);
        String orgId = null;
        for (int i = 0; i < splitPolicyid.length; i++) {
            String policyid = splitPolicyid[i];//价格策略id
            int personNum = Integer.parseInt(splitPersonnumber[i]);//价格策略对应的人数
            BigDecimal perNum = BigDecimal.valueOf(personNum);
            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());
            orgId = volunteerProductTourPrice.getOrgid();

            BigDecimal directcostprice = null;
//             成本价
            directcostprice = volunteerProductTourPrice.getDirectcostprice();
//             成本总价
            BigDecimal multiply = perNum.multiply(directcostprice);//人数 x 成本价
            realPrice = realPrice.add(multiply);

        }

//        计算佣金
        BigDecimal total = new BigDecimal(totalprice); //订单价格
        BigDecimal tsc = total.subtract(count); //减去单房差与接送价
        BigDecimal subtract = tsc.subtract(realPrice); //减去总成本 = 佣金
//        BigDecimal subtract = total.subtract(realPrice).subtract(count);

        VolunteerCommissionRecord volunteerCommissionRecord = new VolunteerCommissionRecord();
        String id = UUID.randomUUID().toString();
        volunteerCommissionRecord.setId(id);
        volunteerCommissionRecord.setUserid(ordOrderinfo.getOrdersalerid());
        volunteerCommissionRecord.setOrderid(ordOrderinfo.getId());
        volunteerCommissionRecord.setOrderno(ordOrderinfo.getOrderno());
        volunteerCommissionRecord.setAdultnum(ordOrderinfo.getAdultnum());
        volunteerCommissionRecord.setChildnum(ordOrderinfo.getChildnum());
        volunteerCommissionRecord.setCommissionamt(subtract);
        volunteerCommissionRecord.setDatastatus(0);
        volunteerCommissionRecord.setCreateddate(new Date());
        volunteerCommissionRecord.setOrgid(orgId);

        int insert = volunteerCommissionRecordMapper.insert(volunteerCommissionRecord);

        return insert;
    }

}
