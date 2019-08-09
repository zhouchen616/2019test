package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.*;
import com.holyrobot.con_product.pojo.ProTour;
import com.holyrobot.con_product.pojo.ProTourExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProTourMapper {
    int countByExample(ProTourExample example);

    int deleteByExample(ProTourExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProTour record);

    int insertSelective(ProTour record);

    List<ProTour> selectByExample(ProTourExample example);

    ProTour selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProTour record, @Param("example") ProTourExample example);

    int updateByExample(@Param("record") ProTour record, @Param("example") ProTourExample example);

    int updateByPrimaryKeySelective(ProTour record);

    int updateByPrimaryKey(ProTour record);

    List<TourVenueBo> listVenue(String id);

    List<TourPricePolicyBo> listPricePolicy(@Param("id") String id, @Param("siteId") String siteId);

    List<ProductTourOrderInfoBo> listTourOrder(@Param("id") String id, @Param("tourDate") String tourDate);

    List<TourBo> listTour(@Param("id") String id, @Param("tourDate") String tourDate, @Param("siteId") String siteId);

    List<TourBo> listTourLimit(@Param("id") String id, @Param("tourDate") String tourDate, @Param("siteId") String siteId);

    ProductDetailPriceDto selectTourPriceByDirect(@Param("proId") String proId, @Param("siteId") String siteId);

    ProductDetailPriceDto selectTourPriceBySale(@Param("proId") String proId, @Param("siteId") String siteId);

    int selectVisitorNumByTours(@Param("tourId") String tourId);

    List<ManyToursDto> manyTours(@Param("tourDate") String tourDate, @Param("siteId") String siteId, @Param("proId") String proId);

}