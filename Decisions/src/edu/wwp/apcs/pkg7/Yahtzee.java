package edu.wwp.apcs.pkg7;

public class Yahtzee 
{
	public static void twoDice()
	{
		int roll = 1; 
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1;
		
		System.out.println(die1 + " " + die2);
		
		while(die1 != die2)
		{
			die1 = (int) (Math.random() * 6) + 1;
			die2 = (int) (Math.random() * 6) + 1;
			
			System.out.println(die1 + " " + die2);
			
			roll++;
		}
		
		System.out.println("Count            " + roll);
	}
	
	public static void threeDice()
	{
		int roll = 1; 
		
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1;
		int die3 = (int) (Math.random() * 6) + 1;

		System.out.println(die1 + " " + die2 + " " + die3);

		while(die1 != die2 || die2 != die3)
		{
			die1 = (int) (Math.random() * 6) + 1;
			die2 = (int) (Math.random() * 6) + 1;
			die3 = (int) (Math.random() * 6) + 1;
			
			System.out.println(die1 + " " + die2 + " " + die3);
			
			roll++;
		}
		
		System.out.println("Count            " + roll);
	}
	
	public static void fiveDice()
	{
		int roll = 1; 
		
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1;
		int die3 = (int) (Math.random() * 6) + 1;
		int die4 = (int) (Math.random() * 6) + 1;
		int die5 = (int) (Math.random() * 6) + 1;

		System.out.println(die1 + " " + die2 + " " + die3 + " " + die4 + " " + die5);

		while(die1 != die2 || die2 != die3 || die3 != die4 || die4 != die5)
		{
			die1 = (int) (Math.random() * 6) + 1;
			die2 = (int) (Math.random() * 6) + 1;
			die3 = (int) (Math.random() * 6) + 1;
			die4 = (int) (Math.random() * 6) + 1;
			die5 = (int) (Math.random() * 6) + 1;
			
			System.out.println(die1 + " " + die2 + " " + die3 + " " + die4 + " " + die5);
			
			roll++;
		}
		
		System.out.println("Count            " + roll);
	}
	
	public static void main(String[] args) 
	{
		twoDice();
		threeDice();
		fiveDice();
	}
}