package edu.wwp.apcs.pkg5;
import java.util.Scanner;

public class LoopFunctions 
{
	public static int sumInts(int num)
	{
		int sum = 0;
		
		for (int i = 0; i <= num; i++)
		{
			sum += 1;
		}
		
		return sum; 
	}
	
	public static int sumInts2(int num)
	{
		int sum = 0;
		int n = 1;
		
		while (n <= num)
		{
			sum += n;
			n++;
		}
		
		return sum; 
	}
	
	public static void displaySalesTax()
	{
		System.out.println("Amount       Tax");
		
		for (double c = 0; c <= 25; c += .25)
		{
			System.out.printf("$%5.2f", c);
			System.out.printf("$%10.2f", c * .06);
			System.out.println();
		}
	}
	
	public static void runningTotal()
	{
		Scanner key = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.println("Enter a number (-999 to end the list): ");
		int n = key.nextInt();
		
		while (n != -999)
		{
			count++;
			sum += n;
			System.out.println("Enter a number (-999 to end the list): ");
			n = key.nextInt();
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (double) sum / count);
		System.out.println();
		
		key.close();
	}
	
	public static void coinTrials(int n)
	{
		int hCount = 0;
		int tCount = 0;
		
		for (int i = 0; i < n; i++)
		{
			if (Math.random() < .5)
			{
				hCount++;
			}
			else
			{
				tCount++;
			}
		}
		
		System.out.println("Heads: " + hCount + "    " + (100.0) * hCount / n + "%");
		System.out.println("Tails: " + tCount + "    " + (100.0) * tCount / n + "%");
	}
	
	public static void main(String[] args)
	{
		System.out.println(sumInts2(7));
		System.out.println(sumInts(7));
		displaySalesTax();
		coinTrials(8);
		runningTotal();
	}
}
