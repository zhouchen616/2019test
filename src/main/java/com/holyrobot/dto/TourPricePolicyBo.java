/** 
 * Project Name:holyrobot-common 
 * File Name:TourPricePolicyBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月13日 下午1:58:56 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年4月13日 下午1:58:56 
 */
public class TourPricePolicyBo implements Serializable{

	private static final long serialVersionUID = -2600097011075605799L;

	private String id;
	
	private int touristType;
	
	private String policyName;
	
	private BigDecimal salesPrice;
	
	private BigDecimal rebatePrice;
	
	private BigDecimal singleRoomPrice;
	
	private BigDecimal proCost;
	
	private boolean def;
	
	private boolean seat;
	
	private int orderIndex;

	private BigDecimal directPrice;

	private boolean isUseDiscount; //是否有优惠，默认未使用, 0：没有 1：有

	private BigDecimal beforeDiscountSalesPrice; //优惠前分销价

	private BigDecimal discountDirectPrice; //直客优惠金额

	private BigDecimal beforeDiscountDirectPrice; //优惠前直客价

	private BigDecimal discountSalesPrice; //分销优惠金额

	private BigDecimal discountValue; //优惠值
	private BigDecimal volunteerDirectPrice; //志愿者售价
	private BigDecimal volunteerRebatePrice; //返佣
	private BigDecimal volunteerSalesPrice; //优惠值

	private int discountType; //优惠类型 1：直降，2：优惠百分比

	private BigDecimal travelerRewardPrice;//奖励金

	public BigDecimal getTravelerRewardPrice() {
		return travelerRewardPrice;
	}

	public void setTravelerRewardPrice(BigDecimal travelerRewardPrice) {
		this.travelerRewardPrice = travelerRewardPrice == null ? new BigDecimal(0) : travelerRewardPrice;
	}

	public BigDecimal getVolunteerDirectPrice() {
		return volunteerDirectPrice;
	}

	public void setVolunteerDirectPrice(BigDecimal volunteerDirectPrice) {
		this.volunteerDirectPrice = volunteerDirectPrice;
	}

	public BigDecimal getVolunteerRebatePrice() {
		return volunteerRebatePrice;
	}

	public void setVolunteerRebatePrice(BigDecimal volunteerRebatePrice) {
		this.volunteerRebatePrice = volunteerRebatePrice;
	}

	public BigDecimal getVolunteerSalesPrice() {
		return volunteerSalesPrice;
	}

	public void setVolunteerSalesPrice(BigDecimal volunteerSalesPrice) {
		this.volunteerSalesPrice = volunteerSalesPrice;
	}

	public boolean isUseDiscount() {
		return isUseDiscount;
	}

	public void setUseDiscount(boolean useDiscount) {
		isUseDiscount = useDiscount;
	}

	public BigDecimal getBeforeDiscountSalesPrice() {
		return beforeDiscountSalesPrice;
	}

	public void setBeforeDiscountSalesPrice(BigDecimal beforeDiscountSalesPrice) {
		this.beforeDiscountSalesPrice = beforeDiscountSalesPrice;
	}

	public BigDecimal getDiscountDirectPrice() {
		return discountDirectPrice;
	}

	public void setDiscountDirectPrice(BigDecimal discountDirectPrice) {
		this.discountDirectPrice = discountDirectPrice;
	}

	public BigDecimal getBeforeDiscountDirectPrice() {
		return beforeDiscountDirectPrice;
	}

	public void setBeforeDiscountDirectPrice(BigDecimal beforeDiscountDirectPrice) {
		this.beforeDiscountDirectPrice = beforeDiscountDirectPrice;
	}

	public BigDecimal getDiscountSalesPrice() {
		return discountSalesPrice;
	}

	public void setDiscountSalesPrice(BigDecimal discountSalesPrice) {
		this.discountSalesPrice = discountSalesPrice;
	}

	public BigDecimal getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(BigDecimal discountValue) {
		this.discountValue = discountValue;
	}

	public int getDiscountType() {
		return discountType;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	public BigDecimal getDirectPrice() {
		return directPrice;
	}

	public void setDirectPrice(BigDecimal directPrice) {
		this.directPrice = directPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTouristType() {
		return touristType;
	}

	public void setTouristType(int touristType) {
		this.touristType = touristType;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
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

	public BigDecimal getSingleRoomPrice() {
		return singleRoomPrice;
	}

	public void setSingleRoomPrice(BigDecimal singleRoomPrice) {
		this.singleRoomPrice = singleRoomPrice;
	}

	public BigDecimal getProCost() {
		return proCost;
	}

	public void setProCost(BigDecimal proCost) {
		this.proCost = proCost;
	}

	public boolean isDef() {
		return def;
	}

	public void setDef(boolean def) {
		this.def = def;
	}

	public boolean isSeat() {
		return seat;
	}

	public void setSeat(boolean seat) {
		this.seat = seat;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}
	
	
}
