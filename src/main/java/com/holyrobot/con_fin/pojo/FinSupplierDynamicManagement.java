package com.holyrobot.con_fin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FinSupplierDynamicManagement {
    private String id;

    private Integer type;

    private String supplierid;

    private Integer isenabled;

    private BigDecimal proportionalpercentage;

    private BigDecimal headvalue;

    private String orgid;

    private String createdbyid;

    private String createdby;

    private Date createddate;

    private Integer internalsupptype;

    private Integer setmode;

    private BigDecimal setmodevalue;

    private Date reviseddate;

    private String revisedby;

    private String revisedbyid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public Integer getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

    public BigDecimal getProportionalpercentage() {
        return proportionalpercentage;
    }

    public void setProportionalpercentage(BigDecimal proportionalpercentage) {
        this.proportionalpercentage = proportionalpercentage;
    }

    public BigDecimal getHeadvalue() {
        return headvalue;
    }

    public void setHeadvalue(BigDecimal headvalue) {
        this.headvalue = headvalue;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getInternalsupptype() {
        return internalsupptype;
    }

    public void setInternalsupptype(Integer internalsupptype) {
        this.internalsupptype = internalsupptype;
    }

    public Integer getSetmode() {
        return setmode;
    }

    public void setSetmode(Integer setmode) {
        this.setmode = setmode;
    }

    public BigDecimal getSetmodevalue() {
        return setmodevalue;
    }

    public void setSetmodevalue(BigDecimal setmodevalue) {
        this.setmodevalue = setmodevalue;
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

    public String getRevisedbyid() {
        return revisedbyid;
    }

    public void setRevisedbyid(String revisedbyid) {
        this.revisedbyid = revisedbyid == null ? null : revisedbyid.trim();
    }
}