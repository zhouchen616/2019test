/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProductScheduleImageService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月26日 下午5:43:26 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;


import com.holyrobot.con_product.pojo.ProProductScheduleImage;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:43:26 
 */
public interface ProductScheduleImageService {
	
	ProProductScheduleImage getById(String id);
	
	int save(ProProductScheduleImage image);
}
