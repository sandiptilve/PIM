package com.creativecapsule.entity;

/**
 * Created by sandip on 02/22/2017.
 */
public class Employee {

	private int id;
	private String Name;

	public Employee(int id, String name) {
		this.id = id;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
