package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.BusProductDto;
import com.holyrobot.dto.FlightProductDto;
import com.holyrobot.dto.ShipProductDto;
import com.holyrobot.dto.TrainProductDto;
import com.holyrobot.con_product.pojo.ProTourTraffic;
import com.holyrobot.con_product.pojo.ProTourTrafficExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProTourTrafficMapper {
    int countByExample(ProTourTrafficExample example);

    int deleteByExample(ProTourTrafficExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProTourTraffic record);

    int insertSelective(ProTourTraffic record);

    List<ProTourTraffic> selectByExample(ProTourTrafficExample example);

    ProTourTraffic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProTourTraffic record, @Param("example") ProTourTrafficExample example);

    int updateByExample(@Param("record") ProTourTraffic record, @Param("example") ProTourTrafficExample example);

    int updateByPrimaryKeySelective(ProTourTraffic record);

    int updateByPrimaryKey(ProTourTraffic record);

    List<FlightProductDto> selectFlightInfo(@Param("tourId") String tourId);

    List<TrainProductDto> selectTrainInfo(@Param("tourId") String tourId);

    List<BusProductDto> selectBusInfo(@Param("tourId") String tourId);

    List<ShipProductDto> selectShipInfo(@Param("tourId") String tourId);
}