package com.curso.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class SpringCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCommerceApplication.class, args);
	}

}
