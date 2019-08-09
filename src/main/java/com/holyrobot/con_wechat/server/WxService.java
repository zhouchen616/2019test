package com.holyrobot.con_wechat.server;

import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 周陈
 * @Title: 微信
 * @date 2018/6/30 15:30
 */
public interface WxService {
    /**
     * 　　* @Description: 获取微信公众号accessToken
     * 　　* @author 周陈
     * 　　* @date 2018/6/30 15:31
     *
     */
    String getAccessToken();

    /**
     * 　　* @Description: 获取二维码图片地址
     * 　　* @author 周陈
     * 　　* @date 2018/7/4 17:02
     *
     */
    String getQrCode(String userID);

    /**
     * 　　* @Description: 通过orgId获取h5商城微店
     * 　　* @author 周陈
     * 　　* @date 2018/8/11 12:40
     *
     */
    String getH5Shop(String orgId);

    Response jump(HttpServletRequest request, String orgId, String userId, int status, String orderId, Integer userType);

    Response getTralverQrCode(String orgId, String parentId, String travelAgencyName, String wechatInviter);

    String getCoupon(String orgId);

    Response jumpTraveller(String orgId, String userId, String parentId, String travelAgencyName, String wechatInviter, String apply);

    void wxMpTemplateMessage(String orgId, String openId, String orderId);
}
