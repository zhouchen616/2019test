/** 
 * Project Name:holyrobot-common 
 * File Name:ProductBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月13日 下午2:36:19 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import com.holyrobot.bo.ModifyProductBo;
import com.holyrobot.con_product.pojo.ProTourVenue;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年4月13日 下午2:36:19 
 */
public class ProductBo implements Serializable{

	private static final long serialVersionUID = -57963748890044989L;

	/*单房差*/

	private BigDecimal singleRoomPrice;

	/*产品相关信息*/
    private ModifyProductBo proProduct;

    /*大交通相关信息*/
    private List<FlightInfoDto> flightInfodto ;

    /*接送设置相关信息*/
	private List<ProTourVenue> proTourVenues;

    /*酒店相关信息（暂时没有表）*/


	//	整合大交通全部信息
	private List<TrafficDto> trafficDto;



	public List<TrafficDto> getTrafficDto() {
		return trafficDto;
	}

	public void setTrafficDto(List<TrafficDto> trafficDto) {
		this.trafficDto = trafficDto;
	}

	public BigDecimal getSingleRoomPrice() {
		return singleRoomPrice;
	}

	public void setSingleRoomPrice(BigDecimal singleRoomPrice) {
		this.singleRoomPrice = singleRoomPrice;
	}

	public ModifyProductBo getProProduct() {
		return proProduct;
	}

	public void setProProduct(ModifyProductBo proProduct) {
		this.proProduct = proProduct;
	}

	public List<FlightInfoDto> getFlightInfodto() {
		return flightInfodto;
	}

	public void setFlightInfodto(List<FlightInfoDto> flightInfodto) {
		this.flightInfodto = flightInfodto;
	}

	public List<ProTourVenue> getProTourVenues() {
		return proTourVenues;
	}

	public void setProTourVenues(List<ProTourVenue> proTourVenues) {
		this.proTourVenues = proTourVenues;
	}
}
