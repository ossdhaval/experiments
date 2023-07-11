package com.threadcondition;

import java.util.concurrent.locks.Condition;

/**
 * This class represents an offer that is made to customer when account
 * balance goes beyond {@linkplain com.threadcondition.Bank#HIGH_BAL_AMOUNT HIGH_BAL_AMOUNT}
 */

public class HighBalanceOffer implements Runnable 
{
	
	/**
	 * Account in focus
	 */
	public Account mAccount;
	
	/**
	 * High balance condition supplied from Account
	 */
	private Condition high_balance;
	
	/**
	 * Constructor
	 * 
	 * @param aAccount Account in focus
	 * @param highBalance Condition for high balance
	 */
	public HighBalanceOffer(Account aAccount, Condition highBalance)
	{
		mAccount = aAccount;
		high_balance = highBalance;
	}

	public void run()
	{
		// first acquire lock since we are going change data in shared 
		// account object
		mAccount.accountLock.lock();
		
		// await on high_balance condition till we high balance is achieved 
		while(mAccount.amount < Bank.HIGH_BAL_AMOUNT)
		{
			try 
			{
				high_balance.await();
				System.out.println("high balance has come out of await");
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		// since we have reached here, that means high balance is achieved.
		// add a credit point
		mAccount.creditPoints = mAccount.creditPoints + 1;
		
		// unlock the accountLock
		mAccount.accountLock.unlock();
		System.out.println("Balance is high : "+mAccount.getAmount()+", Credit Points : "+mAccount.creditPoints);
	}

}
