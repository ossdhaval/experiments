package com.enumerator;

public class CheckAPI {

	public static DirectionName dn = DirectionName.NORTH;
	public static DirectionName dn2;
	
	public static void main(String args[])
	{
		System.out.println(dn.toString());
		
		dn2 = DirectionName.valueOf("SOUTH");
		System.out.println(dn2.toString());
		
				
	}

}
