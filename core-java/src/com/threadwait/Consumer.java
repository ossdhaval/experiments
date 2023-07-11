package com.threadwait;

import java.util.ArrayList;

public class Consumer implements Runnable
{
	private ArrayList<String> mList = new ArrayList<String>();
	public Consumer(ArrayList<String> list)
	{
		mList = list;
	}
	
	public void run()
	{
		synchronized (mList) 
		{
			
			if(mList.size() == 0)
			{
				System.out.println("No elements in the list. Consumer will wait");
				try 
				{
					mList.wait();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}			
			System.out.println("Consumer came out of wait");
			for(String s : mList)
			{
				System.out.println("Read : "+s);
			}
			mList.clear();
			mList.notify();	
		}
		
	}
		
}

