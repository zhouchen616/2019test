/** 
 * Project Name:holyrobot-search-service 
 * File Name:ProTourVenueServiceImpl.java 
 * Package Name:com.jingjie.service.impl 
 * Date:2018年3月26日 下午5:46:56 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProTourVenueMapper;
import com.holyrobot.con_product.pojo.ProTourVenue;
import com.holyrobot.con_product.pojo.ProTourVenueExample;
import com.holyrobot.con_product.server.ProTourVenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:46:56 
 */
@Service
public class ProTourVenueServiceImpl implements ProTourVenueService {

	@Autowired
	ProTourVenueMapper venueMapper;
	
	@Override
	public ProTourVenue getById(String id) {
		ProTourVenue selectByPrimaryKey = venueMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	
	@Override
	public int save(ProTourVenue venue) {
		int insertSelective = venueMapper.insertSelective(venue);
		return insertSelective;
	}

	
	@Override
	public ProTourVenue getByTourId(String id) {
		ProTourVenueExample example = new ProTourVenueExample();
		example.createCriteria().andTouridEqualTo(id);
		List<ProTourVenue> selectByExample = venueMapper.selectByExample(example);
		return selectByExample.get(0);
	}

	@Override
	public List<ProTourVenue> get(ProTourVenueExample example) {
		return venueMapper.selectByExample(example);
	}


}
