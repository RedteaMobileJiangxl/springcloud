package com.redteamobile.springclouddemoclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient //通过该注解，实现服务发现，注册
@SpringBootApplication
public class SpringcloudDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoClientApplication.class, args);
	}
}

@RestController
class ServiceInstanceRestController {

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am from port:" +port;
	}
}