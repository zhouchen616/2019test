package com.holyrobot.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;


/**
 *    
 * @Description: 生成UUID
 * @author 汤玉林
 * @date 2018年3月22日 上午9:12:41
 */
public class CodecUtil {
	
	public static String createUUID(){
		return UUID.randomUUID().toString();
	}

	/**
	 * 定制游需求订单
	 * @return
	 */
	public static String getCusInfoNo(){
		return DateUtil.getYear()+ RandomStringUtils.randomNumeric(8);
	}
}
