package com.redteamobile.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //springBoot注解,spring在springBoot基础之上来构建项目
@EnableEurekaServer //开启eureka服务
public class SpringcloudDemoApplication {

	//spirng boot的标准入口
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoApplication.class, args);
	}
}
