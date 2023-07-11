package com.compare.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Caller 
{
	public static void main(String[] args)
	{
		
		// use comparable
		Employee emp1 = new Employee(1, "NameOne", "SecondNameOne", 100, 13, 1);
		Employee emp2 = new Employee(2, "NameTwo", "SecondNameTwo", 200, 15, 1);
		Employee emp3 = new Employee(3, "NameThree", "SecondNameThree", 300, 14, 1);
		
		List<Employee> ml = new ArrayList<Employee>();
		ml.add(emp1);
		ml.add(emp3);
		ml.add(emp2);
	
		// print insertion order
		System.out.println("insert order : ");
		for (Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
		
		System.out.println("\n");
	
		// print after sorting by Comparable
		Collections.sort(ml);
		System.out.println("Using comparable : ");
		for (Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
		
		System.out.println("\n");
		
		// print after sorting by IDs in ascending order.
		System.out.println("sort by id, ascending order : ");
		Collections.sort(ml, Employee.SortByIDAscending);
		for(Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
		
		System.out.println("\n");
		
		// print after sorting by IDs in ascending order.
		System.out.println("sort by id, descending order : ");
		Collections.sort(ml, Employee.sortByIDDescending);
		for(Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
		
	}
}
