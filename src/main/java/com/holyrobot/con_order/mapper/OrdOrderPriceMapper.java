package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderPrice;
import com.holyrobot.con_order.pojo.OrdOrderPriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderPriceMapper {
    int countByExample(OrdOrderPriceExample example);

    int deleteByExample(OrdOrderPriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderPrice record);

    int insertSelective(OrdOrderPrice record);

    List<OrdOrderPrice> selectByExample(OrdOrderPriceExample example);

    OrdOrderPrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderPrice record, @Param("example") OrdOrderPriceExample example);

    int updateByExample(@Param("record") OrdOrderPrice record, @Param("example") OrdOrderPriceExample example);

    int updateByPrimaryKeySelective(OrdOrderPrice record);

    int updateByPrimaryKey(OrdOrderPrice record);
}