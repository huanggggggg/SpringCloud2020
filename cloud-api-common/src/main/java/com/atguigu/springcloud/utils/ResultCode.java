package com.atguigu.springcloud.utils;

/**
 * 枚举了一些常用的API操作码
 */
public enum ResultCode {
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(506, "参数检验失败"),//validate failed
    UNAUTHORIZED(401, "暂未登录或token已经过期"),//unauthorized
    FORBIDDEN(403, "没有相关权限");//forbidden

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
