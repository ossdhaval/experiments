package com.compare.comparator;

import java.util.Comparator;

public class Employee implements Comparable
{
	private int id;
	private String firstName;
	private String secondName;
	private double salary;
	private int band;
	private int level;
	
	
	
	public Employee(int id, String firstName, String secondName, double salary,	int band, int level) 
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.salary = salary;
		this.band = band;
		this.level = level;
	}
	
	/**
	 * this method is required to implement by Comparable interface. (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @return Should return +ve if this obj is greater then one being passed, 0 if equal, -ve if less.
	 */
	
	public int compareTo(Object obj)
	{
		Employee emp2 = (Employee)obj;
		
		if(this.id < emp2.id)
			// return negative value
			return -1;
		if(this.id == emp2.id)
			// return 0
			return 0;
		if(this.id > emp2.id)
			// return positive value
			return 1;
		
		// if none of above match ( not likely ) then return negative
		return -1;
	}
	
	
	public static Comparator SortByIDAscending = new Comparator() 
												{

													public int compare(Object e1, Object e2) 
													{
														return (((Employee)e1).getId() - ((Employee)e2).getId());
													}

												};
	
												
	public static Comparator sortByIDDescending = new Comparator() 
												{
													public int compare(Object e1, Object e2)
													{
														return ( ((Employee)e2).getId() - ((Employee)e1).getId() );
													}
												
												};
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBand() {
		return band;
	}
	public void setBand(int band) {
		this.band = band;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	

}
