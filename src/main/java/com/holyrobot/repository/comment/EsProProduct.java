package com.holyrobot.repository.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;


/**
 * @author 周陈
 * @Title: ES产品索引
 * @date 2018/5/14 10:15
 */
@Document(indexName = "pro_product", type = "pro_product", shards = 1, replicas = 0)
public class EsProProduct {
    //	文档id
    @Id
    private String id;
    //	产品主键id
    @Field(type = FieldType.keyword , store = true)
    private String proId;
    //	原产品ID
    @Field(type = FieldType.keyword , store = true)
    private String oldProId;
    //	产品基本类型
    @Field(type = FieldType.Integer , store = true)
    private Integer proBasicType;
    //	产品编号
    @Field(type = FieldType.keyword , store = true)
    private String proNo;
    //	店铺orgID
    @Field(type = FieldType.keyword , store = true)
    private String orgId;
    //	org店铺名称
    @Field(type = FieldType.keyword , store = true)
    private String brandName;
    //	店铺UserId
    @Field(type = FieldType.keyword , store = true)
    private String shopUserId;
    //	发送方ID
    @Field(type = FieldType.keyword , store = true)
    private String directSalesSendId;
    //	发送次数，用于产品短域名
    @Field(type = FieldType.Integer , store = true)
    private Integer sendNo;
    //	发送方域名
    @Field(type = FieldType.keyword , store = true)
    private String sendDomain;
    //	发送方所在城市
    @Field(type = FieldType.keyword , store = true)
    private String sendCity;
    //	发送发旅行社联系人
    @Field(type = FieldType.keyword , store = true)
    private String sendTAContact;
    //	发送方旅行社联系电话
    @Field(type = FieldType.keyword , store = true)
    private String sendTAContactMobile;
    //	产品名
    @Field(type = FieldType.keyword , store = true)
    private String proName;
    //	地接产品名称
    @Field(type = FieldType.keyword , store = true)
    private String localProName;
    //	产品分销名（别名）
    @Field(type = FieldType.keyword , store = true)
    private String aliaseName;
    //	线路类型ID
    @Field(type = FieldType.keyword , store = true)
    private String proCategoryID;
    //	线路类型
    @Field(type = FieldType.keyword , store = true)
    private String proCategory;
    //	产品类型ID
    @Field(type = FieldType.keyword , store = true)
    private String proTypeID;
    //	产品类型
    @Field(type = FieldType.keyword , store = true)
    private String proType;
    //	行程天数
    @Field(type = FieldType.Integer , store = true)
    private Integer tourDays;
    //	目的地
    @Field(type = FieldType.keyword , store = true)
    private String destination;
    //	产品标签
    @Field(type = FieldType.keyword , store = true)
    private String proTag;
    //	产品封面图
    @Field(type = FieldType.keyword , store = true)
    private String coverImg;
    //	移动端封面
    @Field(type = FieldType.keyword , store = true)
    private String mobileCoverImg;
    //	星级
    @Field(type = FieldType.Integer , store = true)
    private Integer starLevel;
    //	销售范围
    @Field(type = FieldType.Integer , store = true)
    private Integer scope;
    //	销售类型
    @Field(type = FieldType.Integer , store = true)
    private Integer salesType;
    //	品牌
    @Field(type = FieldType.keyword , store = true)
    private String proBrand;
    //	是否支持电子合同
    @Field(type = FieldType.Integer , store = true)
    private Integer isSigned;
    //	是否自由模板（仅自己可见）
    @Field(type = FieldType.Integer , store = true)
    private Integer isPrivateTemplate;
    //	是否公用模板（对平台可见）
    @Field(type = FieldType.Integer , store = true)
    private Integer isCommonTemplate;
    //	线路子类型
    @Field(type = FieldType.keyword , store = true)
    private String routeSubType;
    //	线路子类型名称
    @Field(type = FieldType.keyword , store = true)
    private String routeSubTypeName;
    //	产品等级
    @Field(type = FieldType.keyword , store = true)
    private String proLevel;
    //	产品属性
    @Field(type = FieldType.Integer , store = true)
    private Integer proProp;
    //	填写方式
    @Field(type = FieldType.Integer , store = true)
    private Integer productType;
    //	供应商Id
    @Field(type = FieldType.keyword , store = true)
    private String supplierID;
    //	供应商名称
    @Field(type = FieldType.keyword , store = true)
    private String supplierName;
    //	供应商店铺域名前缀
    @Field(type = FieldType.keyword , store = true)
    private String SupplierDomain;
    //	状态
    @Field(type = FieldType.Integer , store = true)
    private Integer dataStatus;
    //	出发城市
    @Field(type = FieldType.keyword , store = true)
    private String departure;
    //	站点id
    @Field(type = FieldType.keyword , store = true)
    private String siteId;
    //	站点Name
    @Field(type = FieldType.keyword , store = true)
    private String siteName;
    //	是否促销
    @Field(type = FieldType.Integer , store = true)
    private Integer isUseDiscount;
    //	是否尾单
    @Field(type = FieldType.Integer , store = true)
    private Integer isTail;
    //	近期团次
    @Field(type = FieldType.keyword , store = true)
    private String tours;
    //	最近团次
//    @Field(type = FieldType.Date , store = true , format = DateFormat.year_month_day)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date recentlyTourDate;
    //	最远团次
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Field(type = FieldType.Date , store = true , format = DateFormat.year_month_day)
    private Date farTourDate;
    //	团次数
    @Field(type = FieldType.Integer , store = true)
    private Integer tourNum;
    //	审核状态
    @Field(type = FieldType.Integer , store = true)
    private Integer auditStatus;
    //	是否复制
    @Field(type = FieldType.Integer , store = true)
    private Integer isCopy;
    //	未审核团次数
    @Field(type = FieldType.Integer , store = true)
    private Integer notAuditTourNum;
    //	外发产品供应商类型
    @Field(type = FieldType.Integer , store = true)
    private Integer directSalesSupplierType;
    //	参考同行价
    @Field(type = FieldType.Double , store = true)
    private Double salesprice;
    //	参考直客价
    @Field(type = FieldType.Double , store = true)
    private Double directprice;
    //	参考返佣
    @Field(type = FieldType.Double , store = true)
    private Double rebatePrice;
    //	参考志愿者价
    @Field(type = FieldType.Double , store = true)
    private Double volunteerDirectPrice;
    //	参考志愿者返佣
    @Field(type = FieldType.Double , store = true)
    private Double volunteerRebatePrice;
    //	参考奖励金
    @Field(type = FieldType.Double , store = true)
    private Double travelerRewardPrice;
    //	销售量
    @Field(type = FieldType.Integer , store = true)
    private Integer salesQuantity;
    //	店铺类
    @Field(type = FieldType.Integer , store = true)
    private Integer businessTypes;
    //	有效团次数
    @Field(type = FieldType.Integer , store = true)
    private Integer validTourNum;
    //	是否过期
    @Field(type = FieldType.Integer , store = true)
    private Integer isPastDue;
    //是否更新产品
    @Field(type = FieldType.Integer , store = true)
    private Integer priceStatus;
    //	文档创建时间

    //    @Field(type = FieldType.Date , store = true , format = DateFormat.year_month_day)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
    private Date createdDate;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getOldProId() {
        return oldProId;
    }

    public void setOldProId(String oldProId) {
        this.oldProId = oldProId;
    }

    public Integer getProBasicType() {
        return proBasicType;
    }

    public void setProBasicType(Integer proBasicType) {
        this.proBasicType = proBasicType;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getShopUserId() {
        return shopUserId;
    }

    public void setShopUserId(String shopUserId) {
        this.shopUserId = shopUserId;
    }

    public String getDirectSalesSendId() {
        return directSalesSendId;
    }

    public void setDirectSalesSendId(String directSalesSendId) {
        this.directSalesSendId = directSalesSendId;
    }

    public Integer getSendNo() {
        return sendNo;
    }

    public void setSendNo(Integer sendNo) {
        this.sendNo = sendNo;
    }

    public String getSendDomain() {
        return sendDomain;
    }

    public void setSendDomain(String sendDomain) {
        this.sendDomain = sendDomain;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public String getSendTAContact() {
        return sendTAContact;
    }

    public void setSendTAContact(String sendTAContact) {
        this.sendTAContact = sendTAContact;
    }

    public String getSendTAContactMobile() {
        return sendTAContactMobile;
    }

    public void setSendTAContactMobile(String sendTAContactMobile) {
        this.sendTAContactMobile = sendTAContactMobile;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getLocalProName() {
        return localProName;
    }

    public void setLocalProName(String localProName) {
        this.localProName = localProName;
    }

    public String getAliaseName() {
        return aliaseName;
    }

    public void setAliaseName(String aliaseName) {
        this.aliaseName = aliaseName;
    }

    public String getProCategoryID() {
        return proCategoryID;
    }

    public void setProCategoryID(String proCategoryID) {
        this.proCategoryID = proCategoryID;
    }

    public String getProCategory() {
        return proCategory;
    }

    public void setProCategory(String proCategory) {
        this.proCategory = proCategory;
    }

    public String getProTypeID() {
        return proTypeID;
    }

    public void setProTypeID(String proTypeID) {
        this.proTypeID = proTypeID;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public Integer getTourDays() {
        return tourDays;
    }

    public void setTourDays(Integer tourDays) {
        this.tourDays = tourDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProTag() {
        return proTag;
    }

    public void setProTag(String proTag) {
        this.proTag = proTag;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getMobileCoverImg() {
        return mobileCoverImg;
    }

    public void setMobileCoverImg(String mobileCoverImg) {
        this.mobileCoverImg = mobileCoverImg;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public Integer getSalesType() {
        return salesType;
    }

    public void setSalesType(Integer salesType) {
        this.salesType = salesType;
    }

    public String getProBrand() {
        return proBrand;
    }

    public void setProBrand(String proBrand) {
        this.proBrand = proBrand;
    }

    public Integer getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(Integer isSigned) {
        this.isSigned = isSigned;
    }

    public Integer getIsPrivateTemplate() {
        return isPrivateTemplate;
    }

    public void setIsPrivateTemplate(Integer isPrivateTemplate) {
        this.isPrivateTemplate = isPrivateTemplate;
    }

    public Integer getIsCommonTemplate() {
        return isCommonTemplate;
    }

    public void setIsCommonTemplate(Integer isCommonTemplate) {
        this.isCommonTemplate = isCommonTemplate;
    }

    public String getRouteSubType() {
        return routeSubType;
    }

    public void setRouteSubType(String routeSubType) {
        this.routeSubType = routeSubType;
    }

    public String getRouteSubTypeName() {
        return routeSubTypeName;
    }

    public void setRouteSubTypeName(String routeSubTypeName) {
        this.routeSubTypeName = routeSubTypeName;
    }

    public String getProLevel() {
        return proLevel;
    }

    public void setProLevel(String proLevel) {
        this.proLevel = proLevel;
    }

    public Integer getProProp() {
        return proProp;
    }

    public void setProProp(Integer proProp) {
        this.proProp = proProp;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierDomain() {
        return SupplierDomain;
    }

    public void setSupplierDomain(String supplierDomain) {
        SupplierDomain = supplierDomain;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Integer getIsUseDiscount() {
        return isUseDiscount;
    }

    public void setIsUseDiscount(Integer isUseDiscount) {
        this.isUseDiscount = isUseDiscount;
    }

    public Integer getIsTail() {
        return isTail;
    }

    public void setIsTail(Integer isTail) {
        this.isTail = isTail;
    }

    public String getTours() {
        return tours;
    }

    public void setTours(String tours) {
        this.tours = tours;
    }

    public Date getRecentlyTourDate() {
        return recentlyTourDate;
    }

    public void setRecentlyTourDate(Date recentlyTourDate) {
        this.recentlyTourDate = recentlyTourDate;
    }

    public Date getFarTourDate() {
        return farTourDate;
    }

    public void setFarTourDate(Date farTourDate) {
        this.farTourDate = farTourDate;
    }

    public Integer getTourNum() {
        return tourNum;
    }

    public void setTourNum(Integer tourNum) {
        this.tourNum = tourNum;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getIsCopy() {
        return isCopy;
    }

    public void setIsCopy(Integer isCopy) {
        this.isCopy = isCopy;
    }

    public Integer getNotAuditTourNum() {
        return notAuditTourNum;
    }

    public void setNotAuditTourNum(Integer notAuditTourNum) {
        this.notAuditTourNum = notAuditTourNum;
    }

    public Integer getDirectSalesSupplierType() {
        return directSalesSupplierType;
    }

    public void setDirectSalesSupplierType(Integer directSalesSupplierType) {
        this.directSalesSupplierType = directSalesSupplierType;
    }

    public Double getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Double salesprice) {
        this.salesprice = salesprice;
    }

    public Double getDirectprice() {
        return directprice;
    }

    public void setDirectprice(Double directprice) {
        this.directprice = directprice;
    }

    public Double getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(Double rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public Double getVolunteerDirectPrice() {
        return volunteerDirectPrice;
    }

    public void setVolunteerDirectPrice(Double volunteerDirectPrice) {
        this.volunteerDirectPrice = volunteerDirectPrice;
    }

    public Double getVolunteerRebatePrice() {
        return volunteerRebatePrice;
    }

    public void setVolunteerRebatePrice(Double volunteerRebatePrice) {
        this.volunteerRebatePrice = volunteerRebatePrice;
    }

    public Double getTravelerRewardPrice() {
        return travelerRewardPrice;
    }

    public void setTravelerRewardPrice(Double travelerRewardPrice) {
        this.travelerRewardPrice = travelerRewardPrice;
    }

    public Integer getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(Integer salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public Integer getBusinessTypes() {
        return businessTypes;
    }

    public void setBusinessTypes(Integer businessTypes) {
        this.businessTypes = businessTypes;
    }

    public Integer getValidTourNum() {
        return validTourNum;
    }

    public void setValidTourNum(Integer validTourNum) {
        this.validTourNum = validTourNum;
    }

    public Integer getIsPastDue() {
        return isPastDue;
    }

    public void setIsPastDue(Integer isPastDue) {
        this.isPastDue = isPastDue;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(Integer priceStatus) {
        this.priceStatus = priceStatus;
    }
}
