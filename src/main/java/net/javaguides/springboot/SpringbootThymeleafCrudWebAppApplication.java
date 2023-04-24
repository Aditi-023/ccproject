package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootThymeleafCrudWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafCrudWebAppApplication.class, args);
	}

}

//scp -i ccproj.pem springboot-thymeleaf-crud-pagination-sorting-webapp-master\target\springboot-thymeleaf-crud-web-app-0.0.1-SNAPSHOT.jar ec2-user@3.95.225.115