package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.demo.entities")
@SpringBootApplication
public class AppointmentAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppointmentAppApplication.class, args);
	}

}
