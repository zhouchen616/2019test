package com.holyrobot.con_order.server;

import com.holyrobot.con_order.pojo.OrdOrderPriceEdit;

import java.util.List;

/**
 * @ClassName： OrdOrderPriceEditService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-12 16:36
 * @Version: 1.0
 * @Modified By:
 */
public interface OrdOrderPriceEditService {
    List<OrdOrderPriceEdit> selectByNOrderIdWithIsChild(String nOrderId);

    List<OrdOrderPriceEdit> selectByNOrderIdWithNoChild(String nOrderId);
}
