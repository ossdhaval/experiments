package com.threadwaitnotify;

public class Starter 
{
	public static void main(String[] args)
	{
		NumberFactory f = new NumberFactory();
		
		
		Thread po = new Thread(new PrintOdd(f));
		
		Thread pe = new Thread(new PrintEven(f));
		
		po.start();
		pe.start();
	}
}
