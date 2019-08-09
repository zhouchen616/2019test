package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductFile;
import com.holyrobot.con_product.pojo.ProProductFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductFileMapper {
    int countByExample(ProProductFileExample example);

    int deleteByExample(ProProductFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductFile record);

    int insertSelective(ProProductFile record);

    List<ProProductFile> selectByExample(ProProductFileExample example);

    ProProductFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductFile record, @Param("example") ProProductFileExample example);

    int updateByExample(@Param("record") ProProductFile record, @Param("example") ProProductFileExample example);

    int updateByPrimaryKeySelective(ProProductFile record);

    int updateByPrimaryKey(ProProductFile record);
}