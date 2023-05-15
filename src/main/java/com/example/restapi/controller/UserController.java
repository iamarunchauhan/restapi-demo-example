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
	
	@GetMapping("/rto")
	public String getRtoDetails() {
		logger.info("Inside rto API");
		return "RTO Details are available now!";
	}
}
