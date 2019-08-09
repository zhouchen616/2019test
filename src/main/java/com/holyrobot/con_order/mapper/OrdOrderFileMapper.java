package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderFile;
import com.holyrobot.con_order.pojo.OrdOrderFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderFileMapper {
    int countByExample(OrdOrderFileExample example);

    int deleteByExample(OrdOrderFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderFile record);

    int insertSelective(OrdOrderFile record);

    List<OrdOrderFile> selectByExample(OrdOrderFileExample example);

    OrdOrderFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderFile record, @Param("example") OrdOrderFileExample example);

    int updateByExample(@Param("record") OrdOrderFile record, @Param("example") OrdOrderFileExample example);

    int updateByPrimaryKeySelective(OrdOrderFile record);

    int updateByPrimaryKey(OrdOrderFile record);
}