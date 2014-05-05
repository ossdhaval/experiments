package com.threadwaitnotify;

public class AllInOne 
{
	
	public static Integer num = 0;
	public static Object myLock = new Object();
	
	public static void main(String[] args)
	{
		System.out.println("started : ");
		
		Thread printOdd = new Thread( new Runnable(){

			public void run() {
				
				for(int i=0; i<10; i++)
				{
					synchronized (myLock) 
					{

						while(num % 2 == 0)
						{
							try {
								myLock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

						System.out.println("printing odd : "+num);
						num++;
						myLock.notify();
					}
				}
				
			}
		});
		
		
		Thread printEven = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<10; i++)
				{
					synchronized (myLock) 
					{

						while(num % 2 != 0)
						{
							try {
								myLock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

						System.out.println("printing even : "+ num);
						num++;
						myLock.notify();
					}
				}
				
			}
		});
		
		printEven.setName("Even");
		printEven.start();
		printOdd.setName("odd");
		printOdd.start();
	}
	
	
	
	
}
