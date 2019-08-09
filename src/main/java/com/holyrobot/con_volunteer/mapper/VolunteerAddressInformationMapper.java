package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerAddressInformation;
import com.holyrobot.con_volunteer.pojo.VolunteerAddressInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerAddressInformationMapper {
    int countByExample(VolunteerAddressInformationExample example);

    int deleteByExample(VolunteerAddressInformationExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerAddressInformation record);

    int insertSelective(VolunteerAddressInformation record);

    List<VolunteerAddressInformation> selectByExample(VolunteerAddressInformationExample example);

    VolunteerAddressInformation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerAddressInformation record, @Param("example") VolunteerAddressInformationExample example);

    int updateByExample(@Param("record") VolunteerAddressInformation record, @Param("example") VolunteerAddressInformationExample example);

    int updateByPrimaryKeySelective(VolunteerAddressInformation record);

    int updateByPrimaryKey(VolunteerAddressInformation record);
}