package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerApplicationRecord;
import com.holyrobot.con_volunteer.pojo.VolunteerApplicationRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerApplicationRecordMapper {
    int countByExample(VolunteerApplicationRecordExample example);

    int deleteByExample(VolunteerApplicationRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerApplicationRecord record);

    int insertSelective(VolunteerApplicationRecord record);

    List<VolunteerApplicationRecord> selectByExample(VolunteerApplicationRecordExample example);

    VolunteerApplicationRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerApplicationRecord record, @Param("example") VolunteerApplicationRecordExample example);

    int updateByExample(@Param("record") VolunteerApplicationRecord record, @Param("example") VolunteerApplicationRecordExample example);

    int updateByPrimaryKeySelective(VolunteerApplicationRecord record);

    int updateByPrimaryKey(VolunteerApplicationRecord record);

}