package com.holyrobot.con_volunteer.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName： VolunteerAdjustmentAmtVo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-4 16:21
 * @Version: 1.0
 * @Modified By:
 */
public class VolunteerAdjustmentAmtVo implements Serializable {

    private String id;//佣金记录表id

    private String userId;

    private String orderId; //订单id

    private BigDecimal commissionAmt; //佣金值

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

    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
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
