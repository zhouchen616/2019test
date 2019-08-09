package com.holyrobot.con_order.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class OrdOrderShopAdjust {
    private String id;

    private String orderid;//订单ID

    private BigDecimal beforeadjustamount; //调整前金额

    private BigDecimal adjustamount; //调整金额

    private BigDecimal afteradjustamount;//调整后金额

    private String createdbyid;//用户ID

    private String createdby;//用户名

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createddate;

    private String orgid;

    private String comment;//调整金额备注

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

    public BigDecimal getBeforeadjustamount() {
        return beforeadjustamount;
    }

    public void setBeforeadjustamount(BigDecimal beforeadjustamount) {
        this.beforeadjustamount = beforeadjustamount;
    }

    public BigDecimal getAdjustamount() {
        return adjustamount;
    }

    public void setAdjustamount(BigDecimal adjustamount) {
        this.adjustamount = adjustamount;
    }

    public BigDecimal getAfteradjustamount() {
        return afteradjustamount;
    }

    public void setAfteradjustamount(BigDecimal afteradjustamount) {
        this.afteradjustamount = afteradjustamount;
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