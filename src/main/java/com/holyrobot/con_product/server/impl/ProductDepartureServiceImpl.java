package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProProductDepartureMapper;
import com.holyrobot.con_product.pojo.ProProductDeparture;
import com.holyrobot.con_product.pojo.ProProductDepartureExample;
import com.holyrobot.con_product.server.ProductDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/16 15:46
 * @Version: 1.0
 */

@Service
public class ProductDepartureServiceImpl implements ProductDepartureService {

    @Autowired
    private ProProductDepartureMapper proProductDepartureMapper;

    @Override
    public List<ProProductDeparture> getDeparture(ProProductDepartureExample example) {
        return proProductDepartureMapper.selectByExample(example);
    }
}
