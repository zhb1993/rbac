package com.zhb.rbac.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 用户管理
    */
@Data
@TableName("sys_user")
public class SysUser {
    /**
    * 编号
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 用户名
    */
    private String name;

    /**
    * 昵称
    */
    private String nickName;

    /**
    * 头像
    */
    private String avatar;

    /**
    * 密码
    */
    private String password;

    /**
    * 加密盐
    */
    private String salt;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 状态  0：禁用   1：正常
    */
    private Byte status;

    /**
    * 机构ID
    */
    private Long deptId;

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

    /**
    * 是否删除  -1：已删除  0：正常
    */
    private int delFlag;
}