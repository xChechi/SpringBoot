package com.projectone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@GetMapping("/")
	public GreetResponse greet() {
		return new GreetResponse(
				"Hellou Ninooou",
				List.of("Java", "Python", "Javascript"),
				new Person("Nino", 42, 20500.42)
		);
	}

	record Person (String name, int age, double savings) {}

	record GreetResponse (String greet, List<String> favLanguages, Person person) {}
}
