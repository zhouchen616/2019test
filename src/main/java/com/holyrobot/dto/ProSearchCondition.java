package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @author 周陈
 * @Title: 产品查询条件
 * @date 2018/12/3 11:17
 */
public class ProSearchCondition {
    private String userId;
    private Integer dataStatus;
    private Integer userType=2;
    /**
     * 线路类型ID
     */
    private String routeTypeId;
    /**
     * 店铺ID
     */
    private String orgId;
    /**
     * 标签
     */
    private List<String> tags;
    /**
     * 站点id
     */
    private String siteId;
    /**
     * 目的地
     */
    private String destination;
    /**
     * 出发城市
     */
    private String departure;
    /**
     * 产品类型
     */
    private String proType ;
    /**
     * 行程天数
     */
    private List<Integer> days;
    /**
     * 出行天数范围
     */
    private String tourDayScope;
    //出行天数大于day1
    private Integer day1;
    //出行天数小于day2
    private Integer day2;
    /**
     * 出团日期 月份
     */
    private List<String> tourMonth;
    /**
     * 出团日期
     */
    @DateTimeFormat(pattern="yyyy/MM/dd")
    @JsonFormat(pattern = "yyyy/MM/dd",timezone="GMT+8")
    private Date endDate;
    @DateTimeFormat(pattern="yyyy/MM/dd")
    @JsonFormat(pattern = "yyyy/MM/dd",timezone="GMT+8")
    private Date beginDate;
    /**
     * 最低价
     */
    private Double lowPrice;
    /**
     * 最高价
     */
    private Double highPrice;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 排序
     *
     orderBy=1 默认排序，rderBy=2，根据价格排序 orderBy=3，根据热度排序
     */
    private int orderBy=1;
    /**
     * 排序规则desc/asc
     */
    private String orderDirection="desc";
    /**
     * 开始位置
     */
    private int start = 0;
    /**
     * 显示条数
     */
    private int size = 10;
    /**
     * 销售类型
     */
    private Integer marketType;
    private Integer shopType;
    //换一换
    private Integer  isRandom;
    //最大天数
    private Integer  maxDay;
    //最小天数
    private Integer  minDay;
    //品牌
    private String brand;

    //1.组团社; 2.批发商；3.地接社；
    private Integer businessType;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getMaxDay() {
        return maxDay;
    }

    public void setMaxDay(Integer maxDay) {
        this.maxDay = maxDay;
    }

    public Integer getMinDay() {
        return minDay;
    }

    public void setMinDay(Integer minDay) {
        this.minDay = minDay;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getIsRandom() {
        return isRandom;
    }

    public void setIsRandom(Integer isRandom) {
        this.isRandom = isRandom;
    }

    List<VolunteerProIdAndTypeDto> proIds;

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<VolunteerProIdAndTypeDto> getProIds() {
        return proIds;
    }

    public void setProIds(List<VolunteerProIdAndTypeDto> proIds) {
        this.proIds = proIds;
    }

    public Integer getMarketType() {
        return marketType;
    }

    public void setMarketType(Integer marketType) {
        this.marketType = marketType;
    }
    public Integer getDay1() {
        return day1;
    }

    public void setDay1(Integer day1) {
        this.day1 = day1;
    }

    public Integer getDay2() {
        return day2;
    }

    public void setDay2(Integer day2) {
        this.day2 = day2;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getRouteTypeId() {
        return routeTypeId;
    }

    public void setRouteTypeId(String routeTypeId) {
        this.routeTypeId = routeTypeId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public List<Integer> getDays() {
        return days;
    }

    public void setDays(List<Integer> days) {
        this.days = days;
    }

    public String getTourDayScope() {
        return tourDayScope;
    }

    public void setTourDayScope(String tourDayScope) {
        this.tourDayScope = tourDayScope;
        switch (tourDayScope){
            case "2~3天":
                setDay1(2);
                setDay2(3);
                break;
            case "4~6天":
                setDay1(4);
                setDay2(6);
                break;
            case "7~9天":
                setDay1(7);
                setDay2(9);
                break;
            case "10天以上":
                setDay1(10);
                break;
        }
    }

    public List<String> getTourMonth() {
        return tourMonth;
    }

    public void setTourMonth(List<String> tourMonth) {
        this.tourMonth = tourMonth;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
