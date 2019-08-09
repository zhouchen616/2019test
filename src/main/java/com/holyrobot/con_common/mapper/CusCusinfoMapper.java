package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CusCusinfo;
import com.holyrobot.con_common.pojo.CusCusinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusCusinfoMapper {
    int countByExample(CusCusinfoExample example);

    int deleteByExample(CusCusinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusinfo record);

    int insertSelective(CusCusinfo record);

    List<CusCusinfo> selectByExample(CusCusinfoExample example);

    CusCusinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusinfo record, @Param("example") CusCusinfoExample example);

    int updateByExample(@Param("record") CusCusinfo record, @Param("example") CusCusinfoExample example);

    int updateByPrimaryKeySelective(CusCusinfo record);

    int updateByPrimaryKey(CusCusinfo record);
}