package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CommParameter;
import com.holyrobot.con_common.pojo.CommParameterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommParameterMapper {
    int countByExample(CommParameterExample example);

    int deleteByExample(CommParameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommParameter record);

    int insertSelective(CommParameter record);

    List<CommParameter> selectByExample(CommParameterExample example);

    CommParameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommParameter record, @Param("example") CommParameterExample example);

    int updateByExample(@Param("record") CommParameter record, @Param("example") CommParameterExample example);

    int updateByPrimaryKeySelective(CommParameter record);

    int updateByPrimaryKey(CommParameter record);
}