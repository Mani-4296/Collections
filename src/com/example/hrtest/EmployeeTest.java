package com.example.hrtest;

import java.util.Scanner;

// importing Employee class from com.example.hr package
import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// getting user inputs for id, name, salary
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.println("Enter the employee name: ");
		String name = input.nextLine();
		System.out.println("Enter the salary of this employee: ");
		double salary = input.nextDouble();
		input.close();

		// creating instance for employee class
		Employee details = new Employee(id, name, salary);
		// calling method from employee class
		details.printName();
		details.printSalary();
	}

}
