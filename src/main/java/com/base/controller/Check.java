package com.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chk")
public class Check {
	
		/*@Autowired
		private UserService   userService;
*/
		@GetMapping("/msg")
		public String message() {
			return "Check my health by simple way";
			 
		}
	}
	
