package com.holyrobot.response;

import java.io.Serializable;

/**
 * 
 * @Description: 产品列表响应实体
 * @author 周陈
 * @date 2018年4月13日 上午9:17:23
 */
public class ProductListResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private String iD;

	private String proTypeID;

	private String proType;

	private String proCategoryID;

	private String proCategory;

	private String proName;

	private String aliaseName;

	private String proNo;

	private Integer tourDays;

	private String startDate;

	private String dueDate;

	private String departure;

	private String destination;

	private String proTag;

	private String feature;

	private String feeIncludes;

	private String feeNonIncludes;

	private String travelName;

	private String brandName;

	private Double defaultPrice;

	private Integer isAck;

	private String lineid;

	private String siteid;

	private String sitename;

	private Double price;

	private Double singleroomprice;

	private Double rebate;
	
	private String coverImg;

	

	@Override
	public String toString() {
		return "ProductListResponse [iD=" + iD + ", proTypeID=" + proTypeID + ", proType=" + proType
				+ ", proCategoryID=" + proCategoryID + ", proCategory=" + proCategory + ", proName=" + proName
				+ ", aliaseName=" + aliaseName + ", proNo=" + proNo + ", tourDays=" + tourDays + ", startDate="
				+ startDate + ", dueDate=" + dueDate + ", departure=" + departure + ", destination=" + destination
				+ ", proTag=" + proTag + ", feature=" + feature + ", feeIncludes=" + feeIncludes + ", feeNonIncludes="
				+ feeNonIncludes + ", travelName=" + travelName + ", brandName=" + brandName + ", defaultPrice="
				+ defaultPrice + ", isAck=" + isAck + ", lineid=" + lineid + ", siteid=" + siteid + ", sitename="
				+ sitename + ", price=" + price + ", singleroomprice=" + singleroomprice + ", rebate=" + rebate
				+ ", coverImg=" + coverImg + "]";
	}

	public String getCoverImg() {
		return coverImg;
	}

	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
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

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getAliaseName() {
		return aliaseName;
	}

	public void setAliaseName(String aliaseName) {
		this.aliaseName = aliaseName;
	}

	public String getProNo() {
		return proNo;
	}

	public void setProNo(String proNo) {
		this.proNo = proNo;
	}

	public Integer getTourDays() {
		return tourDays;
	}

	public void setTourDays(Integer tourDays) {
		this.tourDays = tourDays;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate.replace("T", " ");
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate.replace("T", " ");
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

	public String getProTag() {
		return proTag;
	}

	public void setProTag(String proTag) {
		this.proTag = proTag;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeeIncludes() {
		return feeIncludes;
	}

	public void setFeeIncludes(String feeIncludes) {
		this.feeIncludes = feeIncludes;
	}

	public String getFeeNonIncludes() {
		return feeNonIncludes;
	}

	public void setFeeNonIncludes(String feeNonIncludes) {
		this.feeNonIncludes = feeNonIncludes;
	}

	public String getTravelName() {
		return travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(Double defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public Integer getIsAck() {
		return isAck;
	}

	public void setIsAck(Integer isAck) {
		this.isAck = isAck;
	}

	public String getLineid() {
		return lineid;
	}

	public void setLineid(String lineid) {
		this.lineid = lineid;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSingleroomprice() {
		return singleroomprice;
	}

	public void setSingleroomprice(Double singleroomprice) {
		this.singleroomprice = singleroomprice;
	}

	public Double getRebate() {
		return rebate;
	}

	public void setRebate(Double rebate) {
		this.rebate = rebate;
	}

}
