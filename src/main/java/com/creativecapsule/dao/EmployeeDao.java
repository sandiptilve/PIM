package com.creativecapsule.dao;

import com.creativecapsule.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by sandip on 02/22/2017.
 */
@Repository
public class EmployeeDao {

private static Map<Integer, Employee> employees;

	static{

		employees = new Hashtable<Integer, Employee>(){
			{
				put(1, new Employee(1, "Sandip"));
				put(2, new Employee(2, "Kapil"));
				put(3, new Employee(3, "Laxmi"));
			}

		};
	}

	public Collection<Employee> getAllEmployees()
	{
		return this.employees.values();
	}

	public Employee getEmployeeById(int id)
	{
		return this.employees.get(id);
	}

	public void removeEmployeeById(int id) {
		this.employees.remove(id);
	}

	public void updateEmployeeById(Employee employee) {
		Employee emp = this.employees.get(employee.getId());
		employee.setName(emp.getName());
	}

	public void insertEmployee(Employee employee) {
		this.employees.put(employee.getId(),employee);
	}
}
