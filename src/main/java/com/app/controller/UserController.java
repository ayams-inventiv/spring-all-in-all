package com.app.controller;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDTO;
import com.app.entity.User;
import com.app.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<Object> createUser(@RequestBody UserDTO userDTO){
		User user = userService.createUser(userDTO);
		if(Objects.nonNull(user)) {
			return new ResponseEntity<Object>(user, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Object>(Collections.emptyList(), HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/users")
	public ResponseEntity<Object> createUser(){
		List<User> user = userService.getAllUsers();
		if(!user.isEmpty()) {
			return new ResponseEntity<Object>(user, HttpStatus.OK);
		}else {
			return new ResponseEntity<Object>(Collections.emptyList(), HttpStatus.EXPECTATION_FAILED);
		}
	}

}
