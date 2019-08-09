package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdVolunteerOrderShopAdjust;
import com.holyrobot.con_order.pojo.OrdVolunteerOrderShopAdjustExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdVolunteerOrderShopAdjustMapper {
    int countByExample(OrdVolunteerOrderShopAdjustExample example);

    int deleteByExample(OrdVolunteerOrderShopAdjustExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdVolunteerOrderShopAdjust record);

    int insertSelective(OrdVolunteerOrderShopAdjust record);

    List<OrdVolunteerOrderShopAdjust> selectByExample(OrdVolunteerOrderShopAdjustExample example);

    OrdVolunteerOrderShopAdjust selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdVolunteerOrderShopAdjust record, @Param("example") OrdVolunteerOrderShopAdjustExample example);

    int updateByExample(@Param("record") OrdVolunteerOrderShopAdjust record, @Param("example") OrdVolunteerOrderShopAdjustExample example);

    int updateByPrimaryKeySelective(OrdVolunteerOrderShopAdjust record);

    int updateByPrimaryKey(OrdVolunteerOrderShopAdjust record);
}