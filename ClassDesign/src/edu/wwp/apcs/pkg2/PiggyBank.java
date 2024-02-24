package edu.wwp.apcs.pkg2;

public class PiggyBank 
{
	int pennies;
	int nickels;
	int dimes;
	int quarters;
	
	public PiggyBank()
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public PiggyBank(int pennies, int nickels, int dimes, int quarters) 
	{
		this.pennies = pennies;
		this.nickels = nickels;
		this.dimes=  dimes;
		this.quarters = quarters;
	}
	
	public double getPennies(double pennies) 
	{
		return pennies;
	}
	
	public double getNickels(double nickels) 
	{
		return nickels;
	}
	
	public double getDimes(double dimes) 
	{
		return dimes;
	}
	
	public double getQuarters(double quarters) 
	{
		return quarters;
	}
	
	public double totalVal() 
	{
		double totalVal = (0.01*pennies) + (0.05*nickels) 
						+ (0.10*dimes) + (0.25*quarters);
		return totalVal;
	}
	
	public String toString()
	{
		return "Pennies: " + pennies + "\nNickels: " + nickels
				+ "\nDimes: " + dimes + "\nQuarters: " + quarters
				+ "\n" + "\nTotal Value: " + "$" + totalVal();
	}
	
	public static void main(String[] args)
	{
		PiggyBank bank = new PiggyBank(20, 43, 18,30);
		
		System.out.println(bank.toString());
	}
}
