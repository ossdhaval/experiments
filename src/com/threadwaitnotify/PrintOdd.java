package com.threadwaitnotify;

public class PrintOdd implements Runnable
{
	NumberFactory mf = null;
	
	public PrintOdd(NumberFactory af)
	{
		mf = af;
	}
	
	public void run()
	{
		synchronized(mf)
		{
			for(int i=0; i<10; i++)
			{
				while(mf.checkCurrentOdd()==0)
				{
					try {
						mf.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
										
				} 
				System.out.println(mf.getCurrentNumber()+" Odd");
				mf.notify();
				
					
			}
		}
		
		
	}
}
