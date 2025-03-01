package com.example.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class GuestController {
	
	@GetMapping("newguest")
	public String newGuest() {
		return"NewGuest";
	}
	
	@PostMapping("saveguest")
	public String saveguest() {
		return"Login";
	}

}
