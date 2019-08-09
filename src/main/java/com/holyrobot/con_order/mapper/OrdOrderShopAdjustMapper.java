package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderShopAdjust;
import com.holyrobot.con_order.pojo.OrdOrderShopAdjustExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderShopAdjustMapper {
    int countByExample(OrdOrderShopAdjustExample example);

    int deleteByExample(OrdOrderShopAdjustExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderShopAdjust record);

    int insertSelective(OrdOrderShopAdjust record);

    List<OrdOrderShopAdjust> selectByExample(OrdOrderShopAdjustExample example);

    OrdOrderShopAdjust selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderShopAdjust record, @Param("example") OrdOrderShopAdjustExample example);

    int updateByExample(@Param("record") OrdOrderShopAdjust record, @Param("example") OrdOrderShopAdjustExample example);

    int updateByPrimaryKeySelective(OrdOrderShopAdjust record);

    int updateByPrimaryKey(OrdOrderShopAdjust record);
}