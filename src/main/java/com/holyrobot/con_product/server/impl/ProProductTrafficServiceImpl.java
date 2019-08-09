package com.holyrobot.con_product.server.impl;

import com.holyrobot.con_order.server.BusinessService;
import com.holyrobot.con_product.mapper.ProProductTrafficMapper;
import com.holyrobot.con_product.pojo.ProProductTraffic;
import com.holyrobot.con_product.pojo.ProProductTrafficExample;
import com.holyrobot.con_product.server.ProProductTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/15 10:49
 * @Version: 1.0
 */

@Service
public class ProProductTrafficServiceImpl implements ProProductTrafficService {

    @Autowired
    private ProProductTrafficMapper proProductTrafficMapper;
    @Autowired
    private BusinessService businessService;

    /**
     * @Author: 史迪旻
     * @Description: 根据产品表查询对应的机票信息
     * @Date:  2018/12/21
     * @return: selectByProId
     * @Param: [id]
     */
    @Override
    public List<ProProductTraffic> selectByProId(String id) {
        ProProductTrafficExample example = new ProProductTrafficExample();
        example.or().andProidEqualTo(id);
        List<ProProductTraffic> proProductTraffics = proProductTrafficMapper.selectByExample(example);
        for (int i = 0; i < proProductTraffics.size(); i++) {
            ProProductTraffic proProductTraffic = proProductTraffics.get(i);
            String depname = proProductTraffic.getDepname(); //出发机场
            String arrname = proProductTraffic.getArrname(); //到达机场
            proProductTraffic.setDepname(businessService.getAirPort(depname));
            proProductTraffic.setArrname(businessService.getAirPort(arrname));
        }

        return proProductTraffics;
    }
}
