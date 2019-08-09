package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductDestination;
import com.holyrobot.con_product.pojo.ProProductDestinationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDestinationMapper {
    int countByExample(ProProductDestinationExample example);

    int deleteByExample(ProProductDestinationExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDestination record);

    int insertSelective(ProProductDestination record);

    List<ProProductDestination> selectByExample(ProProductDestinationExample example);

    ProProductDestination selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDestination record, @Param("example") ProProductDestinationExample example);

    int updateByExample(@Param("record") ProProductDestination record, @Param("example") ProProductDestinationExample example);

    int updateByPrimaryKeySelective(ProProductDestination record);

    int updateByPrimaryKey(ProProductDestination record);
}