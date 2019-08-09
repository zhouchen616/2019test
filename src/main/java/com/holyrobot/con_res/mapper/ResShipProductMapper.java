package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResShipProduct;
import com.holyrobot.con_res.pojo.ResShipProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResShipProductMapper {
    int countByExample(ResShipProductExample example);

    int deleteByExample(ResShipProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResShipProduct record);

    int insertSelective(ResShipProduct record);

    List<ResShipProduct> selectByExampleWithBLOBs(ResShipProductExample example);

    List<ResShipProduct> selectByExample(ResShipProductExample example);

    ResShipProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResShipProduct record, @Param("example") ResShipProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ResShipProduct record, @Param("example") ResShipProductExample example);

    int updateByExample(@Param("record") ResShipProduct record, @Param("example") ResShipProductExample example);

    int updateByPrimaryKeySelective(ResShipProduct record);

    int updateByPrimaryKeyWithBLOBs(ResShipProduct record);

    int updateByPrimaryKey(ResShipProduct record);
}