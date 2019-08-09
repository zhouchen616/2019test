package com.holyrobot.con_product.server.impl;

import com.alibaba.fastjson.JSON;
import com.holyrobot.con_fin.mapper.FinSupplierDynamicManagementMapper;
import com.holyrobot.con_fin.pojo.FinSupplierDynamicManagement;
import com.holyrobot.con_fin.pojo.FinSupplierDynamicManagementExample;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.*;
import com.holyrobot.con_product.mapper.*;
import com.holyrobot.con_product.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_product.server.ProProductDirectSalesService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: B端分销
 * @date 2019/3/5 9:56
 */
@Service
@Slf4j
public class ProProductDirectSalesServiceImpl implements ProProductDirectSalesService {
    @Autowired
    private ProProductDirectSalesMapper proProductDirectSalesMapper;
    @Autowired
    private ProProductDirectSalesItemMapper productDirectSalesItemMapper;
    @Autowired
    private ProProductDirectSalesProductMapper proProductDirectSalesProductMapper;
    @Autowired
    private ProProductMapper proProductMapper;
    @Autowired
    private ProTourMapper proTourMapper;
    @Autowired
    private ProTourPricepolicyMapper proTourPricepolicyMapper;
    @Autowired
    private ProProductDirectSalesRelationMapper proProductDirectSalesRelationMapper;
    @Autowired
    private FinSupplierDynamicManagementMapper finSupplierDynamicManagementMapper;
    @Autowired
    private ProProductDynamicManageSettingMapper proProductDynamicManageSettingMapper;


    /**
     * 　　* @Description: 产品上架
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:50
     */
    @Override
    @Transactional
    public Response directShelfProduct(ShelfProductVO directShelfProductVO) {
        log.info("进入B主动分销 产品上架 directShelfProduct={}",JSON.toJSONString(directShelfProductVO));
        //给供应商配置动态管理费，主动分销的产品动态管理费未写入产品
        String orgId=directShelfProductVO.getOrgId();
        String supplierId;
        FinSupplierDynamicManagementExample finSupplierDynamicManagementExample = new FinSupplierDynamicManagementExample();
        FinSupplierDynamicManagementExample.Criteria criteria = finSupplierDynamicManagementExample.createCriteria();
        criteria.andOrgidEqualTo(orgId);
        log.info("产品数量:{}",directShelfProductVO.getProIds().size());
        for(int i=0;i<directShelfProductVO.getProIds().size();i++){
            supplierId=directShelfProductVO.getProIds().get(i).getDirectSalesSendId();
            log.info("供应商配置动态管理费orgId={},supplierId={}",orgId,supplierId);
            criteria.andSupplieridEqualTo(supplierId);
            List<FinSupplierDynamicManagement> result = finSupplierDynamicManagementMapper.selectByExample(finSupplierDynamicManagementExample);
            log.info("**********result={}",result);
            if(result!=null&&result.size()>0){
                ProProductDynamicManageSettingExample proProductDynamicManageSettingExample = new ProProductDynamicManageSettingExample();
                ProProductDynamicManageSettingExample.Criteria criteria1 =proProductDynamicManageSettingExample.createCriteria();
                criteria1.andOrgidEqualTo(orgId);
//                criteria1.andSupplieridEqualTo(supplierId);
                log.info("proid={}",directShelfProductVO.getProIds().get(i).getId());
                criteria1.andProductidEqualTo(directShelfProductVO.getProIds().get(i).getDirectSalesSendId());
                List<ProProductDynamicManageSetting> proResult = proProductDynamicManageSettingMapper.selectByExample(proProductDynamicManageSettingExample);
                if(proResult==null||proResult.size()==0){
                    ProProductDynamicManageSetting proProductDynamicManageSetting = new ProProductDynamicManageSetting();
                    proProductDynamicManageSetting.setId(UUID.randomUUID().toString());
                    proProductDynamicManageSetting.setProductsource(2);
                    proProductDynamicManageSetting.setSuppliertype(2);
                    proProductDynamicManageSetting.setProductid(directShelfProductVO.getProIds().get(i).getId());
                    proProductDynamicManageSetting.setSupplierid(supplierId);
                    proProductDynamicManageSetting.setOrgid(orgId);
                    proProductDynamicManageSetting.setCreateddate(new Date());
                    proProductDynamicManageSetting.setReviseddate(new Date());
                    proProductDynamicManageSetting.setSetmode(result.get(0).getSetmode());
                    proProductDynamicManageSetting.setSetmodevalue(result.get(0).getSetmodevalue());
                    int insert = proProductDynamicManageSettingMapper.insert(proProductDynamicManageSetting);
                    if(insert==1){
                    log.info("给供应商配置动态管理费，主动分销的产品动态管理费未写入产品成功");
                    }
                }
            }
        }

        //封装产品iD,用于查询，减少数据库连接次数，提高效率
        List<String> proIds = new ArrayList<>();
        for (VolunteerProIdAndTypeDto volunteerProIdAndTypeDto : directShelfProductVO.getProIds()) {
            proIds.add(volunteerProIdAndTypeDto.getId());
        }

        //查询产品
        ProProductExample example = new ProProductExample();
        example.or().andIdIn(proIds);
        List<ProProduct> proProducts = proProductMapper.selectByExample(example);
        return this.insterProProductDirect(proProducts, directShelfProductVO);
    }

    /**
     * 　　* @Description: 批量产品最低返佣查询
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:52
     */
    @Override
    public Response minRebate(ShelfProductVO directShelfProductVO) {
        log.info("进入B主动分销 批量产品最低返佣查询 minRebate");
        RebatePriceDto rebatePriceDto = proTourPricepolicyMapper.selectMinRebatePrice(directShelfProductVO.getSiteId(), directShelfProductVO.getProIds());
        rebatePriceDto.setPricePercent(rebatePriceDto.getPricePercent() * -1);
        rebatePriceDto.setPrice(rebatePriceDto.getPrice() * -1);
        return new Response().success(rebatePriceDto);
    }

    /**
     * 　　* @Description: 单团次价格调整接口
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:57
     */
    @Override
    @Transactional
    public Response singleTourUpdate(SingleTourUpdateVo singleTourUpdateVo) {
        log.info("进入B主动分销 单团次价格调整接口 singleTourUpdate");
        //1.产品处理
        ProProductDirectSalesProductExample example = new ProProductDirectSalesProductExample();
        example.or().andReceiveridEqualTo(singleTourUpdateVo.getOrgId())
                .andSupplieridEqualTo(singleTourUpdateVo.getDirectSalesSendId())
                .andProidEqualTo(singleTourUpdateVo.getProId()).andIsautoEqualTo(1);
        List<ProProductDirectSalesProduct> proProductDirectSalesProducts = proProductDirectSalesProductMapper.selectByExample(example);
        ProProductDirectSalesProduct proProductDirectSalesProduct = new ProProductDirectSalesProduct();
        if (proProductDirectSalesProducts != null && proProductDirectSalesProducts.size() > 0) {
            proProductDirectSalesProduct = proProductDirectSalesProducts.get(0);
        } else {
            ProProduct proProduct = proProductMapper.selectByPrimaryKey(singleTourUpdateVo.getProId());
            proProductDirectSalesProduct = this.getProProductDirectSalesProduct(proProduct,
                    singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getOrgName());

            int insert = proProductDirectSalesProductMapper.insert(proProductDirectSalesProduct);
            if (insert < 1) {
                log.error("产品插入失败！");
                return new Response().failure("产品插入失败!");
            }
        }

        //2.团期处理
        ProTour proTour = proTourMapper.selectByPrimaryKey(singleTourUpdateVo.getTourId());
        ProProductDirectSales proProductDirectSales = this.getProProductDirectSales(proTour, proProductDirectSalesProduct.getSuppliername(),
                singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getOrgName());
        proProductDirectSales.setDirectSalesProductId(proProductDirectSalesProduct.getId());
        int insert = proProductDirectSalesMapper.insert(proProductDirectSales);
        if (insert < 1) {
            log.error("产品团期插入失败！");
            return new Response().failure("产品团期插入失败!");
        }
        //3.价格插入
        for (SingleTourPriceVo tourPriceVo : singleTourUpdateVo.getSingleTourPrices()) {
            ProTourPricepolicy proTourPricepolicy = proTourPricepolicyMapper.selectByPrimaryKey(tourPriceVo.getId());
            ProProductDirectSalesItem proProductDirectSalesItem = new ProProductDirectSalesItem();
            proProductDirectSalesItem.setId(UUID.randomUUID().toString());
            proProductDirectSalesItem.setTourid(proTour.getId());
            proProductDirectSalesItem.setTouristtype(proTourPricepolicy.getTouristtype());
            proProductDirectSalesItem.setPolicyname(proTourPricepolicy.getPolicyname());
            proProductDirectSalesItem.setIsdefault(proTourPricepolicy.getIsdefault());
            proProductDirectSalesItem.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
            proProductDirectSalesItem.setOrderindex(proTourPricepolicy.getOrderindex());
            proProductDirectSalesItem.setSiteid(proTourPricepolicy.getSiteid());
            proProductDirectSalesItem.setSitename(proTourPricepolicy.getSitename());
            proProductDirectSalesItem.setProid(proTourPricepolicy.getProid());

            proProductDirectSalesItem.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
            //销售成本价 = 原销售价
            proProductDirectSalesItem.setSalescostprice(proTourPricepolicy.getSalesprice());
            //直客成本加 = 原直客价
            proProductDirectSalesItem.setDirectcostprice(proTourPricepolicy.getDirectprice());
            proProductDirectSalesItem.setDirectsalesid(proProductDirectSales.getId());
            proProductDirectSalesItem.setEtasalescostprice(proTourPricepolicy.getSalesprice());
            proProductDirectSalesItem.setEtadirectcostprice(proTourPricepolicy.getDirectprice());
            proProductDirectSalesItem.setEtarebateprice(proTourPricepolicy.getRebateprice());
            proProductDirectSalesItem.setEtasingleroomprice(proTourPricepolicy.getSingleroomprice());
//            proProductDirectSalesItem.setVolunteerdirectprice(proTourPricepolicy.getVolunteerdirectprice());
//            proProductDirectSalesItem.setVolunteerrebateprice(proTourPricepolicy.getVolunteerrebateprice());
//            proProductDirectSalesItem.setVolunteersalesprice(proTourPricepolicy.getVolunteersalesprice());
            proProductDirectSalesItem.setIsauto(1);
            //返佣
            proProductDirectSalesItem.setRebateprice(new BigDecimal(tourPriceVo.getVolunteerRebatePrice()));
            //直客价
            proProductDirectSalesItem.setDirectprice(new BigDecimal(tourPriceVo.getDirectPrice()));
            //同行结算价 = 直客价 - 返佣
            proProductDirectSalesItem.setSalesprice(new BigDecimal(tourPriceVo.getDirectPrice())
                    .subtract(new BigDecimal(tourPriceVo.getVolunteerDirectPrice())));
            int insert1 = productDirectSalesItemMapper.insert(proProductDirectSalesItem);
            if (insert1 < 1) {
                log.error("价格策略插入失败！");
                return new Response().failure("价格策略插入失败！");
            }
        }
        //普通产品表的主键ID 用 外发产品表的主键ID 覆盖掉
        singleTourUpdateVo.setProId(proProductDirectSalesProduct.getId());
        return new Response().success("价格调整成功！");
    }

    /**
     * 　　* @Description: 单产品上架
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 16:43
     */
    @Override
    public Response singleProductShelf(SingleTourUpdateVo singleTourUpdateVo) {
        log.info("进入B主动分销 单产品上架 singleProductShelf={}",JSON.toJSONString(singleTourUpdateVo));

        //给供应商配置动态管理费，主动分销的产品动态管理费未写入产品
        String orgId=singleTourUpdateVo.getOrgId();
        String supplierId=singleTourUpdateVo.getDirectSalesSendId();
        log.info("供应商配置动态管理费orgId={},supplierId={},proid={}",orgId,supplierId,singleTourUpdateVo.getProId());
        FinSupplierDynamicManagementExample finSupplierDynamicManagementExample = new FinSupplierDynamicManagementExample();
        FinSupplierDynamicManagementExample.Criteria criteria = finSupplierDynamicManagementExample.createCriteria();
        criteria.andOrgidEqualTo(orgId);
        criteria.andSupplieridEqualTo(supplierId);
        List<FinSupplierDynamicManagement> result = finSupplierDynamicManagementMapper.selectByExample(finSupplierDynamicManagementExample);
        if(result!=null&&result.size()>0){
            ProProductDynamicManageSettingExample proProductDynamicManageSettingExample = new ProProductDynamicManageSettingExample();
            ProProductDynamicManageSettingExample.Criteria criteria1 =proProductDynamicManageSettingExample.createCriteria();
            criteria1.andOrgidEqualTo(orgId);
//            criteria1.andSupplieridEqualTo(supplierId);
            criteria1.andProductidEqualTo(singleTourUpdateVo.getProId());
            List<ProProductDynamicManageSetting> proResult = proProductDynamicManageSettingMapper.selectByExample(proProductDynamicManageSettingExample);
            if(proResult==null||proResult.size()==0){
                ProProductDynamicManageSetting proProductDynamicManageSetting = new ProProductDynamicManageSetting();
                proProductDynamicManageSetting.setId(UUID.randomUUID().toString());
                proProductDynamicManageSetting.setProductsource(2);
                proProductDynamicManageSetting.setSuppliertype(2);
                proProductDynamicManageSetting.setProductid(singleTourUpdateVo.getProId());
                proProductDynamicManageSetting.setSupplierid(supplierId);
                proProductDynamicManageSetting.setOrgid(orgId);
                proProductDynamicManageSetting.setCreateddate(new Date());
                proProductDynamicManageSetting.setReviseddate(new Date());
                proProductDynamicManageSetting.setSetmode(result.get(0).getSetmode());
                proProductDynamicManageSetting.setSetmodevalue(result.get(0).getSetmodevalue());
                int insert = proProductDynamicManageSettingMapper.insert(proProductDynamicManageSetting);
                if(insert==1){
                    log.info("给供应商配置动态管理费，主动分销的产品动态管理费未写入产品成功");
                }
            }

        }
        //1.产品处理
        ProProductDirectSalesProductExample example = new ProProductDirectSalesProductExample();
        example.or().andReceiveridEqualTo(singleTourUpdateVo.getOrgId())
                .andSupplieridEqualTo(singleTourUpdateVo.getDirectSalesSendId())
                .andProidEqualTo(singleTourUpdateVo.getProId()).andIsautoEqualTo(1);
        List<ProProductDirectSalesProduct> proProductDirectSalesProducts = proProductDirectSalesProductMapper.selectByExample(example);
        ProProductDirectSalesProduct proProductDirectSalesProduct = new ProProductDirectSalesProduct();
        if (proProductDirectSalesProducts != null && proProductDirectSalesProducts.size() > 0) {
            proProductDirectSalesProduct = proProductDirectSalesProducts.get(0);
        } else {
            ProProduct proProduct = proProductMapper.selectByPrimaryKey(singleTourUpdateVo.getProId());
//            ProProduct proProduct = proProductMapper.selectByPrimaryKey(singleTourUpdateVo.getSingleTourPrices().get(0).getId());
            proProductDirectSalesProduct = this.getProProductDirectSalesProduct(proProduct,
                    singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getOrgName());
            int insert = proProductDirectSalesProductMapper.insert(proProductDirectSalesProduct);
            if (insert < 1) {
                log.error("产品插入失败！");
                return new Response().failure("产品插入失败!");
            }
        }
        //2.团期
        List<String> tourIds = proProductDirectSalesMapper.selectTourIds(singleTourUpdateVo.getDirectSalesSendId()
                , singleTourUpdateVo.getOrgId(), singleTourUpdateVo.getProId());
        ProTourExample example1 = new ProTourExample();
        if (tourIds == null || tourIds.size() == 0) {
            example1.or().andProidEqualTo(singleTourUpdateVo.getProId()).andTourstatusEqualTo(1)
                    .andTourdateGreaterThan(new Date());
        } else {
            example1.or().andProidEqualTo(singleTourUpdateVo.getProId()).andTourstatusEqualTo(1)
                    .andTourdateGreaterThan(new Date()).andIdNotIn(tourIds);
        }
        List<ProTour> proTours = proTourMapper.selectByExample(example1);
        List<ProProductDirectSales> proProductDirectSales = new ArrayList<>();
        for (ProTour tour : proTours) {
            ProProductDirectSales sales = this.getProProductDirectSales(tour,
                    proProductDirectSalesProduct.getSuppliername(), singleTourUpdateVo.getOrgId(),
                    singleTourUpdateVo.getOrgName());
            sales.setDirectSalesProductId(proProductDirectSalesProduct.getId());
            proProductDirectSales.add(sales);
            //价格策略查询
            ProTourPricepolicyExample example2 = new ProTourPricepolicyExample();
            example2.or().andTouridEqualTo(tour.getId())
//                    .andSiteidEqualTo(singleTourUpdateVo.getSiteId())
                    .andProidEqualTo(proProductDirectSalesProduct.getProid());
            List<ProTourPricepolicy> proTourPricepolicies = proTourPricepolicyMapper.selectByExample(example2);
            List<ProProductDirectSalesItem> proProductDirectSalesItems = new ArrayList<>();
            if(proTourPricepolicies!=null && proTourPricepolicies.size()>0){
                proProductDirectSalesMapper.insert(sales);
            }
            for (ProTourPricepolicy proTourPricepolicy : proTourPricepolicies) {
                ProProductDirectSalesItem proProductDirectSalesItem = new ProProductDirectSalesItem();
                proProductDirectSalesItem.setId(UUID.randomUUID().toString());
                proProductDirectSalesItem.setTourid(tour.getId());
                proProductDirectSalesItem.setTouristtype(proTourPricepolicy.getTouristtype());
                proProductDirectSalesItem.setPolicyname(proTourPricepolicy.getPolicyname());
                proProductDirectSalesItem.setIsdefault(proTourPricepolicy.getIsdefault());
                proProductDirectSalesItem.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                proProductDirectSalesItem.setOrderindex(proTourPricepolicy.getOrderindex());
                proProductDirectSalesItem.setSiteid(proTourPricepolicy.getSiteid());
                proProductDirectSalesItem.setSitename(proTourPricepolicy.getSitename());
                proProductDirectSalesItem.setProid(proTourPricepolicy.getProid());
                proProductDirectSalesItem.setRebateprice(proTourPricepolicy.getRebateprice());
                proProductDirectSalesItem.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                //销售成本价 = 原销售价
                proProductDirectSalesItem.setSalescostprice(proTourPricepolicy.getSalesprice());
                //直客成本加 = 原直客价
                proProductDirectSalesItem.setDirectcostprice(proTourPricepolicy.getDirectprice());
                proProductDirectSalesItem.setDirectsalesid(sales.getId());
                proProductDirectSalesItem.setEtasalescostprice(proTourPricepolicy.getSalesprice());
                proProductDirectSalesItem.setEtadirectcostprice(proTourPricepolicy.getDirectprice());
                proProductDirectSalesItem.setEtarebateprice(proTourPricepolicy.getRebateprice());
                proProductDirectSalesItem.setEtasingleroomprice(proTourPricepolicy.getSingleroomprice());
//                proProductDirectSalesItem.setVolunteerdirectprice(proTourPricepolicy.getVolunteerdirectprice());
//                proProductDirectSalesItem.setVolunteerrebateprice(proTourPricepolicy.getVolunteerrebateprice());
//                proProductDirectSalesItem.setVolunteersalesprice(proTourPricepolicy.getVolunteersalesprice());
                proProductDirectSalesItem.setIsauto(1);
                proProductDirectSalesItem.setDirectprice(proTourPricepolicy.getDirectprice());
                proProductDirectSalesItem.setSalesprice(proTourPricepolicy.getSalesprice());
                proProductDirectSalesItem.setTravelerRewardPrice(proTourPricepolicy.getTravelerRewardPrice());
                proProductDirectSalesItems.add(proProductDirectSalesItem);
            }
            //价格策略插入
            int insertTourPricesList = productDirectSalesItemMapper.insertList(proProductDirectSalesItems);
            if (insertTourPricesList != proProductDirectSalesItems.size()) {
                log.error("批量插入产品团期价格失败！团次id={}", tour.getId());
                return new Response().failure("批量插入产品团期价格失败！");
            }
            //单团次插入
            //由于数据库的限制,加此判断
//            if (proProductDirectSales.size() > 150) {
//                proProductDirectSalesMapper.insert(sales);
//            }
//            proProductDirectSales.add(sales);
        }
        //插入志愿者产品团期
//        if (proProductDirectSales.size() > 0 && proProductDirectSales.size() < 150) {
//            int insertTour = proProductDirectSalesMapper.insertList(proProductDirectSales);
//            if (insertTour != proProductDirectSales.size()) {
//                log.error("批量插入志愿者产品团期失败！");
//                return new Response().failure("批量插入志愿者产品团期失败！");
//            }
//        }
        //普通产品表的主键ID 用 外发产品表的主键ID 覆盖掉
        singleTourUpdateVo.setProId(proProductDirectSalesProduct.getId());
        return new Response().success("产品上架成功！");
    }

    /**
     * 　　* @Description: B端主动分销产品、团期、价格策略插入
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:48
     */
    @Transactional
    public Response insterProProductDirect(List<ProProduct> proProducts, ShelfProductVO directShelfProductVO) {
        Date newDate = new Date();
        //产品插入
        List<ProProductDirectSalesProduct> proProductDirectSalesProducts = new ArrayList<>();
        List<ProProductDirectSales> proProductDirectSales = new ArrayList<>();
        List<ProProductDirectSalesRelation> proProductDirectSalesRelations = new ArrayList<>();
        for (ProProduct proProduct : proProducts) {
            //产品表封装
            ProProductDirectSalesProduct proProductDirectSalesProduct = this.getProProductDirectSalesProduct(proProduct,
                    directShelfProductVO.getOrgId(), directShelfProductVO.getOrgName());
            ProProductDirectSalesRelation proProductDirectSalesRelation = new ProProductDirectSalesRelation();
            proProductDirectSalesRelation.setId(UUID.randomUUID().toString());
            proProductDirectSalesRelation.setProid(proProductDirectSalesProduct.getProid());
            proProductDirectSalesRelation.setReceiverid(proProductDirectSalesProduct.getReceiverid());
            proProductDirectSalesRelation.setSupplierid(proProductDirectSalesProduct.getSupplierid());
            //查询次数
            ProProductDirectSalesRelationExample example0 = new ProProductDirectSalesRelationExample();
            example0.setOrderByClause("RelationNo DESC");
            example0.or().andProidEqualTo(proProductDirectSalesProduct.getProid()).andReceiveridEqualTo(proProductDirectSalesProduct.getReceiverid());
            List<ProProductDirectSalesRelation> proProductDirectSalesRelations1 = proProductDirectSalesRelationMapper.selectByExample(example0);
//            if(proProductDirectSalesRelations1==null || proProductDirectSalesRelations1.size()==0){
            if (proProductDirectSalesRelations1 != null && proProductDirectSalesRelations1.size() > 0) {
                proProductDirectSalesRelation.setRelationno(proProductDirectSalesRelations1.get(0).getRelationno() + 1);
            } else {
                proProductDirectSalesRelation.setRelationno(1);
            }
            proProductDirectSalesRelations.add(proProductDirectSalesRelation);
            proProductDirectSalesProducts.add(proProductDirectSalesProduct);

            //团次
            ProTourExample example = new ProTourExample();
            example.or().andProidEqualTo(proProduct.getId()).andTourdateGreaterThan(newDate).andTourstatusEqualTo(1);
            List<ProTour> proTours = proTourMapper.selectByExample(example);
            for (ProTour tour : proTours) {
                ProProductDirectSales sales = this.getProProductDirectSales(tour, proProductDirectSalesProduct.getSuppliername()
                        , directShelfProductVO.getOrgId(), directShelfProductVO.getOrgName());
                sales.setDirectSalesProductId(proProductDirectSalesProduct.getId());
                proProductDirectSales.add(sales);

                //价格策略查询
                ProTourPricepolicyExample example1 = new ProTourPricepolicyExample();
                example1.or().andTouridEqualTo(tour.getId())
//                        .andSiteidEqualTo(directShelfProductVO.getSiteId())
                        .andProidEqualTo(proProductDirectSalesProduct.getProid());
                List<ProTourPricepolicy> proTourPricepolicies = proTourPricepolicyMapper.selectByExample(example1);
                List<ProProductDirectSalesItem> proProductDirectSalesItems = new ArrayList<>();

                if (proTourPricepolicies != null && proTourPricepolicies.size() > 0) {
                    proProductDirectSalesMapper.insert(sales);
                }
                for (ProTourPricepolicy proTourPricepolicy : proTourPricepolicies) {
                    ProProductDirectSalesItem proProductDirectSalesItem = new ProProductDirectSalesItem();
                    proProductDirectSalesItem.setId(UUID.randomUUID().toString());
                    proProductDirectSalesItem.setTourid(tour.getId());
                    proProductDirectSalesItem.setTouristtype(proTourPricepolicy.getTouristtype());
                    proProductDirectSalesItem.setPolicyname(proTourPricepolicy.getPolicyname());
                    proProductDirectSalesItem.setIsdefault(proTourPricepolicy.getIsdefault());
                    proProductDirectSalesItem.setIsoccupyseat(proTourPricepolicy.getIsoccupyseat());
                    proProductDirectSalesItem.setOrderindex(proTourPricepolicy.getOrderindex());
                    proProductDirectSalesItem.setSiteid(proTourPricepolicy.getSiteid());
                    proProductDirectSalesItem.setSitename(proTourPricepolicy.getSitename());
                    proProductDirectSalesItem.setProid(proTourPricepolicy.getProid());
                    proProductDirectSalesItem.setRebateprice(proTourPricepolicy.getRebateprice());
                    proProductDirectSalesItem.setSingleroomprice(proTourPricepolicy.getSingleroomprice());
                    //销售成本价 = 原销售价
                    proProductDirectSalesItem.setSalescostprice(proTourPricepolicy.getSalesprice());
                    //直客成本加 = 原直客价
                    proProductDirectSalesItem.setDirectcostprice(proTourPricepolicy.getDirectprice());
                    proProductDirectSalesItem.setDirectsalesid(sales.getId());
                    proProductDirectSalesItem.setEtasalescostprice(proTourPricepolicy.getSalesprice());
                    proProductDirectSalesItem.setEtadirectcostprice(proTourPricepolicy.getDirectprice());
                    proProductDirectSalesItem.setEtarebateprice(proTourPricepolicy.getRebateprice());
                    proProductDirectSalesItem.setEtasingleroomprice(proTourPricepolicy.getSingleroomprice());
                    proProductDirectSalesItem.setTravelerRewardPrice(proTourPricepolicy.getTravelerRewardPrice());
//                    proProductDirectSalesItem.setVolunteerdirectprice(proTourPricepolicy.getVolunteerdirectprice());
//                    proProductDirectSalesItem.setVolunteerrebateprice(proTourPricepolicy.getVolunteerrebateprice());
//                    proProductDirectSalesItem.setVolunteersalesprice(proTourPricepolicy.getVolunteersalesprice());
                    proProductDirectSalesItem.setIsauto(1);
                    //售价处理
                    if (directShelfProductVO == null || directShelfProductVO.getType() == 1) {
                        //直接上架
                        proProductDirectSalesItem.setDirectprice(proTourPricepolicy.getDirectprice());
                        proProductDirectSalesItem.setSalesprice(proTourPricepolicy.getSalesprice());
                    } else {
                        //修改价格上架
                        //调整类型，1.百分比；2.固定金额
                        BigDecimal b1 = new BigDecimal(new Double(directShelfProductVO.getPreValueC()));
                        BigDecimal directPrice = new BigDecimal(new Double(0));
                        BigDecimal salesPrice = new BigDecimal(new Double(0));
                        switch (directShelfProductVO.getDiscountTypeC()) {
                            case 1:
                                directPrice = proTourPricepolicy.getDirectprice().multiply(b1).add(proTourPricepolicy.getDirectprice().setScale(3, BigDecimal.ROUND_HALF_UP));
                                salesPrice = proTourPricepolicy.getSalesprice().multiply(b1).add(proTourPricepolicy.getSalesprice().setScale(3, BigDecimal.ROUND_HALF_UP));
                                break;
                            case 2:
                                directPrice = proTourPricepolicy.getDirectprice().add(b1);
                                salesPrice = proTourPricepolicy.getSalesprice().add(b1);
                                break;
                        }
                        proProductDirectSalesItem.setDirectprice(directPrice);
                        proProductDirectSalesItem.setSalesprice(salesPrice);
                    }
                    proProductDirectSalesItems.add(proProductDirectSalesItem);
                }

                //价格策略插入
                if (proProductDirectSalesItems.size() > 0) {
                    int insertTourPricesList = productDirectSalesItemMapper.insertList(proProductDirectSalesItems);
                    if (insertTourPricesList != proProductDirectSalesItems.size()) {
                        log.error("批量插入产品团期价格失败！团次id={}", tour.getId());
                        return new Response().failure("批量插入产品团期价格失败！");
                    }
                }

                //单团次插入
                //由于数据库的限制,加此判断
//                if (proProductDirectSales.size() > 50) {
//                    proProductDirectSalesMapper.insert(sales);
//                }
            }
        }

        //插入proProductDirectSalesRelation表
        if (proProductDirectSalesRelations.size() > 0) {
            int insertList = proProductDirectSalesRelationMapper.insertList(proProductDirectSalesRelations);
            if (insertList != proProductDirectSalesRelations.size()) {
                log.error("批量插入proProductDirectSalesRelation表失败！");
                return new Response().failure("批量插入proProductDirectSalesRelation表失败！");
            }
        }
        //插入志愿者产品团期
//        if (proProductDirectSales.size() > 0 && proProductDirectSales.size() < 50) {
//            int insertTour = proProductDirectSalesMapper.insertList(proProductDirectSales);
//            if (insertTour != proProductDirectSales.size()) {
//                log.error("批量插入志愿者产品团期失败！");
//                return new Response().failure("批量插入志愿者产品团期失败！");
//            }
//        }
        //产品插入
        int insertList = proProductDirectSalesProductMapper.insertList(proProductDirectSalesProducts);
        if (insertList != proProductDirectSalesProducts.size()) {
            log.error("批量插入产品失败！");
            return new Response().failure("批量插入产品失败！");
        }
        return new Response().success("产品上架成功！");
    }

    @Override
    @Transactional
    public int insertProProductDirectSalesProductList(List<ProProductDirectSalesProduct> proProductDirectSalesProducts) {
        int insertMaxCount = Constants.pojoMaxSizeInSql(ProProductDirectSalesProduct.class);
        int insertCount = 0;
        for (int i = 0; i * insertMaxCount < proProductDirectSalesProducts.size(); i++) {
            if((i + 1) * insertMaxCount <= proProductDirectSalesProducts.size()){
                insertCount += proProductDirectSalesProductMapper.insertList(proProductDirectSalesProducts.subList(i * insertMaxCount,(i + 1) * insertMaxCount));
            }else {
                insertCount +=  proProductDirectSalesProductMapper.insertList(proProductDirectSalesProducts.subList(i * insertMaxCount,proProductDirectSalesProducts.size()));
            }
        }
        log.info("主动分销产品成功插入{}条", proProductDirectSalesProducts.size());
        return insertCount;
    }

    @Override
    @Transactional
    public int insertProProductDirectSalesItemList(List<ProProductDirectSalesItem> proProductDirectSalesItems) {
        int insertMaxCount = Constants.pojoMaxSizeInSql(ProProductDirectSalesItem.class);
        int insertCount = 0;
        for (int i = 0; i * insertMaxCount < proProductDirectSalesItems.size(); i++) {
            if((i + 1) * insertMaxCount <= proProductDirectSalesItems.size()){
                insertCount += productDirectSalesItemMapper.insertList(proProductDirectSalesItems.subList(i * insertMaxCount,(i + 1) * insertMaxCount));
            }else {
                insertCount +=  productDirectSalesItemMapper.insertList(proProductDirectSalesItems.subList(i * insertMaxCount,proProductDirectSalesItems.size()));
            }
        }
        log.info("主动分销价格成功插入{}条", proProductDirectSalesItems.size());
        return insertCount;
    }

    @Override
    @Transactional
    public int insertProProductDirectSalesList(List<ProProductDirectSales> proProductDirectSales) {
        int insertMaxCount = Constants.pojoMaxSizeInSql(ProProductDirectSales.class);
        int insertCount = 0;
        for (int i = 0; i * insertMaxCount < proProductDirectSales.size(); i++) {
            if((i + 1) * insertMaxCount <= proProductDirectSales.size()){
                insertCount += proProductDirectSalesMapper.insertList(proProductDirectSales.subList(i * insertMaxCount,(i + 1) * insertMaxCount));
            }else {
                insertCount +=  proProductDirectSalesMapper.insertList(proProductDirectSales.subList(i * insertMaxCount,proProductDirectSales.size()));
            }
        }
        log.info("主动分销团次成功插入{}条", proProductDirectSales.size());
        return insertCount;
    }
    /**
     * 　　* @Description: 产品货架查询
     * 　　* @author 周陈
     * 　　* @date 2019/3/6 14:01
     */
    @Override
    public Response getGoodsShelfToB(ProSearchCondition proSearchCondition) {
        log.info("进入B主动分销 产品货架查询 getGoodsShelfToB");
        //页码从0 开始
        int start = proSearchCondition.getStart();
        //每页显示的条数
        int size = proSearchCondition.getSize();
        //分页开始下标 = 页码 * 每页显示的条数
        proSearchCondition.setStart(start * size);
        //分页结束下标 = （页码+1） * 每页显示的条数
        proSearchCondition.setSize((start + 1) * size);
        List<ProductListDto> productListDtos = proProductDirectSalesMapper.selectGoodsShelf(proSearchCondition);
        //点击换一换，随机取20条数据
        if (proSearchCondition.getIsRandom() != null && proSearchCondition.getIsRandom() == 1) {
            int size1 = productListDtos.size();
            if (size1 <= 20) {
                return new Response().success(productListDtos);
            } else {
                int count = size1 / 20;
                int i = RandomUtils.nextInt(0, size1 - 21);
                List<ProductListDto> productListDtos1 = productListDtos.subList(i, i + 20);
                return new Response().success(productListDtos1);
            }
        }
        return new Response().success(productListDtos);
    }


    public ProProductDirectSalesProduct getProProductDirectSalesProduct(ProProduct proProduct, String orgId, String orgName) {
        ProProductDirectSalesProduct proProductDirectSalesProduct = new ProProductDirectSalesProduct();
        proProductDirectSalesProduct.setId(UUID.randomUUID().toString());
        proProductDirectSalesProduct.setSupplierid(proProduct.getOrgid());
        proProductDirectSalesProduct.setSuppliername(proProduct.getTravelname());
        proProductDirectSalesProduct.setReceiverid(orgId);
        proProductDirectSalesProduct.setReceivername(orgName);
        proProductDirectSalesProduct.setProid(proProduct.getId());
        proProductDirectSalesProduct.setAliasename(proProduct.getAliasename());
        proProductDirectSalesProduct.setLocalproname(proProduct.getAliasename());
        proProductDirectSalesProduct.setAttention(proProduct.getAttention());
        proProductDirectSalesProduct.setDestcollectionflag(proProduct.getDestcollectionflag());
        proProductDirectSalesProduct.setEmergencycontact(proProduct.getEmergencycontact());
        proProductDirectSalesProduct.setEmergencymobileno(proProduct.getEmergencymobileno());
        proProductDirectSalesProduct.setTravelagencyaddr(proProduct.getTravelagencyaddr());
        proProductDirectSalesProduct.setTravelagencyphone(proProduct.getTravelagencyphone());
        proProductDirectSalesProduct.setTaemergencycontact(proProduct.getTaemergencycontact());
        proProductDirectSalesProduct.setTaemergencymobile(proProduct.getTaemergencymobile());
        proProductDirectSalesProduct.setWxpublicityimage(proProduct.getWxpublicityimage());
        proProductDirectSalesProduct.setWxtitle(proProduct.getWxtitle());
        proProductDirectSalesProduct.setWxsharesummary(proProduct.getWxsharesummary());
        proProductDirectSalesProduct.setSuppliercityname(proProduct.getSupplierCityName());
        proProductDirectSalesProduct.setSuppliercityid(proProduct.getSupplierCityID());
        proProductDirectSalesProduct.setSummary(proProduct.getSummary());
        proProductDirectSalesProduct.setFeeincludes(proProduct.getFeeincludes());
        proProductDirectSalesProduct.setBactorule(proProduct.getBactorule());
        proProductDirectSalesProduct.setShopping(proProduct.getShopping());
        proProductDirectSalesProduct.setTips(proProduct.getTips());
        proProductDirectSalesProduct.setFeenonincludes(proProduct.getFeenonincludes());
        proProductDirectSalesProduct.setTravelname(proProduct.getTravelname());
        proProductDirectSalesProduct.setFeature(proProduct.getFeature());
        proProductDirectSalesProduct.setInsurance(proProduct.getInsurance());
        proProductDirectSalesProduct.setBrandname(proProduct.getBrandname());
        proProductDirectSalesProduct.setProname(proProduct.getProname());
        proProductDirectSalesProduct.setCoverimg(proProduct.getCoverimg());
        proProductDirectSalesProduct.setCreateddate(new Date());
        proProductDirectSalesProduct.setReviseddate(new Date());
        proProductDirectSalesProduct.setIsauto(1);
        proProductDirectSalesProduct.setIsnew(2);
        return proProductDirectSalesProduct;
    }

    public ProProductDirectSales getProProductDirectSales(ProTour tour, String supplierName, String orgId, String orgName) {
        ProProductDirectSales sales = new ProProductDirectSales();
        sales.setSupplierid(tour.getOrgid());
        sales.setSuppliername(supplierName);
        sales.setReceiverid(orgId);
        sales.setProid(tour.getProid());
        sales.setTourid(tour.getId());
        sales.setPlannum(tour.getPlannum());
        //是否共享 0：否；1：是
        sales.setIsshare(1);
        sales.setDatastatus(1);
        sales.setCreateddate(new Date());
        sales.setCreatedby(tour.getCreatedby());
        sales.setCreatedbyid(tour.getCreatedbyid());
        sales.setDeptid(tour.getDeptid());
        sales.setReviseddate(new Date());
        sales.setRevisedby(tour.getRevisedby());
        sales.setOrgid(tour.getOrgid());
        sales.setId(UUID.randomUUID().toString());
        sales.setTourname(tour.getTourname());
        sales.setTourdate(tour.getTourdate());
        sales.setDuedate(tour.getDuedate());
        sales.setTourno(tour.getTourno());
        //审核状态 0：待审核；1： 审核通过；2：审核未通过
        sales.setAuditstatus(1);
        sales.setAuditeddate(new Date());
        sales.setReceivername(orgName);
        //供应商上架状态  0：待上架；1：已上架
        sales.setSupplierdatastatus(1);
        //是否被复制 0：未复制；1：已复制
        sales.setIscopy(0);
        sales.setIsauto(1);
        return sales;
    }
}
