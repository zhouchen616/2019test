package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderTourist;
import com.holyrobot.con_order.pojo.OrdOrderTouristExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderTouristMapper {
    int countByExample(OrdOrderTouristExample example);

    int deleteByExample(OrdOrderTouristExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderTourist record);

    int insertSelective(OrdOrderTourist record);

    List<OrdOrderTourist> selectByExample(OrdOrderTouristExample example);

    OrdOrderTourist selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderTourist record, @Param("example") OrdOrderTouristExample example);

    int updateByExample(@Param("record") OrdOrderTourist record, @Param("example") OrdOrderTouristExample example);

    int updateByPrimaryKeySelective(OrdOrderTourist record);

    int updateByPrimaryKey(OrdOrderTourist record);
}