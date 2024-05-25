package com.base.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.Entity.User;
import com.base.repository.UserRepository;
import com.base.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String message(String msg) {
		msg="Hi .....goodd ---check health by other way by using UserServiceIMP";
		return msg;
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub..
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub.......
		return userRepository.findAll();
	}

	@Override
	public void removeUser(Long UserId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(UserId);;;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getById(Long userId) {
		
		Optional<User> findById = userRepository.findById(userId);
		
		// TODO Auto-generated method stub
		return findById.get();
	}

	
	
	
	/*
	 * @Override public User updateUserById(Long id, User user) { // TODO
	 * Auto-generated method stub return userRepository.getById(id); }
	 * 
	 * @Override public String deleteDepartmentById(Long id) { // TODO
	 * Auto-generated method stub return userRepository.toString(); }
	 */
}
	