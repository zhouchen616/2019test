package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderBus;
import com.holyrobot.con_order.pojo.OrdOrderBusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderBusMapper {
    int countByExample(OrdOrderBusExample example);

    int deleteByExample(OrdOrderBusExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderBus record);

    int insertSelective(OrdOrderBus record);

    List<OrdOrderBus> selectByExample(OrdOrderBusExample example);

    OrdOrderBus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderBus record, @Param("example") OrdOrderBusExample example);

    int updateByExample(@Param("record") OrdOrderBus record, @Param("example") OrdOrderBusExample example);

    int updateByPrimaryKeySelective(OrdOrderBus record);

    int updateByPrimaryKey(OrdOrderBus record);

    int updateDataStatusByOrderId(@Param("orderId") String orderId);
}