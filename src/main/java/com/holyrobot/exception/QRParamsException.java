package com.holyrobot.exception;

/**
 * @author 周陈
 * @Title: 自定义异常类
 * @date 2018/7/4 16:10
 */
public class QRParamsException extends Exception {
    private static final long serialVersionUID = 8837582301762730656L;
    public QRParamsException()  {}                //用来创建无参数对象
    public QRParamsException(String message) {        //用来创建指定参数对象
        super(message);                             //调用超类构造器
    }

}
