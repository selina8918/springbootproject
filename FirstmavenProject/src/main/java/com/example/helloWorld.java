package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

	@RequestMapping("/")
	public String hello() {
		return"hello world";
	}
	
}
