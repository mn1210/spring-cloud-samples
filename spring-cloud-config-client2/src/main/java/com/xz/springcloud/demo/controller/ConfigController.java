package com.xz.springcloud.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cfg")
@RefreshScope //通过刷新不需要重启 依赖spring-boot-starter-actuator
public class ConfigController {

	@Value("${server.port}")
	private String port;
	@Value("${spring.profiles}")
	private String env;
	
	@Value("${busi.ops}")
	private String isNew;
	
	@GetMapping("t1")
	public String test() {
		return port+"=="+env;
	}
	
	
	@GetMapping("t2")
	public String test2() {
		if(isNew.equals("Y")) {
			System.out.println("新业务***********");
		}else {
			System.out.println("老的业务规则=========");
		}
//		isNew.toLowerCase()//
//		isNew.toUpperCase()
		return isNew;
	}
	
	
}
