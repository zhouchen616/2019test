package com.holyrobot.con_res.server.impl;

import com.holyrobot.con_res.mapper.ResFlightinfoMapper;
import com.holyrobot.con_res.pojo.ResFlightinfo;
import com.holyrobot.con_res.server.ResFlightinfoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/18 9:22
 * @Version: 1.0
 */

@Service
public class ResFlightinfoSerivceImpl implements ResFlightinfoSerivce {

    @Autowired
    private ResFlightinfoMapper resFlightinfoMapper;

    /**
     *
     * @Description:
     *
     * @auther: 史迪旻
     * @date: 19:37 2018-8-30
     * @param: [flightNo, flightdate]
     * @return: java.util.List<com.holyrobot.con_res.pojo.ResFlightinfo>
     *
     */
    @Override
    public List<ResFlightinfo> selectByFlightNoAndFlightDate(String flightNo,Date flightdate) {
        return resFlightinfoMapper.selectByFlightNoAndFlightDate(flightNo, flightdate);
    }
}
