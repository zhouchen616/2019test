package com.holyrobot.util;

import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @Description: TODO
 * @author 赵乐
 * @date 2018年4月11日 上午11:32:10
 */
@Component
public class PublicipUtils {
	
	/**
	 * 
	 * @Description 获取本地ip的方法
	 * @author 赵乐
	 * @date 2018年4月11日 下午1:52:48
	 * @action getLocalAddress
	 * @param @return
	 * @return String
	 */
	public static String getLocalAddress(){
		String ip = "";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ip;
	}
	
	/**
	 * 
	 * @Description 获取当前网络ip
	 * @author 赵乐
	 * @date 2018年4月11日 下午2:23:28
	 * @action getIpAddr
	 * @param @param request
	 * @param @return
	 * @return String
	 */
    public static String getIpAddr(HttpServletRequest request){
        String ipAddress = request.getHeader("X-Forwarded-For");  
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getHeader("Proxy-Client-IP");  
            }
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getHeader("WL-Proxy-Client-IP");  
            }
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getHeader("X-Real-IP");  
            }  
            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
                ipAddress = request.getRemoteAddr();  
                if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){  
                    //根据网卡取本机配置的IP  
                    InetAddress inet=null;  
                    try {  
                        inet = InetAddress.getLocalHost();  
                    } catch (UnknownHostException e) {  
                        e.printStackTrace();  
                    }  
                    ipAddress= inet.getHostAddress();  
                }  
            }  
            //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
            if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15  
                if(ipAddress.indexOf(",")>0){  
                    ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));  
                }  
            }  
            return ipAddress;   
    }


    /**
     * @Author: 周相儒
     * @Description: 获取请求中的浏览器类型
     * @Date:  2018/7/20
     * @return: String
     * @Param: request
     */
    public static String getBrowser(HttpServletRequest request){
		UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        return userAgent.getBrowser().toString();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String publicIP = getLocalAddress();
		System.out.println(publicIP);
	}

}
