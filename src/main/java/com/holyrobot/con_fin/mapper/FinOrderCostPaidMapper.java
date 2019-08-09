package com.holyrobot.con_fin.mapper;

import com.holyrobot.con_fin.pojo.FinOrderCostPaid;
import com.holyrobot.con_fin.pojo.FinOrderCostPaidExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinOrderCostPaidMapper {
    int countByExample(FinOrderCostPaidExample example);

    int deleteByExample(FinOrderCostPaidExample example);

    int deleteByPrimaryKey(String id);

    int insert(FinOrderCostPaid record);

    int insertSelective(FinOrderCostPaid record);

    List<FinOrderCostPaid> selectByExample(FinOrderCostPaidExample example);

    FinOrderCostPaid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FinOrderCostPaid record, @Param("example") FinOrderCostPaidExample example);

    int updateByExample(@Param("record") FinOrderCostPaid record, @Param("example") FinOrderCostPaidExample example);

    int updateByPrimaryKeySelective(FinOrderCostPaid record);

    int updateByPrimaryKey(FinOrderCostPaid record);
}