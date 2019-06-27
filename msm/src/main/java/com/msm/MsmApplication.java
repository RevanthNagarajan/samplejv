package com.msm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsmApplication.class, args);
	}

}
