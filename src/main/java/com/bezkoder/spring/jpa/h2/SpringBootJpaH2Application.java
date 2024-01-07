package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot application for managing tutorials.
 * Uses JPA and H2 database for data persistence.
 */
@SpringBootApplication
public class SpringBootJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

}
