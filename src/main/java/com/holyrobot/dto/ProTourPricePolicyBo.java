package com.holyrobot.dto;



import com.holyrobot.con_product.pojo.ProTourPricepolicy;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @Description 返回显示订单的票价信息
 * @author 周相儒
 * @date 2018年4月24日 下午1:54:18
 */
public class ProTourPricePolicyBo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String peoplenum;
	
	private BigDecimal calcprice;
	
	private ProTourPricepolicy proTourPricePolicy;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPeoplenum() {
		return peoplenum;
	}

	public void setPeoplenum(String peoplenum) {
		this.peoplenum = peoplenum;
	}
    
    
	public BigDecimal getCalcprice() {
		return calcprice;
	}

	public void setCalcprice(BigDecimal calcprice) {
		this.calcprice = calcprice;
	}

	public ProTourPricepolicy getProTourPricePolicy() {
		return proTourPricePolicy;
	}

	public void setProTourPricePolicy(ProTourPricepolicy proTourPricePolicy) {
		this.proTourPricePolicy = proTourPricePolicy;
	}
	
	
	
	
}
