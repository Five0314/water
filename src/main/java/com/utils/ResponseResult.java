package com.utils;

/**
 * class
 *
 * @author Five
 * @date create in 下午4:24 2017/11/30
 */
public class ResponseResult<T> {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    public ResponseResult() {
    }

//    成功

    public static ResponseResult success(Object data){
        ResponseResult r = new ResponseResult();

        r.code = 0;
        r.data = data;

        return r;
    }

    public static ResponseResult success(){
        ResponseResult r = new ResponseResult();

        r.code = 0;

        return r;
    }

//    失败

    public static ResponseResult error(Integer code, String message){
        ResponseResult r = new ResponseResult();

        r.code = code;
        r.message = message;

        return r;
    }

    public static ResponseResult error(Integer code){
        ResponseResult r = new ResponseResult();

        r.code = code;

        return r;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
