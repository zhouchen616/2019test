package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.TravelerRewardWithdrawDeposit;
import com.holyrobot.con_volunteer.pojo.TravelerRewardWithdrawDepositExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravelerRewardWithdrawDepositMapper {
    int countByExample(TravelerRewardWithdrawDepositExample example);

    int deleteByExample(TravelerRewardWithdrawDepositExample example);

    int deleteByPrimaryKey(String id);

    int insert(TravelerRewardWithdrawDeposit record);

    int insertSelective(TravelerRewardWithdrawDeposit record);

    List<TravelerRewardWithdrawDeposit> selectByExample(TravelerRewardWithdrawDepositExample example);

    TravelerRewardWithdrawDeposit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TravelerRewardWithdrawDeposit record, @Param("example") TravelerRewardWithdrawDepositExample example);

    int updateByExample(@Param("record") TravelerRewardWithdrawDeposit record, @Param("example") TravelerRewardWithdrawDepositExample example);

    int updateByPrimaryKeySelective(TravelerRewardWithdrawDeposit record);

    int updateByPrimaryKey(TravelerRewardWithdrawDeposit record);
}