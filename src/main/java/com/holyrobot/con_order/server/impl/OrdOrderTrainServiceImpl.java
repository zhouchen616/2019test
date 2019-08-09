package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderTrainMapper;
import com.holyrobot.con_order.server.OrdOrderTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName： OrdOrderTrainServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-10-23 10:35
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderTrainServiceImpl implements OrdOrderTrainService {

    @Autowired
    private OrdOrderTrainMapper ordOrderTrainMapper;
    
    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 10:36 2018-10-23
     * @param: [orderId]
     * @return: int
     *
     */
    @Override
    public int updateDataStatusByOrderId(String orderId) {
        return ordOrderTrainMapper.updateDataStatusByOrderId(orderId);
    }
}
