package com.holyrobot.dto.h5user;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 周陈
 * @Title: H5商城直客信息
 * @date 2018/7/5 15:01
 */
public class H5UserInfo {
    private String ID;
    private String UserName;
    private int UserType;
    private String Mobile;
    private String QQ;
    private String Email;
    private String CreatedString;
    private String CreatedBy;
    private String CreatedByID;
    private String RevisedString;
    private String Remark;
    private int Sex;


    public H5UserInfo(String ID,String userName) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        this.ID = ID;
        UserName = userName;
        CreatedString = simpleDateFormat.format(new Date());
        CreatedBy = userName;
        CreatedByID = ID;
        RevisedString = simpleDateFormat.format(new Date());
    }

    public H5UserInfo() {
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserType(int UserType) {
        this.UserType = UserType;
    }

    public int getUserType() {
        return UserType;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getQQ() {
        return QQ;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setCreatedString(String CreatedString) {
        this.CreatedString = CreatedString;
    }

    public String getCreatedString() {
        return CreatedString;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedByID(String CreatedByID) {
        this.CreatedByID = CreatedByID;
    }

    public String getCreatedByID() {
        return CreatedByID;
    }

    public void setRevisedString(String RevisedString) {
        this.RevisedString = RevisedString;
    }

    public String getRevisedString() {
        return RevisedString;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getRemark() {
        return Remark;
    }

}
