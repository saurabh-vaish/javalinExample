package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee emp);
	
//	public Integer updateEmployee(Employee emp);
//
//	public Employee getOneEmployee(Integer empId);
	
	public List<Employee> getAllEmployees();
	
//	public void deleteEmployee(Integer empId);
//
//	public Boolean checkEmployee(Integer empId);
//
//	public List<Employee> getEmployeeByUserName(String username);
	 
	
}
