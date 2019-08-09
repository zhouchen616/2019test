package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductDynamicManageSetting;
import com.holyrobot.con_product.pojo.ProProductDynamicManageSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDynamicManageSettingMapper {
    int countByExample(ProProductDynamicManageSettingExample example);

    int deleteByExample(ProProductDynamicManageSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDynamicManageSetting record);

    int insertSelective(ProProductDynamicManageSetting record);

    List<ProProductDynamicManageSetting> selectByExample(ProProductDynamicManageSettingExample example);

    ProProductDynamicManageSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDynamicManageSetting record, @Param("example") ProProductDynamicManageSettingExample example);

    int updateByExample(@Param("record") ProProductDynamicManageSetting record, @Param("example") ProProductDynamicManageSettingExample example);

    int updateByPrimaryKeySelective(ProProductDynamicManageSetting record);

    int updateByPrimaryKey(ProProductDynamicManageSetting record);
}