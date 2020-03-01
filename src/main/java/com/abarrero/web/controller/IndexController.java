package com.abarrero.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/error")
	public String error() {
		return "404";
	}
	
	@GetMapping("/blank")
	public String blank() {
		return "blank";
	}
	
	@GetMapping("/buttons")
	public String buttons() {
		return "buttons";
	}
	
	@GetMapping("/cards")
	public String cards() {
		return "cards";
	}
	
	@GetMapping("/charts")
	public String charts() {
		return "charts";
	}
	
	@GetMapping("/forgot-password")
	public String forgotPassword() {
		return "forgot-password";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/tables")
	public String tables() {
		return "tables";
	}
	
	@GetMapping("/utilities-animation")
	public String utilitiesAnimation() {
		return "utilities-animation";
	}
	
	@GetMapping("/utilities-border")
	public String utilitiesBorder() {
		return "utilities-border";
	}
	
	@GetMapping("/utilities-color")
	public String utilitiesColor() {
		return "utilities-color";
	}
	
	@GetMapping("/utilities-other")
	public String utilitiesOther() {
		return "utilities-other";
	}
}
