package com.lwj.client.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrixTest")
public class HystrixController {

	/**
	 * 测试重试、断路
	 * @return
	 */
	@GetMapping("/hystrix")
	public String testHystrix() {
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("client 1 hystrix");
		return "client1";
	}
	
}
