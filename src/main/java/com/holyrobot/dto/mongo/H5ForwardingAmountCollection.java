package com.holyrobot.dto.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName： H5ForwardingAmountCollection
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-15 10:36
 * @Version: 1.0
 * @Modified By:
 */
@Data
@Document(collection = "H5SpForwardACollection")
public class H5ForwardingAmountCollection implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String userType;        //用户类型：1.B端 2.C端
    private String userAgent;       //浏览器参数
    private String ip;              //用户IP
    private Date createDate;      //创建时间
    private String orgId;           //当前访问旅行社ID
    private String orgName;         //当前访问旅行社名称
    private String userId;          //用户ID
    private String userName;        //用户名
    private String deptId;          //部门ID B端
    private String deptName;        //部门名称 B端
    private String uOrgId;          //用户旅行社ID B端
    private String uOrgName;        //用户旅行社名称 B端
    private String domain;          //用户domain
    private String pageType;        //转发页类型：1.产品页；2.首页；
    private String url;             //转发链接
    private String urlTitle;        //链接标题
    private String desc;            //分享描述
    private String proId;           //产品ID
    private String proType;         //产品类型
    private String proRouretType;   //产品线路类型
    private String aliaseName;      //产品分销名（别名）
    private String localProName;    //地接产品名称
    private String proNo;           //产品编号
    private String tourDays;        //行程天数
    private Date startDate;       //有效开始日期
    private Date dueDate;         //有效截止日期
    private String departure;       //出发地
    private String destination;     //目的地
    private String proTag;          //产品标签
    private String isAck;           //下单时是否即时确认 1：下单即确认 0：二次确认
    private String salesType;       //销售类型 1：对外销售；2：内部分销；3：内外销
    private String proProp;         //产品属性 1：打包产品；2：单项产品
    private String starLevel;       //产品星级，用于产品排序
    private String trafficType;     //交通类别 0：无 9：机票；10：火车票；11：汽车票；12：船票
    private String routeSubType;    //线路子类型
    private String routeSubTypeName;//线路子类型名称

}
