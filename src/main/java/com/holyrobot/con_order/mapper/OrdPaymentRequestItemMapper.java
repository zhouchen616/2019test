package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdPaymentRequestItem;
import com.holyrobot.con_order.pojo.OrdPaymentRequestItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdPaymentRequestItemMapper {
    int countByExample(OrdPaymentRequestItemExample example);

    int deleteByExample(OrdPaymentRequestItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdPaymentRequestItem record);

    int insertSelective(OrdPaymentRequestItem record);

    List<OrdPaymentRequestItem> selectByExample(OrdPaymentRequestItemExample example);

    OrdPaymentRequestItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdPaymentRequestItem record, @Param("example") OrdPaymentRequestItemExample example);

    int updateByExample(@Param("record") OrdPaymentRequestItem record, @Param("example") OrdPaymentRequestItemExample example);

    int updateByPrimaryKeySelective(OrdPaymentRequestItem record);

    int updateByPrimaryKey(OrdPaymentRequestItem record);
}