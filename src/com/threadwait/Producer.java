package com.threadwait;

import java.util.ArrayList;
// this is a producer
public class Producer implements Runnable
{
	ArrayList<String> mList = new ArrayList<String>();
	public Producer(ArrayList<String> list)
	{
		mList = list;
	}
	
	public void run()
	{
		int i=0;
		System.out.println("producer started");
		synchronized (mList) 
		{
			System.out.println("in the synchronized");
			while(mList.size() != 0)
			{
				System.out.println(" < 0 , so sleep ");
				try 
				{
					mList.wait();
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("0, so start producing");
			while(mList.size() != 5)
			{
				System.out.println("adding element : "+i);
				mList.add("element"+(i++));
			}
			System.out.println("notifing all consumers waiting on mList");
			mList.notify();
		}	
	}
}

