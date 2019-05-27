package com.example.SpringBoot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
