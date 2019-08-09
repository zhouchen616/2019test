package com.holyrobot.con_fin.mapper;

import com.holyrobot.con_fin.pojo.FinSupplierDynamicManagement;
import com.holyrobot.con_fin.pojo.FinSupplierDynamicManagementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinSupplierDynamicManagementMapper {
    int countByExample(FinSupplierDynamicManagementExample example);

    int deleteByExample(FinSupplierDynamicManagementExample example);

    int deleteByPrimaryKey(String id);

    int insert(FinSupplierDynamicManagement record);

    int insertSelective(FinSupplierDynamicManagement record);

    List<FinSupplierDynamicManagement> selectByExample(FinSupplierDynamicManagementExample example);

    FinSupplierDynamicManagement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FinSupplierDynamicManagement record, @Param("example") FinSupplierDynamicManagementExample example);

    int updateByExample(@Param("record") FinSupplierDynamicManagement record, @Param("example") FinSupplierDynamicManagementExample example);

    int updateByPrimaryKeySelective(FinSupplierDynamicManagement record);

    int updateByPrimaryKey(FinSupplierDynamicManagement record);
}