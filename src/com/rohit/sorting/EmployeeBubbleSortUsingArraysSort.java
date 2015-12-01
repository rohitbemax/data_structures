package com.rohit.sorting;

import java.util.Arrays;

import com.rohit.model.Employee;

public class EmployeeBubbleSortUsingArraysSort {
	
	public static void main(String args[]) {
		Employee emps[] = {new Employee("Rohit", 30), new Employee("Rahul", 28), new Employee("Papa", 25)};
		new EmployeeBubbleSortUsingArraysSort().performSort(emps);
	}
	
	public void performSort(Employee empArr[]) {
		System.out.println("--- Employee before sorting ---");
		printEmployees(empArr);
		Arrays.sort(empArr);
		
		System.out.println("--- Employee after sorting ---");
		printEmployees(empArr);
		
	}
	
	public void printEmployees(Employee emps[]) {
		for(Employee e : emps) {
			System.out.println("Name: " + e.getName() + ", Age: " + e.getAge());
		}
	}
}
