package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdOnlinePayInfo {
    private String id;

    private String orderid;

    private Integer type;

    private Integer datastatus;

    private BigDecimal rdined;

    private BigDecimal receivableamt;

    private BigDecimal servicecharge;

    private BigDecimal realityamt;

    private Date createddate;

    private String remark;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public BigDecimal getRdined() {
        return rdined;
    }

    public void setRdined(BigDecimal rdined) {
        this.rdined = rdined;
    }

    public BigDecimal getReceivableamt() {
        return receivableamt;
    }

    public void setReceivableamt(BigDecimal receivableamt) {
        this.receivableamt = receivableamt;
    }

    public BigDecimal getServicecharge() {
        return servicecharge;
    }

    public void setServicecharge(BigDecimal servicecharge) {
        this.servicecharge = servicecharge;
    }

    public BigDecimal getRealityamt() {
        return realityamt;
    }

    public void setRealityamt(BigDecimal realityamt) {
        this.realityamt = realityamt;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}