package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderShip;
import com.holyrobot.con_order.pojo.OrdOrderShipExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderShipMapper {
    int countByExample(OrdOrderShipExample example);

    int deleteByExample(OrdOrderShipExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderShip record);

    int insertSelective(OrdOrderShip record);

    List<OrdOrderShip> selectByExample(OrdOrderShipExample example);

    OrdOrderShip selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderShip record, @Param("example") OrdOrderShipExample example);

    int updateByExample(@Param("record") OrdOrderShip record, @Param("example") OrdOrderShipExample example);

    int updateByPrimaryKeySelective(OrdOrderShip record);

    int updateByPrimaryKey(OrdOrderShip record);

    int updateDataStatusByOrderId(@Param("orderId") String orderId);
}