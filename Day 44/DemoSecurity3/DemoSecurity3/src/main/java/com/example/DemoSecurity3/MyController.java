package com.example.DemoSecurity3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/")
	public String home() {
		String s1="<h1>Hello Sudam</h1>";
		String s3="<h1>My capgemeni Internship has completed</h1>";
		String s2="<a href = /logout> Logout</a>";
		return s1+s3+s2;
		
	}
}


