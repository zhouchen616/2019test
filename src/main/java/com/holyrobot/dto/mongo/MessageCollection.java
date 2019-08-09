package com.holyrobot.dto.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @Author: 周相儒
 * @Description: 短信发送记录存储
 * @CreateDate: 2018/7/18 14:33
 * @Version: 1.0
 */
@Data
@Document(collection = "H5SpMessageCollection")
public class MessageCollection implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String date;//发送时间

    private String content;//发送内容

    private String phone;//接收内容手机号

    private String createId; //当前操作人（为空时为游客注册）

    public MessageCollection() {
    }

    public MessageCollection(String id, String date, String content, String phone, String createId) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.phone = phone;
        this.createId = createId;
    }

}
