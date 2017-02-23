package com.creativecapsule.service;

import com.creativecapsule.dao.EmployeeDao;
import com.creativecapsule.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by sandip on 02/22/2017.
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	public Collection<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}

	public Employee getEmployeeById(int id)
	{
		return this.employeeDao.getEmployeeById(id);
	}

	public void removeEmployeeById(int id) {
		this.employeeDao.removeEmployeeById(id);
	}

	public void updateEmployeeById(Employee employee) {
		 this.employeeDao.updateEmployeeById(employee);
	}

	public void insertEmployee(Employee employee) {
		this.employeeDao.insertEmployee(employee);
	}
}
