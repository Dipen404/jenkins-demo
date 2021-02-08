package com.ipen.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrud1Application.class, args);
		System.out.println("Jenkins demo is running smothly......");
	}
	
	@GetMapping("/")
	public String home() {
		return "Jenkins is running";
	}

}
