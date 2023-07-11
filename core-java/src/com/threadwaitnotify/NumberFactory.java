package com.threadwaitnotify;

public class NumberFactory 
{
	private int num = 1;
	
/*	public synchronized int getNextOdd()
	{
		int ret = 0;
		if(num%2!=0)
		{
			ret = num;
			num++;
		}
		else
			ret = 0;
		
		return ret;
	}
	
	public synchronized int getNextEven()
	{
		int ret = 0;
		if(num%2==0)
		{
			ret = num;
			num++;
		}
		else
			ret = 0;
		
		return ret;
	}*/
	
	public int checkCurrentOdd()
	{
		if(num%2==1)
			return 1;
		else 
			return 0;
	}
	
	public int getCurrentNumber()
	{
		int ret = num;
		num++;
		return ret;
	}
}
