package edu.wwp.apcs.pkg9;

import java.util.ArrayList;

public class Bank 
{
	private ArrayList<BankAccount> accounts;
	
	public Bank()
	{
		accounts = new ArrayList<BankAccount>();
	}
	
	public void addAccount(BankAccount a)
	{
		accounts.add(a);
	}
	
	public int count(double atLeast)
	{
		int matches = 0;
		
		for (int i = 0; i < accounts.size(); i++)
		{
			BankAccount a = accounts.get(i);
			
			if (a.getBalance() >= atLeast)
			{
				matches++;
			}
		}
		
		return matches;
	}
	
	public BankAccount find(int accountNumber)
	{
		for (int i = 0; i < accounts.size(); i++)
		{
			BankAccount a = accounts.get(i);
			
			if (a.getAccountNumber() >= accountNumber)
			{
				return a;
			}
		}
		
		return null;
	}
		
	public BankAccount getMaximum()
	{
		if (accounts.size() == 0)
		{
			return null;
		}
			
		BankAccount max = (BankAccount) accounts.get(0);
			
		for (int i = 1; i < accounts.size(); i++) 
		{
			BankAccount a = (BankAccount) accounts.get(i);
			
			if (a.getBalance() > max.getBalance())
			{
				max = a;
			}
		}
		
		return max;
	}
	
	public double getTotalBalance()
	{
		double total = 0;
		
		for (BankAccount i : accounts)
		{
			total += i.getBalance();
		}
		
		return total;
	}
	
	public boolean deposit(int accountNumber, double amount)
	{
		BankAccount found = find(accountNumber);
		
		if (found == null)
		{
			return false;
		}
		
		found.deposit(amount);
		
		return true;
	}
	
	public double averageBalance()
	{
		return getTotalBalance() / accounts.size();
	}
	
	public void display()
	{
		
	}
	
	public static void main(String[] args) 
	{
		Bank firstBankOfJava = new Bank();
		
		firstBankOfJava.addAccount(new BankAccount(1001, 20000));
		firstBankOfJava.addAccount(new BankAccount(1015, 10000));
		firstBankOfJava.addAccount(new BankAccount(1729, 15000));

		System.out.println("Total of all Accounts: " + firstBankOfJava.getTotalBalance());

		double threshold = 15000;
		int c = firstBankOfJava.count(threshold);
		
		System.out.println(c + "accounts with balance >= " + threshold);
		
		int accountNumber = 1015;
		
		BankAccount a = firstBankOfJava.find(accountNumber);
		
		if (a == null)
		{
			System.out.println("No account with number " + accountNumber);
		}
		
		else
		{
			System.out.println("Account with number " + accountNumber + " has balance " + a.getBalance());
		}
		
		BankAccount max = firstBankOfJava.getMaximum();
		
		System.out.println("Account with number " + max.getAccountNumber() + " has the largest balance.");
		System.out.println(firstBankOfJava.deposit(1729, 346.25));
		
		firstBankOfJava.display();
		
		System.out.println("Average Balance: " + firstBankOfJava.averageBalance());
	}
}
