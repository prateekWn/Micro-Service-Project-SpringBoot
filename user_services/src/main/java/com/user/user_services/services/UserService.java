package com.user.user_services.services;

import com.user.user_services.entity.User;

public interface UserService {

	public User getUserById(Long id);

	public void deleteUser(Long userId);
}
