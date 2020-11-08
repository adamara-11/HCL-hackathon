package com.emobileconnect.application.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emobileconnect.application.dao.CustomerRepository;
import com.emobileconnect.application.domain.Customer;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(CustomerRepository customerRepo) {
		return args -> {
			log.info("Preloading" + customerRepo.save(new Customer(101L,"John", "Hethan", "john@gmail.com", "2020-01-01", "2020-02-02", "Monthly Plan", "In Progress", "Doc1234")));
		};
	}
}

