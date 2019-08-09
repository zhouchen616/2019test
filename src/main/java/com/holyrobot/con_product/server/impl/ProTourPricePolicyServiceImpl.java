/**
 * Project Name:holyrobot-search-service
 * File Name:ProTourPricePolicyServiceImpl.java
 * Package Name:com.jingjie.service.impl
 * Date:2018年3月26日 下午5:39:01
 * author 汤玉林
 */
package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProTourPricepolicyMapper;
import com.holyrobot.con_product.pojo.ProTourPricepolicy;
import com.holyrobot.con_product.pojo.ProTourPricepolicyExample;
import com.holyrobot.con_product.server.ProTourPricePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:39:01 
 */
@Service
public class ProTourPricePolicyServiceImpl implements ProTourPricePolicyService {

    @Autowired
    ProTourPricepolicyMapper priceMapper;

    @Override
    public ProTourPricepolicy getById(String id) {
        ProTourPricepolicy selectByPrimaryKey = priceMapper.selectByPrimaryKey(id);
        return selectByPrimaryKey;
    }


    @Override
    public int save(ProTourPricepolicy price) {
        int insertSelective = priceMapper.insertSelective(price);
        return insertSelective;
    }


    @Override
    public List<ProTourPricepolicy> getByTourId(String id) {
        ProTourPricepolicyExample example = new ProTourPricepolicyExample();
        example.createCriteria().andTouridEqualTo(id);
        example.setOrderByClause("touristType asc");
        List<ProTourPricepolicy> selectByExample = priceMapper.selectByExample(example);
        return selectByExample;
    }


    @Override
    public List<ProTourPricepolicy> selectByExample(
            ProTourPricepolicyExample example) {
        List<ProTourPricepolicy> selectByExample = priceMapper.selectByExample(example);
        return selectByExample;
    }


    @Override
    public List<ProTourPricepolicy> selectByIds(List<String> ids) {
        return priceMapper.selectByIds(ids);
    }


}
