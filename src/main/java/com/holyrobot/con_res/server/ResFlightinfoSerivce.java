package com.holyrobot.con_res.server;

import com.holyrobot.con_res.pojo.ResFlightinfo;

import java.util.Date;
import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/18 9:21
 * @Version: 1.0
 */
public interface ResFlightinfoSerivce {

    List<ResFlightinfo> selectByFlightNoAndFlightDate(String flightNo, Date flightdate);

}
