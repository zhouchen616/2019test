/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProTourVenueService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月26日 下午5:46:20 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;

import com.holyrobot.con_product.pojo.ProTourVenue;
import com.holyrobot.con_product.pojo.ProTourVenueExample;

import java.util.List;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:46:20 
 */
public interface ProTourVenueService {

	ProTourVenue getById(String id);
	
	int save(ProTourVenue venue);
	
	ProTourVenue getByTourId(String id);

	List<ProTourVenue> get(ProTourVenueExample example);
}
