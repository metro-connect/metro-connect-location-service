package com.metro.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MetroConnectLocationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetroConnectLocationServiceApplication.class, args);
	}

}
