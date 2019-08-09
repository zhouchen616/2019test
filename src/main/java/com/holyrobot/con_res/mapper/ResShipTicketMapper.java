package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResShipTicket;
import com.holyrobot.con_res.pojo.ResShipTicketExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ResShipTicketMapper {
    int countByExample(ResShipTicketExample example);

    int deleteByExample(ResShipTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResShipTicket record);

    int insertSelective(ResShipTicket record);

    List<ResShipTicket> selectByExample(ResShipTicketExample example);

    ResShipTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResShipTicket record, @Param("example") ResShipTicketExample example);

    int updateByExample(@Param("record") ResShipTicket record, @Param("example") ResShipTicketExample example);

    int updateByPrimaryKeySelective(ResShipTicket record);

    int updateByPrimaryKey(ResShipTicket record);

    List<ResShipTicket> selectByShipCodeAndSoON(@Param("shipcode") String shipcode, @Param("goDate") Date goDate, @Param("depstation") String depstation, @Param("desstation") String desstation);
}