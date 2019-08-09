package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResFlightProduct;
import com.holyrobot.con_res.pojo.ResFlightProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResFlightProductMapper {
    int countByExample(ResFlightProductExample example);

    int deleteByExample(ResFlightProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResFlightProduct record);

    int insertSelective(ResFlightProduct record);

    List<ResFlightProduct> selectByExample(ResFlightProductExample example);

    ResFlightProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResFlightProduct record, @Param("example") ResFlightProductExample example);

    int updateByExample(@Param("record") ResFlightProduct record, @Param("example") ResFlightProductExample example);

    int updateByPrimaryKeySelective(ResFlightProduct record);

    int updateByPrimaryKey(ResFlightProduct record);
}