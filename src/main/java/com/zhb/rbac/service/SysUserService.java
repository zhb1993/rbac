package com.zhb.rbac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhb.rbac.entity.SysUser;
import com.zhb.rbac.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SysUserService extends ServiceImpl<SysUserMapper, SysUser> {
}

