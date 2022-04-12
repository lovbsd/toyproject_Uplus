package com.uplus.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class DomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

}
