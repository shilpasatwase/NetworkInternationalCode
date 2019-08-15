package com.example.accelerate.SpringEurekaClientUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaClientUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientUserServiceApplication.class, args);
	}

}
