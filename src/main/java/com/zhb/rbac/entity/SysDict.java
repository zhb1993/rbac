package com.zhb.rbac.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 字典表
    */
@Data
@TableName("sys_dict")
public class SysDict {
    /**
    * 编号
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 数据值
    */
    private String value;

    /**
    * 标签名
    */
    private String label;

    /**
    * 类型
    */
    private String type;

    /**
    * 描述
    */
    private String description;

    /**
    * 排序（升序）
    */
    private Long sort;

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
    * 备注信息
    */
    private String remarks;

    /**
    * 是否删除  -1：已删除  0：正常
    */
    private int delFlag;
}