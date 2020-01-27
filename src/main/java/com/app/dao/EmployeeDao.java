package com.app.dao;

import com.app.model.Employee;

import java.util.List;

/***
 * @author saurabh vaish
 * @version 1.0
 * @since 27/01/20
 ***/
public interface EmployeeDao {
    public Employee saveEmployee(Employee emp);

//	public Integer updateEmployee(Employee emp);
//
//	public Employee getOneEmployee(Integer empId);

    public List<Employee> getAllEmployees();
}
