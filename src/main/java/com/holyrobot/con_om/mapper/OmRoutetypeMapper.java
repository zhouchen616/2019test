package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmRoutetype;
import com.holyrobot.con_om.pojo.OmRoutetypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmRoutetypeMapper {
    int countByExample(OmRoutetypeExample example);

    int deleteByExample(OmRoutetypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmRoutetype record);

    int insertSelective(OmRoutetype record);

    List<OmRoutetype> selectByExample(OmRoutetypeExample example);

    OmRoutetype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmRoutetype record, @Param("example") OmRoutetypeExample example);

    int updateByExample(@Param("record") OmRoutetype record, @Param("example") OmRoutetypeExample example);

    int updateByPrimaryKeySelective(OmRoutetype record);

    int updateByPrimaryKey(OmRoutetype record);
}