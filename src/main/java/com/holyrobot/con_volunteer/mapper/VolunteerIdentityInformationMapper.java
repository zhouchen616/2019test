package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerIdentityInformation;
import com.holyrobot.con_volunteer.pojo.VolunteerIdentityInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerIdentityInformationMapper {
    int countByExample(VolunteerIdentityInformationExample example);

    int deleteByExample(VolunteerIdentityInformationExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerIdentityInformation record);

    int insertSelective(VolunteerIdentityInformation record);

    List<VolunteerIdentityInformation> selectByExample(VolunteerIdentityInformationExample example);

    VolunteerIdentityInformation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerIdentityInformation record, @Param("example") VolunteerIdentityInformationExample example);

    int updateByExample(@Param("record") VolunteerIdentityInformation record, @Param("example") VolunteerIdentityInformationExample example);

    int updateByPrimaryKeySelective(VolunteerIdentityInformation record);

    int updateByPrimaryKey(VolunteerIdentityInformation record);
}