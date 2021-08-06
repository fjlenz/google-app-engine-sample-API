package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController

public class DemoApplication {

	Logger logger = LoggerFactory.getLogger("jsonConsoleAppender");
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {

		String returnString = "Hi FJ again and again X";
		logger.info("This is the log for my response: '{}'", returnString);
		
		return new ResponseEntity<>(returnString, HttpStatus.OK);			
		
    }
}
