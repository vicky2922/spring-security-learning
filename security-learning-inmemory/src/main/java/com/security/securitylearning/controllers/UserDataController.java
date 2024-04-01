package com.security.securitylearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.securitylearning.dto.UserDto;
import com.security.securitylearning.services.UserDataService;

@RestController
public class UserDataController {
	
	@Autowired
	UserDataService userDataService;

	@GetMapping("/")
	public String checkService() {
		return "All API is working";
	}
	
	@GetMapping("/user")
	public String checkServiceForUser() {
		return "API for user is working";
	}
	
	@GetMapping("/admin")
	public String checkServiceforAdmin() {
		return "API for admin is working";
	}
	
	@GetMapping("/all")
	public String getAllUsers(){
		return userDataService.getAllUsers().toString();
	}
}
