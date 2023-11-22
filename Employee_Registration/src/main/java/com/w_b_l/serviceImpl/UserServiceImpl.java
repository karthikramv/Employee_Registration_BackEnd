package com.w_b_l.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.w_b_l.entity.SignUpEntity;
import com.w_b_l.repo.UserRepository;
import com.w_b_l.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository repo;
	
	@Override
	public SignUpEntity createUserDetails(SignUpEntity signUpEntity) {
	SignUpEntity save = repo.save(signUpEntity);
		return save;
	}

	@Override
	public List<SignUpEntity> getUserDetails() {
		List<SignUpEntity> findAll = repo.findAll();
		return findAll;
	}

}
