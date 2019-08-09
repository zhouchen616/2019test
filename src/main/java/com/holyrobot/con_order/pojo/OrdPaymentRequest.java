package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdPaymentRequest {
    private String id;

    private String orderid;

    private BigDecimal paymentamt;

    private String supplierid;

    private String ordercostid;

    private String creator;

    private String creatorid;

    private String deptid;

    private String comment;

    private Date createdate;

    private Integer datastatus;

    private String orgid;

    private String orgname;

    private String orderno;

    private String suppliername;

    private Date paydate;

    private Boolean isselleraudit;

    private Boolean iscreditpay;

    private Date creditpaydate;

    private Boolean isbuyerapply;

    private String buyerorgname;

    @Override
    public String toString() {
        return "OrdPaymentRequest{" +
                "id='" + id + '\'' +
                ", orderid='" + orderid + '\'' +
                ", paymentamt=" + paymentamt +
                ", supplierid='" + supplierid + '\'' +
                ", ordercostid='" + ordercostid + '\'' +
                ", creator='" + creator + '\'' +
                ", creatorid='" + creatorid + '\'' +
                ", deptid='" + deptid + '\'' +
                ", comment='" + comment + '\'' +
                ", createdate=" + createdate +
                ", datastatus=" + datastatus +
                ", orgid='" + orgid + '\'' +
                ", orgname='" + orgname + '\'' +
                ", orderno='" + orderno + '\'' +
                ", suppliername='" + suppliername + '\'' +
                ", paydate=" + paydate +
                ", isselleraudit=" + isselleraudit +
                ", iscreditpay=" + iscreditpay +
                ", creditpaydate=" + creditpaydate +
                ", isbuyerapply=" + isbuyerapply +
                ", buyerorgname='" + buyerorgname + '\'' +
                '}';
    }

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

    public BigDecimal getPaymentamt() {
        return paymentamt;
    }

    public void setPaymentamt(BigDecimal paymentamt) {
        this.paymentamt = paymentamt;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getOrdercostid() {
        return ordercostid;
    }

    public void setOrdercostid(String ordercostid) {
        this.ordercostid = ordercostid == null ? null : ordercostid.trim();
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

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
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

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Boolean getIsselleraudit() {
        return isselleraudit;
    }

    public void setIsselleraudit(Boolean isselleraudit) {
        this.isselleraudit = isselleraudit;
    }

    public Boolean getIscreditpay() {
        return iscreditpay;
    }

    public void setIscreditpay(Boolean iscreditpay) {
        this.iscreditpay = iscreditpay;
    }

    public Date getCreditpaydate() {
        return creditpaydate;
    }

    public void setCreditpaydate(Date creditpaydate) {
        this.creditpaydate = creditpaydate;
    }

    public Boolean getIsbuyerapply() {
        return isbuyerapply;
    }

    public void setIsbuyerapply(Boolean isbuyerapply) {
        this.isbuyerapply = isbuyerapply;
    }

    public String getBuyerorgname() {
        return buyerorgname;
    }

    public void setBuyerorgname(String buyerorgname) {
        this.buyerorgname = buyerorgname == null ? null : buyerorgname.trim();
    }
}