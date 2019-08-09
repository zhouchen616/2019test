package com.holyrobot.con_res.server;

import com.holyrobot.con_res.pojo.ResFlightcabin;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: 仓位信息
 * @CreateDate: 2018/5/18 11:34
 * @Version: 1.0
 */
public interface ResFlightcabinService {

    List<ResFlightcabin> selectBy(String flightId);

}
