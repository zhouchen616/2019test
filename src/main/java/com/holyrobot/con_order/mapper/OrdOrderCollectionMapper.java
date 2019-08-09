package com.holyrobot.con_order.mapper;

import com.holyrobot.con_order.pojo.OrdOrderCollection;
import com.holyrobot.con_order.pojo.OrdOrderCollectionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdOrderCollectionMapper {
    int countByExample(OrdOrderCollectionExample example);

    int deleteByExample(OrdOrderCollectionExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderCollection record);

    int insertSelective(OrdOrderCollection record);

    List<OrdOrderCollection> selectByExample(OrdOrderCollectionExample example);

    OrdOrderCollection selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderCollection record, @Param("example") OrdOrderCollectionExample example);

    int updateByExample(@Param("record") OrdOrderCollection record, @Param("example") OrdOrderCollectionExample example);

    int updateByPrimaryKeySelective(OrdOrderCollection record);

    int updateByPrimaryKey(OrdOrderCollection record);
}