package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOnlinePayInfo;
import com.holyrobot.con_order.pojo.OrdOnlinePayInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOnlinePayInfoMapper {
    int countByExample(OrdOnlinePayInfoExample example);

    int deleteByExample(OrdOnlinePayInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOnlinePayInfo record);

    int insertSelective(OrdOnlinePayInfo record);

    List<OrdOnlinePayInfo> selectByExample(OrdOnlinePayInfoExample example);

    OrdOnlinePayInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOnlinePayInfo record, @Param("example") OrdOnlinePayInfoExample example);

    int updateByExample(@Param("record") OrdOnlinePayInfo record, @Param("example") OrdOnlinePayInfoExample example);

    int updateByPrimaryKeySelective(OrdOnlinePayInfo record);

    int updateByPrimaryKey(OrdOnlinePayInfo record);
}