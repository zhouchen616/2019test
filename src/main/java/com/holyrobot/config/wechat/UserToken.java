package com.holyrobot.config.wechat;

/**
 * @author 周陈
 * @Title: 用户Token
 * @date 2018/5/22 19:57
 */
public class UserToken {
    /**
     * 商铺I
     */
    private String orgId;
    /**
     * wx用户ID
     */
    private String openId;
    /**
     * 用户类型 1.ERP 2.直客 3.顾问
     */
    private Integer userType;
    /**
     * token
     */
    private String  token;

    public UserToken() {
    }

    public UserToken(String orgId, String openId, Integer userType, String token) {
        this.orgId = orgId;
        this.openId = openId;
        this.userType = userType;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
