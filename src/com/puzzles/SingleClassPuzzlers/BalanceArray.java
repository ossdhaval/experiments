package com.puzzles.SingleClassPuzzlers;

import java.util.Arrays;



public class BalanceArray 
{
	
	// create an Array of int
	
	public static int[] myArray =   {1,2,3,4,3,2,5}; //{1,2,3,2,2,3,2,1}; {1,2,3,1,2,3,2,1,3};

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

	
		System.out.println(Arrays.toString(myArray));
		
		int i = 0;
		int j = myArray.length - 1;
		
		while (i < j && i != (j-1))
		{
			System.out.println(i+" "+j);
			int fhs = firstHalfSum(i);
			int shs = secondHalfSum(j);
			
			System.out.println(fhs+" "+shs);
			System.out.println("=========");
			
			if(fhs < shs)
			{
				i++;
			}
			else
			{
				if(fhs == shs)
				{
					i++;
					j--;
				}
				else
				{
					j--;
				}
			}
			
		}
		
		System.out.println("first idx : "+ i);
		System.out.println("second idx : "+ j);

	}
	
	public static int firstHalfSum(int index)
	{
		int total = 0;
		while(index >= 0)
		{
			total = total + myArray[index];
			index--;
		}
		
		return total;
	}
	
	
	public static int secondHalfSum(int index)
	{
		int total = 0;
		while(index < myArray.length)
		{
			total = total + myArray[index];
			index++;
		}
		
		return total;
	}

}


