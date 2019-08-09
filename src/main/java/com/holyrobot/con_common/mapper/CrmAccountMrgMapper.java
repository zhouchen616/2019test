package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CrmAccountMrg;
import com.holyrobot.con_common.pojo.CrmAccountMrgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmAccountMrgMapper {
    int countByExample(CrmAccountMrgExample example);

    int deleteByExample(CrmAccountMrgExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmAccountMrg record);

    int insertSelective(CrmAccountMrg record);

    List<CrmAccountMrg> selectByExample(CrmAccountMrgExample example);

    CrmAccountMrg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmAccountMrg record, @Param("example") CrmAccountMrgExample example);

    int updateByExample(@Param("record") CrmAccountMrg record, @Param("example") CrmAccountMrgExample example);

    int updateByPrimaryKeySelective(CrmAccountMrg record);

    int updateByPrimaryKey(CrmAccountMrg record);
}