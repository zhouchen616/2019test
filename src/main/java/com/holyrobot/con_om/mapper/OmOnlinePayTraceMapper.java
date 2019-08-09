package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmOnlinePayTrace;
import com.holyrobot.con_om.pojo.OmOnlinePayTraceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmOnlinePayTraceMapper {
    int countByExample(OmOnlinePayTraceExample example);

    int deleteByExample(OmOnlinePayTraceExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmOnlinePayTrace record);

    int insertSelective(OmOnlinePayTrace record);

    List<OmOnlinePayTrace> selectByExample(OmOnlinePayTraceExample example);

    OmOnlinePayTrace selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmOnlinePayTrace record, @Param("example") OmOnlinePayTraceExample example);

    int updateByExample(@Param("record") OmOnlinePayTrace record, @Param("example") OmOnlinePayTraceExample example);

    int updateByPrimaryKeySelective(OmOnlinePayTrace record);

    int updateByPrimaryKey(OmOnlinePayTrace record);
}