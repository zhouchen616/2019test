package com.holyrobot.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 周陈
 * @Description: ES查询条件
 * @date 2018年4月13日 上午9:18:39
 */
public class EsSearchCondition implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * userType
     */
    private Integer userType=2;

    /**
     * tags
     */
    private List<String> tags;

    /**
     * 是否尾单
     */
    private Integer isTail;
    /**
     * 是否确认 1：下单即确认 0：二次确认
     */
    private Integer isAck;
    /**
     * 销售类型    1.直售；2.二次确认；0；尾单；
     */
    private Integer marketType;
    /**
     * orgId
     */
    private String orgId;
    /**
     * 主题推荐
     */
    private String subject;
    /**
     * 线路类型
     */
    private String routeTypeId;
    /**
     * 站点
     */
    private String site;
    /**
     * 站点id
     */
    private String siteId="" ;

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
    private Integer tourDays;
    /**
     * 出团日期 月份
     */
    private List<Integer> tourMonth;
    /**
     * 出团日期 年份
     */
    private Integer tourYear;
    /**
     * 开始时间
     */
    private String beginDate;
    /**
     * 结束时间
     */
    private String endDate;
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
     * 供应商
     */
    private String travelName;
    /**
     * 排序
     */
    private String orderBy;
    /**
     * 排序规则
     */
    private String orderDirection;
    /**
     * 开始位置
     */
    private int start = 0;
    /**
     * 显示条数
     */
    private int size = 100;

    /**
     * proId
     */
    private List<String> proIds;

    private List<String> oldProIds;

    public List<String> getProIds() {
        return proIds;
    }

    public void setProIds(List<String> proIds) {
        List<String> newProIds = new ArrayList<String>();
        for(String proId:proIds){
            newProIds.add(proId.toUpperCase());
        }
        this.proIds = newProIds;
    }

    private List<Integer> days;

    private String orderByPrice="sites.directprice";

    private Integer shopType;

    private String shopUserId="";

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShopUserId() {
        return shopUserId;
    }

    public void setShopUserId(String shopUserId) {
        this.shopUserId = shopUserId.toUpperCase();
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    @Override
    public String toString() {
        return "EsSearchCondition{" +
                "userType=" + userType +
                ", tags=" + tags +
                ", isTail=" + isTail +
                ", isAck=" + isAck +
                ", marketType=" + marketType +
                ", orgId='" + orgId + '\'' +
                ", subject='" + subject + '\'' +
                ", routeTypeId='" + routeTypeId + '\'' +
                ", site='" + site + '\'' +
                ", siteId='" + siteId + '\'' +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", proType='" + proType + '\'' +
                ", tourDays=" + tourDays +
                ", tourMonth=" + tourMonth +
                ", tourYear=" + tourYear +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", lowPrice=" + lowPrice +
                ", highPrice=" + highPrice +
                ", keywords='" + keywords + '\'' +
                ", travelName='" + travelName + '\'' +
                ", orderBy='" + orderBy + '\'' +
                ", orderDirection='" + orderDirection + '\'' +
                ", start=" + start +
                ", size=" + size +
                ", proIds=" + proIds +
                ", days=" + days +
                ", orderByPrice='" + orderByPrice + '\'' +
                ", shopType=" + shopType +
                ", shopUserId='" + shopUserId + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
        if (userType==1){
            orderByPrice="sites.salesprice";
        }
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getIsTail() {
        return isTail;
    }

    public void setIsTail(Integer isTail) {
        this.isTail = isTail;
    }

    public Integer getIsAck() {
        return isAck;
    }

    public void setIsAck(Integer isAck) {
        this.isAck = isAck;
    }

    public Integer getMarketType() {
        return marketType;
    }

    public void setMarketType(Integer marketType) {
        this.marketType = marketType;
        switch (marketType) {
            case 1:
                setIsAck(1);
                break;
            case 2:
                setIsAck(0);
                break;
            case 0:
                setIsTail(1);
                break;
        }
    }

    public List<Integer> getDays() {
        return days;
    }

    public void setDays(List<Integer> days) {
        this.days = days;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId.toUpperCase();
    }

    public String getSiteId() {
        return siteId.toUpperCase();
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId.toUpperCase();
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject.equals("") ? null : subject;
    }

    public String getRouteTypeId() {
        return routeTypeId;
    }

    public void setRouteTypeId(String routeTypeId) {
        if(routeTypeId!=null){
            this.routeTypeId = routeTypeId.toUpperCase();
        }else {
            this.routeTypeId=null;
        }
    }

    public Integer getTourYear() {
        return tourYear;
    }

    public void setTourYear(Integer tourYear) {
        this.tourYear = tourYear;
    }

    public List<Integer> getTourMonth() {
        return tourMonth;
    }

    public void setTourMonth(List<Integer> tourMonth) {

        this.tourMonth = tourMonth;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site.equals("") || site == null ? "上海站" : site;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName.equals("") ? null : travelName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType.equals("") ? null : proType.toUpperCase();
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
        //this.keywords = keywords.equals("") ? null : "*"+keywords+"*";
        this.keywords = keywords.equals("") ? null : keywords;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination.equals("") ? null : destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure.equals("") ? null : departure;
    }

    public Integer getTourDays() {
        return tourDays;
    }

    public void setTourDays(Integer tourDays) {
        this.tourDays = tourDays;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate.equals("") ? null : beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate.equals("") ? null : endDate;
    }

    public String getOrderBy() {
        if (orderBy == null) {
            orderBy = "startDate";
        } else if (orderBy.equals("defaulPrice")) {
            orderBy = orderByPrice;
        }
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy.equals("") ? "startDate" : orderBy;
    }

    public String getOrderDirection() {
        return orderDirection == null ? "DESC" : orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection.equals("") ? null : orderDirection;
    }

    public int getStart() {
        return start > 0 ? start : 0;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        if (this.size < 1) {
            return 10;
        } else if (this.size > 100) {
            return 100;
        } else {
            return this.size;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getOldProIds() {
        return oldProIds;
    }

    public void setOldProIds(List<String> oldProIds) {
        List<String> newProIds = new ArrayList<String>();
        for(String proId:oldProIds){
            newProIds.add(proId.toUpperCase());
        }
        this.oldProIds = newProIds;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list.toString());
    }

}
