package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmOrgWechatConf;
import com.holyrobot.con_om.pojo.OmOrgWechatConfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmOrgWechatConfMapper {
    int countByExample(OmOrgWechatConfExample example);

    int deleteByExample(OmOrgWechatConfExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmOrgWechatConf record);

    int insertSelective(OmOrgWechatConf record);

    List<OmOrgWechatConf> selectByExample(OmOrgWechatConfExample example);

    OmOrgWechatConf selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmOrgWechatConf record, @Param("example") OmOrgWechatConfExample example);

    int updateByExample(@Param("record") OmOrgWechatConf record, @Param("example") OmOrgWechatConfExample example);

    int updateByPrimaryKeySelective(OmOrgWechatConf record);

    int updateByPrimaryKey(OmOrgWechatConf record);

    List<OmOrgWechatConf> selectByOrgId(@Param("orgId") String orgId);
}