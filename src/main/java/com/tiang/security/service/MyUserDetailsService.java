package com.tiang.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tiang.security.dao.UserRepository;
import com.tiang.security.model.Users;
import com.tiang.security.userPrincipal.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		
		Users users=userRepository.findByUsername(username);
		if(users==null) {
			throw  new UsernameNotFoundException("user not found");
			
		}
		return new  UserPrincipal(users);
	}

}
