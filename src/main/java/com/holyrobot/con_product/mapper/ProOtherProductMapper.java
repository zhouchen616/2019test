package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProOtherProduct;
import com.holyrobot.con_product.pojo.ProOtherProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProOtherProductMapper {
    int countByExample(ProOtherProductExample example);

    int deleteByExample(ProOtherProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProOtherProduct record);

    int insertSelective(ProOtherProduct record);

    List<ProOtherProduct> selectByExample(ProOtherProductExample example);

    ProOtherProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProOtherProduct record, @Param("example") ProOtherProductExample example);

    int updateByExample(@Param("record") ProOtherProduct record, @Param("example") ProOtherProductExample example);

    int updateByPrimaryKeySelective(ProOtherProduct record);

    int updateByPrimaryKey(ProOtherProduct record);
}