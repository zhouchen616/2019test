/** 
 * Project Name:holyrobot-common 
 * File Name:ProTourResponse.java 
 * Package Name:com.jingjie.common.response 
 * Date:2018年3月29日 上午9:51:17 
 * author 汤玉林
 */ 
package com.holyrobot.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description: 团期响应类
 * @author 汤玉林
 * @date 2018年3月29日 上午9:51:17 
 */
public class ProTourResponse implements Serializable{

	private static final long serialVersionUID = 6956402071101422854L;

	private String tourNo;
	
	private String tourName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
	private Date tourDate;
	
	private BigDecimal marketPrice;
	
	List<TourPriceResponse> priceList;

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

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public List<TourPriceResponse> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<TourPriceResponse> priceList) {
		this.priceList = priceList;
	}
	
	
}
