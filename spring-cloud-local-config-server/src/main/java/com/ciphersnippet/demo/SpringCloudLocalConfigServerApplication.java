package com.ciphersnippet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudLocalConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLocalConfigServerApplication.class, args);
	}

}
