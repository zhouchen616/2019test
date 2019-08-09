package com.holyrobot.dto;

import com.holyrobot.con_om.pojo.*;
import com.holyrobot.con_order.pojo.OrdOrderinfo;

import java.io.Serializable;
import java.util.List;


public class OrderInfoBo implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> guestname;
	
	private List<String> guestsex;
	
	private List<String> guestage;

	private List<String> guestcard;

	private List<String> guesttelphone;

	private List<String> guestaddress;
	
	private OrdOrderinfo ordOrderInfo;

	public List<String> getGuestname() {
		return guestname;
	}

	public void setGuestname(List<String> guestname) {
		this.guestname = guestname;
	}

	public List<String> getGuestsex() {
		return guestsex;
	}

	public void setGuestsex(List<String> guestsex) {
		this.guestsex = guestsex;
	}

	public List<String> getGuestage() {
		return guestage;
	}

	public void setGuestage(List<String> guestage) {
		this.guestage = guestage;
	}

	public List<String> getGuestcard() {
		return guestcard;
	}

	public void setGuestcard(List<String> guestcard) {
		this.guestcard = guestcard;
	}

	public List<String> getGuesttelphone() {
		return guesttelphone;
	}

	public void setGuesttelphone(List<String> guesttelphone) {
		this.guesttelphone = guesttelphone;
	}

	public List<String> getGuestaddress() {
		return guestaddress;
	}

	public void setGuestaddress(List<String> guestaddress) {
		this.guestaddress = guestaddress;
	}


	public OrdOrderinfo getOrdOrderInfo() {
		return ordOrderInfo;
	}

	public void setOrdOrderInfo(OrdOrderinfo ordOrderInfo) {
		this.ordOrderInfo = ordOrderInfo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
