package com.jnit.NGO_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.jnit.NGO_Application.model")
public class NgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgoApplication.class, args);
		System.out.print("Hello here");
	}											

}
