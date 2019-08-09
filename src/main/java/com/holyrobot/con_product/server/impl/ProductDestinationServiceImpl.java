/** 
 * Project Name:holyrobot-search-service 
 * File Name:ProductDestinationServiceImpl.java 
 * Package Name:com.jingjie.service.impl 
 * Date:2018年3月26日 下午6:55:12 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProProductDestinationMapper;
import com.holyrobot.con_product.pojo.ProProductDestination;
import com.holyrobot.con_product.pojo.ProProductDestinationExample;
import com.holyrobot.con_product.server.ProductDestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午6:55:12 
 */
@Service
public class ProductDestinationServiceImpl implements ProductDestinationService {

	@Autowired
	ProProductDestinationMapper destinationMapper;
	
	@Override
	public ProProductDestination getById(String id) {
		ProProductDestination selectByPrimaryKey = destinationMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	
	@Override
	public int save(ProProductDestination destination) {
		int insertSelective = destinationMapper.insertSelective(destination);
		return insertSelective;
	}


	
	@Override
	public ProProductDestination getByProId(String id) {
		ProProductDestinationExample example = new ProProductDestinationExample();
		example.createCriteria().andProidEqualTo(id);
		List<ProProductDestination> selectByExample = destinationMapper.selectByExample(example);
		return selectByExample.size()>0?selectByExample.get(0):null;
	}

}
