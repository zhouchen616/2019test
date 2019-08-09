package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdOtherOrderInfo {
    private String id;

    private String orderno;

    private String ordername;

    private Integer count;

    private BigDecimal unitamt;

    private BigDecimal totalamt;

    private String shoporgid;

    private String shoporgname;

    private Integer datastatus;

    private Integer ordertype;

    private String payno;

    private String payway;

    private String srcbank;

    private String createdbyid;

    private String createdby;

    private Date createddate;

    private String deptid;

    private String orgid;

    private String orgname;

    private String otherproid;

    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getUnitamt() {
        return unitamt;
    }

    public void setUnitamt(BigDecimal unitamt) {
        this.unitamt = unitamt;
    }

    public BigDecimal getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(BigDecimal totalamt) {
        this.totalamt = totalamt;
    }

    public String getShoporgid() {
        return shoporgid;
    }

    public void setShoporgid(String shoporgid) {
        this.shoporgid = shoporgid == null ? null : shoporgid.trim();
    }

    public String getShoporgname() {
        return shoporgname;
    }

    public void setShoporgname(String shoporgname) {
        this.shoporgname = shoporgname == null ? null : shoporgname.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getPayno() {
        return payno;
    }

    public void setPayno(String payno) {
        this.payno = payno == null ? null : payno.trim();
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getSrcbank() {
        return srcbank;
    }

    public void setSrcbank(String srcbank) {
        this.srcbank = srcbank == null ? null : srcbank.trim();
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

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOtherproid() {
        return otherproid;
    }

    public void setOtherproid(String otherproid) {
        this.otherproid = otherproid == null ? null : otherproid.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}