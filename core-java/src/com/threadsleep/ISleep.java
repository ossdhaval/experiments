package com.threadsleep;

public class ISleep {
	
	public static void main(String[] args)
	{
		System.out.println("1");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("2");
	}

}
