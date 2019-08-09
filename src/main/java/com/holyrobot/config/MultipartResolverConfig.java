package com.holyrobot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @Author: 周相儒
 * @Description: 配置multipartResolver
 * @CreateDate: 2018/6/7 14:36
 * @Version: 1.0
 */
@Configuration
public class MultipartResolverConfig {

    @Bean("multipartResolver")
    public CommonsMultipartResolver get(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        commonsMultipartResolver.setResolveLazily(true);
        commonsMultipartResolver.setMaxInMemorySize(40960);
        commonsMultipartResolver.setMaxUploadSize(50*1024*1024);
        return commonsMultipartResolver;
    }



}
