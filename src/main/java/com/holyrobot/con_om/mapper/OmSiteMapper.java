package com.holyrobot.con_om.mapper;

import com.holyrobot.bo.OmDestinationBo;
import com.holyrobot.dto.DefaultSiteDto;
import com.holyrobot.con_om.pojo.OmSite;
import com.holyrobot.con_om.pojo.OmSiteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmSiteMapper {
    int countByExample(OmSiteExample example);

    int deleteByExample(OmSiteExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmSite record);

    int insertSelective(OmSite record);

    List<OmSite> selectByExample(OmSiteExample example);

    OmSite selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmSite record, @Param("example") OmSiteExample example);

    int updateByExample(@Param("record") OmSite record, @Param("example") OmSiteExample example);

    int updateByPrimaryKeySelective(OmSite record);

    int updateByPrimaryKey(OmSite record);
    
    List<OmSite> selectAll();
    
    List<OmDestinationBo> getProductAdnDestinationBysiteid(String siteid);

    List<OmSite> selectSiteByOrgId(String orgId);
    /**
     * 　　* @Description: 通过orgId查询产品最多的站点
     * 　　* @author 周陈
     * 　　* @date 2018/11/29 17:10
     *
     */
    DefaultSiteDto selectDefaultSiteByOrgId(String orgId);
}