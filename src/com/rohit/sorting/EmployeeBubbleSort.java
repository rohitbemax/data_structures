package com.rohit.sorting;

import java.util.Arrays;

import com.rohit.model.Employee;
import com.rohit.util.GenericPrint;

public class EmployeeBubbleSort {

	GenericPrint<Employee> gp = new GenericPrint<>();
	
	public static void main(String args[]) {
		Employee emps[] = {new Employee("Rohit", 30), new Employee("Rahul", 28), new Employee("Papa", 25)};
		new EmployeeBubbleSortUsingArraysSort().performSort(emps);
	}
	
	public void performSort(Employee empArr[]) {
		System.out.println("--- Employee before sorting ---");
		gp.printObjects(empArr);
		
		for(int i=0; i<empArr.length; i++) {
			for(int j=i; j<empArr.length; i++) {
				if(empArr[i].getAge() > empArr[j].getAge()) {
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
				}
			}
		}
		
		System.out.println("--- Employee after sorting ---");
		gp.printObjects(empArr);
		
	}

}
