package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmOppermission;
import com.holyrobot.con_om.pojo.OmOppermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmOppermissionMapper {
    int countByExample(OmOppermissionExample example);

    int deleteByExample(OmOppermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmOppermission record);

    int insertSelective(OmOppermission record);

    List<OmOppermission> selectByExample(OmOppermissionExample example);

    OmOppermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmOppermission record, @Param("example") OmOppermissionExample example);

    int updateByExample(@Param("record") OmOppermission record, @Param("example") OmOppermissionExample example);

    int updateByPrimaryKeySelective(OmOppermission record);

    int updateByPrimaryKey(OmOppermission record);
}