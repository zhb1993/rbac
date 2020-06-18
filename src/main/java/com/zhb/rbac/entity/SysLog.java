package com.zhb.rbac.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 系统操作日志
    */
@Data
@TableName("sys_log")
public class SysLog {
    /**
    * 编号
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 用户操作
    */
    private String operation;

    /**
    * 请求方法
    */
    private String method;

    /**
    * 请求参数
    */
    private String params;

    /**
    * 执行时长(毫秒)
    */
    private Long time;

    /**
    * IP地址
    */
    private String ip;

    /**
    * 创建人
    */
    private String createBy;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新人
    */
    private String lastUpdateBy;

    /**
    * 更新时间
    */
    private Date lastUpdateTime;
}