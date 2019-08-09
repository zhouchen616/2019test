/** 
 * Project Name:holyrobot-common 
 * File Name:CustomFormParam.java 
 * Package Name:com.jingjie.vo 
 * Date:2018年4月26日 下午5:11:01 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import java.io.Serializable;

/**
 * @Description: 定制游提交form表单
 * @author 汤玉林
 * @date 2018年4月26日 下午5:11:01 
 */
public class CustomFormParam implements Serializable{

	private static final long serialVersionUID = 6998612099648546611L;
	
	private int custype;
	
	private String departure;
	
	private String destination;
	
	private String tourDate;
	
	private String adultNum;
	
	private String childNum;
	
	private String budget;
	
	private String serviceNames;
	
	private String otherRequire;
	
	private String travellerName;
	
	private String mobile;
	
	private String email;
	
	private String wechat;

	public int getCustype() {
		return custype;
	}

	public void setCustype(int custype) {
		this.custype = custype;
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

	public String getTourDate() {
		return tourDate;
	}

	public void setTourDate(String tourDate) {
		this.tourDate = tourDate;
	}

	public String getAdultNum() {
		return adultNum;
	}

	public void setAdultNum(String adultNum) {
		this.adultNum = adultNum;
	}

	public String getChildNum() {
		return childNum;
	}

	public void setChildNum(String childNum) {
		this.childNum = childNum;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getServiceNames() {
		return serviceNames;
	}

	public void setServiceNames(String serviceNames) {
		this.serviceNames = serviceNames;
	}

	public String getOtherRequire() {
		return otherRequire;
	}

	public void setOtherRequire(String otherRequire) {
		this.otherRequire = otherRequire;
	}

	public String getTravellerName() {
		return travellerName;
	}

	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	
}
