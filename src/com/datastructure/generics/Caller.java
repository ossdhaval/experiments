package com.datastructure.generics;

public class Caller {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		GenericStackUsingArray myStack = new GenericStackUsingArray();
		
		myStack.push(new Object());
		myStack.push(new Object());
		myStack.push(new Object());
		
		System.out.println(myStack);

	}

}
