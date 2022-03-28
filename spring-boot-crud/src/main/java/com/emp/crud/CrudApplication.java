package com.emp.crud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.crud.entity.Employee;
import com.emp.crud.repository.EmpRepository;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Spider Man", "Queens");
		Employee e2 = new Employee(2, "Superman", "Kripton");

		empRepository.employee.addAll(Arrays.asList(e1, e2));
	}

}
