package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmOrgInfoExtension;
import com.holyrobot.con_om.pojo.OmOrgInfoExtensionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmOrgInfoExtensionMapper {
    int countByExample(OmOrgInfoExtensionExample example);

    int deleteByExample(OmOrgInfoExtensionExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmOrgInfoExtension record);

    int insertSelective(OmOrgInfoExtension record);

    List<OmOrgInfoExtension> selectByExample(OmOrgInfoExtensionExample example);

    OmOrgInfoExtension selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmOrgInfoExtension record, @Param("example") OmOrgInfoExtensionExample example);

    int updateByExample(@Param("record") OmOrgInfoExtension record, @Param("example") OmOrgInfoExtensionExample example);

    int updateByPrimaryKeySelective(OmOrgInfoExtension record);

    int updateByPrimaryKey(OmOrgInfoExtension record);
}