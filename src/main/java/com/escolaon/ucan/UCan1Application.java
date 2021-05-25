package com.escolaon.ucan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = { "com.escolaon.ucan.entities" })
//@EnableJpaRepositories(basePackages = { "com.escolaon.ucan.repositories" })
//@ComponentScan(basePackages = {"com.escolaon.ucan.services"})

public class UCan1Application {

	public static void main(String[] args) {
		SpringApplication.run(UCan1Application.class, args);
	}

}
