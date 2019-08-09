package com.holyrobot.con_volunteer.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName： VolunteerShopAutoUpdate
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-28 14:20
 * @Version: 1.0
 * @Modified By:
 */
public class VolunteerShopAutoUpdate implements Serializable {

    private Integer autoUpdate; //开启自动更新产品 1：开启  0：关闭   -1：第一次进入

    private Integer adjustmentType; //调整类型  1：加价 0：减价  （没有值时 = 没有设置价格更新）

    private Integer adjustmentMethod; //加减价方式  1：百分比  2：固定金额

    private BigDecimal percentage; //百分比

    private BigDecimal fixedAmount; //固定金额

    private String userId; //用户id

    private String orgId; //授权旅行社id

    private String orgName; //授权旅行社名称

    private String shopName; //店铺名

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public Integer getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(Integer autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public Integer getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(Integer adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public Integer getAdjustmentMethod() {
        return adjustmentMethod;
    }

    public void setAdjustmentMethod(Integer adjustmentMethod) {
        this.adjustmentMethod = adjustmentMethod;
    }

    @Override
    public String toString() {
        return "VolunteerShopAutoUpdate{" +
                "autoUpdate=" + autoUpdate +
                ", adjustmentType=" + adjustmentType +
                ", adjustmentMethod=" + adjustmentMethod +
                ", percentage=" + percentage +
                ", fixedAmount=" + fixedAmount +
                ", userId='" + userId + '\'' +
                ", orgId='" + orgId + '\'' +
                '}';
    }
}
