package com.base.service;

import java.util.List;

import com.base.Entity.User;

public interface UserService {

	/*
	 * User createUser(User users);
	 * 
	 * User getUserById(Long userId);
	 * 
	 * List<User> getAllUsers();
	 */

	public String message(String message);

	public User create(User user);

	public List<User> getAllUser();

	public void removeUser(Long userId);

	public User updateUser(User user);
	
	public User getById(Long userId);
	
	/*
	 * static User updateUserById(Long id, User user) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * String deleteDepartmentById(Long id);
	 * 
	 * public static User getUserById(Long id) { // TODO Auto-generated method stub
	 * return null; }
	 */
	
	

}