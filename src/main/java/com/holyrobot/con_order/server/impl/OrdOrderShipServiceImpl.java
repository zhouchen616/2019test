package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderShipMapper;
import com.holyrobot.con_order.server.OrdOrderShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName： OrdOrderShipServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-10-23 10:44
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderShipServiceImpl implements OrdOrderShipService {

    @Autowired
    private OrdOrderShipMapper ordOrderShipMapper;

    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 10:45 2018-10-23
     * @param: [orderId]
     * @return: int
     *
     */
    @Override
    public int updateDataStatusByOrderId(String orderId) {
        return ordOrderShipMapper.updateDataStatusByOrderId(orderId);
    }
}
