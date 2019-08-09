/** 
 * Project Name:holyrobot-search-service 
 * File Name:ProductScheduleImageServiceImpl.java 
 * Package Name:com.jingjie.service.impl 
 * Date:2018年3月26日 下午5:44:07 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProProductScheduleImageMapper;
import com.holyrobot.con_product.pojo.ProProductScheduleImage;
import com.holyrobot.con_product.server.ProductScheduleImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:44:07 
 */
@Service
public class ProductScheduleImageServiceImpl implements ProductScheduleImageService {

	@Autowired
	ProProductScheduleImageMapper scheduleImageMapper;
	
	@Override
	public ProProductScheduleImage getById(String id) {
		ProProductScheduleImage selectByPrimaryKey = scheduleImageMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	
	@Override
	public int save(ProProductScheduleImage image) {
		int insertSelective = scheduleImageMapper.insertSelective(image);
		return insertSelective;
	}

	
}
