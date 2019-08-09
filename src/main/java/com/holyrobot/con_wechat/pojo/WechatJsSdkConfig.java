package com.holyrobot.con_wechat.pojo;

/**
 * @author 周陈
 * @Title: 微信js-sdk配置信息
 * @date 2018/8/13 14:15
 */
public class WechatJsSdkConfig {
    private String appid;
    private long timestamp;
    private String nonceStr;
    private String signature;

    @Override
    public String toString() {
        return "WechatJsSdkConfig{" +
                "appid='" + appid + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
