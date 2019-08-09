package com.holyrobot.con_res.server.impl;

import com.holyrobot.con_res.mapper.ResShipTicketMapper;
import com.holyrobot.con_res.pojo.ResShipTicket;
import com.holyrobot.con_res.server.ResShipTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName： ResShipTicketServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-28 15:52
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class ResShipTicketServiceImpl implements ResShipTicketService {

    @Autowired
    private ResShipTicketMapper resShipTicketMapper;

    @Override
    public List<ResShipTicket> selectByShipCodeAndSoON(String shipcode, Date goDate, String depstation, String desstation) {
        List<ResShipTicket> resShipTickets = resShipTicketMapper.selectByShipCodeAndSoON(shipcode, goDate, depstation, desstation);
        return resShipTickets;
    }
}
