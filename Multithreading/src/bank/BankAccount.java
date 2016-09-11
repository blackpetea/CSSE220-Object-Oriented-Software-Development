package bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
	private double balance;
	private Lock banlanceChangeLock;
	private Condition sufficientFundsCondition;
	

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		this.balance = 0;
		this.banlanceChangeLock=new ReentrantLock();
		this.sufficientFundsCondition=this.banlanceChangeLock.newCondition();
	}

	/**
	 * Deposits money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		this.banlanceChangeLock.lock();
		try {
			System.out.print("Depositing " + amount);
			double newBalance = this.balance + amount;
			System.out.println(", new balance is " + newBalance);
			this.balance = newBalance;
			this.sufficientFundsCondition.signalAll();
		} finally {//finally make sure the code below will run no matter what happened above
			this.banlanceChangeLock.unlock();
		}

	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 * @throws InterruptedException
	 *             if the withdrawing thread is interrupted while waiting for
	 *             sufficient funds to withdraw
	 */
	public void withdraw(double amount) throws InterruptedException {
		this.banlanceChangeLock.lock();
		try {
			while (this.balance<amount) {
				this.sufficientFundsCondition.await();
			}
			System.out.print("Withdrawing " + amount);
			double newBalance = this.balance - amount;
			System.out.println(", new balance is " + newBalance);
			this.balance = newBalance;
		} finally {
			this.banlanceChangeLock.unlock();
		}

	}

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return this.balance;
	}

}
