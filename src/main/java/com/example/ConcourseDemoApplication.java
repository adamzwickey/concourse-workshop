package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConcourseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcourseDemoApplication.class, args);
	}

	@Value("${app.version}")
	private String _version;

	@RequestMapping("version")
	public String getVersion() {
		return _version;
	}
}
