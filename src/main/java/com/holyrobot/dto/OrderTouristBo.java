package com.holyrobot.dto;

import java.io.Serializable;

/**
 * @Description 游客信息上传回传显示
 * @author 周相儒
 * @date 2018年4月10日 上午10:11:20
 */
public class OrderTouristBo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;

	private String guestname;

	private String guestsex;

	private String guestage;

	private String guestcard;
	
	private String guestcardtype;

	private String guesttelphone;

	private String guestaddress;
	
	public String getGuestcardtype() {
		return guestcardtype;
	}
	
	public void setGuestcardtype(String guestcardtype) {
		this.guestcardtype = guestcardtype;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String msg;

	public String getGuestname() {
		return guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	public String getGuestsex() {
		return guestsex;
	}

	public void setGuestsex(String guestsex) {
		this.guestsex = guestsex;
	}

	public String getGuestage() {
		return guestage;
	}

	public void setGuestage(String guestage) {
		this.guestage = guestage;
	}

	public String getGuestcard() {
		return guestcard;
	}

	public void setGuestcard(String guestcard) {
		this.guestcard = guestcard;
	}

	public String getGuesttelphone() {
		return guesttelphone;
	}

	public void setGuesttelphone(String guesttelphone) {
		this.guesttelphone = guesttelphone;
	}

	public String getGuestaddress() {
		return guestaddress;
	}

	public void setGuestaddress(String guestaddress) {
		this.guestaddress = guestaddress;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
