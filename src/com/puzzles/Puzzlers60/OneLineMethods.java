package com.puzzles.Puzzlers60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;

public class OneLineMethods 
{
	// using Arrays util class to initialize list with multiple values
	private static List<String> dupList = Arrays.asList("spam", "sausage", "spam", "spam", "bacon", "spam", "tomato","spam");
	
	private static String stringWithTokens = "fear,surprise,     ruthless efficiency,        an almost fanatical devotion to the Pope, nice red uniforms";
	
	
	
	
	public static void main(String[] args)
	{
		// using toString to print the content of list
		System.out.println(eliminateDuplicates(dupList).toString());
		
		System.out.println(Arrays.toString(getStringArray(stringWithTokens)));
		
		
		
	}


	private static List<String> eliminateDuplicates(List<String> dupList2) 
	{
		// using LinkedHashSet to preserve insert order
		return new ArrayList(new LinkedHashSet<String>(dupList2));
	}
	
	private static String[] getStringArray(String stringWithTokens2) {
		
		String[] a = stringWithTokens2.split(",[ ]*");
		return a;
	}

}
