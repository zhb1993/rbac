package com.zhb.rbac.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhb.rbac.**.mapper")
public class RbacAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacAdminApplication.class, args);
    }

}
