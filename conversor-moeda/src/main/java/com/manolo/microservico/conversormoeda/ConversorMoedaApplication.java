package com.manolo.microservico.conversormoeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.manolo.microservico.conversormoeda")
@EnableDiscoveryClient
public class ConversorMoedaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversorMoedaApplication.class, args);
	}

}
