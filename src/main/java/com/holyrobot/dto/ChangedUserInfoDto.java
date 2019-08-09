package com.holyrobot.dto;

import java.io.Serializable;

/**
 * @ClassName： ChangedUserInfoDto
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-12 17:54
 * @Version: 1.0
 * @Modified By:
 */
public class ChangedUserInfoDto implements Serializable {

    private String name;

    private String sex;

    private String telphone;

    private String guestCard;

    private String guestCardType;

    private String pickName;

    private String pickUpTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getGuestCard() {
        return guestCard;
    }

    public void setGuestCard(String guestCard) {
        this.guestCard = guestCard;
    }

    public String getGuestCardType() {
        return guestCardType;
    }

    public void setGuestCardType(String guestCardType) {
        this.guestCardType = guestCardType;
    }

    public String getPickName() {
        return pickName;
    }

    public void setPickName(String pickName) {
        this.pickName = pickName;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    @Override
    public String toString() {
        return "ChangedUserInfoDto{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", telphone='" + telphone + '\'' +
                ", guestCard='" + guestCard + '\'' +
                ", guestCardType='" + guestCardType + '\'' +
                ", pickName='" + pickName + '\'' +
                ", pickUpTime='" + pickUpTime + '\'' +
                '}';
    }
}
