package com.holyrobot.config.wechat;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 周陈
 * @Title: 用户在微信客户端中访问第三方网页，公众号就可以通过微信网页授权机制，来获取用户基本信息，进而实现业务逻辑，
 * 使用该sdk获取用户信息的步骤是首先构造网页授权url，当用户同意授权后，会回调所设置的url并把authorization code传过来，
 * 然后用这个code获得access token，其中也包含用户的openid等信息
 * @date 2018/5/22 16:04
 */
@Component
public class WechatMpConfig {
    //首先将appid和secret放进一个WxMpService，创建一个WxMpService对象
    @Autowired
    private WechatAccountConfig accountConfig;

    @Bean
    public WxMpService wxMpService() {
        //创建WxMpService实例并设置appid和sectret
        WxMpService wxMpService = new WxMpServiceImpl();
        //这里的设置方式是跟着这个sdk的文档写的
        wxMpService.setWxMpConfigStorage(wxConfigProvider());
        return wxMpService;
    }

    @Bean
    public WxMpConfigStorage wxConfigProvider() {
        WxMpInMemoryConfigStorage wxConfigProvider = new WxMpInMemoryConfigStorage();
        wxConfigProvider.setAppId(accountConfig.getAppid());
        wxConfigProvider.setSecret(accountConfig.getSecret());
        return wxConfigProvider;
    }
}

