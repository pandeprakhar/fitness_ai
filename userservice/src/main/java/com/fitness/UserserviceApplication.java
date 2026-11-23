package com.fitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.fitness.model")
public class UserserviceApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);


	}

}
