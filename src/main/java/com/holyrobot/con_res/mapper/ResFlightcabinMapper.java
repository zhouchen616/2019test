package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResFlightcabin;
import com.holyrobot.con_res.pojo.ResFlightcabinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResFlightcabinMapper {
    int countByExample(ResFlightcabinExample example);

    int deleteByExample(ResFlightcabinExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResFlightcabin record);

    int insertSelective(ResFlightcabin record);

    List<ResFlightcabin> selectByExample(ResFlightcabinExample example);

    ResFlightcabin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResFlightcabin record, @Param("example") ResFlightcabinExample example);

    int updateByExample(@Param("record") ResFlightcabin record, @Param("example") ResFlightcabinExample example);

    int updateByPrimaryKeySelective(ResFlightcabin record);

    int updateByPrimaryKey(ResFlightcabin record);
}