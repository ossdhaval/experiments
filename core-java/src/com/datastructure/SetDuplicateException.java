package com.datastructure;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicateException {
	
	public static Integer i = new Integer(1);
	
	public static void main(String[] args)
	{
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(new Integer(i));
		s.add(new Integer(2));
		s.add(new Integer(3));
		
		System.out.println(s.size());
	}

}
