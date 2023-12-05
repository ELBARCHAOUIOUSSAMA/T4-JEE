package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			 customerRepository.save(List.of(
					Customer.builder().name("Oussama").email("ouss@gmail.com").build(),
					Customer.builder().name("Hassan").email("hasan@gmail.com").build(),
					Customer.builder().name("Fatima").email("fati@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};

	}

}
