/** 
 * Project Name:holyrobot-common 
 * File Name:TourPriceBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月13日 下午1:25:28 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年4月13日 下午1:25:28 
 */	
public class TourVenueBo implements Serializable{

	private static final long serialVersionUID = 6519071700464960218L;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private String tourDate;
	
	private String venue;
	
	private String collectionTime;
	
	private BigDecimal shuttlePrice;
	
	private BigDecimal dropOffPrice;

	
	
	public String getTourDate() {
		return tourDate;
	}

	public void setTourDate(String tourDate) {
		this.tourDate = tourDate;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCollectionTime() {
		return collectionTime;
	}

	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}

	public BigDecimal getShuttlePrice() {
		return shuttlePrice;
	}

	public void setShuttlePrice(BigDecimal shuttlePrice) {
		this.shuttlePrice = shuttlePrice;
	}

	public BigDecimal getDropOffPrice() {
		return dropOffPrice;
	}

	public void setDropOffPrice(BigDecimal dropOffPrice) {
		this.dropOffPrice = dropOffPrice;
	}
	
}
