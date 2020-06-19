package com.zhb.rbac.admin.common;

/**
 * @author jackesy
 * @className: CodeEnum
 * @description: 响应代码枚举类
 * @create 2019/8/14 14:26
 **/
public enum CodeEnum {


    SUCCESS(100, "操作成功"),
    FAIL_PARAMCHECK(101,"参数校验失败"),
    FAIL_BUSINESS(102,"操作失败"),
    FAIL_LOGIN_OVERDUE(401,"登录过期"),
    FAIL_NOT_LOGIN(402,"没有登录"),
    FAIL_ILLEGAL_TOKEN(403,"非法token"),
    FAIL_NOTFOUND(404,"请求接口不存在"),
    FAIL_NOAUTHORITY(405,"无权限请求接口"),
    FAIL_RATELIMIT(429,"访问太频繁"),
    FAIL_SERVER(500,"程序内部异常"),
    ;


    private int code;
    private String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Boolean isSuccess(int code) {
        return SUCCESS.getCode() == code;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
