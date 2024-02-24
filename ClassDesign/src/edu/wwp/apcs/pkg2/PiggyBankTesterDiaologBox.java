package edu.wwp.apcs.pkg2;
import java.util.Scanner;

public class PiggyBankTesterDiaologBox 
{
	public void combinePiggy(PiggyBank x, PiggyBank b)
	{
		x.pennies += b.pennies;
		b.pennies = 0;
	
		x.nickels += b.nickels;
		b.nickels = 0;
		
		x.dimes += b.dimes;
		b.dimes = 0;
		
		x.quarters += b.quarters;
		b.quarters = 0;
	}
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the number of pennies: ");
		int pennies = key.nextInt();
		
		System.out.print("Enter the number of nickels: ");
		int nickels = key.nextInt();
		
		System.out.print("Enter the number of dimes: ");
		int dimes = key.nextInt();
		
		System.out.print("Enter the number of quarters: ");
		int quarters = key.nextInt();
		
		PiggyBank x = new PiggyBank(pennies, nickels, dimes, quarters);
		System.out.println(x.toString());
		
		key.close();
	}
}
