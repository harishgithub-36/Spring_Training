package com.example.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springbootproject.autowire.Employee;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
		// we are asking for a bean of employee type
		Employee e = context.getBean(Employee.class);
		e.show();
		System.out.println(e);

	}

}
