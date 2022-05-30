package com.example.Session3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "index";
		
		
	}
	@GetMapping("/Main")
	public String main() {
		return "Main";
   }
	@GetMapping("/NextPage")
	public String Next() {
		return "NextPage";
   }

	@GetMapping("/Check")
	public String Last() {
		return "Check";
   }
}