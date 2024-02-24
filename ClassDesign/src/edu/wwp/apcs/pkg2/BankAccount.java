package edu.wwp.apcs.pkg2;

public class BankAccount 
{
	private String acctNumb;
	private double balance;
	
	public BankAccount()
	{
		balance = 100;
		acctNumb = "99999";
	}
	
	public BankAccount(double myBalance, String myAccount)
	{
		balance = myBalance;
		acctNumb = myAccount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getAccount()
	{
		return acctNumb;
	}
	
	public void setBalance (double myBalance)
	{
		balance = myBalance;
	}
	
	public void setAcctNumb (String myAcct)
	{
		acctNumb = myAcct;
	}
	
	public void deposit (double amount)
	{
		balance += amount;
	}
	
	public void withdraw (double amount)
	{
		balance -= amount;
	}
	
	public void calcMonthlyInterest(double rate)
	{
		double amount = balance * rate / 12 / 100;
		deposit(amount);
	}
	
	public String toString()
	{
	return ("Bank Account: Account #: " + this.getAccount() + 
			" 	Balance: " + this.getBalance());
	}
	
	public static void main (String[] args)
	{
		BankAccount one = new BankAccount (123.78, "123456");
		System.out.println(one);
		one.deposit(23.71);
		System.out.println(one);
		one.calcMonthlyInterest(4);
		System.out.println("New Balance: " + one.getBalance());
	}
}
