package com.ksr.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/home")
public class Payment {

	@RequestMapping(value = "/pay")
	public String display()
	{        
		
		// comment added
		
		return "Welcome to Spring Boot and GitHub Forking, Thank you";
		
	}
	
	
	
}
