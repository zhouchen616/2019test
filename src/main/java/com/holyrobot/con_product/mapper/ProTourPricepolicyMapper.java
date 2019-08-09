package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.RebatePriceDto;
import com.holyrobot.dto.VolunteerProIdAndTypeDto;
import com.holyrobot.con_product.pojo.ProTourPricepolicy;
import com.holyrobot.con_product.pojo.ProTourPricepolicyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProTourPricepolicyMapper {
    int countByExample(ProTourPricepolicyExample example);

    int deleteByExample(ProTourPricepolicyExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProTourPricepolicy record);

    int insertSelective(ProTourPricepolicy record);

    List<ProTourPricepolicy> selectByExample(ProTourPricepolicyExample example);

    ProTourPricepolicy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProTourPricepolicy record, @Param("example") ProTourPricepolicyExample example);

    int updateByExample(@Param("record") ProTourPricepolicy record, @Param("example") ProTourPricepolicyExample example);

    int updateByPrimaryKeySelective(ProTourPricepolicy record);

    int updateByPrimaryKey(ProTourPricepolicy record);

    List<ProTourPricepolicy> selectByIds(@Param("ids") List<String> ids);

    RebatePriceDto selectMinRebatePrice(@Param("siteId") String siteId, @Param("proIds") List<VolunteerProIdAndTypeDto> proIds);
}