package com.dragon.war.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//标记为:restful
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
