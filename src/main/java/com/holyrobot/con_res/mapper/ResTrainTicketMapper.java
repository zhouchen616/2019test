package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResTrainTicket;
import com.holyrobot.con_res.pojo.ResTrainTicketExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ResTrainTicketMapper {
    int countByExample(ResTrainTicketExample example);

    int deleteByExample(ResTrainTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResTrainTicket record);

    int insertSelective(ResTrainTicket record);

    List<ResTrainTicket> selectByExample(ResTrainTicketExample example);

    ResTrainTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResTrainTicket record, @Param("example") ResTrainTicketExample example);

    int updateByExample(@Param("record") ResTrainTicket record, @Param("example") ResTrainTicketExample example);

    int updateByPrimaryKeySelective(ResTrainTicket record);

    int updateByPrimaryKey(ResTrainTicket record);

    List<ResTrainTicket> selectByTrainCodeAndSoON(@Param("stationTrainCode") String stationTrainCode, @Param("goDate") Date date, @Param("fromStationName") String fromStationName, @Param("toStationName") String toStationName);
}