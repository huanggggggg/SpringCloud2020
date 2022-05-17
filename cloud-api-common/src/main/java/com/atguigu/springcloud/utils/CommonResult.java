package com.atguigu.springcloud.utils;

import lombok.Data;


@Data
//@Component
public class CommonResult <T>  {
    private Integer code;
    private String message;
    private T data;
    //为了方便生成的两个参数的构造方法


    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult() {
    }
    /**
     * 成功返回结果
     *//*
    public static <T>CommonResult<T> success(T data){
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),data);
    }

    public static CommonResult success(){
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),null);
    }
    *//**
     * 访问失败
     * 自定义提示信息
     *//*
    public static <T> CommonResult<T> failed(ResultCode resultCode,String message){
        return new CommonResult<>(resultCode.getCode(),message,null );
    }
    *//**
     * 访问失败
     * 使用系统自带的提示信息
     *//*
    public static <T> CommonResult<T> failed(ResultCode resultCode){
        return new CommonResult<>(resultCode.getCode(),resultCode.getMessage(),null);
    }
    *//**
     * 访问失败
     * 需要返回对象
     *//*
    public static <T> CommonResult<T> failed(ResultCode resultCode,T data){
        return new CommonResult<>(resultCode.getCode(), resultCode.getMessage(),data);
    }

    *//**
     * 访问失败，对应枚举中的失败
     *
     *//*
    public static <T> CommonResult<T> error(){
        return new CommonResult<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(),null);
    }
*/
}
