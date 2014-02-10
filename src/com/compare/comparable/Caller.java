package com.compare.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Caller 
{
	public static MyObject mo1 = null;
	public static MyObject mo2 = null;
	
	public static void main(String[] args)
	{
		mo1 = new MyObject();
		mo2 = new MyObject();
		
		mo1.setmAge(20);
		mo2.setmAge(10);
		
		List<MyObject> ml = new ArrayList<MyObject>();
		
		ml.add(mo1);
		ml.add(mo2);
		
		System.out.println("printing simple list ( it'll print insertion order ) : ");
		for(MyObject o : ml)
		{
			System.out.println(o.getmAge());
		}
		
		Collections.sort(ml);
		System.out.println("printing natural order ( implemented by comparable ) : ");
		for(MyObject o : ml)
		{
			System.out.println(o.getmAge());
		}
		
		
		
	}
}
