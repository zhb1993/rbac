package com.zhb.rbac.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 用户角色
    */
@Data
@TableName("sys_user_role")
public class SysUserRole {
    /**
    * 编号
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 角色ID
    */
    private Long roleId;

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