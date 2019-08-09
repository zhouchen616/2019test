package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductScheduleImage;
import com.holyrobot.con_product.pojo.ProProductScheduleImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductScheduleImageMapper {
    int countByExample(ProProductScheduleImageExample example);

    int deleteByExample(ProProductScheduleImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductScheduleImage record);

    int insertSelective(ProProductScheduleImage record);

    List<ProProductScheduleImage> selectByExampleWithBLOBs(ProProductScheduleImageExample example);

    List<ProProductScheduleImage> selectByExample(ProProductScheduleImageExample example);

    ProProductScheduleImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductScheduleImage record, @Param("example") ProProductScheduleImageExample example);

    int updateByExampleWithBLOBs(@Param("record") ProProductScheduleImage record, @Param("example") ProProductScheduleImageExample example);

    int updateByExample(@Param("record") ProProductScheduleImage record, @Param("example") ProProductScheduleImageExample example);

    int updateByPrimaryKeySelective(ProProductScheduleImage record);

    int updateByPrimaryKeyWithBLOBs(ProProductScheduleImage record);

    int updateByPrimaryKey(ProProductScheduleImage record);
}