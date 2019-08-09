package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmProtocol;
import com.holyrobot.con_om.pojo.OmProtocolExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmProtocolMapper {
    int countByExample(OmProtocolExample example);

    int deleteByExample(OmProtocolExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmProtocol record);

    int insertSelective(OmProtocol record);

    List<OmProtocol> selectByExample(OmProtocolExample example);

    OmProtocol selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmProtocol record, @Param("example") OmProtocolExample example);

    int updateByExample(@Param("record") OmProtocol record, @Param("example") OmProtocolExample example);

    int updateByPrimaryKeySelective(OmProtocol record);

    int updateByPrimaryKey(OmProtocol record);
}