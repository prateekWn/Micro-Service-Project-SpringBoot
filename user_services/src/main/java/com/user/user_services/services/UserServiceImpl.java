package com.user.user_services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_services.entity.User;
import com.user.user_services.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(Long id) {
		
		 return userRepository.findById(id).get();
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
}
