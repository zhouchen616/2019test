package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResBusTicket;
import com.holyrobot.con_res.pojo.ResBusTicketExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ResBusTicketMapper {
    int countByExample(ResBusTicketExample example);

    int deleteByExample(ResBusTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResBusTicket record);

    int insertSelective(ResBusTicket record);

    List<ResBusTicket> selectByExample(ResBusTicketExample example);

    ResBusTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResBusTicket record, @Param("example") ResBusTicketExample example);

    int updateByExample(@Param("record") ResBusTicket record, @Param("example") ResBusTicketExample example);

    int updateByPrimaryKeySelective(ResBusTicket record);

    int updateByPrimaryKey(ResBusTicket record);

    List<ResBusTicket> selectByCarCodeAndSoON(@Param("busCarNumber") String busCarNumber, @Param("goDate") Date date, @Param("depstation") String depstation, @Param("desstation") String desstation);
}