package com.sahand.simple_web_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SimpleWebServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebServerApplication.class, args);
	}

}
