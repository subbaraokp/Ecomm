package com.ksr.Ecomm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ksr.controller"})
public class DemoEcommApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEcommApplication.class, args);
	}

}
