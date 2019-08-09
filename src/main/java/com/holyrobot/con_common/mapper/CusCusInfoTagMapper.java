package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CusCusInfoTag;
import com.holyrobot.con_common.pojo.CusCusInfoTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusCusInfoTagMapper {
    int countByExample(CusCusInfoTagExample example);

    int deleteByExample(CusCusInfoTagExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusInfoTag record);

    int insertSelective(CusCusInfoTag record);

    List<CusCusInfoTag> selectByExample(CusCusInfoTagExample example);

    CusCusInfoTag selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusInfoTag record, @Param("example") CusCusInfoTagExample example);

    int updateByExample(@Param("record") CusCusInfoTag record, @Param("example") CusCusInfoTagExample example);

    int updateByPrimaryKeySelective(CusCusInfoTag record);

    int updateByPrimaryKey(CusCusInfoTag record);
}