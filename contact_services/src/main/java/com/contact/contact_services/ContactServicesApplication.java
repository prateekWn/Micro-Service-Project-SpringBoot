package com.contact.contact_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContactServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServicesApplication.class, args);
	}

}
