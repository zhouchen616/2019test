package com.holyrobot.con_product.server;

import com.holyrobot.con_product.pojo.ProProductStoreImage;

import java.util.List;

/**
 * @ClassName： ProProductStoreImageService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-12-3 10:29
 * @Version: 1.0
 * @Modified By:
 */
public interface ProProductStoreImageService {

    List<ProProductStoreImage> findByProId(String proId);
}
