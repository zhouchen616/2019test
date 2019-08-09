package com.holyrobot.con_order.server;

import com.holyrobot.con_order.pojo.OrdOrderChange;

import java.util.List;

/**
 * @ClassName： OrdOrderChangeService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-11 16:26
 * @Version: 1.0
 * @Modified By:
 */
public interface OrdOrderChangeService {
    List<OrdOrderChange> selectByOrderIdWithDateDesc(String ordId);
}
