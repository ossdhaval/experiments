package com.threadwaitnotify;

public class PrintEven implements Runnable
{
	NumberFactory mf = null;
	
	public PrintEven(NumberFactory af)
	{
		mf = af;
	}
	
	public void run()
	{
		synchronized(mf)
		{
			for(int i=0; i<10; i++)
			{
				while(mf.checkCurrentOdd()==1)
				{
					try {
						mf.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
										
				} 
				System.out.println(mf.getCurrentNumber()+" Even");
				mf.notify();
				
					
			}
		}
		
		
	}
}
