package com.example.demo.common;

import lombok.Data;

@Data
public class Result<T> {
    private String code;
    private String msg;
    private T data;
    private String token;

    public Result(){}

    public Result(T data){
        this.data=data;
    }
    public Result(String token){
        this.token=token;
    }
    public Result(T data,String token){
        this.data=data;
        this.token=token;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode("0");
        result.setMsg("成功");
        return result;
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>(data);
        result.setCode("0");
        result.setMsg("成功");
        return result;
    }
    public static <T> Result<T> success(T data,String token){
        Result<T> result = new Result<>(data,token);
        result.setCode("0");
        result.setMsg("成功");
        return result;
    }
    public static <T> Result<T> success(String token){
        Result<T> result = new Result<>(token);
        result.setCode("0");
        result.setMsg("成功");
        return result;
    }

    public static Result error(String code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
