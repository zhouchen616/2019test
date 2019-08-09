/** 
 * Project Name:holyrobot-common 
 * File Name:TourInfoVo.java 
 * Package Name:com.jingjie.vo.product 
 * Date:2018年4月16日 下午4:27:08 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年4月16日 下午4:27:08 
 */
public class TourInfoVo implements Serializable{

	private static final long serialVersionUID = -6877348664140254609L;
	
	private TourBo tourInfo;//团期信息
	
	private BigDecimal tourPrice;//团期价格
	
	private int stock;//产品库存
	
	private List<TourPricePolicyBo> pricePolicyList;//团期价格列表

	
	public TourBo getTourInfo() {
		return tourInfo;
	}

	public void setTourInfo(TourBo tourInfo) {
		this.tourInfo = tourInfo;
	}

	public BigDecimal getTourPrice() {
		return tourPrice;
	}

	public void setTourPrice(BigDecimal tourPrice) {
		this.tourPrice = tourPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<TourPricePolicyBo> getPricePolicyList() {
		return pricePolicyList;
	}

	public void setPricePolicyList(List<TourPricePolicyBo> pricePolicyList) {
		this.pricePolicyList = pricePolicyList;
	}
	
	
	
	
	
}
