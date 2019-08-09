package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderTouristImg;
import com.holyrobot.con_order.pojo.OrdOrderTouristImgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderTouristImgMapper {
    int countByExample(OrdOrderTouristImgExample example);

    int deleteByExample(OrdOrderTouristImgExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderTouristImg record);

    int insertSelective(OrdOrderTouristImg record);

    List<OrdOrderTouristImg> selectByExample(OrdOrderTouristImgExample example);

    OrdOrderTouristImg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderTouristImg record, @Param("example") OrdOrderTouristImgExample example);

    int updateByExample(@Param("record") OrdOrderTouristImg record, @Param("example") OrdOrderTouristImgExample example);

    int updateByPrimaryKeySelective(OrdOrderTouristImg record);

    int updateByPrimaryKey(OrdOrderTouristImg record);
}