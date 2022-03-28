package com.example.springbootproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject.model.User;

@RestController

public class SampleRestController {
	@RequestMapping(method = RequestMethod.GET, value = "/api/user")
	public ResponseEntity<User> getUser() {
		User user = new User();
		user.setName("Anonymous");
		user.setAge(30);
		user.setCountry("India");
		return ResponseEntity.ok(user);
	}
}
