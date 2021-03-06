package com.creativecapsule.Dao;

import com.creativecapsule.Entity.Employee;
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
}
