package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.H5ShopComments;
import com.holyrobot.con_common.pojo.H5ShopCommentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface H5ShopCommentsMapper {
    int countByExample(H5ShopCommentsExample example);

    int deleteByExample(H5ShopCommentsExample example);

    int deleteByPrimaryKey(String id);

    int insert(H5ShopComments record);

    int insertSelective(H5ShopComments record);

    List<H5ShopComments> selectByExample(H5ShopCommentsExample example);

    H5ShopComments selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") H5ShopComments record, @Param("example") H5ShopCommentsExample example);

    int updateByExample(@Param("record") H5ShopComments record, @Param("example") H5ShopCommentsExample example);

    int updateByPrimaryKeySelective(H5ShopComments record);

    int updateByPrimaryKey(H5ShopComments record);
}