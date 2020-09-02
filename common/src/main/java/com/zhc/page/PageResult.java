package com.zhc.page;

/**
 * @author Bryan
 * @date 2020/9/2 11:32
 */
public class PageResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public PageResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public PageResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
