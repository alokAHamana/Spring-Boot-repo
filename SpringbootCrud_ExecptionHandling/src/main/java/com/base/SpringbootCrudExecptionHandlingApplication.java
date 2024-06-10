package com.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudExecptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudExecptionHandlingApplication.class, args);
	
	
	System.out.println("Global exception");
	}

}
