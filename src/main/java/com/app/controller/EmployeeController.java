package com.app.controller;

import com.app.model.Employee;
import com.app.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class EmployeeController {


	private EmployeeServiceImpl service;

	public EmployeeController(){
		service = new EmployeeServiceImpl();
	}



	public Employee saveEmployee(Employee employee)
	{
		return service.saveEmployee(employee);
	}
	
	
	
	// show all employees

	public List<Employee> getAllEmployees()   // we can use request , response as parameter , no effect on path matching
	{
		return service.getAllEmployees();
	}
	
	
//	// view one employee
//
//	@GetMapping("/viewOne/{empId}")
//	public String viewOneEmployee(@PathVariable Integer empId,Model map,RedirectAttributes rmap)
//	{
//		if(service.checkEmployee(empId))
//		{
//			map.addAttribute("emp",service.getOneEmployee(empId));
//
//			log.info("Returning Employee Details !");
//
//			return "ViewEmployee";
//		}
//		else
//		{
//			log.error("No Employee Found With Given Id");
//			throw new EmployeeNotFoundException("Employee Not Found");
//		}
//	}
//
//
//	// get employee update page
//
//	public String getUpdate(@PathVariable Integer empId,Model map)
//	{
//		if(service.checkEmployee(empId))
//		{
//			map.addAttribute("employee",service.getOneEmployee(empId));
//
//			log.info("Employee Found , Returing Employee Details on Update Page !");
//
//			return "EmployeeUpdate";
//		}
//		else
//		{
//			throw new EmployeeNotFoundException("Employee Not Found");
//		}
//	}
//
//
//	// update employee
//
//	public String updateEmployee(@ModelAttribute Employee employee,Errors errors,Model map,RedirectAttributes rmap)
//	{
//		log.info("Entering into update method");
//
//		validator.validate(employee, errors);
//
//		if(!errors.hasErrors())
//		{
//			Integer empId = service.updateEmployee(employee);
//			rmap.addFlashAttribute("smsg","Employee Updated Successfully with Id :"+empId);
//
//			log.info("Employee Updated Sucessfully !!");
//
//			return "redirect:all";
//		}
//		else
//		{
//			log.info("Employee Details Are Not Correct ");
//
//			map.addAttribute("employee",employee);
//			map.addAttribute("emsg","Please Enter Valid Details");
//
//			return "EmployeeUpdate";
//		}
//
//	}
//
//
//	// delete Employee
//
//	public String deleteEmployee(@PathVariable Integer empId, RedirectAttributes map)
//	{
//		if(service.checkEmployee(empId))
//		{
//			service.deleteEmployee(empId);
//
//			map.addFlashAttribute("msg","Employee Deleted SuccessFully with Given Id :"+empId);
//
//			log.info("Employee Deleted Successfully  !!");
//
//			return "redirect:/all";
//		}
//		else
//		{
//			throw new EmployeeNotFoundException("Employee Not Found");
//		}
//	}
//
	
}
