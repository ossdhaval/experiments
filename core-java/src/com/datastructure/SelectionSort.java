package com.datastructure;

public class SelectionSort {
	
	static int[] myArray = {10,9,8,0,1,5,4,3,-5,1};
	
	public static void main(String[] args)
	{
		int anchorIndex = 0;
		int compareIndex = 0;
		int minIndex = 0;
		
		for(anchorIndex=0; anchorIndex<myArray.length; anchorIndex++)
		{
			minIndex = anchorIndex;
			for(compareIndex=anchorIndex; compareIndex<myArray.length; compareIndex++)
			{
				if(myArray[minIndex] > myArray[compareIndex])
				{
					minIndex = compareIndex;
				}
			}
			
			int temp = myArray[anchorIndex];
			myArray[anchorIndex] = myArray[minIndex];
			myArray[minIndex] = temp;
			
		}
		
		for(int i : myArray)
			System.out.println(i);
		
	}
	

}
