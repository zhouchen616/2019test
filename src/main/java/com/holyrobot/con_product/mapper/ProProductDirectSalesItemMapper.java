package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.RebatePriceDto;
import com.holyrobot.dto.TourBo;
import com.holyrobot.con_product.pojo.ProProductDirectSalesItem;
import com.holyrobot.con_product.pojo.ProProductDirectSalesItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDirectSalesItemMapper {
    int countByExample(ProProductDirectSalesItemExample example);

    int deleteByExample(ProProductDirectSalesItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDirectSalesItem record);

    int insertSelective(ProProductDirectSalesItem record);

    List<ProProductDirectSalesItem> selectByExample(ProProductDirectSalesItemExample example);

    ProProductDirectSalesItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDirectSalesItem record, @Param("example") ProProductDirectSalesItemExample example);

    int updateByExample(@Param("record") ProProductDirectSalesItem record, @Param("example") ProProductDirectSalesItemExample example);

    int updateByPrimaryKeySelective(ProProductDirectSalesItem record);

    int updateByPrimaryKey(ProProductDirectSalesItem record);

    List<TourBo> listTourLimit(@Param("id") String id, @Param("siteId") String siteId);

    RebatePriceDto selectMinRebatePrice(@Param("siteId") String siteId, @Param("proId") String proId,
                                        @Param("orgId") String orgId, @Param("directSalesSendId") String directSalesSendId);

    int insertList(@Param("list") List<ProProductDirectSalesItem> list);
}