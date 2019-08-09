package com.holyrobot.con_volunteer.mapper;


import com.holyrobot.con_volunteer.pojo.VolunteerProduct;
import com.holyrobot.con_volunteer.pojo.VolunteerProductExample;
import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.ProductListDto;
import com.holyrobot.dto.UpdateVolProductVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolunteerProductMapper {
    int countByExample(VolunteerProductExample example);

    int deleteByExample(VolunteerProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(VolunteerProduct record);

    int insertSelective(VolunteerProduct record);

    List<VolunteerProduct> selectByExample(VolunteerProductExample example);

    VolunteerProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VolunteerProduct record, @Param("example") VolunteerProductExample example);

    int updateByExample(@Param("record") VolunteerProduct record, @Param("example") VolunteerProductExample example);

    int updateByPrimaryKeySelective(VolunteerProduct record);

    int updateByPrimaryKey(VolunteerProduct record);
    //批量插入志愿者产品
    int insertList(@Param("list") List<VolunteerProduct> pro);
    //货架查询
    List<ProductListDto> selectGoodsShelf(ProSearchCondition search);
    //志愿者产品管理查询
    List<ProductListDto> selectVolProductManage(ProSearchCondition proSearchCondition);

    int updateVolProduct(UpdateVolProductVo updateVolProductVo);

    List<String> getDestinationByTourDays(@Param("userId") String userId, @Param("begin") int begin, @Param("end") int end);

    int updateAutoStatus(String id);
}