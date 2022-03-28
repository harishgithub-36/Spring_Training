package com.example.springbootproject.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eid;
	private String name;
	private String dept;
	@Autowired
	// searches by type
//	@Qualifier
	// searches by name
	public Laptop laptop;

	public int getEid() {
		return eid;
	}

	@Value("10")
	public void setEid(int id) {
		this.eid = id;
	}

	public String getName() {
		return name;
	}

	@Value("ABC")
	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + ", laptop=" + laptop + "]";
	}

	@Value("Devloping")
	public void setDept(String dept) {
		this.dept = dept;
	}

	public void show() {
		System.out.println("In Employee");
		laptop.check();
	}

}
