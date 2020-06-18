package com.zhb.rbac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhb.rbac.mapper.SysDictMapper;
import com.zhb.rbac.entity.SysDict;
@Service
@Slf4j
public class SysDictService extends ServiceImpl<SysDictMapper,SysDict> {

}
