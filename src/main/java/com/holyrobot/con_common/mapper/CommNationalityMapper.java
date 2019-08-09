package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.CommNationality;
import com.holyrobot.con_common.pojo.CommNationalityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommNationalityMapper {
    int countByExample(CommNationalityExample example);

    int deleteByExample(CommNationalityExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommNationality record);

    int insertSelective(CommNationality record);

    List<CommNationality> selectByExample(CommNationalityExample example);

    CommNationality selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommNationality record, @Param("example") CommNationalityExample example);

    int updateByExample(@Param("record") CommNationality record, @Param("example") CommNationalityExample example);

    int updateByPrimaryKeySelective(CommNationality record);

    int updateByPrimaryKey(CommNationality record);
}