package com.threadcondition;

import java.util.concurrent.locks.Condition;

/**
 * This class represents notification being sent to customer when account
 * balance goes lower than {@link com.threadcondition.Bank#LOW_BAL_AMOUNT LOW_BAL_AMOUNT}
 * @author desaid
 *
 */
public class LowBalanceNotification implements Runnable
{
	
	/**
	 * Account in focus
	 */
	public Account mAccount;
	
	/**
	 * low balance condition supplied from Account
	 */
	private Condition low_balance;
	
	/**
	 * Constructor
	 * 
	 * @param aAccount Account in focus
	 * @param highBalance Condition for high balance
	 */
	public LowBalanceNotification(Account aAccount, Condition lowBalance)
	{
		mAccount = aAccount;
		low_balance = lowBalance;
	}

	public void run()
	{
		// first acquire lock since we are going change data in shared 
		// account object
		mAccount.accountLock.lock();
		
		// await on low_balance condition till we low balance is achieved 
		while(mAccount.amount > Bank.LOW_BAL_AMOUNT)
		{
			try 
			{
				low_balance.await();
				System.out.println("Low balance has come out of await");
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		// since we have reached here, that means low balance is achieved.
		// substract a credit point
		mAccount.creditPoints = mAccount.creditPoints - 1;
		
		// unlock the accountLock
		mAccount.accountLock.unlock();
		
		System.out.println("Balance is low : "+mAccount.getAmount()+", Credit Points : "+mAccount.creditPoints);
	}

}
