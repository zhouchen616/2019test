package com.holyrobot.con_fin.mapper;

import com.holyrobot.con_fin.pojo.FinBankAccount;
import com.holyrobot.con_fin.pojo.FinBankAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinBankAccountMapper {
    int countByExample(FinBankAccountExample example);

    int deleteByExample(FinBankAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(FinBankAccount record);

    int insertSelective(FinBankAccount record);

    List<FinBankAccount> selectByExample(FinBankAccountExample example);

    FinBankAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FinBankAccount record, @Param("example") FinBankAccountExample example);

    int updateByExample(@Param("record") FinBankAccount record, @Param("example") FinBankAccountExample example);

    int updateByPrimaryKeySelective(FinBankAccount record);

    int updateByPrimaryKey(FinBankAccount record);
}