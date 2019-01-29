package nl.devoteam.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "nl.devoteam.*")
public class OpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

}

