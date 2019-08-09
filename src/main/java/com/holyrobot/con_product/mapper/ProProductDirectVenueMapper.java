package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductDirectVenue;
import com.holyrobot.con_product.pojo.ProProductDirectVenueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDirectVenueMapper {
    int countByExample(ProProductDirectVenueExample example);

    int deleteByExample(ProProductDirectVenueExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDirectVenue record);

    int insertSelective(ProProductDirectVenue record);

    List<ProProductDirectVenue> selectByExample(ProProductDirectVenueExample example);

    ProProductDirectVenue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDirectVenue record, @Param("example") ProProductDirectVenueExample example);

    int updateByExample(@Param("record") ProProductDirectVenue record, @Param("example") ProProductDirectVenueExample example);

    int updateByPrimaryKeySelective(ProProductDirectVenue record);

    int updateByPrimaryKey(ProProductDirectVenue record);
}