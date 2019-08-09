package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerApplication;
import com.holyrobot.con_volunteer.pojo.VolunteerApplicationExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface VolunteerApplicationMapper {
    int countByExample(VolunteerApplicationExample example);

    int deleteByExample(VolunteerApplicationExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerApplication record);

    int insertSelective(VolunteerApplication record);

    List<VolunteerApplication> selectByExample(VolunteerApplicationExample example);

    VolunteerApplication selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerApplication record, @Param("example") VolunteerApplicationExample example);

    int updateByExample(@Param("record") VolunteerApplication record, @Param("example") VolunteerApplicationExample example);

    int updateByPrimaryKeySelective(VolunteerApplication record);

    int updateByPrimaryKey(VolunteerApplication record);

    List<HashMap<String,Object>> getTravelerInfoDown(@Param("map") HashMap<String, String> map);

    List<HashMap<String,Object>> getTravelerInfoUp(@Param("map") HashMap<String, String> map);

    int updateTravelerAppication(@Param("map") HashMap<String, String> map);

    int updateDataStatusById(@Param("map") HashMap<String, Object> map);

    List<VolunteerApplication> selectTaContact(@Param("map") HashMap<String, String> map);
}