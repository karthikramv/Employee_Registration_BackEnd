package com.w_b_l.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.w_b_l.entity.SignUpEntity;

@Service
public interface UserService {
	SignUpEntity createUserDetails(SignUpEntity signUpEntity);
	List<SignUpEntity> getUserDetails();
}
