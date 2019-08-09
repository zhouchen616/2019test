package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderChange;
import com.holyrobot.con_order.pojo.OrdOrderChangeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderChangeMapper {
    int countByExample(OrdOrderChangeExample example);

    int deleteByExample(OrdOrderChangeExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderChange record);

    int insertSelective(OrdOrderChange record);

    List<OrdOrderChange> selectByExample(OrdOrderChangeExample example);

    OrdOrderChange selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderChange record, @Param("example") OrdOrderChangeExample example);

    int updateByExample(@Param("record") OrdOrderChange record, @Param("example") OrdOrderChangeExample example);

    int updateByPrimaryKeySelective(OrdOrderChange record);

    int updateByPrimaryKey(OrdOrderChange record);

    List<OrdOrderChange> selectByOrderIdWithDateDesc(@Param("ordId") String ordId);
}