package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	
	@GetMapping("/display")
	public String getDisplay() {
		
		return " Docker & Kubernetes Assignment - Hi, This is a display message to check everything works!";
	}

	
	
}
