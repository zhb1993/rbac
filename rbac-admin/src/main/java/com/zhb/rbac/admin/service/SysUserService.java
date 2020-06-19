package com.zhb.rbac.admin.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhb.rbac.admin.entity.SysUser;
import com.zhb.rbac.admin.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SysUserService extends ServiceImpl<SysUserMapper, SysUser> {
}

