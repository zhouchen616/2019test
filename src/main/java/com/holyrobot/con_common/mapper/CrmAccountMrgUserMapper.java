package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CrmAccountMrgUser;
import com.holyrobot.con_common.pojo.CrmAccountMrgUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmAccountMrgUserMapper {
    int countByExample(CrmAccountMrgUserExample example);

    int deleteByExample(CrmAccountMrgUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrmAccountMrgUser record);

    int insertSelective(CrmAccountMrgUser record);

    List<CrmAccountMrgUser> selectByExampleWithBLOBs(CrmAccountMrgUserExample example);

    List<CrmAccountMrgUser> selectByExample(CrmAccountMrgUserExample example);

    CrmAccountMrgUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrmAccountMrgUser record, @Param("example") CrmAccountMrgUserExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmAccountMrgUser record, @Param("example") CrmAccountMrgUserExample example);

    int updateByExample(@Param("record") CrmAccountMrgUser record, @Param("example") CrmAccountMrgUserExample example);

    int updateByPrimaryKeySelective(CrmAccountMrgUser record);

    int updateByPrimaryKeyWithBLOBs(CrmAccountMrgUser record);

    int updateByPrimaryKey(CrmAccountMrgUser record);
}