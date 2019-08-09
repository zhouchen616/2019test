package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.TravelerRewardRecording;
import com.holyrobot.con_volunteer.pojo.TravelerRewardRecordingExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface TravelerRewardRecordingMapper {
    int countByExample(TravelerRewardRecordingExample example);

    int deleteByExample(TravelerRewardRecordingExample example);

    int deleteByPrimaryKey(String id);

    int insert(TravelerRewardRecording record);

    int insertSelective(TravelerRewardRecording record);

    List<TravelerRewardRecording> selectByExample(TravelerRewardRecordingExample example);

    TravelerRewardRecording selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TravelerRewardRecording record, @Param("example") TravelerRewardRecordingExample example);

    int updateByExample(@Param("record") TravelerRewardRecording record, @Param("example") TravelerRewardRecordingExample example);

    int updateByPrimaryKeySelective(TravelerRewardRecording record);

    int updateByPrimaryKey(TravelerRewardRecording record);

    List<HashMap<String,Object>> getAllowance(@Param("map") HashMap<String, String> map);

    List<HashMap<String,Object>> getAllowanceRecording(@Param("map") HashMap<String, String> map);

    List<HashMap<String,Object>> getAllowanceWithReward(@Param("map") HashMap<String, String> map);

    int updateSatuts(@Param("orderId") String orderId);
}