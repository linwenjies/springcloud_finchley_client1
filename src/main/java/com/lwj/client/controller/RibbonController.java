package com.lwj.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbonTest")
public class RibbonController {

	/**
	 * 测试重试
	 * @return
	 */
	@GetMapping("/testRetry")
	public String testRetry() {
		System.out.println("client 1 retry...");
		return "client1";
	}
	
}
