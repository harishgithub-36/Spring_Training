package com.emp.crud.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emp.crud.entity.Employee;

@Repository
public class EmpRepository {
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee;
	}

	public String add(Employee emp) {
		// TODO Auto-generated method stub
		employee.add(emp);
		return "Successfully added";
	}

	public String edit(Employee emp) {
		// TODO Auto-generated method stub
//		employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
//			e.setAddress(emp.getAddress());
//			e.setName(emp.getName());
//		});
		for (Employee e : employee) {
			if (e.getEmployeeId() == emp.getEmployeeId()) {
				e.setAddress(emp.getAddress());
				e.setName(emp.getName());
			}

		}
		return "Successfull Updated";
	}

	public String delete(int empno) {
		// TODO Auto-generated method stub
		employee.remove(empno - 1);
		return "Successfull Deleted";
	}

}
