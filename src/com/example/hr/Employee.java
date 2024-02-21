package com.example.hr;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void printName() {
		System.out.println("Employee name is: " + name);

	}

	public void printSalary() {
		System.out.println("Salary of this employee is: " + salary);
	}

}