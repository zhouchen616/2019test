package com.holyrobot.con_product.mapper;

import com.holyrobot.con_product.pojo.ProProductStoreImage;
import com.holyrobot.con_product.pojo.ProProductStoreImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductStoreImageMapper {
    int countByExample(ProProductStoreImageExample example);

    int deleteByExample(ProProductStoreImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProProductStoreImage record);

    int insertSelective(ProProductStoreImage record);

    List<ProProductStoreImage> selectByExample(ProProductStoreImageExample example);

    ProProductStoreImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProProductStoreImage record, @Param("example") ProProductStoreImageExample example);

    int updateByExample(@Param("record") ProProductStoreImage record, @Param("example") ProProductStoreImageExample example);

    int updateByPrimaryKeySelective(ProProductStoreImage record);

    int updateByPrimaryKey(ProProductStoreImage record);
}