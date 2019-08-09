package com.holyrobot.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ProTourPricePolicysShowBo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private BigDecimal totalPrice;

	private List<ProTourPricePolicyBo> proTourPricePolicyBo;
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<ProTourPricePolicyBo> getProTourPricePolicyBo() {
		return proTourPricePolicyBo;
	}

	public void setProTourPricePolicyBo(List<ProTourPricePolicyBo> proTourPricePolicyBo) {
		this.proTourPricePolicyBo = proTourPricePolicyBo;
	}

	

}
