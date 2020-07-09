package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class AppConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfigTestApplication.class, args);
	}

}
