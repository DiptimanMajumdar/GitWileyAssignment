package com.wiley.demo;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.wiley.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.wiley")
@EntityScan(basePackages = "com.wiley.bean")
@EnableJpaRepositories(basePackages = "com.wiley.persistence")
public class EmployeeSpringbootJpaApplication implements CommandLineRunner{

	@Autowired
	EmployeePresentation employeePresentation;

	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
			
		}

	}

}
