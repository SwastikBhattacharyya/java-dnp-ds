package com.cognizant.spring_learn.Ex1_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
		SpringApplication.run(SpringLearnApplication.class, args);

		logger.info("SpringLearnApplication is being executed");
	}
}
