package com.holyrobot.con_om.mapper;

import com.holyrobot.con_om.pojo.OmDestination;
import com.holyrobot.con_om.pojo.OmDestinationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmDestinationMapper {
    int countByExample(OmDestinationExample example);

    int deleteByExample(OmDestinationExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmDestination record);

    int insertSelective(OmDestination record);

    List<OmDestination> selectByExample(OmDestinationExample example);

    OmDestination selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmDestination record, @Param("example") OmDestinationExample example);

    int updateByExample(@Param("record") OmDestination record, @Param("example") OmDestinationExample example);

    int updateByPrimaryKeySelective(OmDestination record);

    int updateByPrimaryKey(OmDestination record);

    List<OmDestination> selectBySiteIdAndRouteTypeId(@Param("siteId") String siteId, @Param("routeTypeId") String routeTypeId);

    List<OmDestination> selectBySiteIdAndGuoNeiRouteType(@Param("siteId") String siteId, @Param("routeTypeId") String routeTypeId);
}