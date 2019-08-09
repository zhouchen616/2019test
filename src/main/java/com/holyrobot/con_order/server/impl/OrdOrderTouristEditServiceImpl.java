package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderTouristEditMapper;
import com.holyrobot.con_order.pojo.OrdOrderTouristEdit;
import com.holyrobot.con_order.server.OrdOrderTouristEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName： OrdOrderTouristEditServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-12 19:08
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderTouristEditServiceImpl implements OrdOrderTouristEditService {

    @Autowired
    private OrdOrderTouristEditMapper ordOrderTouristEditMapper;
    
    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 19:10 2018-9-12
     * @param: [nOrderId]
     * @return: java.util.List<com.holyrobot.con_order.pojo.OrdOrderTouristEdit>
     *
     */
    @Override
    public List<OrdOrderTouristEdit> selectByNOrderId(String nOrderId) {
        List<OrdOrderTouristEdit> ordOrderTouristEdits = null;
        try {
            ordOrderTouristEdits = ordOrderTouristEditMapper.selectByNOrderId(nOrderId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!ordOrderTouristEdits.isEmpty() && Objects.nonNull(ordOrderTouristEdits)) {
            return ordOrderTouristEdits;
        } else {
            return null;
        }
    }


}
