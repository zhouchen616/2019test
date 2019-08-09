/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProductService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月23日 下午5:50:50 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;

import com.holyrobot.dto.ProductScheduleBo;
import com.holyrobot.con_product.pojo.ProProduct;
import com.holyrobot.con_product.pojo.ProProductScheduleImage;
import com.holyrobot.con_product.pojo.ProProductScheduleImageExample;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月23日 下午5:50:50 
 */
public interface ProductService {

	ProProduct getById(String id);
	
	int save(ProProduct product);
	
	List<ProductScheduleBo> listProSchedule(String id);

	List<ProProductScheduleImage> getByProId(ProProductScheduleImageExample example);

	ProProduct newGetById(String proId);
}
