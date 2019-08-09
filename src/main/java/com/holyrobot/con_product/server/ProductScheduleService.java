/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProductScheduleService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月26日 下午5:40:48 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;

import com.holyrobot.con_product.pojo.ProProductSchedule;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:40:48 
 */
public interface ProductScheduleService {

	List<ProProductSchedule> getByProId(String id);
	
	int save(ProProductSchedule schedule);
	
	
}
