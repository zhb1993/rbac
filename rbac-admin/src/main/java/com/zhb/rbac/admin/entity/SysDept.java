package com.zhb.rbac.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
    * 机构管理
    */
@Data
@TableName("sys_dept")
public class SysDept {
    /**
    * 编号
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 机构名称
    */
    private String name;

    /**
    * 上级机构ID，一级机构为0
    */
    private Long parentId;

    /**
    * 排序
    */
    private Integer orderNum;

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