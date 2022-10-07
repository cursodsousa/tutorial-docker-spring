package io.github.dougllasfps.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerdemoApplication {

	@GetMapping("/")
	public String hello(){
		return "Hello from Docker e Spring";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerdemoApplication.class, args);
	}

}
