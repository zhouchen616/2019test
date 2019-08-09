package com.holyrobot.con_common.server;

import com.holyrobot.dto.ProTypeIconDto;
import java.util.List;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/7/1615:17
 */
public interface CommIconService {
    /**
     * 　　* @Description: 产品类型Icon
     * 　　* @author 周陈
     * 　　* @date 2018/7/16 15:35
     *
     */
    List<ProTypeIconDto> findProTypeIcon();
}
