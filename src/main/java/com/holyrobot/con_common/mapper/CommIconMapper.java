package com.holyrobot.con_common.mapper;

import com.holyrobot.dto.ProTypeIconDto;
import com.holyrobot.con_common.pojo.CommIcon;
import com.holyrobot.con_common.pojo.CommIconExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommIconMapper {
    int countByExample(CommIconExample example);

    int deleteByExample(CommIconExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommIcon record);

    int insertSelective(CommIcon record);

    List<CommIcon> selectByExample(CommIconExample example);

    CommIcon selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommIcon record, @Param("example") CommIconExample example);

    int updateByExample(@Param("record") CommIcon record, @Param("example") CommIconExample example);

    int updateByPrimaryKeySelective(CommIcon record);

    int updateByPrimaryKey(CommIcon record);

    List<ProTypeIconDto> selectProTypeIcon();
}