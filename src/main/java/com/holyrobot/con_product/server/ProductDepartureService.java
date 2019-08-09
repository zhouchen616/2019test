package com.holyrobot.con_product.server;

import com.holyrobot.con_product.pojo.ProProductDeparture;
import com.holyrobot.con_product.pojo.ProProductDepartureExample;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/16 15:45
 * @Version: 1.0
 */
public interface ProductDepartureService {


    List<ProProductDeparture> getDeparture(ProProductDepartureExample example);

}
