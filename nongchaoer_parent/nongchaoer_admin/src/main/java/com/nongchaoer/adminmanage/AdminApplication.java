package com.nongchaoer.adminmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author : [xvChuShun]
 * @version : [v1.0]
 * @description : [后台服务启动类]
 * @createTime : [2023/6/27 13:49]
 * @updateUser : [xvChuShun]
 * @updateTime : [2023/6/27 13:49]
 * @updateRemark : [创建后台服务启动类]
 */
@SpringBootApplication
@ComponentScans({@ComponentScan("com.nongchaoer.common")})
@EnableDiscoveryClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
