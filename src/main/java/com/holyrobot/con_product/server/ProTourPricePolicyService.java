/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProTourPricePolicyService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月26日 下午5:37:33 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;

import com.holyrobot.con_product.pojo.ProTourPricepolicy;
import com.holyrobot.con_product.pojo.ProTourPricepolicyExample;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:37:33 
 */
public interface ProTourPricePolicyService {

	ProTourPricepolicy getById(String id);
	
	int save(ProTourPricepolicy price);
	
	List<ProTourPricepolicy> getByTourId(String id);
	
	List<ProTourPricepolicy> selectByExample(ProTourPricepolicyExample example);
	
	List<ProTourPricepolicy> selectByIds(List<String> ids);

}
