package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdTourinfoDoc;
import com.holyrobot.con_order.pojo.OrdTourinfoDocExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdTourinfoDocMapper {
    int countByExample(OrdTourinfoDocExample example);

    int deleteByExample(OrdTourinfoDocExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdTourinfoDoc record);

    int insertSelective(OrdTourinfoDoc record);

    List<OrdTourinfoDoc> selectByExample(OrdTourinfoDocExample example);

    OrdTourinfoDoc selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdTourinfoDoc record, @Param("example") OrdTourinfoDocExample example);

    int updateByExample(@Param("record") OrdTourinfoDoc record, @Param("example") OrdTourinfoDocExample example);

    int updateByPrimaryKeySelective(OrdTourinfoDoc record);

    int updateByPrimaryKey(OrdTourinfoDoc record);
}