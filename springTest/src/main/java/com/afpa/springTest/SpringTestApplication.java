package com.afpa.springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Lucas
 *Point d'entrée de spring boot
 */
@SpringBootApplication
@EnableSwagger2
public class SpringTestApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
}