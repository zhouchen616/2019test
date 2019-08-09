package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerParent;
import com.holyrobot.con_volunteer.pojo.VolunteerParentExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface VolunteerParentMapper {
    int countByExample(VolunteerParentExample example);

    int deleteByExample(VolunteerParentExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerParent record);

    int insertSelective(VolunteerParent record);

    List<VolunteerParent> selectByExample(VolunteerParentExample example);

    VolunteerParent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerParent record, @Param("example") VolunteerParentExample example);

    int updateByExample(@Param("record") VolunteerParent record, @Param("example") VolunteerParentExample example);

    int updateByPrimaryKeySelective(VolunteerParent record);

    int updateByPrimaryKey(VolunteerParent record);

    List<HashMap<String,Object>> toTravellerShop(@Param("map") HashMap<String, String> map);
}