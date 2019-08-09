package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmProducttype;
import com.holyrobot.con_om.pojo.OmProducttypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmProducttypeMapper {
    int countByExample(OmProducttypeExample example);

    int deleteByExample(OmProducttypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmProducttype record);

    int insertSelective(OmProducttype record);

    List<OmProducttype> selectByExample(OmProducttypeExample example);

    OmProducttype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmProducttype record, @Param("example") OmProducttypeExample example);

    int updateByExample(@Param("record") OmProducttype record, @Param("example") OmProducttypeExample example);

    int updateByPrimaryKeySelective(OmProducttype record);

    int updateByPrimaryKey(OmProducttype record);
}