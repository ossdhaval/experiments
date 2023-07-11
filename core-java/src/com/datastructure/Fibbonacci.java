package com.datastructure;

public class Fibbonacci 
{

	public static void main(String[] args)
	{
		int upto = 10;
		int first = 0;
		int second = 1;
		
		System.out.println(first);
		System.out.println(second);
		generateFibo(first, second, upto);	
	}
	
	
	public static void generateFibo(int first, int second, int aUpto)
	{
		int next = first+second;
		System.out.println(next);
		if(aUpto==0)
		{
			return;
		}
		generateFibo(second, next, aUpto-1);
		
	}
}
