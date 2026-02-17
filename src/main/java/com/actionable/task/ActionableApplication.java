package com.actionable.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ActionableApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionableApplication.class, args);
	}

}
