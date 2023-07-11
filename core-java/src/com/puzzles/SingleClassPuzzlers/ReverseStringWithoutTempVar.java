package com.puzzles.SingleClassPuzzlers;

public class ReverseStringWithoutTempVar {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		String reverseMe = "reverse me!";
		for (int i = 0; i < reverseMe.length(); i++) 
		{
		
//			System.out.println(i);
//			System.out.println(reverseMe);
//			System.out.println(reverseMe.substring(1, reverseMe.length() - i));
//			System.out.println(reverseMe.substring(0, 1));
//			System.out.println(reverseMe.substring(reverseMe.length() - i, reverseMe.length()));
//			System.out.println("--------------------");
			
		    reverseMe = 
		    		reverseMe.substring(1, reverseMe.length() - i)
		        + reverseMe.substring(0, 1)
		        + reverseMe.substring(reverseMe.length() - i, reverseMe.length());
		 }
		 System.out.println(reverseMe);

	}

}
