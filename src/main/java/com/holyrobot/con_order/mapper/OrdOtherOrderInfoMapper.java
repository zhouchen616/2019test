package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOtherOrderInfo;
import com.holyrobot.con_order.pojo.OrdOtherOrderInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOtherOrderInfoMapper {
    int countByExample(OrdOtherOrderInfoExample example);

    int deleteByExample(OrdOtherOrderInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOtherOrderInfo record);

    int insertSelective(OrdOtherOrderInfo record);

    List<OrdOtherOrderInfo> selectByExample(OrdOtherOrderInfoExample example);

    OrdOtherOrderInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOtherOrderInfo record, @Param("example") OrdOtherOrderInfoExample example);

    int updateByExample(@Param("record") OrdOtherOrderInfo record, @Param("example") OrdOtherOrderInfoExample example);

    int updateByPrimaryKeySelective(OrdOtherOrderInfo record);

    int updateByPrimaryKey(OrdOtherOrderInfo record);
}