package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.OrgDestinationDto;
import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.ProductListDto;
import com.holyrobot.dto.ProductScheduleBo;
import com.holyrobot.con_product.pojo.ProProduct;
import com.holyrobot.con_product.pojo.ProProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductMapper {
    int countByExample(ProProductExample example);

    int deleteByExample(ProProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProduct record);

    int insertSelective(ProProduct record);

    List<ProProduct> selectByExampleWithBLOBs(ProProductExample example);

    List<ProProduct> selectByExample(ProProductExample example);

    ProProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExample(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByPrimaryKeySelective(ProProduct record);

    int updateByPrimaryKeyWithBLOBs(ProProduct record);

    int updateByPrimaryKey(ProProduct record);

    List<ProductScheduleBo> listProSchedule(String id);

    List<OrgDestinationDto> selectOrgDestination(String orgId);

    List<String> getDestinationByTourDays(@Param("orgId") String orgId, @Param("begin") int begin, @Param("end") int end);

    List<ProductListDto> selectProList(ProSearchCondition search);

    List<ProductListDto> newProductListByPromotion(ProSearchCondition proSearchCondition);

    ProProduct newGetById(@Param("id") String proId);

    List<ProductListDto> selectProBySiteAndOrdId(@Param("siteId") String siteId, @Param("orgId") String orgId);
}