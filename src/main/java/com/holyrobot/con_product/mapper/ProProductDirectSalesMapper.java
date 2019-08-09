package com.holyrobot.con_product.mapper;

import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.ProductListDto;
import com.holyrobot.con_product.pojo.ProProductDirectSales;
import com.holyrobot.con_product.pojo.ProProductDirectSalesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDirectSalesMapper {
    int countByExample(ProProductDirectSalesExample example);

    int deleteByExample(ProProductDirectSalesExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDirectSales record);

    int insertSelective(ProProductDirectSales record);

    List<ProProductDirectSales> selectByExample(ProProductDirectSalesExample example);

    ProProductDirectSales selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDirectSales record, @Param("example") ProProductDirectSalesExample example);

    int updateByExample(@Param("record") ProProductDirectSales record, @Param("example") ProProductDirectSalesExample example);

    int updateByPrimaryKeySelective(ProProductDirectSales record);

    int updateByPrimaryKey(ProProductDirectSales record);

    int insertList(@Param("list") List<ProProductDirectSales> list);

    List<String> selectTourIds(@Param("supplierId") String supplierId, @Param("receiverId") String receiverId, @Param("proId") String proId);

    //货架查询
    List<ProductListDto> selectGoodsShelf(ProSearchCondition search);
}