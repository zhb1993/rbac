package com.zhb.rbac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhb.rbac.mapper.SysDeptMapper;
import com.zhb.rbac.entity.SysDept;
@Service
@Slf4j
public class SysDeptService extends ServiceImpl<SysDeptMapper,SysDept> {
}
