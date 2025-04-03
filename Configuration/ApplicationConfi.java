package edu.tejas.eventManagement.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages ="edu.tejas" )
@Configuration
public class ApplicationConfi {

	//We are bring the Em object to the Spring container using the following Annoations
	@Bean
	public EntityManager createEntityManger() {
		return Persistence.createEntityManagerFactory("Hibernate").createEntityManager();
	}
}
