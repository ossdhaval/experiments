package com.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Doesn't work , don't know why

public class ArrayToSet 
{
	public static void main(String[] args)
	{
		Integer[] ia = {1,2,3,4,9,6,7,8,9,9};
		Set<Integer> s = new HashSet(Arrays.asList(ia));
		for(Integer i:s)
		{
			System.out.println(i);
		}
		System.out.println("---"+s.size());
	}
}
