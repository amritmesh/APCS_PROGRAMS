package edu.wwp.apcs.pkg7;
import java.util.Scanner;

public class DiceGame
{
	Scanner input = new Scanner(System.in);

	private double bankroll;
	public int p;
		
	public DiceGame()
	{
	}

	public static void main(String[] args)
	{
		DiceGame x = new DiceGame();
		
		x.roll();
		x.round();
	}
	
	public int roll()
	{
		int dice1 = (int) ((Math.random() * 5) + 1);
		int dice2 = (int) ((Math.random() * 5) + 1);

		return dice1 + dice2;
	}
	
	public void round()
	{
		System.out.println("Enter the amount of your bankroll: ");
		bankroll = input.nextDouble();
		
		System.out.println("Enter your bet amount from the bankroll: ");
		double betAmt = input.nextDouble();
		
		int sum = roll();
		System.out.println("You rolled a total of: " + sum);
		
		if (sum == 7 || sum == 11)
		{
			System.out.println("YOU WON");
			System.out.println("Current amount of your bankroll: " +  bankroll);
		}
		
		else if (sum == 2 || sum == 3 || sum == 12)
		{
			System.out.println("YOU LOST");
			System.out.println("Current amount of your bankroll: " +  (bankroll - betAmt));
		}
		
		else
		{
			p = sum;
			System.out.println("Point: " + p);
		}
		
		sum = roll();
		System.out.println("You rolled a total of: " + sum);

		while (sum != 7 && sum != p)
		{
			sum = roll();
			System.out.println("You rolled a total of: " + sum);
		}
		
	    if (sum == 7)
	    {
			System.out.println("YOU LOST");
			System.out.println("Current amount of your bankroll: " +  (bankroll - betAmt));
	    }
	    
	    else if (sum == p)
	    {
			System.out.println("YOU WON");
			System.out.println("Current amount of your bankroll: " +  bankroll);
	    }
	}
}
