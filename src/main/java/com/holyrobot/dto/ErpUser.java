package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: Erp用户信息
 * @date 2018/7/9 11:41
 */
public class ErpUser {

    private String UserID;

    private String AcctID;

    private String UserName;

    private String DeptID;

    private String DeptName;

    private String OrgID;

    private String OrgName;

    private int UserType;

    private int DataPermission;

    private String OpenDate;

    private String ExpireDate;

    private String Domain;

    private String AcctPwd;

    private String TravelName;

    private String BrandName;

    private String Photo;

    private String WeChatOpenID;

    private String WeChatOpenID_H5Shop;

    //是否有分销赚
    private Integer isInitiativeSales;

    //1.组团社; 2.批发商；3.地接社；
    private Integer businessType;

    private String Mobile;

    @Override
    public String toString() {
        return "ErpUser{" +
                "UserID='" + UserID + '\'' +
                ", AcctID='" + AcctID + '\'' +
                ", UserName='" + UserName + '\'' +
                ", DeptID='" + DeptID + '\'' +
                ", DeptName='" + DeptName + '\'' +
                ", OrgID='" + OrgID + '\'' +
                ", OrgName='" + OrgName + '\'' +
                ", UserType=" + UserType +
                ", DataPermission=" + DataPermission +
                ", OpenDate='" + OpenDate + '\'' +
                ", ExpireDate='" + ExpireDate + '\'' +
                ", Domain='" + Domain + '\'' +
                ", AcctPwd='" + AcctPwd + '\'' +
                ", TravelName='" + TravelName + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", Photo='" + Photo + '\'' +
                ", WeChatOpenID='" + WeChatOpenID + '\'' +
                ", WeChatOpenID_H5Shop='" + WeChatOpenID_H5Shop + '\'' +
                '}';
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getIsInitiativeSales() {
        return isInitiativeSales;
    }

    public void setIsInitiativeSales(Integer isInitiativeSales) {
        this.isInitiativeSales = isInitiativeSales;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getAcctID() {
        return AcctID;
    }

    public void setAcctID(String acctID) {
        AcctID = acctID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getOrgID() {
        return OrgID;
    }

    public void setOrgID(String orgID) {
        OrgID = orgID;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public int getUserType() {
        return UserType;
    }

    public void setUserType(int userType) {
        UserType = userType;
    }

    public int getDataPermission() {
        return DataPermission;
    }

    public void setDataPermission(int dataPermission) {
        DataPermission = dataPermission;
    }

    public String getOpenDate() {
        return OpenDate;
    }

    public void setOpenDate(String openDate) {
        OpenDate = openDate;
    }

    public String getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(String expireDate) {
        ExpireDate = expireDate;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getAcctPwd() {
        return AcctPwd;
    }

    public void setAcctPwd(String acctPwd) {
        AcctPwd = acctPwd;
    }

    public String getTravelName() {
        return TravelName;
    }

    public void setTravelName(String travelName) {
        TravelName = travelName;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getWeChatOpenID() {
        return WeChatOpenID;
    }

    public void setWeChatOpenID(String weChatOpenID) {
        WeChatOpenID = weChatOpenID;
    }

    public String getWeChatOpenID_H5Shop() {
        return WeChatOpenID_H5Shop;
    }

    public void setWeChatOpenID_H5Shop(String weChatOpenID_H5Shop) {
        WeChatOpenID_H5Shop = weChatOpenID_H5Shop;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
