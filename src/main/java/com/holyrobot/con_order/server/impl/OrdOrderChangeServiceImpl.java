package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderChangeMapper;
import com.holyrobot.con_order.pojo.OrdOrderChange;
import com.holyrobot.con_order.server.OrdOrderChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName： OrdOrderChangeServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-11 16:27
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderChangeServiceImpl implements OrdOrderChangeService {

    @Autowired
    private OrdOrderChangeMapper ordOrderChangeMapper;

    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 16:39 2018-9-11
     * @param: [ordId]
     * @return: java.util.List<com.holyrobot.con_order.pojo.OrdOrderChange>
     *
     */
    @Override
    public List<OrdOrderChange> selectByOrderIdWithDateDesc(String ordId) {
        List<OrdOrderChange> ordOrderChanges = null;
        try {
            ordOrderChanges = ordOrderChangeMapper.selectByOrderIdWithDateDesc(ordId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Objects.nonNull(ordOrderChanges) && !ordOrderChanges.isEmpty()){
            return ordOrderChanges;
        } else {
            return null;
        }
    }




}
