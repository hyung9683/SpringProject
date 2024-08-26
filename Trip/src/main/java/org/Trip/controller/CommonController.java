package org.Trip.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class CommonController {
	
	
	@GetMapping("/main/login")
	public void loginInput(String error, String logout, Model model) {
		
		log.info("error:" + error);
		log.info("logout:" + logout);
		
		if(error != null) {
			
			model.addAttribute("error", "Login Error Check Your Account");
		}
		
		if(logout != null) {
			
			model.addAttribute("logout", "Logout!!");
		}
	}
	
	@GetMapping("/main/logout")
	public void logoutGET() {
		
		log.info("custom logout");
	}
	
//	@PostMapping("/logout")
//	public void logoutPost() {
//		
//		log.info("post custom logout");
//	}

}
