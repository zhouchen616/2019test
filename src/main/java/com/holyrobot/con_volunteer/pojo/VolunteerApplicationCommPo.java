package com.holyrobot.con_volunteer.pojo;

import java.math.BigDecimal;

/**
 * @ClassName： VolunteerApplicationCommPo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-22 14:33
 * @Version: 1.0
 * @Modified By:
 */
public class VolunteerApplicationCommPo {

    private String travelAgencyName; //授权旅行社名

    private String shopName; //申请人店铺名

    private String shopHeadPortait; //申请人店铺头像

    private String phone; //申请人手机号

    private BigDecimal totalCommission; //可提总佣金

    private BigDecimal cumulativeCommission; //累计佣金

    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopHeadPortait() {
        return shopHeadPortait;
    }

    public void setShopHeadPortait(String shopHeadPortait) {
        this.shopHeadPortait = shopHeadPortait;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public BigDecimal getCumulativeCommission() {
        return cumulativeCommission;
    }

    public void setCumulativeCommission(BigDecimal cumulativeCommission) {
        this.cumulativeCommission = cumulativeCommission;
    }

}
