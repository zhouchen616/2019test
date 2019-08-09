package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.ManyToursDto;
import com.holyrobot.dto.ProProductDeparturePriceDto;
import com.holyrobot.dto.TourBo;
import com.holyrobot.dto.TourPricePolicyBo;
import com.holyrobot.con_product.pojo.ProProductDeparture;
import com.holyrobot.con_product.pojo.ProProductDepartureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDepartureMapper {
    int countByExample(ProProductDepartureExample example);

    int deleteByExample(ProProductDepartureExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDeparture record);

    int insertSelective(ProProductDeparture record);

    List<ProProductDeparture> selectByExample(ProProductDepartureExample example);

    ProProductDeparture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDeparture record, @Param("example") ProProductDepartureExample example);

    int updateByExample(@Param("record") ProProductDeparture record, @Param("example") ProProductDepartureExample example);

    int updateByPrimaryKeySelective(ProProductDeparture record);

    int updateByPrimaryKey(ProProductDeparture record);

    ProProductDeparturePriceDto findDeparturePrice(@Param("proId") String proId, @Param("siteId") String siteId, @Param("orgId") String orgId);

    List<TourBo> selectTourListAll(@Param("dates") List<String> dates, @Param("proId") String proId, @Param("siteId") String siteId);

    List<TourBo> selectTourList(@Param("dates") String dates, @Param("proId") String proId, @Param("siteId") String siteId, @Param("orgId") String orgId);

    List<TourPricePolicyBo> listPricePolicy(@Param("tourID") String tourID, @Param("siteId") String siteId, @Param("orgId") String orgId);

    List<ManyToursDto> manyTours(@Param("tourDate") String tourDate, @Param("siteId") String siteId, @Param("orgId") String orgId, @Param("proId") String proId);


}