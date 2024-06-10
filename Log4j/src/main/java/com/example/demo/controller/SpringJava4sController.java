package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;

@RestController
public class SpringJava4sController {

	static Logger logger =LogManager.getLogger(DemoApplication.class);

	@GetMapping("/ll")
	public String test() {
		logger.info("Controller executing.....");
		return "hello logggi";
	}
	
	
	
	/*
	 * @RequestMapping("/") public String welcome() { return
	 * "Welcome to Spring Boot Tutorials"; }
	 * 
	 * @RequestMapping("/hello") public String myData() { return
	 * "Hello Spring Boot"; }
	 */
}