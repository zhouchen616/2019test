package com.holyrobot.dto.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @ClassName： NTFoxMessageCollection
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-14 18:00
 * @Version: 1.0
 * @Modified By:
 */
@Document(collection = "NTFoxMessage")
public class NTFoxMessageCollection {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    private String ID;

    /// <summary>
    /// 消息接收人ID
    /// </summary>
    private String ReceiverID;

    /// <summary>
    /// 消息接收人名称
    /// </summary>
    private String Receiver;

    /// <summary>
    /// 消息发送人ID
    /// </summary>
    private String SenderID;

    /// <summary>
    /// 消息发送人
    /// </summary>
    private String Sender;

    /// <summary>
    /// 消息标题
    /// </summary>
    private String MessageTitle;

    /// <summary>
    /// 消息内容
    /// </summary>
    private String MessageBody;

    /// <summary>
    /// 消息创建时间
    /// </summary>
    private Date CreatedDate;

    /// <summary>
    /// 消息状态
    /// </summary>
    private int DataStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getReceiverID() {
        return ReceiverID;
    }

    public void setReceiverID(String receiverID) {
        ReceiverID = receiverID;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getSenderID() {
        return SenderID;
    }

    public void setSenderID(String senderID) {
        SenderID = senderID;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getMessageTitle() {
        return MessageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        MessageTitle = messageTitle;
    }

    public String getMessageBody() {
        return MessageBody;
    }

    public void setMessageBody(String messageBody) {
        MessageBody = messageBody;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public int getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(int dataStatus) {
        DataStatus = dataStatus;
    }
}
