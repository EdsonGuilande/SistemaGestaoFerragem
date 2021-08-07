package com.sistema.projecto.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

	

	@GetMapping("/")
	public String homex() {
		return "/home";
}
	
	
	
	@GetMapping("/login")
	public String login() {
		return "/login";
}
	
	
	@GetMapping("/logout")
	public String logout() {
		return "/login";
}
}
