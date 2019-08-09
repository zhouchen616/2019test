package com.holyrobot.con_fin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FinOrderCostPaid {
    private String id;

    private String ordercostid;

    private String supplierid;

    private BigDecimal amount;

    private BigDecimal fee;

    private Date paydate;

    private String xtype;

    private String comment;

    private String creator;

    private String creatorid;

    private Date createdate;

    private String deptid;

    private Integer datastatus;

    private String orderid;

    private String orgid;

    private String orgname;

    @Override
    public String toString() {
        return "FinOrderCostPaid{" +
                "id='" + id + '\'' +
                ", ordercostid='" + ordercostid + '\'' +
                ", supplierid='" + supplierid + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", paydate=" + paydate +
                ", xtype='" + xtype + '\'' +
                ", comment='" + comment + '\'' +
                ", creator='" + creator + '\'' +
                ", creatorid='" + creatorid + '\'' +
                ", createdate=" + createdate +
                ", deptid='" + deptid + '\'' +
                ", datastatus=" + datastatus +
                ", orderid='" + orderid + '\'' +
                ", orgid='" + orgid + '\'' +
                ", orgname='" + orgname + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrdercostid() {
        return ordercostid;
    }

    public void setOrdercostid(String ordercostid) {
        this.ordercostid = ordercostid == null ? null : ordercostid.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getXtype() {
        return xtype;
    }

    public void setXtype(String xtype) {
        this.xtype = xtype == null ? null : xtype.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
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
}