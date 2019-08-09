package com.holyrobot.con_common.server;

import com.holyrobot.con_om.pojo.OmDestination;
import com.holyrobot.dto.OmDestinationDto;
import com.holyrobot.response.Response;
import java.util.List;

/**
 * @author 周陈
 * @Title: 首页接口方法
 * @date 2019/3/11 15:50
 */
public interface IndexService {

    Response getDepAndDes(String siteId, String routeTypeId);
    /**
     * 　　* @Description: 分类页筛选条件
     * 　　* @author 周陈
     * 　　* @date 2019/3/11 15:51
     *
     */
    Response classifySearch(String siteId, String orgId);

    List<OmDestinationDto> findDestinationBySiteId(String siteId);

    List<OmDestination> findDestByRedis(String siteId, String routeTypeId);
    /**
     * @return List<OmDestination>
     * @Description 根据目的地父节点查询子节点集合
     * @author 周陈
     * @date 2018年4月17日 下午6:02:42
     * @action findOmDestinationBy
     */

    List<OmDestination> findOmDestinationById(String siteId, String routTypeId, String parentid);

    List<OmDestinationDto> findDestinationByRouteType(String siteId, String routeTypeId);

}
