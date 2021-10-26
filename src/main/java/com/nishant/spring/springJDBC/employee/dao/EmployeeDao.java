package com.nishant.spring.springJDBC.employee.dao;

import java.util.List;

import com.nishant.spring.springJDBC.employee.dto.Employee;

public interface EmployeeDao {
	
	int create (Employee employee);
	int update (Employee employee);
	int delete (int id);
	Employee read(int id);
	List<Employee> find();

}
