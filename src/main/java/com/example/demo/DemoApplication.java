package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    CommandLineRunner initDatabase(MessageService messageService) {
        return args -> {
            messageService.save(new Message(1L,"Hello, World!"));
            messageService.save(new Message(2L,"Spring Boot is goated!"));
        };
    }
}
