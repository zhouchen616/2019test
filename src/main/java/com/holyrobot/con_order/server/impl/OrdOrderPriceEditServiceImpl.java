package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderPriceEditMapper;
import com.holyrobot.con_order.pojo.OrdOrderPriceEdit;
import com.holyrobot.con_order.server.OrdOrderPriceEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName： OrdOrderPriceEditServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-12 16:36
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class OrdOrderPriceEditServiceImpl implements OrdOrderPriceEditService {

    @Autowired
    private OrdOrderPriceEditMapper ordOrderPriceEditMapper;

    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 16:42 2018-9-12
     * @param: [nOrderId]
     * @return: java.util.List<com.holyrobot.con_order.pojo.OrdOrderPriceEdit>
     *
     */
    @Override
    public List<OrdOrderPriceEdit> selectByNOrderIdWithIsChild(String nOrderId) {
        List<OrdOrderPriceEdit> ordOrderPriceEdits = null;
        try {
            ordOrderPriceEdits = ordOrderPriceEditMapper.selectByNOrderIdWithIsChild(nOrderId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Objects.nonNull(ordOrderPriceEdits) && !ordOrderPriceEdits.isEmpty()){
            return ordOrderPriceEdits;
        } else {
            return null;
        }
    }

    /**
     *
     * @Description: 
     * 
     * @auther: 史迪旻
     * @date: 17:17 2018-9-12 
     * @param: [nOrderId]
     * @return: java.util.List<com.holyrobot.con_order.pojo.OrdOrderPriceEdit>
     *
     */
    @Override
    public List<OrdOrderPriceEdit> selectByNOrderIdWithNoChild(String nOrderId) {
        List<OrdOrderPriceEdit> ordOrderPriceEdits = null;
        try {
            ordOrderPriceEdits = ordOrderPriceEditMapper.selectByNOrderIdWithNoChild(nOrderId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Objects.nonNull(ordOrderPriceEdits) && !ordOrderPriceEdits.isEmpty()){
            return ordOrderPriceEdits;
        } else {
            return null;
        }
    }


}
