package edu.wwp.apcs.pkg8;
import java.util.Random;

public class TwoDimMethods 
{
	private int[][] numbers;

	public TwoDimMethods() 
	{
		int[][] myNumbers = {{ 11, 73, 5, 70 }, { 78, 276, 75, 34 }, { 21, 70, 94, 17 }};
		numbers = myNumbers;
	}
	
	public TwoDimMethods(int rows, int cols) 
	{
		numbers = new int[rows][cols];
		Random gen = new Random();
		
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[i].length; j++)
			{
				numbers[i][j] = gen.nextInt(101);
			}
		}
	}
	
	public void display()
	{
		for (int[] x : numbers)
		{
			for (int y : x)
			{
				System.out.print(y + " ");
			}
			
			System.out.println();
		}
	}
	
	public double average()
	{
		double total = 0;
		
		for (int[] x : numbers)
		{
			for (int y : x)
			{
				total += y;
			}
		}
		
		return total / numbers.length / numbers[0].length;
	}
	
	public int minimum()
	{
		int min = numbers[0][0];
		
		for (int[] x : numbers)
		{
			for (int y : x)
			{
				if (y < min)
				{
					min = y;
				}
			}
		}
		
		return min;
	}

	public static void main(String args[]) 
	{
		TwoDimMethods p = new TwoDimMethods();
		p.display();
		System.out.println("AVERAGE:" + p.average());
		System.out.println("MINIMUM:" + p.minimum());
		TwoDimMethods q = new TwoDimMethods(3,9);
		q.display();
		System.out.println("AVERAGE:" + q.average());
		System.out.println("MINIMUM:" + q.minimum());
	}
}
