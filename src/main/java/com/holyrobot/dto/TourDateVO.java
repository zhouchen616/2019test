package com.holyrobot.dto;

import java.io.Serializable;

public class TourDateVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 出团日期 月份
	 */
	private Integer tourMonth;
	/**
	 * 出团日期 年份
	 */
	private Integer tourYear;
	
	
	
	public TourDateVO() {
		super();
	}
	public TourDateVO(Integer tourMonth, Integer tourYear) {
		super();
		this.tourMonth = tourMonth;
		this.tourYear = tourYear;
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
	
	
}
