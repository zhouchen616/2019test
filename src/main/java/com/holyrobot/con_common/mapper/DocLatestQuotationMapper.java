package com.holyrobot.con_common.mapper;

import com.holyrobot.con_common.pojo.DocLatestQuotation;
import com.holyrobot.con_common.pojo.DocLatestQuotationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocLatestQuotationMapper {
    int countByExample(DocLatestQuotationExample example);

    int deleteByExample(DocLatestQuotationExample example);

    int insert(DocLatestQuotation record);

    int insertSelective(DocLatestQuotation record);

    List<DocLatestQuotation> selectByExample(DocLatestQuotationExample example);

    int updateByExampleSelective(@Param("record") DocLatestQuotation record, @Param("example") DocLatestQuotationExample example);

    int updateByExample(@Param("record") DocLatestQuotation record, @Param("example") DocLatestQuotationExample example);

    List<DocLatestQuotation> selectByOrgId(String orgid);
}