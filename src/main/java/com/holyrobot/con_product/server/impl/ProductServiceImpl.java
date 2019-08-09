package com.holyrobot.con_product.server.impl;

import com.holyrobot.dto.ProductScheduleBo;
import com.holyrobot.con_product.mapper.ProProductMapper;
import com.holyrobot.con_product.mapper.ProProductScheduleImageMapper;
import com.holyrobot.con_product.pojo.ProProduct;
import com.holyrobot.con_product.pojo.ProProductScheduleImage;
import com.holyrobot.con_product.pojo.ProProductScheduleImageExample;
import com.holyrobot.con_product.server.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: 产品实现类
 * @CreateDate: 2018/5/15 14:17
 * @Version: 1.0
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProProductMapper productMapper;
    @Autowired
    private ProProductScheduleImageMapper proProductScheduleImageMapper;


    @Override
    public ProProduct getById(String id) {
        ProProduct selectByPrimaryKey = productMapper.selectByPrimaryKey(id);
        return selectByPrimaryKey;
    }


    @Override
    public int save(ProProduct product) {
        productMapper.insertSelective(product);
        return 0;
    }


    @Override
    public List<ProductScheduleBo> listProSchedule(String id) {
        List<ProductScheduleBo> listProSchedule = productMapper.listProSchedule(id);
        return listProSchedule;
    }

    @Override
    public List<ProProductScheduleImage> getByProId(ProProductScheduleImageExample example) {
        return proProductScheduleImageMapper.selectByExampleWithBLOBs(example);
    }

    /**
     * @Description: 新增字段 查询
     * @auther: 史迪旻
     * @date: 9:23 2019-5-10
     * @param: [proId]
     * @return: com.holyrobot.con_product.pojo.ProProduct
     */
    @Override
    public ProProduct newGetById(String proId) {
        ProProduct proProduct = productMapper.newGetById(proId);
        return proProduct;
    }
}
