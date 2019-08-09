package com.holyrobot.con_fin.mapper;

import com.holyrobot.con_fin.pojo.FinReceivingSet;
import com.holyrobot.con_fin.pojo.FinReceivingSetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinReceivingSetMapper {
    int countByExample(FinReceivingSetExample example);

    int deleteByExample(FinReceivingSetExample example);

    int deleteByPrimaryKey(String id);

    int insert(FinReceivingSet record);

    int insertSelective(FinReceivingSet record);

    List<FinReceivingSet> selectByExample(FinReceivingSetExample example);

    FinReceivingSet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FinReceivingSet record, @Param("example") FinReceivingSetExample example);

    int updateByExample(@Param("record") FinReceivingSet record, @Param("example") FinReceivingSetExample example);

    int updateByPrimaryKeySelective(FinReceivingSet record);

    int updateByPrimaryKey(FinReceivingSet record);
}