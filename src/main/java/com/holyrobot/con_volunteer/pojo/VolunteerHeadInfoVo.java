package com.holyrobot.con_volunteer.pojo;

import java.io.Serializable;

/**
 * @ClassName： VolunteerHeadInfo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-21 18:22
 * @Version: 1.0
 * @Modified By:
 */
public class VolunteerHeadInfoVo implements Serializable {

    private String travelAgencyName; //授权旅行社名称

    private String shopName; //申请人店铺名称

    private String shopUserName; //申请人

    private String shopHeadPortRait; //申请人店铺头像

    private Integer autoUpdate; //开启自动更新产品 1：开启  0：关闭   -1：第一次进入

    public String getShopUserName() {
        return shopUserName;
    }

    public void setShopUserName(String shopUserName) {
        this.shopUserName = shopUserName;
    }

    public Integer getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(Integer autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

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

    public String getShopHeadPortRait() {
        return shopHeadPortRait;
    }

    public void setShopHeadPortRait(String shopHeadPortRait) {
        this.shopHeadPortRait = shopHeadPortRait;
    }
}
