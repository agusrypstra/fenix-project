package com.CrudGymFenix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.CrudGymFenix.controllers","com.CrudGymFenix.models","com.CrudGymFenix.repository","com.CrudGymFenix.service"})

@EnableJpaRepositories("com.CrudGymFenix.repository")

public class CrudGymFenixApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudGymFenixApplication.class, args);
	}

}
