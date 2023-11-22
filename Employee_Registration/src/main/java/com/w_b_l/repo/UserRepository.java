package com.w_b_l.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.w_b_l.entity.SignUpEntity;

@Repository
public interface UserRepository extends JpaRepository<SignUpEntity, Integer>{

}
