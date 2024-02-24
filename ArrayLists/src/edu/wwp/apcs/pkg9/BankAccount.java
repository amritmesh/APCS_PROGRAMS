package edu.wwp.apcs.pkg9;

public class BankAccount 
{
	private int accountNumber;
	private double balance;
	
	public BankAccount(int anAccountNumber)
	{
		accountNumber = anAccountNumber;
		balance = 0;
	}
	
	public BankAccount(int anAccountNumber, double initialBalance)
	{
		accountNumber = anAccountNumber;
		balance = initialBalance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account #: " + getAccountNumber();
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public static void main(String[] args)
	{
		BankAccount one = new BankAccount(1);
		BankAccount two = new BankAccount(2,1000);
		
		one.deposit(50);
		one.deposit (25.25);
		two.withdraw(12.56);
		two.withdraw(100);
		
		System.out.println( one);
		System.out.println(two);
	}
}
