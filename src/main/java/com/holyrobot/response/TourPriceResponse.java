/** 
 * Project Name:holyrobot-common 
 * File Name:TourPriceResponse.java 
 * Package Name:com.jingjie.common.response 
 * Date:2018年3月29日 上午10:01:07 
 * author 汤玉林
 */ 
package com.holyrobot.response;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月29日 上午10:01:07 
 */
public class TourPriceResponse implements Serializable{

	private static final long serialVersionUID = 384680219279032015L;

	private int touristType;
	
	private String policyName;
	
	private BigDecimal salesPrice;
	
	private BigDecimal rebatePrice;

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
	
	
}
