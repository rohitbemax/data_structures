package com.rohit.sorting;

import com.rohit.model.Employee;

public class GenericBubbleSorter<T> 
{
	public void performSort(Comparable<T> t[]) {
		for(int i=0; i<t.length; i++) {
			Comparable<T> obj = t[i];
			for(int j=i; j<t.length; j++) {
				if(t[i].compareTo((T)t[j]) > 0) {
					T temp = (T)t[i];
					t[i] = t[j];
					t[j] = (Comparable<T>)temp;
				}
			}
		}
		
		for(Comparable<T> temp : t) {
			System.out.println(temp);
		}
	}
	
	public static void main(String args[]) {
		Employee emps[] = {new Employee("Rohit", 30), new Employee("Rahul", 28), new Employee("Raj", 99)};
		GenericBubbleSorter<Employee> sorter = new GenericBubbleSorter<>();
		sorter.performSort(emps);
	}
}
