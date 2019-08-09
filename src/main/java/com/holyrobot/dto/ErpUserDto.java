package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: Erp用户Dto
 * @date 2018/7/2 20:09
 */
public class ErpUserDto {
    private String ID;

    private String OrgID;

    private String DeptName;
    private String DeptID;

    private String UserName;

    private String Mobile;

    /**
     * 旅行社名
     */
    private String TravelAgencyName;

    private String userAccountID;

    /**
     * 旅行社名
     */
    private String TravelName;

    //是否有分销赚
    private Integer isInitiativeSales;

    //1.组团社; 2.批发商；3.地接社；
    private Integer businessType;

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }

    public Integer getIsInitiativeSales() {
        return isInitiativeSales;
    }

    public void setIsInitiativeSales(Integer isInitiativeSales) {
        this.isInitiativeSales = isInitiativeSales;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getTravelName() {
        return TravelName;
    }

    public void setTravelName(String travelName) {
        TravelName = travelName;
    }

    public String getUserAccountID() {
        return userAccountID;
    }

    public void setUserAccountID(String userAccountID) {
        this.userAccountID = userAccountID;
    }

    public String getTravelAgencyName() {
        return TravelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        TravelAgencyName = travelAgencyName;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return this.ID;
    }
    public void setOrgID(String OrgID){
        this.OrgID = OrgID;
    }
    public String getOrgID(){
        return this.OrgID;
    }
    public void setDeptName(String DeptName){
        this.DeptName = DeptName;
    }
    public String getDeptName(){
        return this.DeptName;
    }
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    public String getUserName(){
        return this.UserName;
    }
    public void setMobile(String Mobile){
        this.Mobile = Mobile;
    }
    public String getMobile(){
        return this.Mobile;
    }
}
