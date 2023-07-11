package com.datastructure;

public class BubbleSort 
{
	//static Integer[] myArray = {10,9,8,7,6,5,4,3,-7,9};
	static Integer[] myArray = {1,2,3,4,5,6,7,8,9};
	static int counter = -1;
	
	static int totalComparisions = 0;
	
	public static void main(String[] args)
	{
		while(counter!=0)
		{
			counter=0;
			for(int i=0; i<myArray.length-1; i++)
			{
				totalComparisions++;
				if(myArray[i] > myArray[i+1])
				{
					counter++;
					int tmp = myArray[i];
					myArray[i] = myArray[i+1];
					myArray[i+1] = tmp;
				}
			}
			
		}
		
		System.out.println("Comparision Count : "+totalComparisions);
		
		for(int i : myArray)
			System.out.println(i);
	}
		

}

