package com.holyrobot.con_wechat.server;

import com.github.binarywang.wxpay.service.WxPayService;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/11/1414:17
 */
public interface WechatPayService {
    /**
     * 　　* @Description: 根据orgID获配置微信支付第三方工具参数
     * 　　* @author 周陈
     * 　　* @date 2018/11/14 14:19
     *
     */
    WxPayService getWxPayService(String orgId);

    String payNotify(String outTradeNo);
}
