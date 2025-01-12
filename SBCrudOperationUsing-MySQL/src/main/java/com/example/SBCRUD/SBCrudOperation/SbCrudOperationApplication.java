package com.example.SBCRUD.SBCrudOperation;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title="Books NEW API",version = "1.1",description = "books api documentation using swagger"))
public class SbCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCrudOperationApplication.class, args);
	}

}
