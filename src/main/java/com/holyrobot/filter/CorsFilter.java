package com.holyrobot.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 周陈
 * @Title: 解决跨域的过滤器
 * @date 2018/5/16 10:29
 */
@Component
@Slf4j
public class CorsFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
//		log.info("过滤器-Origin:{}",request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Content-Type,header_token,Authorization");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		//显示请求url
//		log.info("过滤器-请求url:"+request.getRequestURL());
		chain.doFilter(req, res);
	}
	public void init(FilterConfig filterConfig) {
    }
	public void destroy() {}
}

