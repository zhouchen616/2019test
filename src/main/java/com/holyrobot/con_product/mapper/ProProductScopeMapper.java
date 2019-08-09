package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductScope;
import com.holyrobot.con_product.pojo.ProProductScopeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductScopeMapper {
    int countByExample(ProProductScopeExample example);

    int deleteByExample(ProProductScopeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductScope record);

    int insertSelective(ProProductScope record);

    List<ProProductScope> selectByExample(ProProductScopeExample example);

    ProProductScope selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductScope record, @Param("example") ProProductScopeExample example);

    int updateByExample(@Param("record") ProProductScope record, @Param("example") ProProductScopeExample example);

    int updateByPrimaryKeySelective(ProProductScope record);

    int updateByPrimaryKey(ProProductScope record);
}