package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: Erp用户详细信息
 * @date 2018/7/5 10:35
 */
public class UserAccountDto {
    private String ID;
    private String UserID;
    private String AcctID;
    private String AcctPwd;
    private String OrgID;
    private String CreatedBy;
    private int DataStatus;
    private String WeChatOpenID;
    private String WeChatOpenID_H5Shop;
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID() {
        return ID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }
    public String getUserID() {
        return UserID;
    }

    public void setAcctID(String AcctID) {
        this.AcctID = AcctID;
    }
    public String getAcctID() {
        return AcctID;
    }

    public void setAcctPwd(String AcctPwd) {
        this.AcctPwd = AcctPwd;
    }
    public String getAcctPwd() {
        return AcctPwd;
    }

    public void setOrgID(String OrgID) {
        this.OrgID = OrgID;
    }
    public String getOrgID() {
        return OrgID;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }
    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setDataStatus(int DataStatus) {
        this.DataStatus = DataStatus;
    }
    public int getDataStatus() {
        return DataStatus;
    }

    public void setWeChatOpenID(String WeChatOpenID) {
        this.WeChatOpenID = WeChatOpenID;
    }
    public String getWeChatOpenID() {
        return WeChatOpenID;
    }

    public void setWeChatOpenID_H5Shop(String WeChatOpenID_H5Shop) {
        this.WeChatOpenID_H5Shop = WeChatOpenID_H5Shop;
    }
    public String getWeChatOpenID_H5Shop() {
        return WeChatOpenID_H5Shop;
    }
}
