package com.zhb.rbac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhb.rbac.entity.SysLoginLog;
import com.zhb.rbac.mapper.SysLoginLogMapper;
@Service
@Slf4j
public class SysLoginLogService extends ServiceImpl<SysLoginLogMapper,SysLoginLog> {

}
