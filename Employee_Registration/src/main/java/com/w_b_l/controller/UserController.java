package com.w_b_l.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.w_b_l.entity.SignUpEntity;
import com.w_b_l.serviceImpl.UserServiceImpl;

@CrossOrigin ("*")
@RestController
@RequestMapping ("/employees/api/v1")

public class UserController {
	@Autowired
	UserServiceImpl impl;
	
	@PostMapping ("/")
	private SignUpEntity createUserInfo(@RequestBody SignUpEntity signUpEntity) {
		SignUpEntity createUserDetails = impl.createUserDetails(signUpEntity);
		return createUserDetails;
	}
	@GetMapping ("/")
	private List<SignUpEntity> getUserInfo() {
		List<SignUpEntity> userDetails = impl.getUserDetails();
		return userDetails;
	}
}
