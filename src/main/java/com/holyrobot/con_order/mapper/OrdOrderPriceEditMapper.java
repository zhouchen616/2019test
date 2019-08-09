package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderPriceEdit;
import com.holyrobot.con_order.pojo.OrdOrderPriceEditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderPriceEditMapper {
    int countByExample(OrdOrderPriceEditExample example);

    int deleteByExample(OrdOrderPriceEditExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderPriceEdit record);

    int insertSelective(OrdOrderPriceEdit record);

    List<OrdOrderPriceEdit> selectByExample(OrdOrderPriceEditExample example);

    OrdOrderPriceEdit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderPriceEdit record, @Param("example") OrdOrderPriceEditExample example);

    int updateByExample(@Param("record") OrdOrderPriceEdit record, @Param("example") OrdOrderPriceEditExample example);

    int updateByPrimaryKeySelective(OrdOrderPriceEdit record);

    int updateByPrimaryKey(OrdOrderPriceEdit record);

    List<OrdOrderPriceEdit> selectByNOrderIdWithIsChild(@Param("nOderId") String nOrdId);

    List<OrdOrderPriceEdit> selectByNOrderIdWithNoChild(@Param("nOderId") String nOrdId);
}