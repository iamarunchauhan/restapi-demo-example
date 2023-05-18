package com.example.restapi.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@GetMapping("/users")
	public String getUserDetails() {
		logger.info("Inside users API");
		return "Users Details are available!";
	}
	
	@GetMapping("/owenerdetails")
	public String getRtoDetails() {
		logger.info("Entry : Inside rto API");
		return "RTO Details is available!";
	}
	
	@GetMapping("/admin")
	public String getRtoDetails() {
		logger.info("Entry : Inside Admin API");
		return "Admin Details is available!";
	}
}
