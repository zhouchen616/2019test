package com.holyrobot.dto;

import com.holyrobot.response.ProductListResponse;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @Description: 产品列表查询返回值封装对象
 * @author 周陈
 * @date 2018年4月19日 下午3:17:19
 */
public class ProductListResponseVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<ProductListResponse> productListResponses ;
	
	private long size;

	public List<ProductListResponse> getProductListResponses() {
		return productListResponses;
	}

	public void setProductListResponses(List<ProductListResponse> productListResponses) {
		this.productListResponses = productListResponses;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
	
}
