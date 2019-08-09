package com.holyrobot.util;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 周陈
 * @Title: 地理位置转换
 * @date 2019/3/18 18:44
 */
public class LocationUtils {

    // key
    private static final String KEY = "JJGBZ-2MYCV-3IJPW-UTJQ7-TZSIT-MZBRX";

    /**
     * @Description: 通过经纬度获取位置
     * @Param: [log, lat]
     * @return: java.lang.String
     * @Author: Alan
     * @Date: 2018/6/1 21:14
     */
    public static Map<String, Object> getLocation(String lng, String lat) {

        Map<String, Object> resultMap = new HashMap<String, Object>();

        // 参数解释：lng：经度，lat：维度。KEY：腾讯地图key，get_poi：返回状态。1返回，0不返回
        String urlString = "http://apis.map.qq.com/ws/geocoder/v1/?location=" + lat + "," + lng + "&key=" + KEY + "&get_poi=1";
        String result = "";
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            // 腾讯地图使用GET
            conn.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            // 获取地址解析结果
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
        } catch (Exception e) {
            e.getMessage();
        }

        // 转JSON格式
        JSONObject jsonObject = JSONObject.parseObject(result).getJSONObject("result");
        // 获取地址（行政区划信息） 包含有国籍，省份，城市
        JSONObject adInfo = jsonObject.getJSONObject("ad_info");
        resultMap.put("nation", adInfo.get("nation"));
        resultMap.put("nationCode", adInfo.get("nation_code"));
        resultMap.put("province", adInfo.get("province"));
        resultMap.put("provinceCode", adInfo.get("adcode"));
        resultMap.put("city", adInfo.get("city"));
        resultMap.put("cityCode", adInfo.get("city_code"));
        return resultMap;
    }

    public static void main(String[] args) {

        // 测试
        String lng = "111.546112";//经度
        String lat = "24.378622";//维度
        Map<String, Object> map = getLocation(lng, lat);
        System.out.println(map);
        System.out.println("国   籍：" + map.get("nation"));
        System.out.println("国家代码：" + map.get("nationCode"));
        System.out.println("省   份：" + map.get("province"));
        System.out.println("省份代码：" + map.get("provinceCode"));
        System.out.println("城   市：" + map.get("city"));
        System.out.println("城市代码：" + map.get("cityCode"));
    }
}