package com.example.springbootproject.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int laptopid;
	private String Laptopname;

	public int getLaptopid() {
		return laptopid;
	}

	@Value("80")
	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}

	public String getLaptopname() {
		return Laptopname;
	}

	@Value("Dell")
	public void setLaptopname(String laptopname) {
		Laptopname = laptopname;
	}

	@Override
	public String toString() {
		return "laptop [laptopid=" + laptopid + ", Laptopname=" + Laptopname + "]";
	}

	public void check() {
		System.out.println("Autowiring is running");
	}
}
