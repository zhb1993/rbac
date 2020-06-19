package com.zhb.rbac.controller;

import com.zhb.rbac.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public Object findAll(){
        return sysUserService.list();
    }

}
