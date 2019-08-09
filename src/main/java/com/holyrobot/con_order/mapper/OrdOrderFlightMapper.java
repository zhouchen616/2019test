package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderFlight;
import com.holyrobot.con_order.pojo.OrdOrderFlightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderFlightMapper {
    int countByExample(OrdOrderFlightExample example);

    int deleteByExample(OrdOrderFlightExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderFlight record);

    int insertSelective(OrdOrderFlight record);

    List<OrdOrderFlight> selectByExample(OrdOrderFlightExample example);

    OrdOrderFlight selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderFlight record, @Param("example") OrdOrderFlightExample example);

    int updateByExample(@Param("record") OrdOrderFlight record, @Param("example") OrdOrderFlightExample example);

    int updateByPrimaryKeySelective(OrdOrderFlight record);

    int updateByPrimaryKey(OrdOrderFlight record);

    int updateDataStatusByOrderId(@Param("orderId") String orderId);
}