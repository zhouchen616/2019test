package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderBusMapper;
import com.holyrobot.con_order.server.OrdOrderBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName： OrdOrderBusServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-10-23 10:40
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderBusServiceImpl implements OrdOrderBusService {

    @Autowired
    private OrdOrderBusMapper ordOrderBusMapper;
    
    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 10:41 2018-10-23
     * @param: [orderId]
     * @return: int
     *
     */
    @Override
    public int updateDataStatusByOrderId(String orderId) {
        return ordOrderBusMapper.updateDataStatusByOrderId(orderId);
    }
}
