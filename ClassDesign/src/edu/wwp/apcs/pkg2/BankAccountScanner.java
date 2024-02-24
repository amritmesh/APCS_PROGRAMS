package edu.wwp.apcs.pkg2;
import java.util.Scanner;

public class BankAccountScanner 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter Bank Account #: ");
		String acct = key.next();
		
		System.out.print("Enter Initial Amount: ");
		double amt = key.nextDouble();
		
		System.out.println();
		
		BankAccount x = new BankAccount(amt, acct);
		System.out.println(x);
		
		System.out.println();
		
		System.out.print("How much do you want to deposit: ");
		double dep = key.nextDouble();
		
		System.out.println();
		
		x.deposit(dep);
		System.out.println(x);
		key.close();
	}
}
