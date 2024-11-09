package com.test.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryService {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello First Jenkins deployable";
	}
}
