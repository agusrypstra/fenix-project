package com.CrudGymFenix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.CrudGymFenix.repositories"})

public class CrudGymFenixApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudGymFenixApplication.class, args);
	}

}
