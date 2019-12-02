package com.zsmypb.sbsserver.util;

import lombok.Data;

/**
 * @author zhangs.
 * @date 2019/11/7.
 */
@Data
public class Result {
    private String code, message;
    private Object data;

    Result() {
    }

    Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result build(String code, String msg) {
        return new Result(code, msg);
    }

    public static Result build(String code, String msg, Object object) {
        return new Result(code, msg, object);
    }

    public static Result ok(Object object) {
        return new Result("0", "success", object);
    }

    public static Result fail(String code, Object object) {
        return new Result(code, "fail", object);
    }
    public static Result fail(String message) {
        return new Result("2", message);
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
