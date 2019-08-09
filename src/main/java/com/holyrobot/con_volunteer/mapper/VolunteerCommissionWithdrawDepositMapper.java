package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.VolunteerCommissionWithdrawDeposit;
import com.holyrobot.con_volunteer.pojo.VolunteerCommissionWithdrawDepositExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerCommissionWithdrawDepositMapper {
    int countByExample(VolunteerCommissionWithdrawDepositExample example);

    int deleteByExample(VolunteerCommissionWithdrawDepositExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerCommissionWithdrawDeposit record);

    int insertSelective(VolunteerCommissionWithdrawDeposit record);

    List<VolunteerCommissionWithdrawDeposit> selectByExample(VolunteerCommissionWithdrawDepositExample example);

    VolunteerCommissionWithdrawDeposit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerCommissionWithdrawDeposit record, @Param("example") VolunteerCommissionWithdrawDepositExample example);

    int updateByExample(@Param("record") VolunteerCommissionWithdrawDeposit record, @Param("example") VolunteerCommissionWithdrawDepositExample example);

    int updateByPrimaryKeySelective(VolunteerCommissionWithdrawDeposit record);

    int updateByPrimaryKey(VolunteerCommissionWithdrawDeposit record);
}