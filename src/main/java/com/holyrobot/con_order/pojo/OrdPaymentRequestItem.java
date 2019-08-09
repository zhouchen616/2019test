package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdPaymentRequestItem {
    private String id;

    private String paymentrequestid;

    private BigDecimal paymentamt;

    private String orderid;

    private String orderno;

    private String orgid;

    private Date createddate;

    @Override
    public String toString() {
        return "OrdPaymentRequestItem{" +
                "id='" + id + '\'' +
                ", paymentrequestid='" + paymentrequestid + '\'' +
                ", paymentamt=" + paymentamt +
                ", orderid='" + orderid + '\'' +
                ", orderno='" + orderno + '\'' +
                ", orgid='" + orgid + '\'' +
                ", createddate=" + createddate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPaymentrequestid() {
        return paymentrequestid;
    }

    public void setPaymentrequestid(String paymentrequestid) {
        this.paymentrequestid = paymentrequestid == null ? null : paymentrequestid.trim();
    }

    public BigDecimal getPaymentamt() {
        return paymentamt;
    }

    public void setPaymentamt(BigDecimal paymentamt) {
        this.paymentamt = paymentamt;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
}