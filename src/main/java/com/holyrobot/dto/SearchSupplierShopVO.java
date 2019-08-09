package com.holyrobot.dto;

import java.io.Serializable;

/**
 * 
 * @Description: 供应商
 * @author 周陈
 * @date 2018年4月25日 下午3:22:34
 */
public class SearchSupplierShopVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * keyWord
	 */
	private String keyWord;

	/**
	 * 出团日期 月份
	 */
	private Integer tourMonth;
	/**
	 * 出团日期 年份
	 */
	private Integer tourYear;
	/**
	 * 开始时间
	 */
	private String beginDate;
	/**
	 * 结束时间
	 */
	private String endDate;

	/**
	 * 供应商name
	 */
	private String travelName;

	/**
	 * 线路类型
	 */
	private String proType;

	/**
	 * 开始位置
	 */
	private int start = 0;
	/**
	 * 显示条数
	 */
	private int size = 10;
	
	

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public String getTravelName() {
		return travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Integer getTourMonth() {
		return tourMonth;
	}

	public void setTourMonth(Integer tourMonth) {
		this.tourMonth = tourMonth;
	}

	public Integer getTourYear() {
		return tourYear;
	}

	public void setTourYear(Integer tourYear) {
		this.tourYear = tourYear;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
