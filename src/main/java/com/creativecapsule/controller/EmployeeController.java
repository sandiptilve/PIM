package com.creativecapsule.controller;

import com.creativecapsule.entity.Employee;
import com.creativecapsule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") int id){
		return employeeService.getEmployeeById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeEmployeeById(@PathVariable("id") int id){
		 employeeService.removeEmployeeById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployeeById(@RequestBody Employee employee){
		employeeService.updateEmployeeById(employee);
	}

	@RequestMapping(value = "add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertEmployee(@RequestBody Employee employee){
		employeeService.insertEmployee(employee);
	}
}
