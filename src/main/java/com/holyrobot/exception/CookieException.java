package com.holyrobot.exception;

/**
 * @author 周陈
 * @Title: cookie校验自定义异常
 * @date 2018/7/6 9:11
 */
public class CookieException extends RuntimeException {


    private String msg;
    private Object data;

    public CookieException(){}

    public CookieException(String msg,Object data) {
        this.msg=msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
