package edu.wwp.apcs.pkg7;

import java.util.Scanner;

public class DecisionMethods 
{
	// 1. returns one of the following
	// Even Positive, Odd Positive, Zero, or Negative
	public static String classify(int n) 
	{
		if (n < 0)
			return "Negative";
		else if (n == 0)
			return "Zero";
		else if (n % 2 == 0)
			return "Even Positive Integer";
		else
			return "Odd Positive Innteger";
	}
	
	// 2. this method will return the Letter Grade of a test
	// F &lt;60
	public static String letterGrade(int testGrade) 
	{
		String letter = "";
		
		if (testGrade >= 90)
			letter = "A";
		if (testGrade >= 80 && testGrade <= 90)
			letter = "B";
		if (testGrade >= 70 && testGrade <= 80)
			letter = "C";
		if (testGrade >= 60 && testGrade <= 70)
			letter = "D";
		if (testGrade < 60)
			letter = "E";
			
		return letter;
	}
	
	// 3. this method will return the maximum value
	public static int getMax(int m, int n, int o)
	{
		if (m >= n && m >= o)
			return m;
		else if(n >= o)
			return n;
		else
			return o;
	}

	// 4. this method will print the three numbers in ascending order public static
	public static void sort1 (int a, int b, int c)
	{
		int min = Math.min(Math.min(a,  b), c);
		int max = Math.max(Math.max(a,  b), c);
		int mid = a + b + c - max - min;
		
		System.out.println(min + " " + mid + " " + " " + max);
	}
	
	// 5. this method will create a chart of statistice of y rolls of a die

		//1000000 TRIALS

	//	=============
	//ONES: 166793 16.6793%
	//TWOS: 166544 16.6544%
	//THREES: 166732 16.6732%
	//FOURS: 166817 16.6817%
	//FIVES: 166144 16.6144%
	//SIXES: 166970 16.697%
	public static void dieTrials(int y)
	{
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int die;
		
		for (int roll = 1; roll <= y; roll++)
		{
			die = (int) (Math.random() * 6) + 1;
			
			if (die == 1)
			{
				one++;
			}
			
			else if (die == 2)
			{
				two++;
			}
			
			else if (die == 3)
			{
				three++;
			}
			
			else if (die == 4)
			{
				four++;
			}
			
			else if (die == 5)
			{
				five++;
			}
			
			else
			{
				six++;
			}
		}
		
		System.out.println("        " + y + " TRIALS");
		System.out.println("       ============");
		System.out.println();
		
		System.out.println("ONES: " + one + "   " + 100.0 * one / y + "%");
		System.out.println("TWOS: " + two + "   " + 100.0 * two / y + "%");
		System.out.println("THREES: " + three + "   " + 100.0 * three / y + "%");
		System.out.println("FOURS: " + four + "   " + 100.0 * four / y + "%");
		System.out.println("FIVES: " + five + "   " + 100.0 * five / y + "%");
		System.out.println("SIXES: " + six + "   " + 100.0 * six / y + "%");
	}
	
//	//6. Write a program to count how many input values are positive, how many
//	are negative, the sum of the positive and the sum of the negative. The input
//	value 999 will mean that all numbers have been typed. (do not include 999 in
//	calculations) Use the Scanner class to input values.
	//
	public static void numberInput() 
	{
		int posSum = 0;
		int negSum = 0;
		
		int posCount = 0;
		int negCount = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number. 999 to end");
		int n = keyboard.nextInt();
		
		while (n != 999) 
		{
			if (n < 0) 
			{
				negSum += n;
				negCount++;
			} 
			
			else if (n > 0) 
			{
				posSum += n;
				posCount++;
			}
			
			System.out.println("Enter a number. 999 to end");
			n = keyboard.nextInt();
		}
		
		System.out.println(posCount + " positive numbers that add up to " + posSum);
		System.out.println(negCount + " negative numbers that add up to " + negSum);
	}

	public static void main(String[] args)
	{
		System.out.println(classify(16));
		System.out.println(classify(-16));
		System.out.println(classify(0));
		
		System.out.println(letterGrade(75));
		
		System.out.println(getMax(4, 7, 9));
		
		sort1(1, 3, 2);
		
		dieTrials(10000000);
		
		numberInput();
	}
}