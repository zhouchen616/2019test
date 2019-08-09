package com.holyrobot.con_res.server.impl;

import com.holyrobot.con_res.mapper.ResTrainTicketMapper;
import com.holyrobot.con_res.pojo.ResTrainTicket;
import com.holyrobot.con_res.server.ResTrainTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName： ResTrainTicketServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-28 10:00
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class ResTrainTicketServiceImpl implements ResTrainTicketService {

    @Autowired
    private ResTrainTicketMapper resTrainTicketMapper;

    @Override
    public List<ResTrainTicket> selectByTrainCodeAndSoON(String stationTrainCode, Date date, String fromStationName, String toStationName) {
        List<ResTrainTicket> resTrainTickets = resTrainTicketMapper.selectByTrainCodeAndSoON(stationTrainCode, date, fromStationName, toStationName);
        return resTrainTickets;
    }
}
