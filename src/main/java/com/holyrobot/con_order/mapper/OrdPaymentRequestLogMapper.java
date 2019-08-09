package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdPaymentRequestLog;
import com.holyrobot.con_order.pojo.OrdPaymentRequestLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdPaymentRequestLogMapper {
    int countByExample(OrdPaymentRequestLogExample example);

    int deleteByExample(OrdPaymentRequestLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdPaymentRequestLog record);

    int insertSelective(OrdPaymentRequestLog record);

    List<OrdPaymentRequestLog> selectByExample(OrdPaymentRequestLogExample example);

    OrdPaymentRequestLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdPaymentRequestLog record, @Param("example") OrdPaymentRequestLogExample example);

    int updateByExample(@Param("record") OrdPaymentRequestLog record, @Param("example") OrdPaymentRequestLogExample example);

    int updateByPrimaryKeySelective(OrdPaymentRequestLog record);

    int updateByPrimaryKey(OrdPaymentRequestLog record);
}