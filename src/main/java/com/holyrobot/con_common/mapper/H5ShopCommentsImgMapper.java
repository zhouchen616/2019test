package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.H5ShopCommentsImg;
import com.holyrobot.con_common.pojo.H5ShopCommentsImgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface H5ShopCommentsImgMapper {
    int countByExample(H5ShopCommentsImgExample example);

    int deleteByExample(H5ShopCommentsImgExample example);

    int deleteByPrimaryKey(String id);

    int insert(H5ShopCommentsImg record);

    int insertSelective(H5ShopCommentsImg record);

    List<H5ShopCommentsImg> selectByExample(H5ShopCommentsImgExample example);

    H5ShopCommentsImg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") H5ShopCommentsImg record, @Param("example") H5ShopCommentsImgExample example);

    int updateByExample(@Param("record") H5ShopCommentsImg record, @Param("example") H5ShopCommentsImgExample example);

    int updateByPrimaryKeySelective(H5ShopCommentsImg record);

    int updateByPrimaryKey(H5ShopCommentsImg record);
}