package com.holyrobot.dto;



import com.holyrobot.con_common.pojo.CusCusinfo;

import java.text.SimpleDateFormat;

/**
 * @author 周陈
 * @Title: 定制游需求提交DTO
 * @date 2018/9/5 16:02
 */
public class CusCusinfoDto {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private String CusInfoNo;
    private Integer CusType;
    private String DepartureID;
    private String Departure;
    private String Destination;
    private String StartDate;
    private String EndDate;
    private Integer AdultNum;
    private Integer ChildNum;
    private Integer Budget;
    private Integer CustomerNum;
    private String OtherRequire;
    private String TravellerName;
    private String Wechat;
    private String Mobile;
    private String Email;
    private String SiteID;
    private String CreatedBy;
    private String CreatedByID;
    private String DeptID;
    private String OrgID;
    private String DestinationID;
    private String Tag;
    private Integer Source;
    private String ServiceType;
    private String SupplierID;
    private Integer Type;
    private String TravelAgencyName;
    private String TransferSupplierNames;

    public CusCusinfoDto(Integer cusType, String departureID, String departure, String destination, String startString, String endString, Integer adultNum, Integer childNum, Integer budget, Integer customerNum, String otherRequire, String travellerName, String wechat, String mobile, String email, String siteID, String createdBy, String createdByID, String deptID, String orgID, String destinationID, String tag, Integer source, String serviceType, Integer type, String travelAgencyName, String transferSupplierNames) {
        CusType = cusType;
        DepartureID = departureID;
        Departure = departure;
        Destination = destination;
        StartDate = startString;
        EndDate = endString;
        AdultNum = adultNum;
        ChildNum = childNum;
        Budget = budget;
        CustomerNum = customerNum;
        OtherRequire = otherRequire;
        TravellerName = travellerName;
        Wechat = wechat;
        Mobile = mobile;
        Email = email;
        SiteID = siteID;
        CreatedBy = createdBy;
        CreatedByID = createdByID;
        DeptID = deptID;
        OrgID = orgID;
        DestinationID = destinationID;
        Tag = tag;
        Source = source;
        ServiceType = serviceType;
        Type = type;
        TravelAgencyName = travelAgencyName;
        TransferSupplierNames = transferSupplierNames;
    }

    public CusCusinfoDto(CusCusinfo cusCusinfo){
        CusInfoNo = cusCusinfo.getCusinfono();
        CusType = cusCusinfo.getCustype();
        DepartureID = cusCusinfo.getDepartureid();
        Departure = cusCusinfo.getDeparture();
        Destination = cusCusinfo.getDestination();
        StartDate = simpleDateFormat.format(cusCusinfo.getStartdate());
        EndDate = simpleDateFormat.format(cusCusinfo.getEnddate());
        AdultNum = cusCusinfo.getAdultnum();
        ChildNum = cusCusinfo.getChildnum();
        Budget = cusCusinfo.getBudget();
        CustomerNum = cusCusinfo.getCustomernum();
        OtherRequire = cusCusinfo.getOtherrequire();
        TravellerName = cusCusinfo.getTravellername();
        Wechat = cusCusinfo.getWechat();
        Mobile = cusCusinfo.getMobile();
        Email = cusCusinfo.getEmail();
        SiteID = cusCusinfo.getSiteid();
        CreatedBy = cusCusinfo.getCreatedby();
        CreatedByID = cusCusinfo.getCreatedbyid();
        DeptID = cusCusinfo.getDeptid();
        OrgID = cusCusinfo.getOrgid();
        DestinationID = cusCusinfo.getDestinationid();
        Tag = cusCusinfo.getTag();
        Source = cusCusinfo.getSource();
        ServiceType = cusCusinfo.getServicetype();
        SupplierID = cusCusinfo.getSupplierid();
        Type = cusCusinfo.getUserType();
        TravelAgencyName = cusCusinfo.getTravelAgencyName();
        TransferSupplierNames = cusCusinfo.getTransferSupplierNames();
    }

    public CusCusinfoDto() {
    }

    @Override
    public String toString() {
        return "CusCusinfoDto{" +
                "CusType=" + CusType +
                ", DepartureID='" + DepartureID + '\'' +
                ", Departure='" + Departure + '\'' +
                ", Destination='" + Destination + '\'' +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", AdultNum=" + AdultNum +
                ", ChildNum=" + ChildNum +
                ", Budget=" + Budget +
                ", CustomerNum=" + CustomerNum +
                ", OtherRequire='" + OtherRequire + '\'' +
                ", TravellerName='" + TravellerName + '\'' +
                ", Wechat='" + Wechat + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", Email='" + Email + '\'' +
                ", SiteID='" + SiteID + '\'' +
                ", CreatedBy='" + CreatedBy + '\'' +
                ", CreatedByID='" + CreatedByID + '\'' +
                ", DeptID='" + DeptID + '\'' +
                ", OrgID='" + OrgID + '\'' +
                ", DestinationID='" + DestinationID + '\'' +
                ", Tag='" + Tag + '\'' +
                ", Source=" + Source +
                ", ServiceType='" + ServiceType + '\'' +
                ", Type=" + Type +
                ", TravelAgencyName='" + TravelAgencyName + '\'' +
                ", TransferSupplierNames='" + TransferSupplierNames + '\'' +
                '}';
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String supplierID) {
        SupplierID = supplierID;
    }

    public String getCusInfoNo() {
        return CusInfoNo;
    }

    public void setCusInfoNo(String cusInfoNo) {
        CusInfoNo = cusInfoNo;
    }

    public Integer getCusType() {
        return CusType;
    }

    public void setCusType(Integer cusType) {
        CusType = cusType;
    }

    public String getDepartureID() {
        return DepartureID;
    }

    public void setDepartureID(String departureID) {
        DepartureID = departureID;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String departure) {
        Departure = departure;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startString) {
        StartDate = startString;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endString) {
        EndDate = endString;
    }

    public Integer getAdultNum() {
        return AdultNum;
    }

    public void setAdultNum(Integer adultNum) {
        AdultNum = adultNum;
    }

    public Integer getChildNum() {
        return ChildNum;
    }

    public void setChildNum(Integer childNum) {
        ChildNum = childNum;
    }

    public Integer getBudget() {
        return Budget;
    }

    public void setBudget(Integer budget) {
        Budget = budget;
    }

    public Integer getCustomerNum() {
        return CustomerNum;
    }

    public void setCustomerNum(Integer customerNum) {
        CustomerNum = customerNum;
    }

    public String getOtherRequire() {
        return OtherRequire;
    }

    public void setOtherRequire(String otherRequire) {
        OtherRequire = otherRequire;
    }

    public String getTravellerName() {
        return TravellerName;
    }

    public void setTravellerName(String travellerName) {
        TravellerName = travellerName;
    }

    public String getWechat() {
        return Wechat;
    }

    public void setWechat(String wechat) {
        Wechat = wechat;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSiteID() {
        return SiteID;
    }

    public void setSiteID(String siteID) {
        SiteID = siteID;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getCreatedByID() {
        return CreatedByID;
    }

    public void setCreatedByID(String createdByID) {
        CreatedByID = createdByID;
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }

    public String getOrgID() {
        return OrgID;
    }

    public void setOrgID(String orgID) {
        OrgID = orgID;
    }

    public String getDestinationID() {
        return DestinationID;
    }

    public void setDestinationID(String destinationID) {
        DestinationID = destinationID;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public Integer getSource() {
        return Source;
    }

    public void setSource(Integer source) {
        Source = source;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }

    public String getTravelAgencyName() {
        return TravelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        TravelAgencyName = travelAgencyName;
    }

    public String getTransferSupplierNames() {
        return TransferSupplierNames;
    }

    public void setTransferSupplierNames(String transferSupplierNames) {
        TransferSupplierNames = transferSupplierNames;
    }
}
