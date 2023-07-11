package com.threadwait;

import java.util.ArrayList;

public class Starter {
	
	public static ArrayList<String> mTheList = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		Thread producer = new Thread(new Producer(mTheList));
		Thread consumer = new Thread(new Consumer(mTheList));
		
		consumer.start();
		producer.start();
	}

}
