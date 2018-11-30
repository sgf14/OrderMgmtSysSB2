package com.sgfdb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductUiController {
	@GetMapping("/hello")
	public String hello(HttpServletRequest request, Model model) {
		//thymeleaf impl.  view name version- in templates folder- with some thymeleaf function
		String messageBlock = "Hello SpringBoot!";		
		model.addAttribute("message", messageBlock );
		return "home";
	}

}
