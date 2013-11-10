package com.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Doesn't work , don't know why

public class ArrayToSet 
{
	public static void main(String[] args)
	{
		int[] ia = {1,2,3,4,5,6,7,8,9,0};
		Set<Integer> s = new HashSet(Arrays.asList(ia));
		System.out.println(s.size());
	}
}
