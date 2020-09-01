package com.tiang.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiang.security.model.Users;

@Repository
public interface UserRepository  extends JpaRepository<Users, Long>{
	Users findByUsername(String username);

}
