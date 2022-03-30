package com.syntaxerror.demo.dao;

import java.util.List;

import com.syntaxerror.demo.response.UserDepartmentResponse;

public interface UserDao {

	public List<UserDepartmentResponse> getUserDepartment();
}
