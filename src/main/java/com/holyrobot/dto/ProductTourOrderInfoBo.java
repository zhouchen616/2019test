/** 
 * Project Name:holyrobot-common 
 * File Name:ProductOrderInfoBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月17日 上午9:33:19 
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
 * @date 2018年4月17日 上午9:33:19 
 */
public class ProductTourOrderInfoBo implements Serializable{

	private static final long serialVersionUID = 3251157088290988307L;

	private String orderName;
	
	private int scheduleDays;
	
	private int category;
	
	private int orderType;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date tourDate;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date returnDate;
	
	private String depName;
	
	private String destName;
	
	private String orderNo;
	
	private String customerUnitId;
	
	private String customerName;
	
	private String orderSourceId;
	
	private String orderSource;
	
	private String contact;
	
	private String mobile;
	
	private int dataStatus;
	
	private int hasAirTicket;
	
	private BigDecimal adjustAmt;
	
	private BigDecimal receivableAmt;
	
	private BigDecimal payableAmt;
	
	private int adultNum;
	
	private int childNum;
	
	private int guideNum;
	
	private String comment;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getScheduleDays() {
		return scheduleDays;
	}

	public void setScheduleDays(int scheduleDays) {
		this.scheduleDays = scheduleDays;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public Date getTourDate() {
		return tourDate;
	}

	public void setTourDate(Date tourDate) {
		this.tourDate = tourDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCustomerUnitId() {
		return customerUnitId;
	}

	public void setCustomerUnitId(String customerUnitId) {
		this.customerUnitId = customerUnitId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderSourceId() {
		return orderSourceId;
	}

	public void setOrderSourceId(String orderSourceId) {
		this.orderSourceId = orderSourceId;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(int dataStatus) {
		this.dataStatus = dataStatus;
	}

	public int getHasAirTicket() {
		return hasAirTicket;
	}

	public void setHasAirTicket(int hasAirTicket) {
		this.hasAirTicket = hasAirTicket;
	}

	public BigDecimal getAdjustAmt() {
		return adjustAmt;
	}

	public void setAdjustAmt(BigDecimal adjustAmt) {
		this.adjustAmt = adjustAmt;
	}

	public BigDecimal getReceivableAmt() {
		return receivableAmt;
	}

	public void setReceivableAmt(BigDecimal receivableAmt) {
		this.receivableAmt = receivableAmt;
	}

	public BigDecimal getPayableAmt() {
		return payableAmt;
	}

	public void setPayableAmt(BigDecimal payableAmt) {
		this.payableAmt = payableAmt;
	}

	public int getAdultNum() {
		return adultNum;
	}

	public void setAdultNum(int adultNum) {
		this.adultNum = adultNum;
	}

	public int getChildNum() {
		return childNum;
	}

	public void setChildNum(int childNum) {
		this.childNum = childNum;
	}

	public int getGuideNum() {
		return guideNum;
	}

	public void setGuideNum(int guideNum) {
		this.guideNum = guideNum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
