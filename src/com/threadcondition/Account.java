package com.threadcondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;




/**
 * This class represents bank account. It provides various operations on 
 * account.
 * 
 * @author desaid
 *
 */

public class Account 
{

	/*
	 * Amount held in account
	 */
	public int amount;
	
	/**
	 * credit points. +1 when amount goes above {@link com.threadcondition.Bank#HIGH_BAL_AMOUNT HIGH_BAL_AMOUNT}<br>
	 * and -1 if amount goes below {@link com.threadcondition.Bank#LOW_BAL_AMOUNT LOW_BAL_AMOUNT}
	 */
	public int creditPoints = 0;
	
	/**
	 * lock for this account object
	 */
	Lock accountLock = new ReentrantLock();
	
	/**
	 * condition that signals balance higher <br>
	 * than {@link com.threadcondition.Bank#HIGH_BAL_AMOUNT HIGH_BAL_AMOUNT}
	 */
	Condition highBalance = accountLock.newCondition();
	
	/**
	 * condition that signals balance lower <br> 
	 * than {@link com.threadcondition.Bank#LOW_BAL_AMOUNT LOW_BAL_AMOUNT}
	 */
	Condition lowBalance = accountLock.newCondition();
	
	/**
	 * Constructor that creates two threads, one for watching low balance<br>
	 * and other for high balance.
	 * @param initialAmount initial amound deposited at the time of opening
	 */
	public Account(int initialAmount)
	{
		amount = initialAmount;
		
		new Thread(new LowBalanceNotification(this, lowBalance)).start();
		
		new Thread(new HighBalanceOffer(this, highBalance)).start();
	}
	
	/**
	 * deposites amount to account. Also signals if amount is higher <br>
	 * than {@link com.threadcondition.Bank#HIGH_BAL_AMOUNT HIGH_BAL_AMOUNT}
	 */
	public int deposit(int addAmount)
	{
		accountLock.lock();
		amount = amount + addAmount;
		if (amount > Bank.HIGH_BAL_AMOUNT)
		{
			highBalance.signal();
		}
		accountLock.unlock();
		return amount;
	}
	
	/**
	 * Withdraws amount from account. Also signals if amount is lower <br>
	 * than {@link com.threadcondition.Bank#LOW_BAL_AMOUNT LOW_BAL_AMOUNT}
	 */
	public int withdraw(int withdrawAmount)
	{
		accountLock.lock();
		amount = amount - withdrawAmount;
		if(amount < Bank.LOW_BAL_AMOUNT)
		{
			lowBalance.signal();
		}
		accountLock.unlock();
		return amount;
	}
	
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
