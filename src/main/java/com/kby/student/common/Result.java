package com.kby.student.common;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/25 17:30
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public  Result<T> success(){
        this.code=200;
        this.msg="成功";
        return this;
    }
    public  Result<T> success(T data){
        this.code=200;
        this.msg="成功";
        this.data=data;
        return this;
    }
    public Result<T> fail(){
        this.code=500;
        this.msg="失败";
        return this;
    }
    public Result<T> fail(T data){
        this.code=500;
        this.msg="失败";
        this.data=data;
        return this;
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
