package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOtherOrderVoucherPic;
import com.holyrobot.con_order.pojo.OrdOtherOrderVoucherPicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOtherOrderVoucherPicMapper {
    int countByExample(OrdOtherOrderVoucherPicExample example);

    int deleteByExample(OrdOtherOrderVoucherPicExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOtherOrderVoucherPic record);

    int insertSelective(OrdOtherOrderVoucherPic record);

    List<OrdOtherOrderVoucherPic> selectByExample(OrdOtherOrderVoucherPicExample example);

    OrdOtherOrderVoucherPic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOtherOrderVoucherPic record, @Param("example") OrdOtherOrderVoucherPicExample example);

    int updateByExample(@Param("record") OrdOtherOrderVoucherPic record, @Param("example") OrdOtherOrderVoucherPicExample example);

    int updateByPrimaryKeySelective(OrdOtherOrderVoucherPic record);

    int updateByPrimaryKey(OrdOtherOrderVoucherPic record);
}