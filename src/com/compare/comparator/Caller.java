package com.compare.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Caller 
{
	public static void main(String[] args)
	{
		List<Employee> ml = new ArrayList<Employee>();
		
		ml.add(new Employee(1, "NameOne", "SecondNameOne", 100, 13, 1));
		ml.add(new Employee(2, "NameTwo", "SecondNameTwo", 200, 15, 1));
	
		// print insertion order
		System.out.println("insert order : ");
		for (Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
	
		// print after sorting by IDs in ascending order.
		System.out.println("sort by id, ascending order : ");
		Collections.sort(ml, Employee.SortByIDAscending);
		for(Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
		
		// print after sorting by IDs in ascending order.
		System.out.println("sort by id, descending order : ");
		Collections.sort(ml, Employee.sortByIDDescending);
		for(Employee e : ml)
		{
			System.out.println(e.getFirstName());
		}
		
	}
}
