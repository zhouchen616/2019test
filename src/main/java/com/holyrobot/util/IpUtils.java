package com.holyrobot.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @Author: 周相儒
 * @Description: 根据IP 获取当前城市
 * @CreateDate: 2018/6/1 10:08
 * @Version: 1.0
 */
@Slf4j
@Component
public class IpUtils {

    public static String getIp(HttpServletRequest request , String url){
        String startcity = "city";
        String ipAddr = PublicipUtils.getIpAddr(request);
        try {
            HttpResponse responsess = HttpUtils.httpClientGet( url+ ipAddr);
            String data = responsess.getData();
            JSONObject parseObject = JSON.parseObject(data);
            log.info("*********ip请求返回参数:"+data);
            int code = Objects.nonNull(parseObject)? parseObject.getInteger("code") : 1;
            if (0 == code ) {
                JSONObject dataObject = parseObject.getJSONObject("data");
                startcity = dataObject.getString("city");
            }
        }catch (Exception e){
            return startcity;
        }
        return startcity;

    }



}
