package com.holyrobot.con_wechat.controller;

import com.alibaba.fastjson.JSON;
import com.github.binarywang.wxpay.bean.notify.WxPayNotifyResponse;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayRefundRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayOrderCloseResult;
import com.github.binarywang.wxpay.bean.result.WxPayRefundResult;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.holyrobot.con_om.pojo.OmOrgWechatConf;
import com.holyrobot.con_om.server.OmOnlinePayTraceService;
import com.holyrobot.con_order.mapper.OrdOrderinfoMapper;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.con_wechat.server.WechatPayService;
import com.holyrobot.con_wechat.server.WechatService;
import com.holyrobot.response.Response;
import com.holyrobot.util.HttpUtils;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: 微信支付相关接口
 * @date 2018/11/14 14:50
 */
@Slf4j
@Controller
@Api(tags = "微信支付相关")
@RequestMapping("/PayAPI")
public class WechatPayController {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    private WechatPayService wechatPayService;
    @Autowired
    private OrdOrderinfoMapper ordOrderInfoMapper;
    @Autowired
    private OmOnlinePayTraceService omOnlinePayTraceService;
    @Autowired
    private WechatService wechatService;
    @Autowired
    private OrgInfoService orgInfoService;
    @Value("${payNotify}")
    private String payNotify;
    @Value("${h5Url}")
    private String h5Url;
    @Value("${devStatus}")
    private String devStatus;
    @Value("${airPortUrl.sendOrderPaySMS}")
    private String sendOrderPaySMS;

    @GetMapping("/getPayPageUrl")
    @ResponseBody
    public String getPayPageUrl(String orderId, String orgId, String openId) {
        log.info("进入支付页面URL获取接口orgId={},orderId={},openId={},", orgId, orderId, openId);
        String url = h5Url + "Pay/PayApi/index1.html?orgId=" + orgId + "&orderId=" + orderId + "&openId=" + openId;
        log.info("支付页面URL获取返回={}", url);
        return url;
    }

    /**
     * 　　* @Description: 统一下单接口
     * 　　* @author 周陈
     * 　　* @date 2018/11/14 21:29
     */
    @RequestMapping(value = "/pay")
    @ResponseBody
    public Response pay(HttpServletRequest request, String orgId, String orderId, String openId) {
        log.info("进入支付接口orgId={},orderId={},openId={},", orgId, orderId, openId);
        //先调用方法，判断当前店铺是否配置总店收款
        OrdOrderinfo ordOrderInfo = ordOrderInfoMapper.selectByPrimaryKey(orderId);
        boolean headShopOrgIdByOrderManage = orgInfoService.getHeadShopOrgIdByOrderManage(orgId, ordOrderInfo.getDirectSalesSendId());
        OmOrgWechatConf wechatConfByOrgId = wechatService.findWechatConfByOrgId(headShopOrgIdByOrderManage ? ordOrderInfo.getDirectSalesSendId() : orgId);
        if (wechatConfByOrgId == null) {
            return new Response().failure("该店铺暂未设置在线支付功能，请采用其他支付方式！");
        }
        try {
            //1.通过orderId查询订单信息

            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            //商品描述
            orderRequest.setBody(ordOrderInfo.getOrdername().length() < 20 ?
                    ordOrderInfo.getOrdername() : ordOrderInfo.getOrdername().substring(0, 20));
            //商户订单号
            orderRequest.setOutTradeNo(UUID.randomUUID().toString().replace("-", ""));
            //元转成分
            //orderRequest.setTotalFee((int) (totalFee * 100));
            if (devStatus.equals("pro")) {
                //真实金额
                orderRequest.setTotalFee((int) (ordOrderInfo.getPayableamt().doubleValue() * 100));
            } else {
                //一分钱
                orderRequest.setTotalFee(1);
            }

            orderRequest.setOpenid(openId);
            orderRequest.setSpbillCreateIp("60.205.215.235");
            Date date = new Date();
            orderRequest.setTimeStart(simpleDateFormat.format(date));
            orderRequest.setTradeType("JSAPI");
            orderRequest.setNotifyUrl(payNotify);
            //30分钟后过期
            orderRequest.setTimeExpire(simpleDateFormat.format(new Date(date.getTime() + 30 * 60 * 1000)));
            //添加 支付记录
            Response response = omOnlinePayTraceService.addUnifiedOrder(orderRequest, ordOrderInfo);
            log.info("支付请求参数,{}", JSON.toJSONString(orderRequest));
            return new Response().success(wechatPayService.getWxPayService(orgId).createOrder(orderRequest), 200);
        } catch (WxPayException e) {
            e.printStackTrace();
            log.error(e.getErrCodeDes());
            return new Response().failure(e.getErrCodeDes());
        }
    }

    @RequestMapping(value = "/refund")
    @ResponseBody
    public Response refund(String orgId, String transactionId, String outRefundNo, Integer totalFee, Integer refundFee, String refundDesc) {
        try {
            WxPayRefundRequest wxPayRefundRequest = new WxPayRefundRequest();
            //微信订单号
            wxPayRefundRequest.setTransactionId(transactionId);
            //商户退款单号 -自定义
            wxPayRefundRequest.setOutRefundNo(outRefundNo);
            //订单金额
            wxPayRefundRequest.setTotalFee(totalFee);
            //退款金额
            wxPayRefundRequest.setRefundFee(refundFee);
            wxPayRefundRequest.setRefundDesc(refundDesc == null ? "特定版H5商城-退款测试" : refundDesc);
            WxPayRefundResult refund = wechatPayService.getWxPayService(orgId).refund(wxPayRefundRequest);
            log.info("统一下单接口result={}", refund);
            return new Response().success("success");
        } catch (WxPayException e) {
            log.error(e.getErrCodeDes());
            return new Response().failure(e.getErrCodeDes());
        }
    }

    /**
     * 　　* @Description: 关闭订单接口
     * 　　* @author 周陈
     * 　　* @date 2018/11/16 21:18
     */
    @RequestMapping(value = "/closeorder")
    @ResponseBody
    public Response closeorder(String orgId, String orderNo) {
        try {
            WxPayOrderCloseResult wxPayOrderCloseResult = wechatPayService.getWxPayService(orgId).closeOrder(orderNo);
            log.info("关闭订单tradeNo={}", orderNo);
            return new Response().success(wxPayOrderCloseResult);
        } catch (WxPayException e) {
            return new Response().failure(e.getErrCodeDes());
        }

    }

    /**
     * 　　* @Description: 支付回调接口
     * 　　* @author 周陈
     * 　　* @date 2018/11/14 21:20
     */
    @ResponseBody
    @RequestMapping("/payNotify")
    public String payNotify(HttpServletRequest request, HttpServletResponse response) {
        try {
            log.info("进入支付回调接口{}", request.getRequestURL());
            //String orgId = "00000000-0000-0000-0000-000000000001";
            String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
            WxPayOrderNotifyResult result = WxPayOrderNotifyResult.fromXML(xmlResult);
            //WxPayOrderNotifyResult result = wechatPayService.getWxPayService(orgId).parseOrderNotifyResult(xmlResult);
            log.info("支付回调result={}", result);
            // 结果正确
            String outTradeNo = result.getOutTradeNo();
            //自己处理订单的业务逻辑，需要判断订单是否已经支付过，否则可能会重复调用
            String orderId = wechatPayService.payNotify(outTradeNo);

            if (!orderId.equals("")) {
                log.info("/payNotify: 支付通知短信开始执行");
                HashMap<Object, Object> map = new HashMap<>();
                map.put("orderSMSType", 2);
                map.put("sendType", 2);
                map.put("orderId", orderId);
                log.info("/payNotify: 短信请求参数 {}", JSON.toJSONString(map));
                String status = HttpUtils.jsonPost(sendOrderPaySMS, JSON.toJSONString(map));
                log.info("/payNotify: 支付通知短信发送状态返回{}", status);
            }

            return WxPayNotifyResponse.success("处理成功!");
        } catch (Exception e) {
            log.error("微信回调结果异常,异常原因{}", e.getMessage());
            return WxPayNotifyResponse.fail(e.getMessage());
        }
    }
}
