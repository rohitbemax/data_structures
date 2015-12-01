package com.rohit.model;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { 
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int compareTo(Employee emp) {
		if(this.age > emp.age) { return 1; }
		else if(this.age == emp.age) { return 0; }
		else { return -1; }
	}
	
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age;
	}
}
