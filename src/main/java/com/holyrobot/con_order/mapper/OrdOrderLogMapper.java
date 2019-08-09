package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderLog;
import com.holyrobot.con_order.pojo.OrdOrderLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderLogMapper {
    int countByExample(OrdOrderLogExample example);

    int deleteByExample(OrdOrderLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderLog record);

    int insertSelective(OrdOrderLog record);

    List<OrdOrderLog> selectByExample(OrdOrderLogExample example);

    OrdOrderLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderLog record, @Param("example") OrdOrderLogExample example);

    int updateByExample(@Param("record") OrdOrderLog record, @Param("example") OrdOrderLogExample example);

    int updateByPrimaryKeySelective(OrdOrderLog record);

    int updateByPrimaryKey(OrdOrderLog record);
}