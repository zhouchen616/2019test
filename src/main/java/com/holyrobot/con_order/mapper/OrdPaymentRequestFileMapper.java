package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdPaymentRequestFile;
import com.holyrobot.con_order.pojo.OrdPaymentRequestFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdPaymentRequestFileMapper {
    int countByExample(OrdPaymentRequestFileExample example);

    int deleteByExample(OrdPaymentRequestFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdPaymentRequestFile record);

    int insertSelective(OrdPaymentRequestFile record);

    List<OrdPaymentRequestFile> selectByExample(OrdPaymentRequestFileExample example);

    OrdPaymentRequestFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdPaymentRequestFile record, @Param("example") OrdPaymentRequestFileExample example);

    int updateByExample(@Param("record") OrdPaymentRequestFile record, @Param("example") OrdPaymentRequestFileExample example);

    int updateByPrimaryKeySelective(OrdPaymentRequestFile record);

    int updateByPrimaryKey(OrdPaymentRequestFile record);
}