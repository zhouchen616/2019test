package com.holyrobot.dto;

import java.math.BigDecimal;

/**
 * @Author: 周相儒
 * @Description: 所有团期价格查询返回
 * @CreateDate: 2018/8/14 14:52
 * @Version: 1.0
 */
public class TourPriceDto {

    private String tourID;
    private String policyId;
    private BigDecimal salesPrice;
    private BigDecimal directPrice;

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public BigDecimal getDirectPrice() {
        return directPrice;
    }

    public void setDirectPrice(BigDecimal directPrice) {
        this.directPrice = directPrice;
    }
}
