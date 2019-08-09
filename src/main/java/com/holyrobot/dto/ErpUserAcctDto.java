package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 绑定ERP用户信息
 * @date 2018/7/5 17:59
 */
public class ErpUserAcctDto {
    private String acctPwd;
    private String userID;
    private int dataStatus=1;
    private String photo;
    private String weChatOpenID_H5Shop;

    public ErpUserAcctDto(String acctPwd, String userID, String photo, String weChatOpenID_H5Shop) {
        this.acctPwd = acctPwd;
        this.userID = userID;
        this.dataStatus = 1;
        this.photo = photo;
        this.weChatOpenID_H5Shop = weChatOpenID_H5Shop;
    }

    public ErpUserAcctDto() {
    }

    @Override
    public String toString() {
        return "ErpUserAcctDto{" +
                "acctPwd='" + acctPwd + '\'' +
                ", userID='" + userID + '\'' +
                ", dataStatus=" + dataStatus +
                ", photo='" + photo + '\'' +
                ", weChatOpenID_H5Shop='" + weChatOpenID_H5Shop + '\'' +
                '}';
    }

    public String getAcctPwd() {
        return acctPwd;
    }

    public void setAcctPwd(String acctPwd) {
        this.acctPwd = acctPwd;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(int dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWeChatOpenID_H5Shop() {
        return weChatOpenID_H5Shop;
    }

    public void setWeChatOpenID_H5Shop(String weChatOpenID_H5Shop) {
        this.weChatOpenID_H5Shop = weChatOpenID_H5Shop;
    }
}
