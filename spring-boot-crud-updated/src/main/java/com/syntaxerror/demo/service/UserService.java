package com.syntaxerror.demo.service;

import java.util.List;

import com.syntaxerror.demo.entity.User;
import com.syntaxerror.demo.response.UserDepartmentResponse;

public interface UserService {

	public List<User> getAllUsers();

	public User getUserById(int userId);

	public User addOrUpdateUser(User user);

	public User deleteUser(int userId) throws Exception;

	// this method is calling from crud repository using @ query annotation
	public List<User> getUserBySalary(float salary);

	// this method is calling from dao classes
	public List<UserDepartmentResponse> getUserDepartment();
}
