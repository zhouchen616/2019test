package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductDirectSalesProduct;
import com.holyrobot.con_product.pojo.ProProductDirectSalesProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductDirectSalesProductMapper {
    int countByExample(ProProductDirectSalesProductExample example);

    int deleteByExample(ProProductDirectSalesProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductDirectSalesProduct record);

    int insertSelective(ProProductDirectSalesProduct record);

    List<ProProductDirectSalesProduct> selectByExample(ProProductDirectSalesProductExample example);

    ProProductDirectSalesProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductDirectSalesProduct record, @Param("example") ProProductDirectSalesProductExample example);

    int updateByExample(@Param("record") ProProductDirectSalesProduct record, @Param("example") ProProductDirectSalesProductExample example);

    int updateByPrimaryKeySelective(ProProductDirectSalesProduct record);

    int updateByPrimaryKey(ProProductDirectSalesProduct record);

    int selectProdutOuterTimes(@Param("proId") String proId, @Param("receiverId") String receiverId);

    int insertList(@Param("list") List<ProProductDirectSalesProduct> list);
}