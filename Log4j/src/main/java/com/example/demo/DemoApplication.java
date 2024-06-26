package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	static Logger logger =LogManager.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		System.out.println("Hello log4j");
	
		//level
		logger.trace("This is  trace msg");
		logger.trace("This is  debg msg");
		logger.trace("This is  info msg");
		logger.trace("This is  warn msg");
		logger.trace("This is  fatal msg");
	}

}
