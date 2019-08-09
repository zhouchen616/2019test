package com.holyrobot.con_wechat.server;



import com.holyrobot.con_om.pojo.OmOrgWechatConf;
import me.chanjar.weixin.mp.api.WxMpService;

/**
 * @author 周陈
 * @Title: 微信开发相关服务接口
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/11/1010:29
 */
public interface WechatService {

    /**
     * 　　* @Description: 根据orgId查询对应店铺微信配置
     * 　　* @author 周陈
     * 　　* @date 2018/11/10 10:31
     *
     */
    OmOrgWechatConf findWechatConfByOrgId(String orgId, Integer... type);

    /**
     * 　　* @Description:  根据orgId获取WxMpService对象，调用第三方方法之前需要先通过orgId获取WxMpService
     * 　　* @author 周陈
     * 　　* @date 2018/11/10 15:50
     *
     */
    WxMpService getWxMpService(String orgId, Integer... type);

    /**
     * 　　* @Description: 获取微信公众号accessToken
     * 　　* @author 周陈
     * 　　* @date 2018/6/30 15:31
     *
     */
    String getAccessToken(String orgId, Integer... type);
}
