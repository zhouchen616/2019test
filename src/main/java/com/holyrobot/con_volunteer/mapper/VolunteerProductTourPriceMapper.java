package com.holyrobot.con_volunteer.mapper;


import com.holyrobot.con_volunteer.pojo.VolunteerProductTourPrice;
import com.holyrobot.con_volunteer.pojo.VolunteerProductTourPriceExample;
import com.holyrobot.dto.ProductDetailPriceDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerProductTourPriceMapper {
    int countByExample(VolunteerProductTourPriceExample example);

    int deleteByExample(VolunteerProductTourPriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerProductTourPrice record);

    int insertSelective(VolunteerProductTourPrice record);

    List<VolunteerProductTourPrice> selectByExample(VolunteerProductTourPriceExample example);

    VolunteerProductTourPrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerProductTourPrice record, @Param("example") VolunteerProductTourPriceExample example);

    int updateByExample(@Param("record") VolunteerProductTourPrice record, @Param("example") VolunteerProductTourPriceExample example);

    int updateByPrimaryKeySelective(VolunteerProductTourPrice record);

    int updateByPrimaryKey(VolunteerProductTourPrice record);

    //批量插入志愿者团期价格
    int insertList(@Param("list") List<VolunteerProductTourPrice> prices);

    ProductDetailPriceDto selectTourPriceBySale(@Param("proId") String proId, @Param("siteId") String siteId,
                                                @Param("userId") String userId, @Param("proStatus") Integer proStatus);

}