package com.example.WithoutDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WithoutDbApplication {


	@GetMapping("hello")
	public String helloWorld()
	{
		return "welcome in pune";
	}

	public static void main(String[] args) {
		SpringApplication.run(WithoutDbApplication.class, args);
	}

}
