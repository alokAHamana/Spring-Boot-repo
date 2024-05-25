package com.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.Entity.User;
import com.base.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> create(@RequestBody User users) {
		userService.create(users);
		return new ResponseEntity<>(users, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll() {
		List<User> users = userService.getAllUser();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/getby/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return userService.getById(id);
	}


	@DeleteMapping("/del/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		userService.removeUser(id);
		//System.out.println("data deleted successfully.......");
		return "data deleted successfully";
	}

	@PutMapping("/put/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
		User existingUser = userService.getById(id);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());

		userService.updateUser(existingUser);
		return new ResponseEntity<>(existingUser, HttpStatus.OK);

	}
}
/*
 * @PutMapping("/put") public User updateUser(@RequestBody User user) { return
 * userService.updateUser(user); }
 */