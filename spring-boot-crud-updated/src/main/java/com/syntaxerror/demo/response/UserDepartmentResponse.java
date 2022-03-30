package com.syntaxerror.demo.response;

public class UserDepartmentResponse {

	private String name;
	private String departmentName;

	public UserDepartmentResponse() {
		super();
	}

	public UserDepartmentResponse(String name, String departmentName) {
		super();
		this.name = name;
		this.departmentName = departmentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "UserDepartmentResponse [name=" + name + ", departmentName=" + departmentName + "]";
	}

}
