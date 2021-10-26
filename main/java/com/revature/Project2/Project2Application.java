package com.revature.Project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //for auto config
@ComponentScan("com.revature") // look for components/stereotypes
@EnableJpaRepositories("com.revature.repositories")  //repos location
@EntityScan("com.revature.beans") //entities location
public class Project2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

}
