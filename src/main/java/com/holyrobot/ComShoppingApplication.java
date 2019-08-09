package com.holyrobot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.holyrobot.*.mapper")
@SpringBootApplication
//开启定时任务
//@EnableScheduling
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class ComShoppingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ComShoppingApplication.class, args);
	}

}
