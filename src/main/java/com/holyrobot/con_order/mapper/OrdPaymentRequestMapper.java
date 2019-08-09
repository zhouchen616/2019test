package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdPaymentRequest;
import com.holyrobot.con_order.pojo.OrdPaymentRequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdPaymentRequestMapper {
    int countByExample(OrdPaymentRequestExample example);

    int deleteByExample(OrdPaymentRequestExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdPaymentRequest record);

    int insertSelective(OrdPaymentRequest record);

    List<OrdPaymentRequest> selectByExample(OrdPaymentRequestExample example);

    OrdPaymentRequest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdPaymentRequest record, @Param("example") OrdPaymentRequestExample example);

    int updateByExample(@Param("record") OrdPaymentRequest record, @Param("example") OrdPaymentRequestExample example);

    int updateByPrimaryKeySelective(OrdPaymentRequest record);

    int updateByPrimaryKey(OrdPaymentRequest record);
}