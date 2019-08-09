package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CommFile;
import com.holyrobot.con_common.pojo.CommFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommFileMapper {
    int countByExample(CommFileExample example);

    int deleteByExample(CommFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommFile record);

    int insertSelective(CommFile record);

    List<CommFile> selectByExample(CommFileExample example);

    CommFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommFile record, @Param("example") CommFileExample example);

    int updateByExample(@Param("record") CommFile record, @Param("example") CommFileExample example);

    int updateByPrimaryKeySelective(CommFile record);

    int updateByPrimaryKey(CommFile record);
}