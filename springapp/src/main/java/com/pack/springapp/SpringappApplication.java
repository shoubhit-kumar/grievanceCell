package com.pack.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
/*
insert into user(active,email,mobile_number,password,role,username)
values(1,"admin@admin.com","9988776655","admin123","ROLE_ADMIN","Admin");
 */