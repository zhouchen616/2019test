package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdVolunteerOrderShopAdjust {
    private String id;

    private String orderid;

    private BigDecimal orderprice;

    private BigDecimal ordercostprice;

    private BigDecimal commissionamt;

    private BigDecimal adjustprice;

    private String createdbyid;

    private String createdby;

    private Date createddate;

    private String orgid;

    private String comment;

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

    public BigDecimal getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }

    public BigDecimal getOrdercostprice() {
        return ordercostprice;
    }

    public void setOrdercostprice(BigDecimal ordercostprice) {
        this.ordercostprice = ordercostprice;
    }

    public BigDecimal getCommissionamt() {
        return commissionamt;
    }

    public void setCommissionamt(BigDecimal commissionamt) {
        this.commissionamt = commissionamt;
    }

    public BigDecimal getAdjustprice() {
        return adjustprice;
    }

    public void setAdjustprice(BigDecimal adjustprice) {
        this.adjustprice = adjustprice;
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

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}