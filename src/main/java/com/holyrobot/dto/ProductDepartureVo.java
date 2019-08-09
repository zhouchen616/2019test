package com.holyrobot.dto;




import com.holyrobot.con_product.pojo.ProProductDeparture;

import java.util.List;
import java.util.Map;

/**
 * @Author: 周相儒
 * @Description: 出发地封装类
 * @CreateDate: 2018/6/1 10:25
 * @Version: 1.0
 */
public class ProductDepartureVo {

    private ProProductDeparture departure;

    private List<ProProductDeparture> departures;

    private Map departuresGroup;

    public ProductDepartureVo(){}

    public ProductDepartureVo(ProProductDeparture departure, List<ProProductDeparture> departures, Map departuresGroup) {
        this.departure = departure;
        this.departures = departures;
        this.departuresGroup = departuresGroup;
    }

    public Map getDeparturesGroup() {
        return departuresGroup;
    }

    public void setDeparturesGroup(Map departuresGroup) {
        this.departuresGroup = departuresGroup;
    }

    public List<ProProductDeparture> getDepartures() {
        return departures;
    }

    public void setDepartures(List<ProProductDeparture> departures) {
        this.departures = departures;
    }

    public ProProductDeparture getDeparture() {
        return departure;
    }

    public void setDeparture(ProProductDeparture departure) {
        this.departure = departure;
    }
}
