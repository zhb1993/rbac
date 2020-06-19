package com.zhb.rbac.admin.common;


public enum BizCodeEnum {

    /**
     * 默认业务代码值
     */
    DEFAULT(20000),
    MINI_APP_LOGIN(20001); // 小程序授权成功，返回代码值，去绑定手机号码
    private int code;

    BizCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
