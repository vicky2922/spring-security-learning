package com.security.securitylearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResource {
	

	@GetMapping("/")
	public String index() {
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
	

}
