package com.zhb.rbac.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@EqualsAndHashCode(callSuper=false)
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code = CodeEnum.SUCCESS.getCode();

    private String msg = "";

    private T data = null;

    private int biz_code = BizCodeEnum.DEFAULT.getCode();

    private Long server_time;

    public Result() {
        super();
    }

    public Result(CodeEnum codeEnum) {
        this(codeEnum.getCode(), codeEnum.getMsg());
    }

    public Result(CodeEnum codeEnum, String msg) {
        this(codeEnum.getCode(), msg);
    }

    public Result(CodeEnum codeEnum, String msg, T data) {
        this(codeEnum.getCode(), msg, data);
    }

    public Result(T data) {
        this(CodeEnum.SUCCESS, data);
    }

    public Result(CodeEnum codeEnum, T data) {
        this(codeEnum.getCode(), codeEnum.getMsg(), data);
    }

    public Result(CodeEnum codeEnum, BizCodeEnum bizCodeEnum){
        this(codeEnum.getCode(),codeEnum.getMsg(),bizCodeEnum.getCode());
    }

    public Result(CodeEnum codeEnum, String msg, BizCodeEnum bizCodeEnum){
        this(codeEnum.getCode(),msg,bizCodeEnum.getCode());
    }

    public Result(CodeEnum codeEnum, T data, BizCodeEnum bizCodeEnum){
        this(codeEnum.getCode(),codeEnum.getMsg(),data,bizCodeEnum.getCode());
    }

    public Result(CodeEnum codeEnum, String msg, T data, BizCodeEnum bizCodeEnum){
        this(codeEnum.getCode(),msg,data,bizCodeEnum.getCode());
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.server_time = System.currentTimeMillis();
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.server_time = System.currentTimeMillis();
    }

    private Result(int code, String msg, int biz_code) {
        this.code = code;
        this.msg = msg;
        this.biz_code = biz_code;
        this.server_time = System.currentTimeMillis();
    }

    private Result(int code, String msg, T data, int biz_code) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.biz_code = biz_code;
        this.server_time = System.currentTimeMillis();
    }

    public boolean isSuccess(){
        return CodeEnum.isSuccess(this.code);
    }

    public boolean isFailed(){
        return !CodeEnum.isSuccess(this.code);
    }

    public static Result buildSuccess(){
        Result result=new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setMsg(CodeEnum.SUCCESS.getMsg());
        result.setServer_time(System.currentTimeMillis());
        return result;
    }

    public static Result buildSuccess(final Object data){
        Result result=new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setData(data);
        result.setMsg(CodeEnum.SUCCESS.getMsg());
        result.setServer_time(System.currentTimeMillis());
        return result;
    }

    public static Result buildSuccess(String msg, Object data){
        Result result=new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setData(data);
        result.setMsg(msg);
        result.setServer_time(System.currentTimeMillis());
        return result;
    }

    public static Result buildSuccess(Integer code,String msg, Object data,int biz_code){
        Result result=new Result();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        result.setBiz_code(biz_code);
        result.setServer_time(System.currentTimeMillis());
        return result;
    }

    public static Result buildSuccess(Integer code,String msg, Object data){
        Result result=new Result();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        result.setServer_time(System.currentTimeMillis());
        return result;
    }


    public static Result buildFail(Integer code,String msg){
        return new Result(code, msg);
    }
    public static Result buildFail(String msg){
        return new Result(CodeEnum.FAIL_BUSINESS.getCode(), msg);
    }
    public static Result buildFail(String msg,Object data){
        return new Result(CodeEnum.FAIL_BUSINESS.getCode(), msg,data);
    }
}
