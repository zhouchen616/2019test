package com.holyrobot.con_res.mapper;

import com.holyrobot.con_res.pojo.ResBusProduct;
import com.holyrobot.con_res.pojo.ResBusProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResBusProductMapper {
    int countByExample(ResBusProductExample example);

    int deleteByExample(ResBusProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResBusProduct record);

    int insertSelective(ResBusProduct record);

    List<ResBusProduct> selectByExampleWithBLOBs(ResBusProductExample example);

    List<ResBusProduct> selectByExample(ResBusProductExample example);

    ResBusProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResBusProduct record, @Param("example") ResBusProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ResBusProduct record, @Param("example") ResBusProductExample example);

    int updateByExample(@Param("record") ResBusProduct record, @Param("example") ResBusProductExample example);

    int updateByPrimaryKeySelective(ResBusProduct record);

    int updateByPrimaryKeyWithBLOBs(ResBusProduct record);

    int updateByPrimaryKey(ResBusProduct record);
}