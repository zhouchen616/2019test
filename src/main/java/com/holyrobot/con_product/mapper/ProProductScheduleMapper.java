package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductSchedule;
import com.holyrobot.con_product.pojo.ProProductScheduleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductScheduleMapper {
    int countByExample(ProProductScheduleExample example);

    int deleteByExample(ProProductScheduleExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductSchedule record);

    int insertSelective(ProProductSchedule record);

    List<ProProductSchedule> selectByExample(ProProductScheduleExample example);

    ProProductSchedule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductSchedule record, @Param("example") ProProductScheduleExample example);

    int updateByExample(@Param("record") ProProductSchedule record, @Param("example") ProProductScheduleExample example);

    int updateByPrimaryKeySelective(ProProductSchedule record);

    int updateByPrimaryKey(ProProductSchedule record);
}