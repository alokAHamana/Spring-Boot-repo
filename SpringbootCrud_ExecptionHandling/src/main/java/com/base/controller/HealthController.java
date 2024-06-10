package com.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.service.UserService;

@RestController
@RequestMapping("/check")
public class HealthController {
	@Autowired
	private UserService userService;

	@GetMapping("/message")
	public ResponseEntity<?> message(String msg) {
		return ResponseEntity.ok(userService.message(msg));
		 
	}
}
