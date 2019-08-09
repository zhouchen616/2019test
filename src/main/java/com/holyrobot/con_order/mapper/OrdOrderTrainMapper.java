package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderTrain;
import com.holyrobot.con_order.pojo.OrdOrderTrainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderTrainMapper {
    int countByExample(OrdOrderTrainExample example);

    int deleteByExample(OrdOrderTrainExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderTrain record);

    int insertSelective(OrdOrderTrain record);

    List<OrdOrderTrain> selectByExample(OrdOrderTrainExample example);

    OrdOrderTrain selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderTrain record, @Param("example") OrdOrderTrainExample example);

    int updateByExample(@Param("record") OrdOrderTrain record, @Param("example") OrdOrderTrainExample example);

    int updateByPrimaryKeySelective(OrdOrderTrain record);

    int updateByPrimaryKey(OrdOrderTrain record);

    int updateDataStatusByOrderId(@Param("orderId") String orderId);
}