/** 
 * Project Name:holyrobot-distribution-web 
 * File Name:Response.java 
 * Package Name:com.jingjie.response 
 * Date:2018年3月20日 下午6:30:00 
 * author 汤玉林
 */ 
package com.holyrobot.response;

import java.io.Serializable;

/**
 * Title: 统一响应结构 
 * Description:使用REST框架实现前后端分离架构，我们需要首先确定返回的JSON响应结构是统一的，
 * 也就是说，每个REST请求将返回相同结构的JSON响应结构。不妨定义一个相对通用的JSON响应结构，其
 * 中包含两部分：元数据与返回值，其中，元数据表示操作是否成功与返回值消息等，返回值对应服务端方法所返回的数据。
 * { "meta": { "success": true, "message": "ok" }, "data": ... }
 * @Description: 统一响应结构
 * @author 汤玉林
 * @date 2018年3月20日 下午6:30:00 
 */
public class Response implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String OK = "ok";
	private static final String ERROR = "error";

	private Meta meta;     // 元数据
	public int code;
	private Object data;// 响应内容

	public void setData(Object data) {
		this.data = data;
	}

	public Response success() {
		this.meta = new Meta(true, OK);
		this.code = 12000;
		return this;
	}

	public Response success(Object data) {
		this.meta = new Meta(true, OK);
		this.data = data;
		return this;
	}

	public Response success(Object data, int codevalue) {
		this.meta = new Meta(true, OK);
		this.data = data;
		this.code = codevalue;
		return this;
	}

	public Response failure() {
		this.meta = new Meta(false, ERROR);
		return this;
	}

	public Response failure(String message) {
		this.meta = new Meta(false, message);
		return this;
	}

	public Response success(String message) {
		this.meta = new Meta(true, message);
		return this;
	}

	public Response failure(String message, int code) {
		this.meta = new Meta(false, message);
		this.code=code;
		return this;
	}

	public Meta getMeta() {
		return meta;
	}

	public Object getData() {
		return data;
	}

	/**
	 * Title: 请求元数据
	 * @author rico
	 * @created 2017年7月4日 下午5:08:12
	 */
	public class Meta implements Serializable {
		private static final long serialVersionUID = 1L;

		private boolean success;
		private String message;

		public Meta(boolean success) {
			this.success = success;
		}

		public Meta(boolean success, String message) {
			this.success = success;
			this.message = message;
		}

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
}
