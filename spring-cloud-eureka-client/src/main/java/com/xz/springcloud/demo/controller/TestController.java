package com.xz.springcloud.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("t")
public class TestController {

	@GetMapping("getT1")
	public String t1() {
		System.out.println("Eureka-client");
		return "Eureka-client";
	}
}
