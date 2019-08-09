package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResTrainProduct;
import com.holyrobot.con_res.pojo.ResTrainProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResTrainProductMapper {
    int countByExample(ResTrainProductExample example);

    int deleteByExample(ResTrainProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResTrainProduct record);

    int insertSelective(ResTrainProduct record);

    List<ResTrainProduct> selectByExampleWithBLOBs(ResTrainProductExample example);

    List<ResTrainProduct> selectByExample(ResTrainProductExample example);

    ResTrainProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResTrainProduct record, @Param("example") ResTrainProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ResTrainProduct record, @Param("example") ResTrainProductExample example);

    int updateByExample(@Param("record") ResTrainProduct record, @Param("example") ResTrainProductExample example);

    int updateByPrimaryKeySelective(ResTrainProduct record);

    int updateByPrimaryKeyWithBLOBs(ResTrainProduct record);

    int updateByPrimaryKey(ResTrainProduct record);
}