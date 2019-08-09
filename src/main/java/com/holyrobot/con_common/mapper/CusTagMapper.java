package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CusTag;
import com.holyrobot.con_common.pojo.CusTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusTagMapper {
    int countByExample(CusTagExample example);

    int deleteByExample(CusTagExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusTag record);

    int insertSelective(CusTag record);

    List<CusTag> selectByExample(CusTagExample example);

    CusTag selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusTag record, @Param("example") CusTagExample example);

    int updateByExample(@Param("record") CusTag record, @Param("example") CusTagExample example);

    int updateByPrimaryKeySelective(CusTag record);

    int updateByPrimaryKey(CusTag record);
}