package com.holyrobot.con_product.server;

import com.holyrobot.dto.BusProductDto;
import com.holyrobot.dto.FlightProductDto;
import com.holyrobot.dto.ShipProductDto;
import com.holyrobot.dto.TrainProductDto;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/8/23 9:37
 * @Version: 1.0
 */
public interface ProTourTrafficService {

    List<FlightProductDto> selectFlightInfo(String tourId);

    List<TrainProductDto> selectTrainInfo(String tourId);

    List<BusProductDto> selectBusInfo(String tourId);

    List<ShipProductDto> selectShipInfo(String tourId);



}
