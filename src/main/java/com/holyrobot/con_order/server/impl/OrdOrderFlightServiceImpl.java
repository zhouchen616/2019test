package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderFlightMapper;
import com.holyrobot.con_order.server.OrdOrderFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @ClassName： OrdOrderFlightServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-10-23 10:04
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderFlightServiceImpl implements OrdOrderFlightService {

    @Autowired
    private OrdOrderFlightMapper ordOrderFlightMapper;

    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 10:06 2018-10-23
     * @param: [orderId]
     * @return: java.util.List<com.holyrobot.con_order.pojo.OrdOrderFlight>
     *
     */
    @Override
    public int updateDataStatusByOrderId(String orderId) {
        return ordOrderFlightMapper.updateDataStatusByOrderId(orderId);
    }

}
