package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderShopAdjustMapper;
import com.holyrobot.con_order.server.OrdOrderShopAdjustService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName： OrdOrderShopAdjustServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-12 09:49
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class OrdOrderShopAdjustServiceImpl implements OrdOrderShopAdjustService {

    @Autowired
    private OrdOrderShopAdjustMapper ordOrderShopAdjustMapper;


}
