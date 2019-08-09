package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CusCusInfoServiceType;
import com.holyrobot.con_common.pojo.CusCusInfoServiceTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusCusInfoServiceTypeMapper {
    int countByExample(CusCusInfoServiceTypeExample example);

    int deleteByExample(CusCusInfoServiceTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusInfoServiceType record);

    int insertSelective(CusCusInfoServiceType record);

    List<CusCusInfoServiceType> selectByExample(CusCusInfoServiceTypeExample example);

    CusCusInfoServiceType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusInfoServiceType record, @Param("example") CusCusInfoServiceTypeExample example);

    int updateByExample(@Param("record") CusCusInfoServiceType record, @Param("example") CusCusInfoServiceTypeExample example);

    int updateByPrimaryKeySelective(CusCusInfoServiceType record);

    int updateByPrimaryKey(CusCusInfoServiceType record);
}