package com.holyrobot.con_volunteer.mapper;

import com.holyrobot.con_volunteer.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerCommissionRecordMapper {
    int countByExample(VolunteerCommissionRecordExample example);

    int deleteByExample(VolunteerCommissionRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerCommissionRecord record);

    int insertSelective(VolunteerCommissionRecord record);

    List<VolunteerCommissionRecord> selectByExample(VolunteerCommissionRecordExample example);

    VolunteerCommissionRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerCommissionRecord record, @Param("example") VolunteerCommissionRecordExample example);

    int updateByExample(@Param("record") VolunteerCommissionRecord record, @Param("example") VolunteerCommissionRecordExample example);

    int updateByPrimaryKeySelective(VolunteerCommissionRecord record);

    int updateByPrimaryKey(VolunteerCommissionRecord record);

    VolunteerApplicationCommPo selectShopHeadAndComm(@Param("orgId") String orgId, @Param("userId") String userId);

    VolunteerAdjustmentAmtPo selectByOrderId(@Param("orderId") String orderId);

    List<VolCommRecAndOrderInfoBo> selectVolCommRecAndOrderInfo(@Param("orgId") String orgId, @Param("userId") String userId);

    int updateDataSatuts(@Param("orderId") String orderId);

}