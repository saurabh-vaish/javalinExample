package com.app.service.impl;

import com.app.dao.EmployeeDao;
import com.app.dao.impl.EmployeeDaoImpl;
import com.app.model.Employee;
import com.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;

	public EmployeeServiceImpl(){
		dao = new EmployeeDaoImpl();
	}

	
	@Override
	@Transactional
	public Employee saveEmployee(Employee emp) {
		return dao.saveEmployee(emp);
	}

//	@Override
//	@Transactional
//	public Integer updateEmployee(Employee emp) {
//		return repo.save(emp).getEmpId();
//	}
//
//	@Override
//	@Transactional(readOnly = true)
//	public Employee getOneEmployee(Integer empId) {
//
//	 Optional<Employee> emp=repo.findById(empId);
//
//	 if(emp.isPresent()) return emp.get();
//	 else throw new EmployeeNotFoundException("Employee Not Found");
//
//	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

//	@Override
//	@Transactional
//	public void deleteEmployee(Integer empId) {
//		repo.deleteById(empId);
//	}
//
//	@Override
//	public Boolean checkEmployee(Integer empId) {
//		return repo.existsById(empId);
//	}
//
//	@Override
//	@Transactional(readOnly = true)
//	public List<Employee> getEmployeeByUserName(String username) {
//		return repo.findByEmpUserName(username);
//	}

	
}
