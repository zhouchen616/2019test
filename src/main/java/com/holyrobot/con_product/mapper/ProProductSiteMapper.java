package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductSite;
import com.holyrobot.con_product.pojo.ProProductSiteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductSiteMapper {
    int countByExample(ProProductSiteExample example);

    int deleteByExample(ProProductSiteExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductSite record);

    int insertSelective(ProProductSite record);

    List<ProProductSite> selectByExample(ProProductSiteExample example);

    ProProductSite selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductSite record, @Param("example") ProProductSiteExample example);

    int updateByExample(@Param("record") ProProductSite record, @Param("example") ProProductSiteExample example);

    int updateByPrimaryKeySelective(ProProductSite record);

    int updateByPrimaryKey(ProProductSite record);
}