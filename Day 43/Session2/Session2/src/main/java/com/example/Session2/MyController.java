package com.example.Session2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/Main")
	public String mainPage(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "Main";
	}
	
		
}