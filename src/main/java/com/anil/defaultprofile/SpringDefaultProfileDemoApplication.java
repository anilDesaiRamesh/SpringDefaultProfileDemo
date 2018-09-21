package com.anil.defaultprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.defaultprofile.controllers.SpringDefaultProfileController;

@SpringBootApplication
public class SpringDefaultProfileDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDefaultProfileDemoApplication.class, args);

		System.out.println("Default Impl---" + run.getBean(SpringDefaultProfileController.class).getGreeting());
	}
}
