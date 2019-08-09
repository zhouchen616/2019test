package com.holyrobot.con_res.server;

import com.holyrobot.con_res.pojo.ResShipTicket;

import java.util.Date;
import java.util.List;

/**
 * @ClassName： ResShipTicketService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-28 15:52
 * @Version: 1.0
 * @Modified By:
 */
public interface ResShipTicketService {

    List<ResShipTicket> selectByShipCodeAndSoON(String shipcode, Date goDate, String depstation, String desstation);

}
