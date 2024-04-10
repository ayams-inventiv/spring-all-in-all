package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.entity.User;
import com.app.repos.UserRepos;
import com.app.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired UserRepos userRepos;

	@Override
	public User createUser(UserDTO userDTO) {
		User user = new User();
		user.setEmailId(userDTO.getEmail());
		user.setName(userDTO.getName());
		return userRepos.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepos.findAll();
	}

}
