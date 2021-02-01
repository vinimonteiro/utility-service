package com.vinimo.utility.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityServiceController {


	@GetMapping("hello")
	public String hello(){
		return "redirect:/hello.html";
	}
	
}
