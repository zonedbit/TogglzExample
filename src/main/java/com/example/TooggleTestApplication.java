package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beanConfig.xml")
public class TooggleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TooggleTestApplication.class, args);
	}
}
