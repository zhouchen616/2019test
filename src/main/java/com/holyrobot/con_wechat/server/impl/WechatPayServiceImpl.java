package com.holyrobot.con_wechat.server.impl;

import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.holyrobot.con_fin.mapper.FinOrderCostPaidMapper;
import com.holyrobot.con_fin.pojo.FinOrderCostPaid;
import com.holyrobot.con_om.pojo.OmOnlinePayTrace;
import com.holyrobot.con_om.pojo.OmOrgWechatConf;
import com.holyrobot.con_om.server.OmOnlinePayTraceService;
import com.holyrobot.con_order.mapper.OrdOrderCollectionMapper;
import com.holyrobot.con_order.mapper.OrdOrderLogMapper;
import com.holyrobot.con_order.pojo.OrdOrderCollection;
import com.holyrobot.con_order.pojo.OrdOrderLog;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.server.OrdOrderInfoService;
import com.holyrobot.con_wechat.server.WechatPayService;
import com.holyrobot.con_wechat.server.WechatService;
import com.holyrobot.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: 微信支付相关接口
 * @date 2018/11/14 14:17
 */
@Service
@Slf4j
public class WechatPayServiceImpl implements WechatPayService {
    @Autowired
    private WechatService wechatService;
    @Autowired
    private OrdOrderInfoService ordOrderInfoService;
    @Autowired
    private OmOnlinePayTraceService omOnlinePayTraceService;
    @Autowired
    private OrdOrderCollectionMapper ordOrderCollectionMapper;
    @Autowired
    private FinOrderCostPaidMapper finOrderCostPaidMapper;
    @Autowired
    private OrdOrderLogMapper ordOrderLogMapper;
//    @Value("${airPortUrl.sendOrderPaySMS}")
//    private String sendOrderPaySMS;

    /**
     * 　　* @Description: 根据orgID获配置,构建微信支付服务类
     * 　　* @author 周陈
     * 　　* @date 2018/11/14 14:20
     */
    @Override
    public WxPayService getWxPayService(String orgId) {
        //通过orgID查询商户配置
        OmOrgWechatConf wechatConfByOrgId = wechatService.findWechatConfByOrgId(orgId);
        //配置config类
        WxPayConfig payConfig = new WxPayConfig();
        payConfig.setAppId(wechatConfByOrgId.getWxappid());
        payConfig.setMchId(wechatConfByOrgId.getWxmchid());
        payConfig.setMchKey(wechatConfByOrgId.getWxpaykey());
        payConfig.setKeyPath(wechatConfByOrgId.getCertlocalpath());
        //构建微信支付服务类
        WxPayService wxPayService = new WxPayServiceImpl();
        wxPayService.setConfig(payConfig);
        return wxPayService;
    }

    /**
     * 　　* @Description: 支付回调处理
     * 　　* @author 周陈
     * 　　* @date 2018/11/17 16:13
     */
    @Override
    @Transactional
    public String payNotify(String outTradeNo) {
        try {
            OmOnlinePayTrace omOnlinePayTrace = omOnlinePayTraceService.findOnlinePayTraceByOutTradeNo(outTradeNo);

            //查询订单表  Ord_OrderInfo
            OrdOrderinfo ordOrderInfo = ordOrderInfoService.selectByOrderId(omOnlinePayTrace.getOrderid());
            if (ordOrderInfo.getDatastatus() == 4) {
                log.error("订单已支付，请勿重复支付！orderId={}", ordOrderInfo.getId());
                return "";
            }
            //修改 支付记录表状态
            int updateOnlinePayTrace = omOnlinePayTraceService.updateDataStatus(omOnlinePayTrace);
            log.info("修改支付记录成功");
            //修改订单主表  Ord_OrderInfo
            int updateOrdOrderInfo = ordOrderInfoService.updateDataStatusAndIsCreditPayById(ordOrderInfo);
            log.info("修改订单主表成功");

            //卖家的收款记录  Ord_Order_Collection
            OrdOrderCollection ordOrderCollection = new OrdOrderCollection();
            ordOrderCollection.setId(UUID.randomUUID().toString());
            ordOrderCollection.setOrderid(ordOrderInfo.getId());
            ordOrderCollection.setCollectamt(ordOrderInfo.getPayableamt());
            ordOrderCollection.setCollecttype("微信支付");
            ordOrderCollection.setCollectdate(new Date());
            ordOrderCollection.setClaimid(Constants.UUID_DEFAULT);
            ordOrderCollection.setCollectstatus(2);
            ordOrderCollection.setOrderid(ordOrderInfo.getId());
            ordOrderCollection.setCreatedby(ordOrderInfo.getCreatedby());
            ordOrderCollection.setCreatedbyid(ordOrderInfo.getCreatedbyid());
            ordOrderCollection.setCreateddate(new Date());
            ordOrderCollection.setAuditcomment("h5商城在线支付");
            ordOrderCollection.setOrgid(ordOrderInfo.getSupplierid());
//            ordOrderCollection.setOrgid(ordOrderInfo.getOrgid());
            int insertOrderCollectionCount = ordOrderCollectionMapper.insert(ordOrderCollection);
            log.info("添加卖家的收款记录成功！");

            //订单付款表 Fin_OrderCostPaid
            FinOrderCostPaid finOrderCostPaid = new FinOrderCostPaid();
            finOrderCostPaid.setOrdercostid(ordOrderInfo.getId());
            finOrderCostPaid.setSupplierid(ordOrderInfo.getSupplierid());
            finOrderCostPaid.setAmount(ordOrderInfo.getPayableamt());
            finOrderCostPaid.setPaydate(new Date());
            finOrderCostPaid.setCreator(ordOrderInfo.getCreatedby());
            finOrderCostPaid.setCreatorid(ordOrderInfo.getCreatedbyid());
            finOrderCostPaid.setCreatedate(new Date());
            finOrderCostPaid.setDeptid(ordOrderInfo.getDeptid());
            finOrderCostPaid.setOrderid(ordOrderInfo.getId());
            finOrderCostPaid.setOrgid(ordOrderInfo.getSupplierid());
            finOrderCostPaid.setOrgname(ordOrderInfo.getOrgname());
            finOrderCostPaid.setId(UUID.randomUUID().toString());
            finOrderCostPaid.setXtype("1");
            finOrderCostPaid.setDatastatus(2);
            int insertFinOrderCostPaidCount = finOrderCostPaidMapper.insert(finOrderCostPaid);
            log.info("添加订单付款成功！");

            //订单日志表  Ord_Order_Log
            OrdOrderLog ordOrderLog = new OrdOrderLog();
            ordOrderLog.setId(UUID.randomUUID().toString());
            ordOrderLog.setOrderid(ordOrderInfo.getId());
            ordOrderLog.setOplog("h5商城在线支付订单");
            ordOrderLog.setOrgid(ordOrderInfo.getSupplierid());
            ordOrderLog.setCreatedbyid(ordOrderInfo.getCreatedbyid());
            ordOrderLog.setCreatedby(ordOrderInfo.getCreatedby());
            ordOrderLog.setCreateddate(new Date());
            ordOrderLog.setOrgname(ordOrderInfo.getOrgname());
            ordOrderLog.setVisibletype(2);
            int insertOrdOrderLogCount = ordOrderLogMapper.insert(ordOrderLog);
            log.info("添加订单日志成功！");

            //在线支付记录表
            omOnlinePayTraceService.insterOrdOnlineInfo(ordOrderInfo);
            log.info("添加在线支付记录表成功！");

//            log.info("WechatPayServiceImpl/payNotify: 支付通知短信开始执行");
//            HashMap<Object, Object> map = new HashMap<>();
//            map.put("orderSMSType", 2);
//            map.put("sendType", 2);
//            map.put("orderId", ordOrderInfo.getId());
//            log.info("WechatPayServiceImpl/payNotify: 短信请求参数 {}", JSON.toJSONString(map));
//            String status = HttpUtils.jsonPost(sendOrderPaySMS, JSON.toJSONString(map));
//            log.info("WechatPayServiceImpl/payNotify: 支付通知短信发送状态返回{}", status);
            return ordOrderInfo.getId();

        } catch (Exception e) {
            log.error("提交PC商城C端线下支付申请失败,{}", e.getMessage());
        }
        return "";
    }

}
