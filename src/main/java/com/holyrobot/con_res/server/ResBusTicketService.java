package com.holyrobot.con_res.server;

import com.holyrobot.con_res.pojo.ResBusTicket;

import java.util.Date;
import java.util.List;

/**
 * @ClassName： ResBusTicketService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-28 14:58
 * @Version: 1.0
 * @Modified By:
 */
public interface ResBusTicketService {
    List<ResBusTicket> selectByCarCodeAndSoON(String busCarNumber, Date date, String depstation, String desstation);
}
