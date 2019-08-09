package com.holyrobot.con_order.server.impl;

import com.holyrobot.con_order.mapper.OrdOrderTouristImgMapper;
import com.holyrobot.con_order.pojo.OrdOrderTouristImg;
import com.holyrobot.con_order.server.OrdOrderTouristImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 周相儒
 * @Description: 游客信息接口实现类
 * @CreateDate: 2018/7/2 10:40
 * @Version: 1.0
 */
@Service
public class OrdOrderTouristImgServiceImpl implements OrdOrderTouristImgService {

    @Autowired
    private OrdOrderTouristImgMapper ordOrderTouristImgMapper;

    
    /**
     * @Author: 周相儒
     * @Description: 添加方法
     * @Date:  2018/7/2
     * @return: int
     * @Param: ordOrderTouristImg
     */
    @Override
    public int addOrdOrderTouristImg(OrdOrderTouristImg ordOrderTouristImg) {
        return ordOrderTouristImgMapper.insert(ordOrderTouristImg);
    }
}
