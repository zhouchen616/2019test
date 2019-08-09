package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_product.mapper.ProProductStoreImageMapper;
import com.holyrobot.con_product.pojo.ProProductStoreImage;
import com.holyrobot.con_product.pojo.ProProductStoreImageExample;
import com.holyrobot.con_product.server.ProProductStoreImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName： ProProductStoreImageServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-12-3 10:29
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class ProProductStoreImageServiceImpl implements ProProductStoreImageService {

    @Autowired
    private ProProductStoreImageMapper proProductStoreImageMapper;

    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 10:41 2018-12-3
     * @param: [proId]
     * @return: java.util.List<com.holyrobot.con_product.pojo.ProProductStoreImage>
     *
     */
    @Override
    public List<ProProductStoreImage> findByProId(String proId) {
        ProProductStoreImageExample example = new ProProductStoreImageExample();
        example.or().andProductidEqualTo(proId);
        List<ProProductStoreImage> proProductStoreImages = proProductStoreImageMapper.selectByExample(example);

        return proProductStoreImages;
    }
}
