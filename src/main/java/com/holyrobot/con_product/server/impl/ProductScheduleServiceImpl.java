/** 
 * Project Name:holyrobot-search-service 
 * File Name:ProductScheduleServiceImpl.java 
 * Package Name:com.jingjie.service.impl 
 * Date:2018年3月26日 下午5:41:26 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProProductScheduleMapper;
import com.holyrobot.con_product.pojo.ProProductSchedule;
import com.holyrobot.con_product.pojo.ProProductScheduleExample;
import com.holyrobot.con_product.server.ProductScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:41:26 
 */
@Service
public class ProductScheduleServiceImpl implements ProductScheduleService {

	
	@Autowired
	ProProductScheduleMapper scheduleMapper;
	
	@Override
	public List<ProProductSchedule> getByProId(String id) {
		ProProductScheduleExample example = new ProProductScheduleExample();
		example.createCriteria().andProidEqualTo(id);
		example.setOrderByClause("schDay asc");
		List<ProProductSchedule> scheduleList = scheduleMapper.selectByExample(example);
		return scheduleList;
	}

	
	@Override
	public int save(ProProductSchedule schedule) {
		int insertSelective = scheduleMapper.insertSelective(schedule);
		return insertSelective;
	}


	

}
