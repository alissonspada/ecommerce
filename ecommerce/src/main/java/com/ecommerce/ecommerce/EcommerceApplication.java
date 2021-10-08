package com.ecommerce.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.ecommerce.ecommerce, com.ecommerce.entities")
public class EcommerceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
