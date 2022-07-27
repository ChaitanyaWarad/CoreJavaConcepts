package com.javatpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {

		Employee emp = new Employee(1, "chaitu", 1000);
		Employee emp1 = new Employee(4, "navya", 4000);
		Employee emp2 = new Employee(2, "ravi", 2000);
		Employee emp3 = new Employee(3, "Kavya", 3000);

		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(emp);
		a1.add(emp1);
		a1.add(emp2);
		a1.add(emp3);

		List<Employee> a2 = a1.stream().filter(e -> e.getSalary() > 100).collect(Collectors.toList());

		for (Employee employee : a2) {
			System.out.print(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
		}
		System.out.println();
		
		List<Employee> newEployees = a1.stream().map(e -> {e.setSalary(e.getSalary() + (e.getSalary()*30/100));return e;}).collect(Collectors.toList());
		
		for (Employee employee : newEployees) {
			System.out.print(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
		}

	}

}
