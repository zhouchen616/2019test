package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerStoreUnbindingRecord;
import com.holyrobot.con_volunteer.pojo.VolunteerStoreUnbindingRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerStoreUnbindingRecordMapper {
    int countByExample(VolunteerStoreUnbindingRecordExample example);

    int deleteByExample(VolunteerStoreUnbindingRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerStoreUnbindingRecord record);

    int insertSelective(VolunteerStoreUnbindingRecord record);

    List<VolunteerStoreUnbindingRecord> selectByExample(VolunteerStoreUnbindingRecordExample example);

    VolunteerStoreUnbindingRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerStoreUnbindingRecord record, @Param("example") VolunteerStoreUnbindingRecordExample example);

    int updateByExample(@Param("record") VolunteerStoreUnbindingRecord record, @Param("example") VolunteerStoreUnbindingRecordExample example);

    int updateByPrimaryKeySelective(VolunteerStoreUnbindingRecord record);

    int updateByPrimaryKey(VolunteerStoreUnbindingRecord record);
}