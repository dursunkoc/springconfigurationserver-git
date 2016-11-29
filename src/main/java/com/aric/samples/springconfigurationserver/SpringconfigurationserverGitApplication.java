package com.aric.samples.springconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringconfigurationserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringconfigurationserverGitApplication.class, args);
	}
}
