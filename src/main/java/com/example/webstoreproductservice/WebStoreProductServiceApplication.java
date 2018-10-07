package com.example.webstoreproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebStoreProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStoreProductServiceApplication.class, args);
	}
}
