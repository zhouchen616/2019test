package com.holyrobot.con_volunteer.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_order.mapper.OrdOrderinfoMapper;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.server.BusinessService;
import com.holyrobot.con_order.server.OrdOrderInfoService;
import com.holyrobot.con_product.mapper.*;
import com.holyrobot.con_product.server.ProProductDepartureService;
import com.holyrobot.con_product.server.impl.ProTourServiceImpl;
import com.holyrobot.con_res.mapper.ResBusProductMapper;
import com.holyrobot.con_res.mapper.ResFlightProductMapper;
import com.holyrobot.con_res.mapper.ResShipProductMapper;
import com.holyrobot.con_res.mapper.ResTrainProductMapper;
import com.holyrobot.con_res.pojo.*;
import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.*;
import com.holyrobot.con_volunteer.mapper.*;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.con_product.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerProductService;
import com.holyrobot.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 周陈
 * @Title: 志愿者产品服务接口实现类
 * @date 2019/2/20 14:15
 */
@Service
@Slf4j
public class VolunteerProductServiceImpl implements VolunteerProductService {
    @Autowired
    private VolunteerProductMapper volunteerProductMapper;
    @Autowired
    private VolunteerProductTourMapper volunteerProductTourMapper;
    @Autowired
    private VolunteerProductTourPriceMapper volunteerProductTourPriceMapper;
    @Autowired
    private ProTourMapper proTourMapper;
    @Autowired
    private ProTourPricepolicyMapper proTourPricepolicyMapper;
    @Autowired
    private ProProductDirectSalesMapper proProductDirectSalesMapper;
    @Autowired
    private ProProductDirectSalesItemMapper productDirectSalesItemMapper;
    @Autowired
    private OrdOrderInfoService ordOrderInfoService;
    @Autowired
    private ProTourTrafficMapper proTourTrafficMapper;
    @Autowired
    private ResFlightProductMapper resFlightProductMapper;
    @Autowired
    private ResBusProductMapper resBusProductMapper;
    @Autowired
    private ResShipProductMapper resShipProductMapper;
    @Autowired
    private ResTrainProductMapper resTrainProductMapper;
    @Autowired
    private RedisClient jedisService;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private ProProductDepartureService proProductDepartureService;
    @Autowired
    private OrdOrderinfoMapper ordOrderinfoMapper;

    public ShelfProductVO volunteerShopAutoUpdateToShelfProductVO(VolunteerShopAutoUpdate volunteerShopAutoUpdate) {
        //1.查询可上架的产品
        ProSearchCondition proSearchCondition = new ProSearchCondition();
        proSearchCondition.setOrgId(volunteerShopAutoUpdate.getOrgId());
        proSearchCondition.setSiteId(null);
        proSearchCondition.setUserId(volunteerShopAutoUpdate.getUserId());
        Response goodsShelfToC = this.getGoodsShelfToC(proSearchCondition);
        List<ProductListDto> productListDtos = (List<ProductListDto>) goodsShelfToC.getData();
        if (productListDtos == null || productListDtos.size() == 0) {
            log.info("店铺产品自动跟新时，查无产品！");
            return null;
        }
        //2.调用上架接口
        ShelfProductVO directShelfProductVO = new ShelfProductVO();
        directShelfProductVO.setOrgId(volunteerShopAutoUpdate.getOrgId());
        directShelfProductVO.setUserId(volunteerShopAutoUpdate.getUserId());
        directShelfProductVO.setUserType(2);
        directShelfProductVO.setDiscountTypeC(volunteerShopAutoUpdate.getAdjustmentMethod());
        //金额
        if (volunteerShopAutoUpdate.getAdjustmentMethod() == 1) {
            //百分比
            if (volunteerShopAutoUpdate.getAdjustmentType() == 1) {
                //加价
                directShelfProductVO.setPreValueC(volunteerShopAutoUpdate.getPercentage().doubleValue());
            } else {
                //减价
                directShelfProductVO.setPreValueC(volunteerShopAutoUpdate.getPercentage().doubleValue());
            }
        } else {
            //固定值
            if (volunteerShopAutoUpdate.getAdjustmentType() == 1) {
                //加价
                directShelfProductVO.setPreValueC(volunteerShopAutoUpdate.getFixedAmount().doubleValue());
            } else {
                //减价
                directShelfProductVO.setPreValueC(volunteerShopAutoUpdate.getFixedAmount().doubleValue());
            }
        }
        directShelfProductVO.setShopName(volunteerShopAutoUpdate.getShopName());
        directShelfProductVO.setOrgName(volunteerShopAutoUpdate.getOrgName());
        directShelfProductVO.setType(2);
        List<VolunteerProIdAndTypeDto> proIds = new ArrayList<>();
        for (ProductListDto productListDto : productListDtos) {
            VolunteerProIdAndTypeDto volunteerProIdAndTypeDto = new VolunteerProIdAndTypeDto();
            volunteerProIdAndTypeDto.setProStatus(productListDto.getIsOutgoing());
            volunteerProIdAndTypeDto.setDirectSalesSendId(productListDto.getDirectSalesSendId());
            volunteerProIdAndTypeDto.setId(productListDto.getId());
            proIds.add(volunteerProIdAndTypeDto);
        }
        directShelfProductVO.setProIds(proIds);
        log.info("店铺产品自动跟新时,产品插入时请求参数={}", JSON.toJSONString(directShelfProductVO));
        return directShelfProductVO;
    }


    @Override
    public Response shopAutoUpdateAddProduct(VolunteerShopAutoUpdate volunteerShopAutoUpdate) {
        Response response = this.directShelfProduct(this.volunteerShopAutoUpdateToShelfProductVO(volunteerShopAutoUpdate));
        return response;
    }

    /**
     * 　　* @Description: 产品直接上架
     * 　　* @author 周陈
     * 　　* @date 2019/2/20 14:33
     */
    @Transactional
    @Override
    public Response directShelfProduct(ShelfProductVO shelfProductVO) {
        if (shelfProductVO == null) {
            return new Response().success("无产品更新！");
        }
        //插入产品
        List<VolunteerProduct> volunteerProducts = new ArrayList<>();
        List<VolunteerProductTour> volunteerProductTours = new ArrayList<>();
        List<VolunteerProductTourPrice> volunteerProductTourPrices = new ArrayList<>();
        Date newDate = new Date();
        for (int i = 0; i < shelfProductVO.getProIds().size(); i++) {
            VolunteerProduct volunteerProduct = new VolunteerProduct();
            volunteerProduct.setId(UUID.randomUUID().toString());
            volunteerProduct.setCreateddate(newDate);
            volunteerProduct.setOrgid(shelfProductVO.getOrgId());
            //上架状态  0：待上架；1：已上架 ；-1：删除
            volunteerProduct.setDatastatus(1);
            //0:无更改 1：价格有修改
            volunteerProduct.setPricestatus(0);
            //产品类型 0：普通产品   1：外发产品
            volunteerProduct.setProstatus(shelfProductVO.getProIds().get(i).getProStatus());
            //0:无更改 1：有新团次
            volunteerProduct.setTourstatus(0);
            volunteerProduct.setProid(shelfProductVO.getProIds().get(i).getId());
            volunteerProduct.setShopname(shelfProductVO.getShopName());
            volunteerProduct.setTravelagencyname(shelfProductVO.getOrgName());
            volunteerProduct.setUserid(shelfProductVO.getUserId());
            // TODO
//            if (shelfProductVO.getProIds().get(i).getProStatus() == 1) {
//            }
            volunteerProduct.setDirectsalessendid(shelfProductVO.getProIds().get(i).getDirectSalesSendId());
            shelfProductVO.getProIds().get(i).setVolunteerProductD(volunteerProduct.getId());
            volunteerProducts.add(volunteerProduct);
        }
        //批量插入志愿者产品
        int volunteerProductsInseter = volunteerProductMapper.insertList(volunteerProducts);
        if (volunteerProductsInseter == volunteerProducts.size()) {
            log.info("志愿者产品成功插入{}条",volunteerProducts.size());
        } else {
            log.error("批量插入志愿者产品失败！");
            return new Response().failure("批量插入志愿者产品失败！");
        }
        //插入团期\插入价格
        for (int i = 0; i < shelfProductVO.getProIds().size(); i++) {
            if (shelfProductVO.getProIds().get(i).getProStatus() == 0) {
                //普通产品
                //团期
                ProTourExample example = new ProTourExample();
                example.or().andProidEqualTo(shelfProductVO.getProIds().get(i).getId()).andTourstatusEqualTo(1)
                        .andTourdateGreaterThan(newDate);
                List<ProTour> proTours = proTourMapper.selectByExample(example);
                log.info("proTour.size={}", proTours.size());
                //给志愿者产品团期赋值
                for (ProTour proTour : proTours) {
                    VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
                    volunteerProductTour.setCreateddate(newDate);
                    //上架状态  0：待上架；1：已上架 ；
                    volunteerProductTour.setDatastatus(1);
                    volunteerProductTour.setDuedate(proTour.getDuedate());
                    volunteerProductTour.setId(UUID.randomUUID().toString());
                    volunteerProductTour.setOrgid(shelfProductVO.getOrgId());
                    volunteerProductTour.setPlannum(proTour.getPlannum());
                    volunteerProductTour.setShopname(shelfProductVO.getShopName());
                    volunteerProductTour.setProid(shelfProductVO.getProIds().get(i).getId());
                    //依据产品proids 查询voluuteer_product的主键id
//                    VolunteerProductExample volunteerProductExample = new VolunteerProductExample();
//                    volunteerProductExample.
                    volunteerProductTour.setTourdate(proTour.getTourdate());
                    volunteerProductTour.setTourid(proTour.getId());
                    volunteerProductTour.setTourname(proTour.getTourname());
                    volunteerProductTour.setTravelagencyname(shelfProductVO.getOrgName());
                    volunteerProductTour.setUserid(shelfProductVO.getUserId());
                    volunteerProductTour.setVolunteerproductid(shelfProductVO.getProIds().get(i).getVolunteerProductD());

                    ProTourPricepolicyExample example1 = new ProTourPricepolicyExample();
                    //proId\siteId\orgId
                    if (shelfProductVO.getSiteId() == null) {
                        example1.or().andTouridEqualTo(proTour.getId())
//                                .andSiteidEqualTo(shelfProductVO.getSiteId())
                                .andOrgidEqualTo(shelfProductVO.getOrgId());
                    } else {
                        example1.or().andTouridEqualTo(proTour.getId())
//                                .andSiteidEqualTo(shelfProductVO.getSiteId())
                                .andOrgidEqualTo(shelfProductVO.getOrgId());
                    }

                    List<ProTourPricepolicy> proTourPricepolicies = proTourPricepolicyMapper.selectByExample(example1);
                    if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                        volunteerProductTours.add(volunteerProductTour);
                    }
                    //给志愿者产品团期价格赋值
                    for (ProTourPricepolicy proTourPricepolicy : proTourPricepolicies) {
                        //过滤，多团次，一个产品，只有部分团次的价格策略有设置志愿者价格，没有价格的过滤掉
                        if (proTourPricepolicy.getVolunteerrebateprice() == null) {
                            continue;
                        }
                        VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                        volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                        volunteerProductTourPrice.setOrderindex(1);
                        volunteerProductTourPrice.setOrgid(shelfProductVO.getOrgId());
                        volunteerProductTourPrice.setPolicyname(proTourPricepolicy.getPolicyname());
                        volunteerProductTourPrice.setProid(shelfProductVO.getProIds().get(i).getId());
                        volunteerProductTourPrice.setShopname(shelfProductVO.getShopName());
                        volunteerProductTourPrice.setSiteid(proTourPricepolicy.getSiteid());
                        volunteerProductTourPrice.setSitename(proTourPricepolicy.getSitename());
                        volunteerProductTourPrice.setTourid(proTourPricepolicy.getTourid());
                        volunteerProductTourPrice.setTouristtype(proTourPricepolicy.getTouristtype());
                        volunteerProductTourPrice.setTravelagencyname(shelfProductVO.getOrgName());
                        volunteerProductTourPrice.setUserid(shelfProductVO.getUserId());
                        volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());
                        volunteerProductTourPrice.setDirectcostprice(proTourPricepolicy.getVolunteersalesprice());
                        volunteerProductTourPrice.setSalescostprice(proTourPricepolicy.getSalesprice());
                        volunteerProductTourPrice.setRebateprice(proTourPricepolicy.getVolunteerrebateprice());
                        volunteerProductTourPrice.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                        volunteerProductTourPrice.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                        volunteerProductTourPrice.setIsdefault(proTourPricepolicy.getIsdefault());
                        volunteerProductTourPrice.setAllowance(proTourPricepolicy.getTravelerRewardPrice());
                        volunteerProductTourPrice.setNewvolunteerproductid(shelfProductVO.getProIds().get(i).getVolunteerProductD());
                        volunteerProductTourPrice.setDatastatus(1);
                        //判断上架类型，1.直接上架；2.价格统一调整上架
                        if (shelfProductVO.getType() == 1) {
                            volunteerProductTourPrice.setSalesprice(proTourPricepolicy.getSalesprice());
                            volunteerProductTourPrice.setDirectprice(proTourPricepolicy.getVolunteerdirectprice());
                        } else {
                            //调整类型，1.百分比；2.固定金额
                            BigDecimal b1 = new BigDecimal(new Double(shelfProductVO.getPreValueC()));
                            BigDecimal directPrice = new BigDecimal(new Double(0));
                            BigDecimal salesPrice = new BigDecimal(new Double(0));
                            switch (shelfProductVO.getDiscountTypeC()) {
                                case 1:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().multiply(b1).add(proTourPricepolicy.getVolunteerdirectprice());
                                    salesPrice = proTourPricepolicy.getSalesprice().multiply(b1).add(proTourPricepolicy.getSalesprice().setScale(3, BigDecimal.ROUND_HALF_UP));

                                    volunteerProductTourPrice.setPrevaluec(proTourPricepolicy.getVolunteerdirectprice().multiply(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                                    volunteerProductTourPrice.setPrevalueb(proTourPricepolicy.getSalesprice().multiply(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                                case 2:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().add(b1);
                                    salesPrice = proTourPricepolicy.getSalesprice().add(b1);
                                    volunteerProductTourPrice.setPrevaluec(b1);
                                    volunteerProductTourPrice.setPrevalueb(b1);
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                            }
                            volunteerProductTourPrice.setSalesprice(salesPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                            volunteerProductTourPrice.setDirectprice(directPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                        }
                        volunteerProductTourPrices.add(volunteerProductTourPrice);
                    }
                }
            } else {
                //外发产品
                //团期
                ProProductDirectSalesExample example = new ProProductDirectSalesExample();
                example.or().andProidEqualTo(shelfProductVO.getProIds().get(i).getId())
                        .andSupplieridEqualTo(shelfProductVO.getProIds().get(i).getDirectSalesSendId())
                        .andReceiveridEqualTo(shelfProductVO.getOrgId()).andTourdateGreaterThan(newDate)
                        .andDatastatusEqualTo(1).andAuditstatusEqualTo(1);
                List<ProProductDirectSales> proTours = proProductDirectSalesMapper.selectByExample(example);
                log.info("proTour.size={}", proTours.size());
                //给志愿者产品团期赋值
                for (ProProductDirectSales proTour : proTours) {
                    VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
                    volunteerProductTour.setCreateddate(newDate);
                    //上架状态  0：待上架；1：已上架 ；
                    volunteerProductTour.setDatastatus(1);
                    volunteerProductTour.setDuedate(proTour.getDuedate());
                    volunteerProductTour.setId(UUID.randomUUID().toString());
                    volunteerProductTour.setOrgid(shelfProductVO.getOrgId());
                    volunteerProductTour.setPlannum(proTour.getPlannum());
                    volunteerProductTour.setShopname(shelfProductVO.getShopName());
                    volunteerProductTour.setProid(shelfProductVO.getProIds().get(i).getId());
                    volunteerProductTour.setTourdate(proTour.getTourdate());
                    volunteerProductTour.setTourid(proTour.getTourid());
                    volunteerProductTour.setTourname(proTour.getTourname());
                    volunteerProductTour.setTravelagencyname(shelfProductVO.getOrgName());
                    volunteerProductTour.setUserid(shelfProductVO.getUserId());
                    volunteerProductTour.setVolunteerproductid(shelfProductVO.getProIds().get(i).getVolunteerProductD());
                    //团期价格
                    ProProductDirectSalesItemExample example1 = new ProProductDirectSalesItemExample();
                    example1.or().andDirectsalesidEqualTo(proTour.getId())
                            .andVolunteerdirectpriceIsNotNull()
                            .andVolunteerrebatepriceIsNotNull();
                    List<ProProductDirectSalesItem> proTourPricepolicies = productDirectSalesItemMapper.selectByExample(example1);
                    if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                        volunteerProductTours.add(volunteerProductTour);
                    }
                    //封装志愿者团队价格
                    for (ProProductDirectSalesItem proTourPricepolicy : proTourPricepolicies) {
                        VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                        volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                        volunteerProductTourPrice.setOrderindex(1);
                        volunteerProductTourPrice.setOrgid(shelfProductVO.getOrgId());
                        volunteerProductTourPrice.setPolicyname(proTourPricepolicy.getPolicyname());
                        volunteerProductTourPrice.setProid(shelfProductVO.getProIds().get(i).getId());
                        volunteerProductTourPrice.setShopname(shelfProductVO.getShopName());
                        volunteerProductTourPrice.setSiteid(proTourPricepolicy.getSiteid());
                        volunteerProductTourPrice.setSitename(proTourPricepolicy.getSitename());
                        volunteerProductTourPrice.setTourid(proTourPricepolicy.getTourid());
                        volunteerProductTourPrice.setTouristtype(proTourPricepolicy.getTouristtype());
                        volunteerProductTourPrice.setTravelagencyname(shelfProductVO.getOrgName());
                        volunteerProductTourPrice.setUserid(shelfProductVO.getUserId());
                        volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());
                        volunteerProductTourPrice.setRebateprice(proTourPricepolicy.getVolunteerrebateprice());
                        volunteerProductTourPrice.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                        volunteerProductTourPrice.setDirectcostprice(proTourPricepolicy.getVolunteersalesprice());
                        volunteerProductTourPrice.setSalescostprice(proTourPricepolicy.getSalesprice());
                        volunteerProductTourPrice.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                        volunteerProductTourPrice.setIsdefault(proTourPricepolicy.getIsdefault());
                        volunteerProductTourPrice.setAllowance(proTourPricepolicy.getTravelerRewardPrice());
                        volunteerProductTourPrice.setNewvolunteerproductid(shelfProductVO.getProIds().get(i).getVolunteerProductD());
//判断上架类型，1.直接上架；2.价格统一调整上架
                        if (shelfProductVO.getType() == 1) {
                            volunteerProductTourPrice.setSalesprice(proTourPricepolicy.getSalesprice());
                            volunteerProductTourPrice.setDirectprice(proTourPricepolicy.getVolunteerdirectprice());
                        } else {
                            //调整金额
                            BigDecimal b1 = new BigDecimal(new Double(shelfProductVO.getPreValueC()));
                            BigDecimal directPrice = new BigDecimal(new Double(0));
                            BigDecimal salesPrice = new BigDecimal(new Double(0));
                            //调整类型，1.百分比；2.固定金额
                            switch (shelfProductVO.getDiscountTypeC()) {
                                case 1:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().multiply(b1).add(proTourPricepolicy.getVolunteerdirectprice()).setScale(3, BigDecimal.ROUND_HALF_UP);
                                    salesPrice = proTourPricepolicy.getSalesprice().multiply(b1).add(proTourPricepolicy.getSalesprice()).setScale(3, BigDecimal.ROUND_HALF_UP);
                                    volunteerProductTourPrice.setPrevaluec(proTourPricepolicy.getVolunteerdirectprice().multiply(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                                    volunteerProductTourPrice.setPrevalueb(proTourPricepolicy.getSalesprice().multiply(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                                case 2:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().add(b1);
                                    salesPrice = proTourPricepolicy.getSalesprice().add(b1);
                                    volunteerProductTourPrice.setPrevaluec(b1);
                                    volunteerProductTourPrice.setPrevalueb(b1);
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                            }
                            volunteerProductTourPrice.setSalesprice(salesPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                            volunteerProductTourPrice.setDirectprice(directPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                        }
                        volunteerProductTourPrices.add(volunteerProductTourPrice);
                    }
                }
            }
        }
        //批量插入团期
        insertVolunteerProductTourList(volunteerProductTours);
        //批量插入价格
        insertVolunteerProductTourPriceList(volunteerProductTourPrices);
        return new Response().success("产品上架成功！");
    }

    /**
     * 　　* @Description: 志愿者产品管理-单产品批量调整价格
     * 　　* @author 周陈
     * 　　* @date 2019/3/4 17:00
     */
    @Override
    @Transactional
    public Response directShelfProductOfVol(ShelfProductVO directShelfProductVO) {
        //查询产品
        VolunteerProductExample example = new VolunteerProductExample();
        if (directShelfProductVO.getProIds().get(0).getProStatus() == 0) {
            example.or().andOrgidEqualTo(directShelfProductVO.getOrgId()).
                    andProidEqualTo(directShelfProductVO.getProIds().get(0).getId()).
                    andUseridEqualTo(directShelfProductVO.getUserId()).andProstatusEqualTo(directShelfProductVO.getProIds().get(0).getProStatus());
        } else {
            example.or().andOrgidEqualTo(directShelfProductVO.getOrgId())
                    .andProidEqualTo(directShelfProductVO.getProIds().get(0).getId())
                    .andUseridEqualTo(directShelfProductVO.getUserId())
                    .andProstatusEqualTo(directShelfProductVO.getProIds().get(0).getProStatus())
                    .andDirectsalessendidEqualTo(directShelfProductVO.getProIds().get(0).getDirectSalesSendId());
        }
        List<VolunteerProduct> volunteerProducts = volunteerProductMapper.selectByExample(example);
        VolunteerProduct volunteerProduct = new VolunteerProduct();
        if (volunteerProducts != null && volunteerProducts.size() > 0) {
            volunteerProduct = volunteerProducts.get(0);
        }
        //查询对应团期
        VolunteerProductTourExample example1 = new VolunteerProductTourExample();
        example1.or().andUseridEqualTo(directShelfProductVO.getUserId()).andVolunteerproductidEqualTo(volunteerProduct.getId());
        List<VolunteerProductTour> volunteerProductTours = volunteerProductTourMapper.selectByExample(example1);
        for (VolunteerProductTour volunteerProductTour : volunteerProductTours) {
            //查询对应团期下的价格策略
            VolunteerProductTourPriceExample example2 = new VolunteerProductTourPriceExample();
            example2.or().andUseridEqualTo(directShelfProductVO.getUserId()).andVolunteerproductidEqualTo(volunteerProductTour.getId());
            List<VolunteerProductTourPrice> volunteerProductTourPrices = volunteerProductTourPriceMapper.selectByExample(example2);
            for (VolunteerProductTourPrice volunteerProductTourPrice : volunteerProductTourPrices) {
                BigDecimal b1 = new BigDecimal(new Double(directShelfProductVO.getPreValueC()));
                BigDecimal directPrice = new BigDecimal(0);
                //指导销售价=结算价+返佣
                directPrice = volunteerProductTourPrice.getDirectcostprice().add(volunteerProductTourPrice.getRebateprice());
                if (directShelfProductVO.getDiscountTypeC() == 1) {
                    //百分比
                    //新售价 = 指导销售价+ （指导销售价*提价百分比）
                    //百分比位数太长，报错！  .setScale(3, BigDecimal.ROUND_HALF_UP) ：四舍五入，精确到小数点第三位
                    volunteerProductTourPrice.setDirectprice(directPrice.multiply(b1).add(directPrice));
                    volunteerProductTourPrice.setDiscounttypec(1);
                    volunteerProductTourPrice.setPrevaluec(b1);
                } else {
                    //固定金额
                    //新售价 = 指导销售价+ 提价金额
                    volunteerProductTourPrice.setDirectprice(directPrice.add(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                    volunteerProductTourPrice.setDiscounttypec(2);
                    volunteerProductTourPrice.setPrevaluec(b1);
                }
                int count = volunteerProductTourPriceMapper.updateByPrimaryKeySelective(volunteerProductTourPrice);
                if (count < 1) {
                    log.error("志愿者团次价格调整失败！");
                    return new Response().failure("志愿者团次价格调整失败！");
                }
            }
        }
        return new Response().success("志愿者团次价格调整成功！");
    }

    /**
     * 　　* @Description: 产品货架查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/25 20:55
     */
    @Override
    public Response getGoodsShelfToC(ProSearchCondition proSearchCondition) {
        List<ProductListDto> productListDtos = volunteerProductMapper.selectGoodsShelf(proSearchCondition);
        return new Response().success(productListDtos);
    }

    /**
     * 　　* @Description: 批量产品最低返佣查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/25 20:55
     */
    @Override
    public Response minRebate(ShelfProductVO directShelfProductVO) {
        if (directShelfProductVO == null) {
            return new Response().success(new RebatePriceDto(0.0, 0.0));
        }
        final List<VolunteerProIdAndTypeDto> proIds = directShelfProductVO.getProIds();
        Map<Integer, List<VolunteerProIdAndTypeDto>> collect = proIds.stream().collect(Collectors.groupingBy(VolunteerProIdAndTypeDto::getProStatus));
        List<RebatePriceDto> minPrics = new ArrayList<>();
        RebatePriceDto rebatePriceDto = new RebatePriceDto();
        for (Integer key : collect.keySet()) {
            //产品类型 0：普通产品   1：外发产品
            switch (key) {
                case 0:
                    RebatePriceDto minPrice0 = proTourPricepolicyMapper.selectMinRebatePrice(directShelfProductVO.getSiteId(), collect.get(key));
                    if (rebatePriceDto.getPrice() == null) {
                        rebatePriceDto.setPrice(minPrice0.getPrice());
                        rebatePriceDto.setPricePercent(minPrice0.getPricePercent());
                    } else {
                        if (rebatePriceDto.getPrice() > minPrice0.getPrice()) {
                            rebatePriceDto.setPrice(minPrice0.getPrice());
                        }
                        if (rebatePriceDto.getPricePercent() > minPrice0.getPricePercent()) {
                            rebatePriceDto.setPricePercent(minPrice0.getPricePercent());
                        }
                    }
                    minPrics.add(minPrice0);
                    break;
                case 1:
                    for (VolunteerProIdAndTypeDto volunteerProIdAndTypeDto : collect.get(key)) {
                        RebatePriceDto minPrice1 = productDirectSalesItemMapper.selectMinRebatePrice(directShelfProductVO.getSiteId(),
                                volunteerProIdAndTypeDto.getId(), directShelfProductVO.getOrgId(),
                                volunteerProIdAndTypeDto.getDirectSalesSendId());
                        if (rebatePriceDto.getPrice() == null) {
                            rebatePriceDto.setPrice(minPrice1.getPrice());
                            rebatePriceDto.setPricePercent(minPrice1.getPricePercent());
                        } else {
                            if (rebatePriceDto.getPrice() > minPrice1.getPrice()) {
                                rebatePriceDto.setPrice(minPrice1.getPrice());
                            }
                            if (rebatePriceDto.getPricePercent() > minPrice1.getPricePercent()) {
                                rebatePriceDto.setPricePercent(minPrice1.getPricePercent());
                            }
                        }
                        minPrics.add(minPrice1);
                    }
                    break;
            }
        }
        log.info("批量产品最低返佣查询返回={}", JSON.toJSONString(minPrics));
//        RebatePriceDto rebatePriceDto = new RebatePriceDto();
//        log.info("取出最小值并取反={}",JSON.toJSONString(rebatePriceDto) );
        rebatePriceDto.setPricePercent(rebatePriceDto.getPricePercent() * -1);
        rebatePriceDto.setPrice(rebatePriceDto.getPrice() * -1);
        return new Response().success(rebatePriceDto);
    }

    /**
     * 　　* @Description: 产品自动更新时，算最低价
     * 　　* @author 周陈
     * 　　* @date 2019/3/14 10:32
     *
     */
    @Override
    public Response minRebateOfAutoUpdate(VolunteerShopAutoUpdate volunteerShopAutoUpdate) {
        ShelfProductVO shelfProductVO = this.volunteerShopAutoUpdateToShelfProductVO(volunteerShopAutoUpdate);
        return this.minRebate(shelfProductVO);
    }

    /**
     * 　　* @Description:
     * 　　* @author 周陈
     * 　　* @date 2019/3/4 14:34
     */
    @Override
    public Response minRebateOfVol(ShelfProductVO directShelfProductVO) {
        if (directShelfProductVO.getProIds() == null && directShelfProductVO.getProIds().size() == 0) {
            return new Response().failure("参数异常！");
        }
        RebatePriceDto rebatePriceDto = volunteerProductTourMapper.selectMinRebatePrice(directShelfProductVO.getSiteId(),
                directShelfProductVO.getProIds().get(0).getId(), directShelfProductVO.getUserId(), directShelfProductVO.getProIds().get(0).getProStatus());
        rebatePriceDto.setPrice(rebatePriceDto.getPrice() * -1);
        rebatePriceDto.setPricePercent(rebatePriceDto.getPricePercent() * -1);
        return new Response().success(rebatePriceDto);
    }

    /**
     * 　　* @Description: 单团次价格调整接口
     * 　　* @author 周陈
     * 　　* @date 2019/2/26 15:50
     */
    @Transactional
    @Override
    public Response singleTourUpdate(SingleTourUpdateVo singleTourUpdateVo) {
        Date newDate = new Date();
        //查询志愿者产品是否已插入
        VolunteerProduct volProduct = this.findVolProduct(singleTourUpdateVo.getShopName(),
                singleTourUpdateVo.getOrgName(), singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getUserId(),
                singleTourUpdateVo.getProId(), singleTourUpdateVo.getIsOutgoing(), singleTourUpdateVo.getDirectSalesSendId());
        VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
        if (singleTourUpdateVo.getIsOutgoing() == 0) {
            //普通产品
            //1.团期插入
            ProTour proTour = proTourMapper.selectByPrimaryKey(singleTourUpdateVo.getTourId());
            volunteerProductTour.setCreateddate(newDate);
            //上架状态  0：待上架；1：已上架 ；
            volunteerProductTour.setDatastatus(1);
            volunteerProductTour.setDuedate(proTour.getDuedate());
            volunteerProductTour.setId(UUID.randomUUID().toString());
            volunteerProductTour.setOrgid(singleTourUpdateVo.getOrgId());
            volunteerProductTour.setPlannum(proTour.getPlannum());
            volunteerProductTour.setShopname(singleTourUpdateVo.getShopName());
            volunteerProductTour.setProid(singleTourUpdateVo.getProId());
            volunteerProductTour.setTourdate(proTour.getTourdate());
            volunteerProductTour.setTourid(proTour.getId());
            volunteerProductTour.setTourname(proTour.getTourname());
            volunteerProductTour.setTravelagencyname(singleTourUpdateVo.getOrgName());
            volunteerProductTour.setUserid(singleTourUpdateVo.getUserId());
            volunteerProductTour.setVolunteerproductid(volProduct.getId());
            int insert = volunteerProductTourMapper.insert(volunteerProductTour);
            if (insert == 0) {
                log.error("团次插入失败");
            }
            //2.价格插入
            for (SingleTourPriceVo tourPriceVo : singleTourUpdateVo.getSingleTourPrices()) {
                ProTourPricepolicy proProductDirectSalesItem = proTourPricepolicyMapper.selectByPrimaryKey(tourPriceVo.getId());
                VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                volunteerProductTourPrice.setOrderindex(proProductDirectSalesItem.getOrderindex());
                volunteerProductTourPrice.setIsdefault(proProductDirectSalesItem.getIsdefault());
                volunteerProductTourPrice.setIsoccupyseat(proProductDirectSalesItem.getIsoccupyseat());
                volunteerProductTourPrice.setNewvolunteerproductid(volunteerProductTour.getVolunteerproductid());
                volunteerProductTourPrice.setOrgid(singleTourUpdateVo.getOrgId());
                volunteerProductTourPrice.setPolicyname(tourPriceVo.getPolicyName());
                volunteerProductTourPrice.setProid(singleTourUpdateVo.getProId());
                volunteerProductTourPrice.setShopname(singleTourUpdateVo.getShopName());
                volunteerProductTourPrice.setSiteid(singleTourUpdateVo.getSiteId());
                volunteerProductTourPrice.setSitename(singleTourUpdateVo.getSiteName());
                volunteerProductTourPrice.setTourid(singleTourUpdateVo.getTourId());
                volunteerProductTourPrice.setTouristtype(tourPriceVo.getTouristType());
                volunteerProductTourPrice.setTravelagencyname(singleTourUpdateVo.getOrgName());
                volunteerProductTourPrice.setUserid(singleTourUpdateVo.getUserId());
                volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());

                volunteerProductTourPrice.setDirectcostprice(proProductDirectSalesItem.getVolunteersalesprice());
                //结算价 = 直客价 - 返佣
                volunteerProductTourPrice.setSalescostprice(new BigDecimal(tourPriceVo.getVolunteerDirectPrice())
                        .subtract(new BigDecimal(tourPriceVo.getVolunteerRebatePrice())));
                volunteerProductTourPrice.setRebateprice(new BigDecimal(tourPriceVo.getVolunteerRebatePrice()));
                volunteerProductTourPrice.setSingleroomprice(new BigDecimal(tourPriceVo.getSingleRoomPrice()));
                //固定金额
                volunteerProductTourPrice.setDiscounttypec(2);
                //奖励金
                volunteerProductTourPrice.setAllowance(proProductDirectSalesItem.getTravelerRewardPrice());

                volunteerProductTourPrice.setDirectprice(new BigDecimal(tourPriceVo.getDirectPrice()));
                int insert1 = volunteerProductTourPriceMapper.insert(volunteerProductTourPrice);
                if (insert1 == 0) {
                    log.error("价格策略插入失败！");
                    return new Response().failure("价格策略插入失败！");
                }
            }
        } else {
            //外发产品
            ProProductDirectSales proTour = proProductDepartureService.getProProductDirectSales(singleTourUpdateVo.getTourId(), singleTourUpdateVo.getProId(), singleTourUpdateVo.getDirectSalesSendId(), singleTourUpdateVo.getOrgId());
            volunteerProductTour.setCreateddate(newDate);
            //上架状态  0：待上架；1：已上架 ；
            volunteerProductTour.setDatastatus(1);
            volunteerProductTour.setDuedate(proTour.getDuedate());
            volunteerProductTour.setId(UUID.randomUUID().toString());
            volunteerProductTour.setOrgid(singleTourUpdateVo.getOrgId());
            volunteerProductTour.setPlannum(proTour.getPlannum());
            volunteerProductTour.setShopname(singleTourUpdateVo.getShopName());
            volunteerProductTour.setProid(singleTourUpdateVo.getProId());
            volunteerProductTour.setTourdate(proTour.getTourdate());
            volunteerProductTour.setTourid(proTour.getId());
            volunteerProductTour.setTourname(proTour.getTourname());
            volunteerProductTour.setTravelagencyname(singleTourUpdateVo.getOrgName());
            volunteerProductTour.setUserid(singleTourUpdateVo.getUserId());
            int insert = volunteerProductTourMapper.insert(volunteerProductTour);
            if (insert == 0) {
                log.error("团次插入失败");
                return new Response().failure("团次插入失败！");
            }
            //2.价格插入
            for (SingleTourPriceVo tourPriceVo : singleTourUpdateVo.getSingleTourPrices()) {
                ProProductDirectSalesItem proProductDirectSalesItem = productDirectSalesItemMapper.selectByPrimaryKey(tourPriceVo.getId());
                VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                volunteerProductTourPrice.setOrderindex(proProductDirectSalesItem.getOrderindex());
                volunteerProductTourPrice.setIsdefault(proProductDirectSalesItem.getIsdefault());
                volunteerProductTourPrice.setIsoccupyseat(proProductDirectSalesItem.getIsoccupyseat());
                volunteerProductTourPrice.setNewvolunteerproductid(volunteerProductTour.getVolunteerproductid());
                volunteerProductTourPrice.setOrgid(singleTourUpdateVo.getOrgId());
                volunteerProductTourPrice.setPolicyname(tourPriceVo.getPolicyName());
                volunteerProductTourPrice.setProid(singleTourUpdateVo.getProId());
                volunteerProductTourPrice.setShopname(singleTourUpdateVo.getShopName());
                volunteerProductTourPrice.setSiteid(singleTourUpdateVo.getSiteId());
                volunteerProductTourPrice.setSitename(singleTourUpdateVo.getSiteName());
                volunteerProductTourPrice.setTourid(singleTourUpdateVo.getTourId());
                volunteerProductTourPrice.setTouristtype(tourPriceVo.getTouristType());
                volunteerProductTourPrice.setTravelagencyname(singleTourUpdateVo.getOrgName());
                volunteerProductTourPrice.setUserid(singleTourUpdateVo.getUserId());
                volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());

                volunteerProductTourPrice.setDirectcostprice(proProductDirectSalesItem.getVolunteersalesprice());
                //结算价 = 直客价 - 返佣
                volunteerProductTourPrice.setSalescostprice(new BigDecimal(tourPriceVo.getVolunteerDirectPrice())
                        .subtract(new BigDecimal(tourPriceVo.getVolunteerRebatePrice())));
                volunteerProductTourPrice.setRebateprice(new BigDecimal(tourPriceVo.getVolunteerRebatePrice()));
                volunteerProductTourPrice.setSingleroomprice(new BigDecimal(tourPriceVo.getSingleRoomPrice()));
                //固定金额
                volunteerProductTourPrice.setDiscounttypec(2);
                volunteerProductTourPrice.setDirectprice(new BigDecimal(tourPriceVo.getDirectPrice()));
                //奖励金
                volunteerProductTourPrice.setAllowance(proProductDirectSalesItem.getTravelerRewardPrice());
                int insert1 = volunteerProductTourPriceMapper.insert(volunteerProductTourPrice);
                if (insert1 == 0) {
                    log.error("价格策略插入失败！");
                    return new Response().failure("价格策略插入失败！");
                }
            }

        }


        return new Response().success("价格调整成功！");
    }

    /**
     * 　　* @Description: 志愿者团次价格策略调整
     * 　　* @author 周陈
     * 　　* @date 2019/3/4 15:46
     */
    @Override
    @Transactional
    public Response singleTourUpdateOfVol(SingleTourUpdateVo singleTourUpdateVo) {

        for (SingleTourPriceVo tourPriceVo : singleTourUpdateVo.getSingleTourPrices()) {
            VolunteerProductTourPrice volunteerProductTourPrice = volunteerProductTourPriceMapper.selectByPrimaryKey(tourPriceVo.getId());

            //调整价格-直客成本 = 调整金额
            volunteerProductTourPrice.setPrevaluec(new BigDecimal(tourPriceVo.getDirectPrice()).subtract(volunteerProductTourPrice.getDirectcostprice()));
//            volunteerProductTourPrice.setDirectcostprice(new BigDecimal(tourPriceVo.getVolunteerDirectPrice()));
            //固定金额
            volunteerProductTourPrice.setDiscounttypec(2);
            volunteerProductTourPrice.setDirectprice(new BigDecimal(tourPriceVo.getDirectPrice()));
            int count = volunteerProductTourPriceMapper.updateByPrimaryKey(volunteerProductTourPrice);
            if (count < 1) {
                log.error("志愿者团次价格调整失败！");
                return new Response().failure("志愿者团次价格调整失败！");
            }
        }

        return new Response().success("志愿者团次价格调整成功！");
    }

    @Override
    public VolunteerProduct findVolProduct(String shopName, String orgName, String orgId, String userId, String proId, Integer proStatus, String directSalesSendId) {
        VolunteerProductExample example = new VolunteerProductExample();
        if (proStatus == 0) {
            example.or().andOrgidEqualTo(orgId).andProidEqualTo(proId).andUseridEqualTo(userId).andProstatusEqualTo(proStatus).andDatastatusNotEqualTo(-1);
        } else {
            example.or().andOrgidEqualTo(orgId).andProidEqualTo(proId).andUseridEqualTo(userId).andDatastatusNotEqualTo(-1).andProstatusEqualTo(proStatus).andDirectsalessendidEqualTo(directSalesSendId);
        }
        List<VolunteerProduct> volunteerProducts = volunteerProductMapper.selectByExample(example);
        if (volunteerProducts != null && volunteerProducts.size() > 0) {
            return volunteerProducts.get(0);
        } else {
            VolunteerProduct volunteerProduct = new VolunteerProduct();
            volunteerProduct.setId(UUID.randomUUID().toString());
            volunteerProduct.setCreateddate(new Date());
            volunteerProduct.setOrgid(orgId);
            //上架状态  0：待上架；1：已上架 ；-1：删除
            volunteerProduct.setDatastatus(1);
            //0:无更改 1：价格有修改
            volunteerProduct.setPricestatus(0);
            //产品类型 0：普通产品   1：外发产品
            volunteerProduct.setProstatus(proStatus);
            //0:无更改 1：有新团次
            volunteerProduct.setTourstatus(0);
            volunteerProduct.setProid(proId);
            volunteerProduct.setShopname(shopName);
            volunteerProduct.setTravelagencyname(orgName);
            volunteerProduct.setUserid(userId);
            volunteerProduct.setDirectsalessendid(directSalesSendId);
            volunteerProductMapper.insert(volunteerProduct);
            return volunteerProduct;
        }
    }

    /**
     * 　　* @Description: 单产品上架
     * 　　* @author 周陈
     * 　　* @date 2019/2/26 19:15
     */
    @Override
    public Response singleProductShelf(SingleTourUpdateVo singleTourUpdateVo) {
        Date newDate = new Date();
        //查询志愿者产品是否已插入
        VolunteerProduct volProduct = this.findVolProduct(singleTourUpdateVo.getShopName(),
                singleTourUpdateVo.getOrgName(), singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getUserId(),
                singleTourUpdateVo.getProId(), singleTourUpdateVo.getIsOutgoing(), singleTourUpdateVo.getDirectSalesSendId());
        //查询已插入团次ID
        List<String> tourIds = volunteerProductTourMapper.selectTourIds(singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getProId(),
                singleTourUpdateVo.getUserId(), singleTourUpdateVo.getIsOutgoing());
        List<VolunteerProductTour> volunteerProductTours = new ArrayList<>();
        List<VolunteerProductTourPrice> volunteerProductTourPrices = new ArrayList<>();
        if (singleTourUpdateVo.getIsOutgoing() == 0) {
            //普通产品
            //团期
            ProTourExample example = new ProTourExample();
            if (tourIds == null || tourIds.size() == 0) {
                example.or().andProidEqualTo(singleTourUpdateVo.getProId()).andTourstatusEqualTo(1)
                        .andTourdateGreaterThan(newDate);
            } else {
                example.or().andProidEqualTo(singleTourUpdateVo.getProId()).andTourstatusEqualTo(1)
                        .andTourdateGreaterThan(newDate).andIdNotIn(tourIds);
            }
            List<ProTour> proTours = proTourMapper.selectByExample(example);
            log.info("proTour.size={}", proTours.size());
            for (ProTour proTour : proTours) {
                VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
                volunteerProductTour.setCreateddate(newDate);
                //上架状态  0：待上架；1：已上架 ；
                volunteerProductTour.setDatastatus(1);
                volunteerProductTour.setDuedate(proTour.getDuedate());
                volunteerProductTour.setId(UUID.randomUUID().toString());
                volunteerProductTour.setOrgid(singleTourUpdateVo.getOrgId());
                volunteerProductTour.setPlannum(proTour.getPlannum());
                volunteerProductTour.setShopname(singleTourUpdateVo.getShopName());
                volunteerProductTour.setProid(singleTourUpdateVo.getProId());
                volunteerProductTour.setTourdate(proTour.getTourdate());
                volunteerProductTour.setTourid(proTour.getId());
                volunteerProductTour.setTourname(proTour.getTourname());
                volunteerProductTour.setTravelagencyname(singleTourUpdateVo.getOrgName());
                volunteerProductTour.setUserid(singleTourUpdateVo.getUserId());
                volunteerProductTour.setVolunteerproductid(volProduct.getId());
                ProTourPricepolicyExample example1 = new ProTourPricepolicyExample();
                //proId\siteId\orgId
                example1.or().andTouridEqualTo(proTour.getId())
//                        .andSiteidEqualTo(singleTourUpdateVo.getSiteId())
                        .andOrgidEqualTo(singleTourUpdateVo.getOrgId());
                List<ProTourPricepolicy> proTourPricepolicies = proTourPricepolicyMapper.selectByExample(example1);
                if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                    volunteerProductTours.add(volunteerProductTour);
                }
                //给志愿者产品团期价格赋值
                for (ProTourPricepolicy proTourPricepolicy : proTourPricepolicies) {
                    VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                    volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                    volunteerProductTourPrice.setOrderindex(1);
                    volunteerProductTourPrice.setOrgid(singleTourUpdateVo.getOrgId());
                    volunteerProductTourPrice.setPolicyname(proTourPricepolicy.getPolicyname());
                    volunteerProductTourPrice.setProid(singleTourUpdateVo.getProId());
                    volunteerProductTourPrice.setShopname(singleTourUpdateVo.getShopName());
                    volunteerProductTourPrice.setSiteid(proTourPricepolicy.getSiteid());
                    volunteerProductTourPrice.setSitename(proTourPricepolicy.getSitename());
                    volunteerProductTourPrice.setTourid(proTourPricepolicy.getTourid());
                    volunteerProductTourPrice.setTouristtype(proTourPricepolicy.getTouristtype());
                    volunteerProductTourPrice.setTravelagencyname(singleTourUpdateVo.getOrgName());
                    volunteerProductTourPrice.setUserid(singleTourUpdateVo.getUserId());
                    volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());
                    volunteerProductTourPrice.setDirectcostprice(proTourPricepolicy.getVolunteersalesprice());
                    volunteerProductTourPrice.setSalescostprice(proTourPricepolicy.getSalesprice());
                    volunteerProductTourPrice.setRebateprice(proTourPricepolicy.getVolunteerrebateprice());
                    volunteerProductTourPrice.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                    volunteerProductTourPrice.setSalesprice(proTourPricepolicy.getVolunteersalesprice());
                    volunteerProductTourPrice.setDirectprice(proTourPricepolicy.getVolunteerdirectprice());
                    volunteerProductTourPrice.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                    volunteerProductTourPrice.setIsdefault(proTourPricepolicy.getIsdefault());
                    volunteerProductTourPrice.setAllowance(proTourPricepolicy.getTravelerRewardPrice());
                    volunteerProductTourPrices.add(volunteerProductTourPrice);
                    volunteerProductTourPrice.setNewvolunteerproductid(volProduct.getId());
                }
            }
        } else {
            //外发产品
            //团期
            ProProductDirectSalesExample example = new ProProductDirectSalesExample();
            if (tourIds != null && tourIds.size() > 0) {
                example.or().andProidEqualTo(singleTourUpdateVo.getProId())
                        .andSupplieridEqualTo(singleTourUpdateVo.getDirectSalesSendId())
                        .andReceiveridEqualTo(singleTourUpdateVo.getOrgId()).andTourdateGreaterThan(newDate)
                        .andDatastatusEqualTo(1).andAuditstatusEqualTo(1).andIdNotIn(tourIds);
            }else {
                example.or().andProidEqualTo(singleTourUpdateVo.getProId())
                        .andSupplieridEqualTo(singleTourUpdateVo.getDirectSalesSendId())
                        .andReceiveridEqualTo(singleTourUpdateVo.getOrgId()).andTourdateGreaterThan(newDate)
                        .andDatastatusEqualTo(1).andAuditstatusEqualTo(1);
            }
            List<ProProductDirectSales> proTours = proProductDirectSalesMapper.selectByExample(example);
            log.info("proTour.size={}", proTours.size());
            //给志愿者产品团期赋值
            for (ProProductDirectSales proTour : proTours) {
                VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
                volunteerProductTour.setCreateddate(newDate);
                //上架状态  0：待上架；1：已上架 ；
                volunteerProductTour.setDatastatus(1);
                volunteerProductTour.setDuedate(proTour.getDuedate());
                volunteerProductTour.setId(UUID.randomUUID().toString());
                volunteerProductTour.setOrgid(singleTourUpdateVo.getOrgId());
                volunteerProductTour.setPlannum(proTour.getPlannum());
                volunteerProductTour.setShopname(singleTourUpdateVo.getShopName());
                volunteerProductTour.setProid(singleTourUpdateVo.getProId());
                volunteerProductTour.setTourdate(proTour.getTourdate());
                volunteerProductTour.setTourid(proTour.getTourid());
                volunteerProductTour.setTourname(proTour.getTourname());
                volunteerProductTour.setTravelagencyname(singleTourUpdateVo.getOrgName());
                volunteerProductTour.setUserid(singleTourUpdateVo.getUserId());
                volunteerProductTour.setVolunteerproductid(volProduct.getId());
                //团期价格
                ProProductDirectSalesItemExample example1 = new ProProductDirectSalesItemExample();
                example1.or().andDirectsalesidEqualTo(proTour.getId())
                        .andVolunteerdirectpriceIsNotNull()
                        .andVolunteerrebatepriceIsNotNull();
                log.info("proTour.getId()={}",proTour.getId());
                List<ProProductDirectSalesItem> proTourPricepolicies = productDirectSalesItemMapper.selectByExample(example1);
                log.info("proTourPricepolicies={}",proTourPricepolicies);
                if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                    volunteerProductTours.add(volunteerProductTour);
                }
                //封装志愿者团队价格
                for (ProProductDirectSalesItem proTourPricepolicy : proTourPricepolicies) {
                    VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                    volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                    volunteerProductTourPrice.setOrderindex(1);
                    volunteerProductTourPrice.setOrgid(singleTourUpdateVo.getOrgId());
                    volunteerProductTourPrice.setPolicyname(proTourPricepolicy.getPolicyname());
                    volunteerProductTourPrice.setProid(singleTourUpdateVo.getProId());
                    volunteerProductTourPrice.setShopname(singleTourUpdateVo.getShopName());
                    volunteerProductTourPrice.setSiteid(proTourPricepolicy.getSiteid());
                    volunteerProductTourPrice.setSitename(proTourPricepolicy.getSitename());
                    volunteerProductTourPrice.setTourid(proTourPricepolicy.getTourid());
                    volunteerProductTourPrice.setTouristtype(proTourPricepolicy.getTouristtype());
                    volunteerProductTourPrice.setTravelagencyname(singleTourUpdateVo.getOrgName());
                    volunteerProductTourPrice.setUserid(singleTourUpdateVo.getUserId());
                    volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());
                    volunteerProductTourPrice.setRebateprice(proTourPricepolicy.getVolunteerrebateprice());
                    volunteerProductTourPrice.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                    volunteerProductTourPrice.setDirectcostprice(proTourPricepolicy.getVolunteersalesprice());
                    volunteerProductTourPrice.setSalescostprice(proTourPricepolicy.getSalesprice());
                    volunteerProductTourPrice.setSalesprice(proTourPricepolicy.getVolunteersalesprice());
                    volunteerProductTourPrice.setDirectprice(proTourPricepolicy.getVolunteerdirectprice());
                    volunteerProductTourPrice.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                    volunteerProductTourPrice.setIsdefault(proTourPricepolicy.getIsdefault());
                    volunteerProductTourPrice.setAllowance(proTourPricepolicy.getTravelerRewardPrice());
                    volunteerProductTourPrices.add(volunteerProductTourPrice);
                    volunteerProductTourPrice.setNewvolunteerproductid(volProduct.getId());
                }
            }
        }
        //批量插入团期
        insertVolunteerProductTourList(volunteerProductTours);
        //批量插入价格
        log.info("proTourPice.size={}", volunteerProductTourPrices.size());
        insertVolunteerProductTourPriceList(volunteerProductTourPrices);
        return new Response().success("单产品上架成功！");
    }

    /**
     * 　　* @Description: 志愿者产品管理页面
     * 　　* @author 周陈
     * 　　* @date 2019/2/27 10:38
     */
    @Override
    public Response volProductManage(ProSearchCondition proSearchCondition) {
        List<ProductListDto> productListDtos = volunteerProductMapper.selectVolProductManage(proSearchCondition);
        return new Response().success(productListDtos);
    }

    /**
     * 　　* @Description: 志愿者产品状态修改
     * 　　* @author 周陈
     * 　　* @date 2019/2/27 11:26
     */
    @Override
    public Response updateVolProduct(UpdateVolProductVo updateVolProductVo) {
        int i = volunteerProductMapper.updateVolProduct(updateVolProductVo);
        if (i > 0) {
            log.info("志愿者产品状态修改成功！");
        } else {
            log.error("志愿者产品状态修改失败！");
            return new Response().failure("修改失败！");
        }
        return new Response().success("修改成功！");
    }

    /**
     * 　　* @Description: 志愿者产品有团次、价格更新时点击的请求
     * 　　* @author 周陈
     * 　　* @date 2019/3/9 16:35
     */
    @Override
    public Response updateAutoStatus(String volProId) {
        int i = volunteerProductMapper.updateAutoStatus(volProId);
        if (i > 0) {
            return new Response().success("更新成功！");
        }
        return new Response().failure("更新失败！");
    }

    /**
     * 　　* @Description: 志愿者·产品列表接口
     * 　　* @author 周陈
     * 　　* @date 2019/2/27 17:24
     */
    @Override
    public Response volProductList(ProSearchCondition proSearchCondition) {
        log.info("志愿者·产品列表接口userId={},siteId={}", proSearchCondition.getUserId(), proSearchCondition.getSiteId());
        List<ProductListDto> productListDtos = volunteerProductMapper.selectVolProductManage(proSearchCondition);
        return new Response().success(productListDtos);
    }

    /**
     * 　　* @Description: 批量插入团期价格，由于数据库的限制，2100条执行一次插入
     * 　　* @author 周陈
     * 　　* @date 2019/2/21 17:11
     */
    @Override
    @Transactional
    public int insertVolunteerProductTourPriceList(List<VolunteerProductTourPrice> volunteerProductTourPrices) {
        int insertMaxCount = Constants.pojoMaxSizeInSql(VolunteerProductTourPrice.class);
        int insertCount = 0;
        for (int i = 0; i * insertMaxCount < volunteerProductTourPrices.size(); i++) {
            if((i + 1) * insertMaxCount <= volunteerProductTourPrices.size()){
                insertCount += volunteerProductTourPriceMapper.insertList(volunteerProductTourPrices.subList(i * insertMaxCount,(i + 1) * insertMaxCount));
            }else {
                insertCount +=  volunteerProductTourPriceMapper.insertList(volunteerProductTourPrices.subList(i * insertMaxCount,volunteerProductTourPrices.size()));
            }
        }
        log.info("志愿者价格成功插入{}条", volunteerProductTourPrices.size());
        return insertCount;
    }

    @Override
    @Transactional
    public int insertVolunteerProductTourList(List<VolunteerProductTour> volunteerProductTours) {
        int insertMaxCount = Constants.pojoMaxSizeInSql(VolunteerProductTour.class);
        int insertCount = 0;
        for (int i = 0; i * insertMaxCount < volunteerProductTours.size(); i++) {
            if((i + 1) * insertMaxCount <= volunteerProductTours.size()){
                insertCount += volunteerProductTourMapper.insertList(volunteerProductTours.subList(i * insertMaxCount,(i + 1) * insertMaxCount));
            }else {
                insertCount +=  volunteerProductTourMapper.insertList(volunteerProductTours.subList(i * insertMaxCount,volunteerProductTours.size()));
            }
        }
        log.info("志愿者团次成功插入{}条", volunteerProductTours.size());
        return insertCount;
    }

    /**
     * 　　* @Description: 售价统一调整接口
     * 　　* @author 周陈
     * 　　* @date 2019/2/22 18:22
     */
    @Override
    public Response unifiedPriceAdjustment(ShelfProductVO shelfProductVO) {
        //插入产品
        List<VolunteerProduct> volunteerProducts = new ArrayList<>();
        Date newDate = new Date();
        for (int i = 0; i < shelfProductVO.getProIds().size(); i++) {
            VolunteerProduct volunteerProduct = new VolunteerProduct();
            volunteerProduct.setId(UUID.randomUUID().toString());
            volunteerProduct.setCreateddate(newDate);
            volunteerProduct.setOrgid(shelfProductVO.getOrgId());
            //上架状态  0：待上架；1：已上架 ；-1：删除
            volunteerProduct.setDatastatus(1);
            //0:无更改 1：价格有修改
            volunteerProduct.setPricestatus(0);
            //产品类型 0：普通产品   1：外发产品
            volunteerProduct.setProstatus(shelfProductVO.getProIds().get(i).getProStatus());
            //0:无更改 1：有新团次
            volunteerProduct.setTourstatus(0);
            volunteerProduct.setProid(shelfProductVO.getProIds().get(i).getId());
            volunteerProduct.setShopname(shelfProductVO.getShopName());
            volunteerProduct.setTravelagencyname(shelfProductVO.getOrgName());
            volunteerProduct.setUserid(shelfProductVO.getUserId());
            volunteerProduct.setDirectsalessendid(shelfProductVO.getProIds().get(i).getDirectSalesSendId());
            shelfProductVO.getProIds().get(i).setVolunteerProductD(volunteerProduct.getId());
            volunteerProducts.add(volunteerProduct);
        }
        //批量插入志愿者产品
        int volunteerProductsInseter = volunteerProductMapper.insertList(volunteerProducts);
        if (volunteerProductsInseter == volunteerProducts.size()) {
            log.info("批量插入志愿者产品成功！");
        } else {
            log.error("批量插入志愿者产品失败！");
            return new Response().failure("批量插入志愿者产品失败！");
        }

        //插入团期\插入价格
        for (int i = 0; i < shelfProductVO.getProIds().size(); i++) {
            List<VolunteerProductTour> volunteerProductTours = new ArrayList<>();
            if (shelfProductVO.getProIds().get(i).getProStatus() == 0) {
                //普通产品
                //团期
                ProTourExample example = new ProTourExample();
                example.or().andProidEqualTo(shelfProductVO.getProIds().get(i).getId()).andTourstatusEqualTo(1)
                        .andTourdateGreaterThan(newDate);
                List<ProTour> proTours = proTourMapper.selectByExample(example);
                log.info("proTour.size={}", proTours.size());
                //给志愿者产品团期赋值
                for (ProTour proTour : proTours) {
                    VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
                    volunteerProductTour.setCreateddate(newDate);
                    //上架状态  0：待上架；1：已上架 ；
                    volunteerProductTour.setDatastatus(1);
                    volunteerProductTour.setDuedate(proTour.getDuedate());
                    volunteerProductTour.setId(UUID.randomUUID().toString());
                    volunteerProductTour.setOrgid(shelfProductVO.getOrgId());
                    volunteerProductTour.setPlannum(proTour.getPlannum());
                    volunteerProductTour.setShopname(shelfProductVO.getShopName());
                    volunteerProductTour.setProid(shelfProductVO.getProIds().get(i).getId());
                    volunteerProductTour.setTourdate(proTour.getTourdate());
                    volunteerProductTour.setTourid(proTour.getId());
                    volunteerProductTour.setTourname(proTour.getTourname());
                    volunteerProductTour.setTravelagencyname(shelfProductVO.getOrgName());
                    volunteerProductTour.setUserid(shelfProductVO.getUserId());
                    volunteerProductTour.setVolunteerproductid(shelfProductVO.getProIds().get(i).getVolunteerProductD());
                    List<VolunteerProductTourPrice> volunteerProductTourPrices = new ArrayList<>();
                    ProTourPricepolicyExample example1 = new ProTourPricepolicyExample();
                    //proId\siteId\orgId
                    example1.or().andTouridEqualTo(proTour.getId())
//                            .andSiteidEqualTo(shelfProductVO.getSiteId())
                            .andOrgidEqualTo(shelfProductVO.getOrgId());
                    List<ProTourPricepolicy> proTourPricepolicies = proTourPricepolicyMapper.selectByExample(example1);
                    //给志愿者产品团期价格赋值
                    if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                        volunteerProductTourMapper.insert(volunteerProductTour);
                    }
                    for (ProTourPricepolicy proTourPricepolicy : proTourPricepolicies) {
                        VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                        volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                        volunteerProductTourPrice.setOrderindex(1);
                        volunteerProductTourPrice.setOrgid(shelfProductVO.getOrgId());
                        volunteerProductTourPrice.setPolicyname(proTourPricepolicy.getPolicyname());
                        volunteerProductTourPrice.setProid(shelfProductVO.getProIds().get(i).getId());
                        volunteerProductTourPrice.setShopname(shelfProductVO.getShopName());
                        volunteerProductTourPrice.setSiteid(proTourPricepolicy.getSiteid());
                        volunteerProductTourPrice.setSitename(proTourPricepolicy.getSitename());
                        volunteerProductTourPrice.setTourid(proTourPricepolicy.getTourid());
                        volunteerProductTourPrice.setTouristtype(proTourPricepolicy.getTouristtype());
                        volunteerProductTourPrice.setTravelagencyname(shelfProductVO.getOrgName());
                        volunteerProductTourPrice.setUserid(shelfProductVO.getUserId());
                        volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());
                        volunteerProductTourPrice.setDirectcostprice(proTourPricepolicy.getVolunteersalesprice());
                        volunteerProductTourPrice.setSalescostprice(proTourPricepolicy.getSalesprice());
                        volunteerProductTourPrice.setRebateprice(proTourPricepolicy.getVolunteerrebateprice());
                        volunteerProductTourPrice.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                        volunteerProductTourPrice.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                        volunteerProductTourPrice.setIsdefault(proTourPricepolicy.getIsdefault());
                        volunteerProductTourPrice.setNewvolunteerproductid(volunteerProductTour.getVolunteerproductid());
                        //判断上架类型，1.直接上架；2.价格统一调整上架
                        if (shelfProductVO.getType() == 1) {
                            volunteerProductTourPrice.setSalesprice(proTourPricepolicy.getSalesprice());
                            volunteerProductTourPrice.setDirectprice(proTourPricepolicy.getVolunteerdirectprice());
                        } else {
                            //调整类型，1.百分比；2.固定金额
                            BigDecimal b1 = new BigDecimal(new Double(shelfProductVO.getPreValueC()));
                            BigDecimal directPrice = new BigDecimal("0");
                            BigDecimal salesPrice = new BigDecimal("0");
                            switch (shelfProductVO.getDiscountTypeC()) {
                                case 1:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().multiply(b1).add(proTourPricepolicy.getVolunteerdirectprice()).setScale(3, BigDecimal.ROUND_HALF_UP);
                                    salesPrice = proTourPricepolicy.getSalesprice().multiply(b1).add(proTourPricepolicy.getSalesprice()).setScale(3, BigDecimal.ROUND_HALF_UP);

                                    volunteerProductTourPrice.setPrevaluec(proTourPricepolicy.getVolunteerdirectprice().multiply(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                                    volunteerProductTourPrice.setPrevalueb(proTourPricepolicy.getSalesprice().multiply(b1).setScale(3, BigDecimal.ROUND_HALF_UP));
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                                case 2:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().add(b1);
                                    salesPrice = proTourPricepolicy.getSalesprice().add(b1);
                                    volunteerProductTourPrice.setPrevaluec(b1);
                                    volunteerProductTourPrice.setPrevalueb(b1);
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                            }
                            volunteerProductTourPrice.setSalesprice(salesPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                            volunteerProductTourPrice.setDirectprice(directPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                        }
                        volunteerProductTourPrices.add(volunteerProductTourPrice);
                    }
//                批量插入产品团期价格
                    int insertTourPricesList = volunteerProductTourPriceMapper.insertList(volunteerProductTourPrices);
                    if (insertTourPricesList != volunteerProductTourPrices.size()) {
                        log.error("批量插入产品团期价格失败！团次id={}", proTour.getId());
                        return new Response().failure("批量插入产品团期价格失败！");
                    }
//                    if (proTours.size() > 150) {
//                        volunteerProductTourMapper.insert(volunteerProductTour);
//                    }
//                    volunteerProductTours.add(volunteerProductTour);
                }
                //插入志愿者产品团期
//                if (proTours.size() > 0 && proTours.size() < 150) {
//                    int insertTour = volunteerProductTourMapper.insertList(volunteerProductTours);
//                    if (insertTour == volunteerProductTours.size()) {
//                        log.info("批量插入志愿者产品团期成功！proId={}", shelfProductVO.getProIds().get(i).getId());
//                    } else {
//                        log.error("批量插入志愿者产品团期失败！");
//                        return new Response().failure("批量插入志愿者产品团期失败！");
//                    }
//                }

            } else {
                //外发产品
                //团期
                ProProductDirectSalesExample example = new ProProductDirectSalesExample();
                example.or().andProidEqualTo(shelfProductVO.getProIds().get(i).getId())
                        .andSupplieridEqualTo(shelfProductVO.getProIds().get(i).getDirectSalesSendId())
                        .andReceiveridEqualTo(shelfProductVO.getOrgId()).andTourdateGreaterThan(newDate)
                        .andDatastatusEqualTo(1).andAuditstatusEqualTo(1);
                List<ProProductDirectSales> proTours = proProductDirectSalesMapper.selectByExample(example);
                log.info("proTour.size={}", proTours.size());
                //给志愿者产品团期赋值
                for (ProProductDirectSales proTour : proTours) {
                    VolunteerProductTour volunteerProductTour = new VolunteerProductTour();
                    volunteerProductTour.setCreateddate(newDate);
                    //上架状态  0：待上架；1：已上架 ；
                    volunteerProductTour.setDatastatus(1);
                    volunteerProductTour.setDuedate(proTour.getDuedate());
                    volunteerProductTour.setId(UUID.randomUUID().toString());
                    volunteerProductTour.setOrgid(shelfProductVO.getOrgId());
                    volunteerProductTour.setPlannum(proTour.getPlannum());
                    volunteerProductTour.setShopname(shelfProductVO.getShopName());
                    volunteerProductTour.setProid(shelfProductVO.getProIds().get(i).getId());
                    volunteerProductTour.setTourdate(proTour.getTourdate());
                    volunteerProductTour.setTourid(proTour.getTourid());
                    volunteerProductTour.setTourname(proTour.getTourname());
                    volunteerProductTour.setTravelagencyname(shelfProductVO.getOrgName());
                    volunteerProductTour.setUserid(shelfProductVO.getUserId());
                    volunteerProductTour.setVolunteerproductid(shelfProductVO.getProIds().get(i).getVolunteerProductD());
                    //团期价格
                    ProProductDirectSalesItemExample example1 = new ProProductDirectSalesItemExample();
                    example1.or().andProidEqualTo(shelfProductVO.getProIds().get(i).getId())
                            .andDirectsalesidEqualTo(proTour.getId());
                    List<ProProductDirectSalesItem> proTourPricepolicies = productDirectSalesItemMapper.selectByExample(example1);
                    List<VolunteerProductTourPrice> volunteerProductTourPrices = new ArrayList<>();
                    if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                        volunteerProductTourMapper.insert(volunteerProductTour);
                    }
                    //封装志愿者团队价格
                    for (ProProductDirectSalesItem proTourPricepolicy : proTourPricepolicies) {
                        VolunteerProductTourPrice volunteerProductTourPrice = new VolunteerProductTourPrice();
                        volunteerProductTourPrice.setId(UUID.randomUUID().toString());
//                    排序（默认1）
                        volunteerProductTourPrice.setOrderindex(1);
                        volunteerProductTourPrice.setOrgid(shelfProductVO.getOrgId());
                        volunteerProductTourPrice.setPolicyname(proTourPricepolicy.getPolicyname());
                        volunteerProductTourPrice.setProid(shelfProductVO.getProIds().get(i).getId());
                        volunteerProductTourPrice.setShopname(shelfProductVO.getShopName());
                        volunteerProductTourPrice.setSiteid(proTourPricepolicy.getSiteid());
                        volunteerProductTourPrice.setSitename(proTourPricepolicy.getSitename());
                        volunteerProductTourPrice.setTourid(proTourPricepolicy.getTourid());
                        volunteerProductTourPrice.setTouristtype(proTourPricepolicy.getTouristtype());
                        volunteerProductTourPrice.setTravelagencyname(shelfProductVO.getOrgName());
                        volunteerProductTourPrice.setUserid(shelfProductVO.getUserId());
                        volunteerProductTourPrice.setVolunteerproductid(volunteerProductTour.getId());
                        volunteerProductTourPrice.setRebateprice(proTourPricepolicy.getVolunteerrebateprice());
                        volunteerProductTourPrice.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                        volunteerProductTourPrice.setDirectcostprice(proTourPricepolicy.getVolunteersalesprice());
                        volunteerProductTourPrice.setSalescostprice(proTourPricepolicy.getSalesprice());
                        volunteerProductTourPrice.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                        volunteerProductTourPrice.setIsdefault(proTourPricepolicy.getIsdefault());
                        volunteerProductTourPrice.setNewvolunteerproductid(volunteerProductTour.getVolunteerproductid());

//判断上架类型，1.直接上架；2.价格统一调整上架
                        if (shelfProductVO.getType() == 1) {
                            volunteerProductTourPrice.setSalesprice(proTourPricepolicy.getSalesprice());
                            volunteerProductTourPrice.setDirectprice(proTourPricepolicy.getVolunteerdirectprice());
                        } else {
                            //调整金额
                            BigDecimal b1 = new BigDecimal(new Double(shelfProductVO.getPreValueC()));
                            BigDecimal directPrice = new BigDecimal("0");
                            BigDecimal salesPrice = new BigDecimal("0");
                            //调整类型，1.百分比；2.固定金额
                            switch (shelfProductVO.getDiscountTypeC()) {
                                case 1:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().multiply(b1).add(proTourPricepolicy.getVolunteerdirectprice());
                                    salesPrice = proTourPricepolicy.getSalesprice().multiply(b1).add(proTourPricepolicy.getSalesprice());
                                    volunteerProductTourPrice.setPrevaluec(proTourPricepolicy.getVolunteerdirectprice().multiply(b1));
                                    volunteerProductTourPrice.setPrevalueb(proTourPricepolicy.getSalesprice().multiply(b1));
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                                case 2:
                                    directPrice = proTourPricepolicy.getVolunteerdirectprice().add(b1);
                                    salesPrice = proTourPricepolicy.getSalesprice().add(b1);
                                    volunteerProductTourPrice.setPrevaluec(b1);
                                    volunteerProductTourPrice.setPrevalueb(b1);
                                    volunteerProductTourPrice.setDiscounttypeb(shelfProductVO.getDiscountTypeC());
                                    volunteerProductTourPrice.setDiscounttypec(shelfProductVO.getDiscountTypeC());
                                    break;
                            }
                            volunteerProductTourPrice.setSalesprice(salesPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                            volunteerProductTourPrice.setDirectprice(directPrice.setScale(3, BigDecimal.ROUND_HALF_UP));
                        }
                        volunteerProductTourPrices.add(volunteerProductTourPrice);
                    }
                    int insertTourPricesList = volunteerProductTourPriceMapper.insertList(volunteerProductTourPrices);
                    if (insertTourPricesList != volunteerProductTourPrices.size()) {
                        log.error("批量插入产品团期价格失败！团次id={}", proTour.getTourid());
                        return new Response().failure("批量插入产品团期价格失败！");
                    }
                    //由于数据库的限制,加此判断
//                    if (proTours.size() > 150) {
//                        volunteerProductTourMapper.insert(volunteerProductTour);
//                    }
//                    volunteerProductTours.add(volunteerProductTour);
                }
                //插入志愿者产品团期
//                if (proTours.size() > 0 && proTours.size() < 150) {
//                    int insertTour = volunteerProductTourMapper.insertList(volunteerProductTours);
//                    if (insertTour == volunteerProductTours.size()) {
//                        log.info("批量插入志愿者产品团期成功！proId={}", shelfProductVO.getProIds().get(i).getId());
//                    } else {
//                        log.error("批量插入志愿者产品团期失败！");
//                        return new Response().failure("批量插入志愿者产品团期失败！");
//                    }
//                }
            }
        }
        return new Response().success("产品直接上架成功！");
    }

    @Override
    public ProductDetailPriceDto getProductDetailPriceDto(String userId, String proId, String siteId, Integer proStatus) {
        ProductDetailPriceDto productDetailPriceDto = volunteerProductTourPriceMapper.selectTourPriceBySale(proId, siteId, userId, proStatus);
        return productDetailPriceDto;
    }

    @Override
    public Response getTourList(String siteId, String proId, String orgId, String shopUserId, Integer proStatus) {
        //获取当前日期后四个月
        List<String> dateList = DateUtil.getCalendarMonth("yyyy-MM", new Date(), 4);
        List<Map<String, Object>> returnList = new ArrayList<>();
        for (String date : dateList) {
            Map<String, Object> tourBoMap = new HashMap<>();
            List<TourBo> listTours = volunteerProductTourMapper.selectTourList(date, proId, siteId, shopUserId, proStatus);
            //TODO BUG：后期如果出现一天有两个团期，需要进行去重处理
            Map<Date, List<TourBo>> collect = listTours.stream().collect(Collectors.groupingBy(TourBo::getTourDate));
            List<TourBo> distinctTours = new ArrayList<>();

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
            tourBoMap.put("month", date);
            BigDecimal minPrice = new BigDecimal(0);
            //按照月分销价价格排序
            List<TourBo> salesPriceCollect = distinctTours.stream().sorted(Comparator.comparing(TourBo::getDirectPrice)).collect(Collectors.toList());
            //获取当前月分销价最小的价格
            if (salesPriceCollect.size() > 0) {
                minPrice = salesPriceCollect.get(0).getDirectPrice();
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
    public Response validateDetail(JSONObject param, HttpServletRequest request) {
        log.info("志愿者价格校验!");
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        log.info("当前登录人信息:{}", wxUserInfo);
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("用户未登录！");
        }
        Integer userType = wxUserInfo.getUserType();
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
            VolunteerProductTourPrice pricePolicy = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());
            BigDecimal salesPrice = new BigDecimal(0);

            salesPrice = pricePolicy.getDirectprice();

            //判断价格是否变化
            if (salesPrice.compareTo(webPrice) != 0) {
                log.info("后台查询价格：{},前台传输价格:{}", salesPrice.toString(), webPrice.toString());
                return new Response().failure("价格发生变化，请刷新！");
            }
        }
        //验证库存
        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
        ProTour proTour = proTourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
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

    @Override
    public Response getProductPriceList(String tourDate, String siteId, String tourId, String userId, Integer proStatus) {
        List<TourInfoVo> tourInfoVoList = new ArrayList<>();
        VolunteerProductTour proTour = volunteerProductTourMapper.selectByPrimaryKey(tourId);
        ProTour proTour1 = proTourMapper.selectByPrimaryKey(proTour.getTourid());
        //业务返回对象
        TourInfoVo tourInfoVo = new TourInfoVo();
        //团期的部分数据设置到返回值中
        TourBo tourBo = new TourBo();

        tourBo.setId(proTour.getId());
        tourBo.setTourDate(proTour.getTourdate());
        tourBo.setTourName(proTour.getTourname());
        tourBo.setDueDate(proTour.getDuedate());
        tourBo.setTourNo(proTour1.getTourno());
        tourInfoVo.setTourInfo(tourBo);

        //开始获取 外发产品-团次价格策略
        List<TourPricePolicyBo> listPricePolicy = volunteerProductTourMapper.listPricePolicy(tourId, siteId, userId, proStatus);
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
        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
        tourid = volunteerProductTour.getTourid();
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
            VolunteerProductTourPrice pricePolicy = volunteerProductTourPriceMapper.selectByPrimaryKey(policyid.toUpperCase());
            BigDecimal salesPrice = null;
            BigDecimal rebateprice = null;

            //市场价
            salesPrice = pricePolicy.getDirectprice();
            //计算实际总价
            realPrice = realPrice.add(perNum.multiply(salesPrice));

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
    public Response getOrderInfo(HttpServletRequest httpServletRequest, JSONObject jsonObject) {
        log.info("getOrderInfo请求参数为：{}", jsonObject.toJSONString());
        String dataStatus = jsonObject.getString("dataStatus");
        String startPage = jsonObject.getString("startPage");
        String size = jsonObject.getString("size");
        String condition = jsonObject.getString("condition");
        WxUser wxUserInfo = (WxUser) httpServletRequest.getSession().getAttribute("wxUserInfo");//获取当前登录人信息
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("请重新登录查看订单信息！");
        }

        Integer userType = wxUserInfo.getUserType();
        String userId = wxUserInfo.getUserId();
        log.info("当前登录人信息:{}", wxUserInfo);
        int start = Integer.parseInt(startPage) * Integer.parseInt(size);
        int pageSize = Integer.parseInt(size);
        String orgId = Constants.UUID_DEFAULT;
        if (userType == 1) {
            ErpUser erpUser = (ErpUser) httpServletRequest.getSession().getAttribute("erpUserInfo");
            orgId = erpUser.getOrgID();
        }
        log.info("订单查询参数dataStatus={}, condition={}, userId={}, orgId={}, start={}, pageSize={}",
                dataStatus, condition, userId, orgId, start, pageSize, userType);
        List<OrderInfoViewDto> order = ordOrderinfoMapper.getVolunteerOrder(dataStatus, condition, userId, wxUserInfo.getVolunteerApplication().getOrgid());
        List<OrderInfoViewVo> orderList = businessService.getOrderList(order);
        Map map = new HashMap();
        map.put("totalNum", Objects.nonNull(order) && !order.isEmpty() ? order.get(0).getTotalNum() : 0);
        map.put("orderList", orderList);
        return new Response().success(map);
    }

    /**
     * 　　* @Description: 多团次查询
     * 　　* @author 周陈
     * 　　* @date 2019/3/8 4:02
     */
    @Override
    public Response manyTours(String tourDate, String orgId, String proId, String siteId, String userId, Integer proStatus) {
        List<ManyToursDto> manyToursDtos = volunteerProductTourMapper.manyTours(tourDate, siteId, orgId, proId, userId, proStatus);
        return new Response().success(manyToursDtos);
    }

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(new Double(-1));
        BigDecimal b2 = new BigDecimal(new Double(200));
        BigDecimal multiply = b2.multiply(b1).add(b2).add(b2);
        System.out.println(multiply);

    }
}
