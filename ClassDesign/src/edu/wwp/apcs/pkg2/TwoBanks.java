package edu.wwp.apcs.pkg2;
import java.util.Scanner;

public class TwoBanks 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		System.out.println("Piggy Bank X");
		
		System.out.println("------------");
		
		System.out.print("Enter the number of pennies: ");
		int xpennies = key.nextInt();
		
		System.out.print("Enter the number of nickels: ");
		int xnickels = key.nextInt();
		
		System.out.print("Enter the number of dimes: ");
		int xdimes = key.nextInt();
		
		System.out.print("Enter the number of quarters: ");
		int xquarters = key.nextInt();
		
		PiggyBank x = new PiggyBank(xpennies, xnickels, xdimes, xquarters);
		
		System.out.println();
		
		System.out.println("Total Value (X): " + "$" + x.totalVal());
		
		System.out.println();
		
		System.out.println("Piggy Bank B");
		
		System.out.println("------------");
		
		System.out.print("Enter the number of pennies: ");
		int bpennies = key.nextInt();
		
		System.out.print("Enter the number of nickels: ");
		int bnickels = key.nextInt();
		
		System.out.print("Enter the number of dimes: ");
		int bdimes = key.nextInt();
		
		System.out.print("Enter the number of quarters: ");
		int bquarters = key.nextInt();
		
		PiggyBank b = new PiggyBank(bpennies, bnickels, bdimes, bquarters);
		
		System.out.println();
				
		System.out.println("Total Value (B): " + "$" + b.totalVal());
				
		key.close();
		
		PiggyBankTesterDiaologBox combinedBank = new PiggyBankTesterDiaologBox();
		
		combinedBank.combinePiggy(x, b);
		
		System.out.println();
		
		System.out.println("New Total Value (X): " + "$" + x.totalVal());
		System.out.println("New Total Value (B): " + "$" + b.totalVal());
	}
}
