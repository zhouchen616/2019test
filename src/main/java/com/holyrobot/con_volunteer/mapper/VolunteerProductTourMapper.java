package com.holyrobot.con_volunteer.mapper;


import com.holyrobot.con_volunteer.pojo.VolunteerProductTour;
import com.holyrobot.con_volunteer.pojo.VolunteerProductTourExample;
import com.holyrobot.dto.ManyToursDto;
import com.holyrobot.dto.RebatePriceDto;
import com.holyrobot.dto.TourBo;
import com.holyrobot.dto.TourPricePolicyBo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerProductTourMapper {
    int countByExample(VolunteerProductTourExample example);

    int deleteByExample(VolunteerProductTourExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerProductTour record);

    int insertSelective(VolunteerProductTour record);

    List<VolunteerProductTour> selectByExample(VolunteerProductTourExample example);

    VolunteerProductTour selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerProductTour record, @Param("example") VolunteerProductTourExample example);

    int updateByExample(@Param("record") VolunteerProductTour record, @Param("example") VolunteerProductTourExample example);

    int updateByPrimaryKeySelective(VolunteerProductTour record);

    int updateByPrimaryKey(VolunteerProductTour record);
    //批量插入志愿者团期
    int insertList(@Param("list") List<VolunteerProductTour> tours);

    List<String> selectTourIds(@Param("orgId") String orgId, @Param("proId") String proId, @Param("userId") String userId,
                               @Param("proStatus") Integer proStatus);

    List<TourBo> selectTourList(@Param("dates") String dates, @Param("proId") String proId,
                                @Param("siteId") String siteId, @Param("userId") String userId,
                                @Param("proStatus") Integer proStatus);

    List<TourBo> listTourLimit(@Param("proId") String proId, @Param("siteId") String siteId, @Param("userId") String userId,
                               @Param("proStatus") Integer proStatus);

    List<TourPricePolicyBo> listPricePolicy(@Param("tourID") String tourID, @Param("siteId") String siteId,
                                            @Param("userId") String userId, @Param("proStatus") Integer proStatus);
    //志愿者最低价
    RebatePriceDto selectMinRebatePrice(@Param("siteId") String siteId, @Param("proId") String proId,
                                        @Param("userId") String userId, @Param("proStatus") Integer proStatus);

    List<ManyToursDto> manyTours(@Param("tourDate") String tourDate, @Param("siteId") String siteId,
                                 @Param("orgId") String orgId, @Param("proId") String proId,
                                 @Param("userId") String userId, @Param("proStatus") Integer proStatus);

}