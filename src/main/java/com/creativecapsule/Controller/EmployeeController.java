package com.creativecapsule.Controller;

import com.creativecapsule.Entity.Employee;
import com.creativecapsule.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by sandip on 02/22/2017.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
}
