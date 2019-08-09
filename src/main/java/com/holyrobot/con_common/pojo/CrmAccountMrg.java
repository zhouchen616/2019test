package com.holyrobot.con_common.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CrmAccountMrg {
    private String id;

    private String parentid;

    private String categoryid;

    private String categoryname;

    private String unitname;

    private String cityid;

    private String cityname;

    private String belongtodeptid;

    private String delongtodept;

    private Boolean inblacklist;

    private String contact;

    private String mobile;

    private String comment;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private Date reviseddate;

    private String revisedby;

    private Integer datastatus;

    private BigDecimal creditamt;

    private Integer creditnumber;

    private String purchaserorgid;

    private String crmaddress;

    private Integer isopnecrmaccount;

    private String crmaccountorgid;

    private Integer source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getBelongtodeptid() {
        return belongtodeptid;
    }

    public void setBelongtodeptid(String belongtodeptid) {
        this.belongtodeptid = belongtodeptid == null ? null : belongtodeptid.trim();
    }

    public String getDelongtodept() {
        return delongtodept;
    }

    public void setDelongtodept(String delongtodept) {
        this.delongtodept = delongtodept == null ? null : delongtodept.trim();
    }

    public Boolean getInblacklist() {
        return inblacklist;
    }

    public void setInblacklist(Boolean inblacklist) {
        this.inblacklist = inblacklist;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
    }

    public String getRevisedby() {
        return revisedby;
    }

    public void setRevisedby(String revisedby) {
        this.revisedby = revisedby == null ? null : revisedby.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public BigDecimal getCreditamt() {
        return creditamt;
    }

    public void setCreditamt(BigDecimal creditamt) {
        this.creditamt = creditamt;
    }

    public Integer getCreditnumber() {
        return creditnumber;
    }

    public void setCreditnumber(Integer creditnumber) {
        this.creditnumber = creditnumber;
    }

    public String getPurchaserorgid() {
        return purchaserorgid;
    }

    public void setPurchaserorgid(String purchaserorgid) {
        this.purchaserorgid = purchaserorgid == null ? null : purchaserorgid.trim();
    }

    public String getCrmaddress() {
        return crmaddress;
    }

    public void setCrmaddress(String crmaddress) {
        this.crmaddress = crmaddress == null ? null : crmaddress.trim();
    }

    public Integer getIsopnecrmaccount() {
        return isopnecrmaccount;
    }

    public void setIsopnecrmaccount(Integer isopnecrmaccount) {
        this.isopnecrmaccount = isopnecrmaccount;
    }

    public String getCrmaccountorgid() {
        return crmaccountorgid;
    }

    public void setCrmaccountorgid(String crmaccountorgid) {
        this.crmaccountorgid = crmaccountorgid == null ? null : crmaccountorgid.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}