package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class LibraryExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryExceptionApplication.class, args);
	}

}
