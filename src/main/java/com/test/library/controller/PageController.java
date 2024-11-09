package com.test.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	String  homePage() {
		return "home";
	}
	@RequestMapping("/about")
	String aboutPage() {
		return "about";
	}
	
	

}
