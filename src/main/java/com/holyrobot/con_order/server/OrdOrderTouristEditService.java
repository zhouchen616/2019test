package com.holyrobot.con_order.server;

import com.holyrobot.con_order.pojo.OrdOrderTouristEdit;

import java.util.List;

/**
 * @ClassName： OrdOrderTouristEditService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-12 19:08
 * @Version: 1.0
 * @Modified By:
 */
public interface OrdOrderTouristEditService {

    List<OrdOrderTouristEdit> selectByNOrderId(String nOrderId);
}
