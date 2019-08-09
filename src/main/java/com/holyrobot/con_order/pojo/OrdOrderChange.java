package com.holyrobot.con_order.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrdOrderChange implements Serializable {
    private String id;

    private String orderid;

    private String norderid;

    private Integer datastatus;

    private String changecomment;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private Date reviseddate;

    private String revisedby;

    private String orgid;

    private String orgname;

    private Integer changetype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getNorderid() {
        return norderid;
    }

    public void setNorderid(String norderid) {
        this.norderid = norderid == null ? null : norderid.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public String getChangecomment() {
        return changecomment;
    }

    public void setChangecomment(String changecomment) {
        this.changecomment = changecomment == null ? null : changecomment.trim();
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

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public Integer getChangetype() {
        return changetype;
    }

    public void setChangetype(Integer changetype) {
        this.changetype = changetype;
    }
}