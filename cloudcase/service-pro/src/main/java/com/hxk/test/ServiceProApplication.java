package com.hxk.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProApplication.class, args);
	}

}
