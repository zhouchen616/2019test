package com.holyrobot.util;

import java.io.Serializable;

/**
 * 
 * @Description: http响应信息
 * @author 汤玉林
 * @date 2018年3月28日 下午5:09:13
 */
public class HttpResponse implements Serializable{
	private static final long serialVersionUID = -8708194003374274689L;
	private int statusCode;
	private String data;

	public HttpResponse(){

	}

	public HttpResponse info(int status, String data){
		this.statusCode=status;
		this.data=data;
		return this;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HttpResponse [statusCode=" + statusCode + ", data=" + data
				+ "]";
	}
	
}