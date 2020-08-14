package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication {

	@GetMapping("/")
	public String getWelcome() {
		return "Welcome to Spring boot docker";
	}
	
	@GetMapping("/name")
	public String getName() {
		return "VEMAREDDY SAJJALA";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
