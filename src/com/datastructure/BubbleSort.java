package com.datastructure;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		Integer[] ia = {3,4,5,1,6,4,34,22,45};
		
		int index=0;
		
		for(int k=0; k<ia.length-1; k++)
		{
			for(int i=0; i<ia.length-(k+1); i++)
			{
				if(ia[i]>ia[i+1])
				{
					Integer temp = ia[i];
					ia[i] = ia[i+1];
					ia[i+1]=temp;
				}
			}
		}
		for(Integer j : ia)
			System.out.println(j.intValue());
	}
}
