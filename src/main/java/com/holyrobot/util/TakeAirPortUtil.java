package com.holyrobot.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName： TakeAirPortUtil
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-30 17:22
 * @Version: 1.0
 * @Modified By:
 */
public class TakeAirPortUtil {

    public static String takeAirPort(String point, String url){
        Map<String, String> maps = new HashMap<>();
        maps.put("Content-Type", "application/json");

        if (StringUtils.isNotBlank(point) && point.matches("^[a-zA-Z]*")){
            HttpResponse httpResponse = HttpUtils.httpClientGet(url + point, maps);
            JSONArray jsonArray = JSONObject.parseArray(httpResponse.getData());
            String airportName = jsonArray.getJSONObject(0).getString("AirportName");
            System.out.println("`````机场信息获取成功`````");
            return airportName;
        }else {
            System.out.println("`````null return原来的机场信息`````");
            return point;
        }

    }
}
