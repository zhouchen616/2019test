package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CusCusInfoDest;
import com.holyrobot.con_common.pojo.CusCusInfoDestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusCusInfoDestMapper {
    int countByExample(CusCusInfoDestExample example);

    int deleteByExample(CusCusInfoDestExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusInfoDest record);

    int insertSelective(CusCusInfoDest record);

    List<CusCusInfoDest> selectByExample(CusCusInfoDestExample example);

    CusCusInfoDest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusInfoDest record, @Param("example") CusCusInfoDestExample example);

    int updateByExample(@Param("record") CusCusInfoDest record, @Param("example") CusCusInfoDestExample example);

    int updateByPrimaryKeySelective(CusCusInfoDest record);

    int updateByPrimaryKey(CusCusInfoDest record);
}