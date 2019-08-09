package com.holyrobot.dto;


import com.holyrobot.con_volunteer.pojo.VolunteerApplication;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * @author 周陈
 * @Title: 微信用户信息
 * @date 2018/7/5 11:55
 */
public class WxUser {
    private String userId;
    private Integer userType = 2;
    private String openId;
    private String nickname;
    private String sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headImgUrl;
    private String mobile;
    private Integer skinType = 0;
    //授权跳转url
    private String url;
    private String locationCity;
    private VolunteerApplication volunteerApplication;

    private Integer newUserType;
    //             用户类型
//            1.C端未绑定手机号
    public static final int USER_TYPE_C_NO_MOBILE_1 = 1;
    //            2.B端用户
    public static final int USER_TYPE_B_2 = 2;
    //            3.普通C，绑定过手机号
    public static final int USER_TYPE_C_HAVE_MOBILE_3 = 3;
    //            4.V志愿者用户
    public static final int USER_TYPE_V_4 = 4;
    //            5.T旅行者（没有下家）
    public static final int USER_TYPE_T_NO_CHILD_5 = 5;
    //            6.T旅行者（有下家）
    public static final int USER_TYPE_T_HAVE_CHILD_6 = 6;

    //是否允许C端访问批发商店铺 0.不允许；1.允许
    private Integer isAllowVisitorSeeShop = 0;

    @Override
    public String toString() {
        return "WxUser{" +
                "userId='" + userId + '\'' +
                ", userType=" + userType +
                ", openId='" + openId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public WxUser(WxMpUser wxMpUser) {
        this.openId = wxMpUser.getOpenId();
        this.nickname = wxMpUser.getNickname();
        this.sex = wxMpUser.getSex();
        this.language = wxMpUser.getLanguage();
        this.city = wxMpUser.getCity();
        this.province = wxMpUser.getProvince();
        this.country = wxMpUser.getCountry();
        this.headImgUrl = wxMpUser.getHeadImgUrl();
    }

    public WxUser() {
    }

    public Integer getNewUserType() {
        return newUserType;
    }

    public void setNewUserType(Integer newUserType) {
        this.newUserType = newUserType;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public VolunteerApplication getVolunteerApplication() {
        return volunteerApplication;
    }

    public void setVolunteerApplication(VolunteerApplication volunteerApplication) {
        this.volunteerApplication = volunteerApplication;
    }

    public Integer getIsAllowVisitorSeeShop() {
        return isAllowVisitorSeeShop;
    }

    public void setIsAllowVisitorSeeShop(Integer isAllowVisitorSeeShop) {
        this.isAllowVisitorSeeShop = isAllowVisitorSeeShop;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSkinType() {
        return skinType;
    }

    public void setSkinType(Integer skinType) {
        this.skinType = skinType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }


}
