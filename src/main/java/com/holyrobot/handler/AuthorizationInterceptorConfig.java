package com.holyrobot.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 周陈
 * @Title: 微信授权拦截器配置类
 * @date 2018/5/23 12:49
 */
@SpringBootConfiguration
public class AuthorizationInterceptorConfig implements WebMvcConfigurer{

    @Autowired
    private AuthorizationInterceptor authorizationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
//       registry.addInterceptor(authorizationInterceptor).addPathPatterns("/**").excludePathPatterns("/wechat/**");
    }
}
