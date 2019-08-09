package com.holyrobot.con_product.server.impl;

import com.holyrobot.dto.BusProductDto;
import com.holyrobot.dto.FlightProductDto;
import com.holyrobot.dto.ShipProductDto;
import com.holyrobot.dto.TrainProductDto;
import com.holyrobot.con_product.mapper.ProTourTrafficMapper;
import com.holyrobot.con_product.server.ProTourTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: 大交通查询实现类
 * @CreateDate: 2018/8/23 9:38
 * @Version: 1.0
 */
@Service
public class ProTourTrafficServiceImpl implements ProTourTrafficService {

    @Autowired
    private ProTourTrafficMapper proTourTrafficMapper;


    @Override
    public List<FlightProductDto> selectFlightInfo(String tourId) {
        return proTourTrafficMapper.selectFlightInfo(tourId);
    }

    @Override
    public List<TrainProductDto> selectTrainInfo(String tourId) {
        return proTourTrafficMapper.selectTrainInfo(tourId);
    }

    @Override
    public List<BusProductDto> selectBusInfo(String tourId) {
        return proTourTrafficMapper.selectBusInfo(tourId);

    }

    @Override
    public List<ShipProductDto> selectShipInfo(String tourId) {
        return proTourTrafficMapper.selectShipInfo(tourId);
    }
}
