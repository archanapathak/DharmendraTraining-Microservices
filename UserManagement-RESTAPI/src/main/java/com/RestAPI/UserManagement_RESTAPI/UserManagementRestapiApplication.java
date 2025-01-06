package com.RestAPI.UserManagement_RESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class UserManagementRestapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserManagementRestapiApplication.class, args);
		System.out.println("welcome to user management restapi development");
	}

}
