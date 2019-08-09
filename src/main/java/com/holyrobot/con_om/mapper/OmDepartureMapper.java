package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmDeparture;
import com.holyrobot.con_om.pojo.OmDepartureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmDepartureMapper {
    int countByExample(OmDepartureExample example);

    int deleteByExample(OmDepartureExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmDeparture record);

    int insertSelective(OmDeparture record);

    List<OmDeparture> selectByExample(OmDepartureExample example);

    OmDeparture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmDeparture record, @Param("example") OmDepartureExample example);

    int updateByExample(@Param("record") OmDeparture record, @Param("example") OmDepartureExample example);

    int updateByPrimaryKeySelective(OmDeparture record);

    int updateByPrimaryKey(OmDeparture record);
}