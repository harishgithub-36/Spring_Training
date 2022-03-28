package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//making class as rest controller
@RestController

public class HelloRestController {

	// whenever there is a request to /hello return the method
	@RequestMapping(method = RequestMethod.GET, value = "/some")
	public String someData() {
		return "someData";
	}
}
