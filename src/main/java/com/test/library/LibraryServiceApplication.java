package com.test.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LibraryServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceApplication.class, args);
		System.out.println("LibraryServiceApplication ........");
	}

}
