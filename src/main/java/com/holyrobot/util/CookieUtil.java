package com.holyrobot.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 周陈
 * @Title: Cookie工具类
 * @date 2018/5/22 16:21
 */
public class CookieUtil {

    /**
     *  创建cookie
     * @param response
     * @param name
     * @param value
     * @param maxAge
     */
    public static void set(HttpServletResponse response,
                           String name,String value,
                           int maxAge){
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     *  获取Cookie
     * @param request
     * @param name
     * @return
     */
    public static Cookie get(HttpServletRequest request,
                             String name){
        Map<String, Cookie> map = readCookieMap(request);
        if(map.containsKey(name)){
            return map.get(name);
        }else{
            return null;
        }
    }

    /**
     * 将cookie封装成map
     * @param request
     * @return
     */
    public static Map<String,Cookie> readCookieMap(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        Map<String,Cookie> map = new HashMap<>();
        if(cookies != null){
            for(Cookie cookie : cookies){
                map.put(cookie.getName(),cookie);
            }
        }

        return map;
    }
}
