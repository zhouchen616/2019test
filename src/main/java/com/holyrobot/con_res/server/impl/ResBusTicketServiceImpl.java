package com.holyrobot.con_res.server.impl;

import com.holyrobot.con_res.mapper.ResBusTicketMapper;
import com.holyrobot.con_res.pojo.ResBusTicket;
import com.holyrobot.con_res.server.ResBusTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName： ResBusTicketServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-28 15:05
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class ResBusTicketServiceImpl implements ResBusTicketService {

    @Autowired
    private ResBusTicketMapper resBusTicketMapper;

    @Override
    public List<ResBusTicket> selectByCarCodeAndSoON(String busCarNumber, Date date, String depstation, String desstation) {
        List<ResBusTicket> resBusTickets = resBusTicketMapper.selectByCarCodeAndSoON(busCarNumber, date, depstation, desstation);
        return resBusTickets;
    }
}
