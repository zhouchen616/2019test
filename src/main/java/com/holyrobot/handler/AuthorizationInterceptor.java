package com.holyrobot.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author 周陈
 * @Title: 自定义拦截器，对请求进行token验证
 * @date 2018/5/23 11:34
 */
@Slf4j
@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    /**
     * 用户缓存token的键
     */
    @Value("${user_session_key}")
    public String user_session_key;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        log.info("***********进入拦截器*************");
        String requestUrl = request.getRequestURI();
        //拦截除/wechat之外的所有请求，判断有没有登录
        if (!requestUrl.contains("/wechat")) {
            log.info("进入intercepter url:" + requestUrl);
            Object wxUserInfo = request.getSession().getAttribute("wxUserInfo");
            if (Objects.isNull(wxUserInfo)) {
                //登录信息过期或者没有登录
                request.getSession().invalidate();
                //throw new CookieException();
            } else {
                return true;
            }
        }
        return true;
    }

}
