/** 
 * Project Name:holyrobot-common 
 * File Name:ProScheduleImageBo.java 
 * Package Name:com.jingjie.bo 
 * Date:2018年4月13日 下午2:17:45 
 * author 汤玉林
 */ 
package com.holyrobot.dto;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年4月13日 下午2:17:45 
 */
public class ProScheduleImageBo  implements Serializable{

	private static final long serialVersionUID = 3921899104852213952L;

	private String thumbSrc;
	
	private String imageSrc;
	
	private String iamgeInfo;
	
	private int orderIndex;

	public String getThumbSrc() {
		return thumbSrc;
	}

	public void setThumbSrc(String thumbSrc) {
		this.thumbSrc = thumbSrc;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public String getIamgeInfo() {
		return iamgeInfo;
	}

	public void setIamgeInfo(String iamgeInfo) {
		this.iamgeInfo = iamgeInfo;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}
	
	
}
