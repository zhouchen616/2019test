package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductDirectSalesRelation;
import com.holyrobot.con_product.pojo.ProProductDirectSalesRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDirectSalesRelationMapper {
    int countByExample(ProProductDirectSalesRelationExample example);

    int deleteByExample(ProProductDirectSalesRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDirectSalesRelation record);

    int insertSelective(ProProductDirectSalesRelation record);

    List<ProProductDirectSalesRelation> selectByExample(ProProductDirectSalesRelationExample example);

    ProProductDirectSalesRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDirectSalesRelation record, @Param("example") ProProductDirectSalesRelationExample example);

    int updateByExample(@Param("record") ProProductDirectSalesRelation record, @Param("example") ProProductDirectSalesRelationExample example);

    int updateByPrimaryKeySelective(ProProductDirectSalesRelation record);

    int updateByPrimaryKey(ProProductDirectSalesRelation record);

    int insertList(@Param("list") List<ProProductDirectSalesRelation> list);
}