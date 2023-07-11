package com.datastructure.generics;

import java.util.Arrays;

public class GenericStackUsingArray 
{
	// initial size
	private final int INITIAL_SIZE = 5;
	
	// array that will hold elements
	private Object[] backingArray = new Object[INITIAL_SIZE];
	
	// expansion step
	private final int EXPANSION_STEP = 5;
	
	// top position
	public int top = -1;
	
	public GenericStackUsingArray()
	{
		
	}

	/**
	 * push object on top of the stack
	 * @param Obj Element to be put on stack
	 */
	public boolean push(Object obj)
	{
		// first make sure we have space available
		ensureCapacity();
		top++;
		backingArray[top] = obj;
		return true;
		
	}

	/**
	 * method to take out element that is at the top of the stack
	 * @return Object element at the top of stack
	 */
	public Object pop()
	{
		// make sure that stack is not empty
		if(!isEmpty())
		{
			// if not empty then take out the top element
			Object poppedElement = backingArray[top];
			// set reference in stack to null
			backingArray[top] = null;

			// decreament top pointer if its not at the bottom of the stack
			if(top != -1)
			{
				top--;
			}

			// return the element reference
			return poppedElement;
		}
		// if stack is empty then return an exception
		else
		{
			return null;
		}

	}

	public boolean isEmpty()
	{
		return top == -1 ? true : false;
	}
	
	private void ensureCapacity()
	{
		if((top+1) == backingArray.length)
		{
			backingArray = Arrays.copyOf(backingArray, backingArray.length+EXPANSION_STEP);
		}
	}
	
	@Override
	public String toString()
	{
		String s = "";
		for (int i=0; i<=top; i++)
		{
			s = s+backingArray[i].toString()+"\n";
		}
		return s;
	}
	
	
}
