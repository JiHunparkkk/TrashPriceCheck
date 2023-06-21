package com.example.TrashPriceCheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TrashPriceCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrashPriceCheckApplication.class, args);
	}
}
