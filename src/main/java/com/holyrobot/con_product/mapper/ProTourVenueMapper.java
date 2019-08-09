package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProTourVenue;
import com.holyrobot.con_product.pojo.ProTourVenueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProTourVenueMapper {
    int countByExample(ProTourVenueExample example);

    int deleteByExample(ProTourVenueExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProTourVenue record);

    int insertSelective(ProTourVenue record);

    List<ProTourVenue> selectByExample(ProTourVenueExample example);

    ProTourVenue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProTourVenue record, @Param("example") ProTourVenueExample example);

    int updateByExample(@Param("record") ProTourVenue record, @Param("example") ProTourVenueExample example);

    int updateByPrimaryKeySelective(ProTourVenue record);

    int updateByPrimaryKey(ProTourVenue record);
}