package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.entity.User;

@Service
public interface UserService {
	 
	public User createUser(UserDTO userDTO);

	public List<User> getAllUsers();
}
