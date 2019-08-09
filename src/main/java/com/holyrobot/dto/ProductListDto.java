package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 周陈
 * @Title: 新·产品列表返回实体
 * @date 2018/12/3 14:10
 */
public class ProductListDto {
    //产品
    private String volProId;
    //产品Id
    private String id;
    //产品编号
    private String ProNo;
    //店铺id
    private String orgId;
    //是否外发 1是外发产品，0非外发产品
    private int isOutgoing;
    //产品名称
    private String aliaseName;
    //旅行社名称
    private String brandName;
    //封面图
    private String coverImg;
    //出发地
    private String departure;
    //目的地
    private String destination;
    //线路类型ID
    private String proCategoryID;
    //产品类型
    private String proType;
    //站点ID
    private String siteId;
    //直客价
    private BigDecimal directPrice;
    //分销价
    private BigDecimal salesPrice;
    //返佣
    private BigDecimal rebatePrice;
    //星级
    private int starLevel;
    //出行天数
    private int tourDays;
    //销售量
    private int salesQuantity;
    //产品标签
    private String proTag;
    /**
     * 产品标签
     */
    private List<String> tags;
    //近期团期
    private String tours;
    private Integer type;
    //价格 0:无更改 1：价格有修改
    private Integer priceStatus;
    //0:无更改 1：有新团次
    private Integer tourStatus;
    //上架状态  0：待上架；1：已上架 ；-1：删除
    private Integer dataStatus;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    private Date createdDate;
    //外发产品发送人id
    private String directSalesSendId;

    private Integer total;

    private String travelerRewardPrice;
    /**
     *产品类型ID
     */
    private String proTypeId ;

    public String getProTypeId() {
        return proTypeId;
    }

    public void setProTypeId(String proTypeId) {
        this.proTypeId = proTypeId;
    }

    public String getVolProId() {
        return volProId;
    }

    public void setVolProId(String volProId) {
        this.volProId = volProId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(Integer priceStatus) {
        this.priceStatus = priceStatus;
    }

    public Integer getTourStatus() {
        return tourStatus;
    }

    public void setTourStatus(Integer tourStatus) {
        this.tourStatus = tourStatus;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getProNo() {
        return ProNo;
    }

    public void setProNo(String proNo) {
        ProNo = proNo;
    }

    public String getDirectSalesSendId() {
        return directSalesSendId;
    }

    public void setDirectSalesSendId(String directSalesSendId) {
        this.directSalesSendId = directSalesSendId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIsOutgoing() {
        return isOutgoing;
    }

    public void setIsOutgoing(int isOutgoing) {
        this.isOutgoing = isOutgoing;
    }

    public String getAliaseName() {
        return aliaseName;
    }

    public void setAliaseName(String aliaseName) {
        this.aliaseName = aliaseName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProCategoryID() {
        return proCategoryID;
    }

    public void setProCategoryID(String proCategoryID) {
        this.proCategoryID = proCategoryID;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public BigDecimal getDirectPrice() {
        return directPrice;
    }

    public void setDirectPrice(BigDecimal directPrice) {
        this.directPrice = directPrice;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public BigDecimal getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(BigDecimal rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public int getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(int starLevel) {
        this.starLevel = starLevel;
    }

    public int getTourDays() {
        return tourDays;
    }

    public void setTourDays(int tourDays) {
        this.tourDays = tourDays;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getProTag() {
        return proTag;
    }

    public String getTravelerRewardPrice() {
        return travelerRewardPrice;
    }

    public void setTravelerRewardPrice(String travelerRewardPrice) {
        this.travelerRewardPrice = travelerRewardPrice == null ? "0":travelerRewardPrice;
    }

    public void setProTag(String proTag) {
        this.proTag = proTag;
        //初始化时将多个标签 截取保存。
        if (StringUtils.isNotEmpty(proTag)) {
            if (proTag.contains(",")) {
                String[] split = proTag.split(",");
                this.tags = Arrays.asList(split);
            } else {
                this.tags = new ArrayList<>();
                this.tags.add(proTag);
            }
        }
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTours() {
        return tours;
    }

    public void setTours(String tours) {
        this.tours = tours;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
