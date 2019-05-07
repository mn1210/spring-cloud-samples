package com.xz.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServer8762Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServer8762Application.class, args);
	}

}
