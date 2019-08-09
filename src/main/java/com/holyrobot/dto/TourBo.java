/** 
 * Project Name:holyrobot-common 
 * File Name:TourBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月16日 下午4:18:49 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年4月16日 下午4:18:49 
 */
public class TourBo implements Serializable {

	private static final long serialVersionUID = 6849131620224480061L;
	private int isMore=0;
	private String id;
	
	private String tourNo;
	
	private String tourName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date tourDate;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date dueDate;
	
	private int planNum;
	
	private int minNum;
	
	private int seatNum;

	private int tourStatus;

	private String refDepFlight;

	private String refBackFlight;

	private BigDecimal salesPrice;//分销价

	private int stock;//库存

	private BigDecimal directPrice;//直客价

	private Integer isAck; //是否及时确认

	private Integer hasTraffic;//是否含有大交通

	private Integer tailAuditStatus;//尾单审核状态

	private Integer isTail;//是否尾单

	private boolean isUseDiscount; //是否有优惠，默认未使用, 0：没有 1：有

	private BigDecimal beforeDiscountSalesPrice; //优惠前分销价

	private BigDecimal discountDirectPrice; //直客优惠金额

	private BigDecimal beforeDiscountDirectPrice; //优惠前直客价

	private BigDecimal discountSalesPrice; //分销优惠金额

	private BigDecimal discountValue; //优惠值

	private int discountType; //优惠类型 1：直降，2：优惠百分比

	private BigDecimal volunteerDirectPrice; //志愿者售价
	private BigDecimal volunteerRebatePrice; //返佣
	private BigDecimal volunteerSalesPrice; //优惠值

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

	public int getIsMore() {
		return isMore;
	}

	public void setIsMore(int isMore) {
		this.isMore = isMore;
	}

	public int getDiscountType() {
		return discountType;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
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

	public String getRefDepFlight() {
		return refDepFlight;
	}

	public void setRefDepFlight(String refDepFlight) {
		this.refDepFlight = refDepFlight;
	}

	public String getRefBackFlight() {
		return refBackFlight;
	}

	public void setRefBackFlight(String refBackFlight) {
		this.refBackFlight = refBackFlight;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
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

	public String getTourNo() {
		return tourNo;
	}

	public void setTourNo(String tourNo) {
		this.tourNo = tourNo;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public Date getTourDate() {
		return tourDate;
	}

	public void setTourDate(Date tourDate) {
		this.tourDate = tourDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public int getPlanNum() {
		return planNum;
	}

	public void setPlanNum(int planNum) {
		this.planNum = planNum;
	}

	public int getMinNum() {
		return minNum;
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public int getTourStatus() {
		return tourStatus;
	}

	public void setTourStatus(int tourStatus) {
		this.tourStatus = tourStatus;
	}

	public Integer getIsAck() {
		return isAck;
	}

	public void setIsAck(Integer isAck) {
		this.isAck = isAck;
	}

	public Integer getHasTraffic() {
		return hasTraffic;
	}

	public void setHasTraffic(Integer hasTraffic) {
		this.hasTraffic = hasTraffic;
	}

	public Integer getTailAuditStatus() {
		return tailAuditStatus;
	}

	public void setTailAuditStatus(Integer tailAuditStatus) {
		this.tailAuditStatus = tailAuditStatus;
	}

	public Integer getIsTail() {
		return isTail;
	}

	public void setIsTail(Integer isTail) {
		this.isTail = isTail;
	}
}
