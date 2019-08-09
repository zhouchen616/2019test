package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmConfigDetail;
import com.holyrobot.con_om.pojo.OmConfigDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmConfigDetailMapper {
    int countByExample(OmConfigDetailExample example);

    int deleteByExample(OmConfigDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmConfigDetail record);

    int insertSelective(OmConfigDetail record);

    List<OmConfigDetail> selectByExample(OmConfigDetailExample example);

    OmConfigDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmConfigDetail record, @Param("example") OmConfigDetailExample example);

    int updateByExample(@Param("record") OmConfigDetail record, @Param("example") OmConfigDetailExample example);

    int updateByPrimaryKeySelective(OmConfigDetail record);

    int updateByPrimaryKey(OmConfigDetail record);

    Integer selectIsAllowVisitorSeeShopValue(@Param("orgId") String orgId);
}