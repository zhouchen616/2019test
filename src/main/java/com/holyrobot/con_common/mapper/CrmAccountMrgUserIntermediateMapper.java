package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CrmAccountMrgUserIntermediate;
import com.holyrobot.con_common.pojo.CrmAccountMrgUserIntermediateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmAccountMrgUserIntermediateMapper {
    int countByExample(CrmAccountMrgUserIntermediateExample example);

    int deleteByExample(CrmAccountMrgUserIntermediateExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmAccountMrgUserIntermediate record);

    int insertSelective(CrmAccountMrgUserIntermediate record);

    List<CrmAccountMrgUserIntermediate> selectByExample(CrmAccountMrgUserIntermediateExample example);

    CrmAccountMrgUserIntermediate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmAccountMrgUserIntermediate record, @Param("example") CrmAccountMrgUserIntermediateExample example);

    int updateByExample(@Param("record") CrmAccountMrgUserIntermediate record, @Param("example") CrmAccountMrgUserIntermediateExample example);

    int updateByPrimaryKeySelective(CrmAccountMrgUserIntermediate record);

    int updateByPrimaryKey(CrmAccountMrgUserIntermediate record);
}