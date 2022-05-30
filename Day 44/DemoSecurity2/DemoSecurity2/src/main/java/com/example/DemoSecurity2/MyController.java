package com.example.DemoSecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/")
	public String home() {
		String s1="<h1>hello World</h1>";
		String s2="<a href = /logout> Logout</a>";
		return s1+s2;
		
	}
}
