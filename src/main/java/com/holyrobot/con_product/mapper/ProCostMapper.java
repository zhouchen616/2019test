package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProCost;
import com.holyrobot.con_product.pojo.ProCostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProCostMapper {
    int countByExample(ProCostExample example);

    int deleteByExample(ProCostExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProCost record);

    int insertSelective(ProCost record);

    List<ProCost> selectByExample(ProCostExample example);

    ProCost selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProCost record, @Param("example") ProCostExample example);

    int updateByExample(@Param("record") ProCost record, @Param("example") ProCostExample example);

    int updateByPrimaryKeySelective(ProCost record);

    int updateByPrimaryKey(ProCost record);
}