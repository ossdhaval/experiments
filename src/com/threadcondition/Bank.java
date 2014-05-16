package com.threadcondition;

/**
 * This class simulates a bank. It'll create an Account instance and will
 * do different operations possible on account.
 *  
 * @author desaid
 *
 */

public class Bank 
{
	/**
	 * Amount that defines a low balance in an account
	 */
	public static final int LOW_BAL_AMOUNT = 10;
	
	/**
	 * Amount that defines high balance in an account
	 */
	public static final int HIGH_BAL_AMOUNT = 100;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// first open an account with initial balance
		System.out.println("Starting with initial amount of 50");
		Account a1 = new Account(50);
		
		// make this thread sleep for 2 seconds, just for clarity purpose
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		// now deposite some money in account so that amount is > HIGH_BAL_AMOUNT
		System.out.println("\nDepositing 1000");
		a1.deposit(1000);
		
		// make this thread sleep for 2 seconds, just for clarity purpose
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		// now withdraw some money so that amount is less than LOW_BAL_AMOUNT
		System.out.println("\nWithdrawing 1049");
		a1.withdraw(1049);
		
		// make this thread sleep for 2 seconds, just for clarity purpose
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("\ndone");
		
	}

}
