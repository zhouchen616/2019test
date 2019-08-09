package com.holyrobot.con_volunteer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName： VolunteerAdjustmentAmtPo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-4 16:05
 * @Version: 1.0
 * @Modified By:
 */
public class VolunteerAdjustmentAmtPo implements Serializable {
    private String id;//佣金记录表id

    private String userId;

    private String orderId; //订单id

    private String orderNo; //订单编号

    private Integer adultNum; //成人数量

    private Integer childNum; //儿童数量

    private BigDecimal commissionAmt; //佣金值

    private Integer dataStatus;//佣金状态 状态 0.不可提现【未出团】；1.可提现【已出团】；-1.已取消

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createdDate;

    private String orgId;

    private BigDecimal payableAmt; //应付金额

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(Integer adultNum) {
        this.adultNum = adultNum;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public BigDecimal getPayableAmt() {
        return payableAmt;
    }

    public void setPayableAmt(BigDecimal payableAmt) {
        this.payableAmt = payableAmt;
    }
}
