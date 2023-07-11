package com.puzzles.SingleClassPuzzlers;

import java.util.HashMap;
import java.util.Map;




public class FindStringFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String subject = "dzone java dzone dzone javascript java";
		
		
		
		Map<String, Integer> substringFrequency = new HashMap<String, Integer>(); 
		
		for(String s : subject.split(" "))
		{
			if(!substringFrequency.containsKey(s))
			{
				substringFrequency.put(s, 1);
				
			}
			else
			{
				substringFrequency.put(s, substringFrequency.get(s)+1);
			}
				
			
		}
		
		System.out.println(substringFrequency.toString());

	}

}
