package com.holyrobot.response;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 供应商页面数据展示实体
 * @author 周陈
 * @date 2018年4月28日 下午1:59:17
 */

public class SupplierShopResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 线路类型
	 */
	private String proType;
	
	/**
	 * 供应商
	 */
	private String travelName;
	/**
	 * ES商品数据
	 */
	private List<ProductListResponse> productListResponses;
	
	

	public String getTravelName() {
		return travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public List<ProductListResponse> getProductListResponses() {
		return productListResponses;
	}

	public void setProductListResponses(List<ProductListResponse> productListResponses) {
		this.productListResponses = productListResponses;
	}

}
