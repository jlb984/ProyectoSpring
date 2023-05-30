package com.unla.ProyectoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProyectoSpring {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpring.class, args);
	}
}
