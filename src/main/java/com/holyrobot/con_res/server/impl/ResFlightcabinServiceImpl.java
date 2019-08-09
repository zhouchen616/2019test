package com.holyrobot.con_res.server.impl;

import com.holyrobot.con_res.mapper.ResFlightcabinMapper;
import com.holyrobot.con_res.pojo.ResFlightcabin;
import com.holyrobot.con_res.pojo.ResFlightcabinExample;
import com.holyrobot.con_res.server.ResFlightcabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/18 11:36
 * @Version: 1.0
 */
@Service
public class ResFlightcabinServiceImpl implements ResFlightcabinService {

    @Autowired
    private ResFlightcabinMapper resFlightcabinMapper;
    @Override
    public List<ResFlightcabin> selectBy(String flightId) {
        ResFlightcabinExample example = new ResFlightcabinExample();
        example.or().andFlightidEqualTo(flightId);
        return resFlightcabinMapper.selectByExample(example);
    }
}
