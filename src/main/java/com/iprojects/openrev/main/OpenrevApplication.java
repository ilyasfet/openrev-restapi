package com.iprojects.openrev.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.iprojects.openrev")
public class OpenrevApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenrevApplication.class, args);
	}

}
