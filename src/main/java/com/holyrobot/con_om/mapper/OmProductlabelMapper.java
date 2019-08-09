package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmProductlabel;
import com.holyrobot.con_om.pojo.OmProductlabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmProductlabelMapper {
    int countByExample(OmProductlabelExample example);

    int deleteByExample(OmProductlabelExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmProductlabel record);

    int insertSelective(OmProductlabel record);

    List<OmProductlabel> selectByExample(OmProductlabelExample example);

    OmProductlabel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmProductlabel record, @Param("example") OmProductlabelExample example);

    int updateByExample(@Param("record") OmProductlabel record, @Param("example") OmProductlabelExample example);

    int updateByPrimaryKeySelective(OmProductlabel record);

    int updateByPrimaryKey(OmProductlabel record);
}