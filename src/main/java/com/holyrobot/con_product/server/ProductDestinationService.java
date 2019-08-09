/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProductDestinationService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月26日 下午6:54:37 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;


import com.holyrobot.con_product.pojo.ProProductDestination;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午6:54:37 
 */
public interface ProductDestinationService {

	ProProductDestination getById(String id);

	int save(ProProductDestination destination);

	ProProductDestination getByProId(String id);
}
