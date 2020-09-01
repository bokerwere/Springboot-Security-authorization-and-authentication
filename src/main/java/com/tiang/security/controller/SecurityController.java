package com.tiang.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SecurityController {
	
	@RequestMapping("/")
	public String home() {
		return  "home";
		
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return  "login";
		
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return  "logout";
		
	}
	

}
