/** 
 * Project Name:holyrobot-common 
 * File Name:ProductScheduleBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月13日 下午2:17:20 
 * author 汤玉林
 */ 
package com.holyrobot.dto;



import com.holyrobot.con_product.pojo.ProProductScheduleImage;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: 周相儒
 * @Description: 行程返回信息封装
 * @Date:  2018/7/24
 */
public class ProductScheduleBo implements Serializable{

	private static final long serialVersionUID = 8128216527316254160L;

	private List<ProProductScheduleImage> images;

	private String schId;
	
	private int schDay;
	
	private String schName;
	
	private String schInfo;
	
	private String schStay;
	
	private int schRepast;

	private String schRepastInfo; //用户描述 用餐信息

	public String getSchRepastInfo() {
		return schRepastInfo;
	}

	public void setSchRepastInfo(String schRepastInfo) {
		this.schRepastInfo = schRepastInfo;
	}

	public List<ProProductScheduleImage> getImages() {
		return images;
	}

	public void setImages(List<ProProductScheduleImage> images) {
		this.images = images;
	}

	public int getSchDay() {
		return schDay;
	}

	public void setSchDay(int schDay) {
		this.schDay = schDay;
	}

	public String getSchName() {
		return schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}

	public String getSchInfo() {
		return schInfo;
	}

	public void setSchInfo(String schInfo) {
		this.schInfo = schInfo;
	}

	public String getSchStay() {
		return schStay;
	}

	public void setSchStay(String schStay) {
		this.schStay = schStay;
	}

	public int getSchRepast() {
		return schRepast;
	}

	public void setSchRepast(int schRepast) {
		this.schRepast = schRepast;
	}

	public String getSchId() {
		return schId;
	}

	public void setSchId(String schId) {
		this.schId = schId;
	}
}
