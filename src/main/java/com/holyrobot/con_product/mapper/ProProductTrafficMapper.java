package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductTraffic;
import com.holyrobot.con_product.pojo.ProProductTrafficExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductTrafficMapper {
    int countByExample(ProProductTrafficExample example);

    int deleteByExample(ProProductTrafficExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductTraffic record);

    int insertSelective(ProProductTraffic record);

    List<ProProductTraffic> selectByExample(ProProductTrafficExample example);

    ProProductTraffic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductTraffic record, @Param("example") ProProductTrafficExample example);

    int updateByExample(@Param("record") ProProductTraffic record, @Param("example") ProProductTrafficExample example);

    int updateByPrimaryKeySelective(ProProductTraffic record);

    int updateByPrimaryKey(ProProductTraffic record);
}