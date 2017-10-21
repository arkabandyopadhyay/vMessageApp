package com.crayprogramming.vMessageApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//mavenCentral()
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class VMessageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VMessageAppApplication.class, args);
	}
}
