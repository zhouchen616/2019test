package com.holyrobot.config.wechat;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 周陈
 * @Title: 公众号的appid和secret
 * @date 2018/5/22 14:53
 */
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    /**公众号appid*/
    private String appid;

    /**公众号secret*/
    private String secret;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}

