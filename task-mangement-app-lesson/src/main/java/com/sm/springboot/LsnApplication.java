package com.sm.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LsnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LsnApplication.class, args);
		System.out.println("Spring Boot Server Boot.....");
	}

}
