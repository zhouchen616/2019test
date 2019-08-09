package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderTouristEdit;
import com.holyrobot.con_order.pojo.OrdOrderTouristEditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderTouristEditMapper {
    int countByExample(OrdOrderTouristEditExample example);

    int deleteByExample(OrdOrderTouristEditExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderTouristEdit record);

    int insertSelective(OrdOrderTouristEdit record);

    List<OrdOrderTouristEdit> selectByExample(OrdOrderTouristEditExample example);

    OrdOrderTouristEdit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderTouristEdit record, @Param("example") OrdOrderTouristEditExample example);

    int updateByExample(@Param("record") OrdOrderTouristEdit record, @Param("example") OrdOrderTouristEditExample example);

    int updateByPrimaryKeySelective(OrdOrderTouristEdit record);

    int updateByPrimaryKey(OrdOrderTouristEdit record);

    List<OrdOrderTouristEdit> selectByNOrderId(@Param("nOderId") String nOrderId);
}