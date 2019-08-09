package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.TravelerUnbindingAndFreeze;
import com.holyrobot.con_volunteer.pojo.TravelerUnbindingAndFreezeExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface TravelerUnbindingAndFreezeMapper {
    int countByExample(TravelerUnbindingAndFreezeExample example);

    int deleteByExample(TravelerUnbindingAndFreezeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TravelerUnbindingAndFreeze record);

    int insertSelective(TravelerUnbindingAndFreeze record);

    List<TravelerUnbindingAndFreeze> selectByExample(TravelerUnbindingAndFreezeExample example);

    TravelerUnbindingAndFreeze selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TravelerUnbindingAndFreeze record, @Param("example") TravelerUnbindingAndFreezeExample example);

    int updateByExample(@Param("record") TravelerUnbindingAndFreeze record, @Param("example") TravelerUnbindingAndFreezeExample example);

    int updateByPrimaryKeySelective(TravelerUnbindingAndFreeze record);

    int updateByPrimaryKey(TravelerUnbindingAndFreeze record);

    List<TravelerUnbindingAndFreeze> getTravelerBindList(@Param("map") HashMap<String, String> map);
}