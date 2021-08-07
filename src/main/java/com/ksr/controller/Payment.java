package com.ksr.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/home")
public class Payment {

	@RequestMapping(value = "/pay")
	public String display()
	{        
		
		// welcome to fetch command
		String name = " Subbarao";
		
		return "Welcome to Spring Boot and GitHub Forking, Thanks and regards " ;
		
	}
	
	
	
}
