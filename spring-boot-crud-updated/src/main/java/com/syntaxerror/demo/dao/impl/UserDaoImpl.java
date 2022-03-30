package com.syntaxerror.demo.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.syntaxerror.demo.dao.UserDao;
import com.syntaxerror.demo.dao.support.NamedParameterJdbcDaoSupportClass;
import com.syntaxerror.demo.response.UserDepartmentResponse;

@Repository
public class UserDaoImpl extends NamedParameterJdbcDaoSupportClass implements UserDao {

	@Override
	public List<UserDepartmentResponse> getUserDepartment() {
		List<UserDepartmentResponse> users = null;
		try {
			String query = "select name,department_name as departmentName from user join department on user.department_id = department.department_id";
			users = getNamedParameterJdbcTemplate().getJdbcOperations().query(query, new BeanPropertyRowMapper<UserDepartmentResponse>(UserDepartmentResponse.class));
		}catch(Exception ex) {
			ex.getStackTrace();	
		}
		return users;
	}

}
