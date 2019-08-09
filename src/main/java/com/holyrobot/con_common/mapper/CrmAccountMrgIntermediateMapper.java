package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CrmAccountMrgIntermediate;
import com.holyrobot.con_common.pojo.CrmAccountMrgIntermediateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmAccountMrgIntermediateMapper {
    int countByExample(CrmAccountMrgIntermediateExample example);

    int deleteByExample(CrmAccountMrgIntermediateExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmAccountMrgIntermediate record);

    int insertSelective(CrmAccountMrgIntermediate record);

    List<CrmAccountMrgIntermediate> selectByExample(CrmAccountMrgIntermediateExample example);

    CrmAccountMrgIntermediate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmAccountMrgIntermediate record, @Param("example") CrmAccountMrgIntermediateExample example);

    int updateByExample(@Param("record") CrmAccountMrgIntermediate record, @Param("example") CrmAccountMrgIntermediateExample example);

    int updateByPrimaryKeySelective(CrmAccountMrgIntermediate record);

    int updateByPrimaryKey(CrmAccountMrgIntermediate record);
}