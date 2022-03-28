package com.emp.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.crud.entity.Employee;
import com.emp.crud.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepository;

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empRepository.getAll();
	}

	public String add(Employee emp) {
		// TODO Auto-generated method stub
		return empRepository.add(emp);
	}

	public String edit(Employee emp) {
		// TODO Auto-generated method stub
		return empRepository.edit(emp);
	}

	public String delete(int empno) {
		// TODO Auto-generated method stub
		return empRepository.delete(empno);
	}

}
