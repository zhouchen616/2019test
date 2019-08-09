package com.holyrobot.con_res.server;

import com.holyrobot.con_res.pojo.ResTrainTicket;

import java.util.Date;
import java.util.List;

/**
 * @ClassName： ResTrainTicketService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-28 09:59
 * @Version: 1.0
 * @Modified By:
 */
public interface ResTrainTicketService {

    List<ResTrainTicket> selectByTrainCodeAndSoON(String stationTrainCode, Date date, String fromStationName, String toStationName);

}
