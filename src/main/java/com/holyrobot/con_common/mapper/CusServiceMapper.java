package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CusService;
import com.holyrobot.con_common.pojo.CusServiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusServiceMapper {
    int countByExample(CusServiceExample example);

    int deleteByExample(CusServiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusService record);

    int insertSelective(CusService record);

    List<CusService> selectByExample(CusServiceExample example);

    CusService selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusService record, @Param("example") CusServiceExample example);

    int updateByExample(@Param("record") CusService record, @Param("example") CusServiceExample example);

    int updateByPrimaryKeySelective(CusService record);

    int updateByPrimaryKey(CusService record);
    
    List<CusService> listAll();
}