package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResFlightinfo;
import com.holyrobot.con_res.pojo.ResFlightinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ResFlightinfoMapper {
    int countByExample(ResFlightinfoExample example);

    int deleteByExample(ResFlightinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResFlightinfo record);

    int insertSelective(ResFlightinfo record);

    List<ResFlightinfo> selectByExample(ResFlightinfoExample example);

    ResFlightinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResFlightinfo record, @Param("example") ResFlightinfoExample example);

    int updateByExample(@Param("record") ResFlightinfo record, @Param("example") ResFlightinfoExample example);

    int updateByPrimaryKeySelective(ResFlightinfo record);

    int updateByPrimaryKey(ResFlightinfo record);

    List<ResFlightinfo> selectByFlightNoAndFlightDate(@Param("flightno") String flightNo, @Param("flightdate") Date flightdate);
}