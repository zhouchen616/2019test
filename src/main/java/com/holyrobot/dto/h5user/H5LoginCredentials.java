package com.holyrobot.dto.h5user;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: 登录信息
 * @date 2018/7/5 15:03
 */
public class H5LoginCredentials {
    private String ID;
    private String U_Id;
    private int Identity_type;
    private String Identifier;
    private String Credential;
    private String CreatedString;
    private String Remark;

    public H5LoginCredentials(String u_Id, String identifier) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        this.ID = UUID.randomUUID().toString();
        this.U_Id = u_Id;
        this.Identity_type = 2;
        this.Identifier = identifier;
        this.CreatedString = simpleDateFormat.format(new Date());
        this.Credential = "1";
    }

    public H5LoginCredentials() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getU_Id() {
        return U_Id;
    }

    public void setU_Id(String u_Id) {
        U_Id = u_Id;
    }

    public int getIdentity_type() {
        return Identity_type;
    }

    public void setIdentity_type(int identity_type) {
        Identity_type = identity_type;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getCredential() {
        return Credential;
    }

    public void setCredential(String credential) {
        Credential = credential;
    }

    public String getCreatedString() {
        return CreatedString;
    }

    public void setCreatedString(String createdString) {
        CreatedString = createdString;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
