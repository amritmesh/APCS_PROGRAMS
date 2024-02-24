package edu.wwp.apcs.pkg8;

public class ArrayWksht3 
{
	// 1. Create an array that contains the first 100 odd positive integers
	public static int[] oddIntegers() 
	{
		int x = 1;
		int[] odds = new int[100];
		
		for (int i = 0; i < odds.length; i++)
		{
			odds[i] = x;
			x += 2;
		}
		
		return odds;
	}
	
	// 2. An int array []salary contains the integer salary of all employees.
	// Write a method that calculates the average salary.
	// Pass the array as a parameter.
	public static double avgSal(int[] salary) 
	{
		double intSal = 0; 
		
		for (int i = 0; i < salary.length; i++)
		{
			intSal += salary[i];
		}
		
		return intSal / salary.length;
	}

	// 3. A String array contains last names in alphabetical order.
	// Create an array []reverse that stores the names in decending order.
	public static String[] createReverse(String[] name) 
	{
		String[] reverseAlph = new String[name.length];
		int y = 0;
		
		for (int i = name.length - 1; i >= 0; i--)
		{
			reverseAlph[y] = name[i];
			y++;
		}
		
		return reverseAlph;
	}
	
	// 4. An int array []number contains integers.
	// Traverse through the array to create 2 more arrays: []pos and neg[].
	// No zeros should be in []pos or []neg
	public static void posNeg(int[] number) 
	{
		int posX = 0;
		int negX = 0;
		
		for (int i = 0; i < number.length; i++)
		{
			if (number[i] > 0)
			{
				posX++;
			}
			
			else
			{
				negX++;
			}
		}
		
		int[] pos = new int[posX];
		int[] neg = new int[negX];
		int pIndex = 0;
		int nIndex = 0;
		
		for (int i = 0; i < number.length; i++)
		{
			if (number[i] > 0)
			{
				pos[pIndex] = number[i];
				pIndex++;
			}
			
			else if (number[i] < 0)
			{
				neg[nIndex] = number[i];
				nIndex++;
			}
		}
		
		System.out.println("Positives: ");
		
		for (int i : pos)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("Negatives: ");
		
		for (int i : neg)
		{
			System.out.print(i + " ");
		}
	}
}