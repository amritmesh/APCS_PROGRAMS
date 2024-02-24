package edu.wwp.apcs.pkg8;
import java.util.Scanner;

public class Gradebook 
{
	public static void main(String[] agrs)
	{
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many tests? ");
		int c = key.nextInt();
		
		int[] t = new int[c];
		
		for (int i = 0; i < t.length; i++)
		{
			System.out.println("Enter test: " + (i + 1));
			t[i] = key.nextInt();
		}
		
		double sum = 0;
		
		for (int i = 0; i < t.length; i++)
		{
			sum += t[i];
		}
		
		System.out.println();
		System.out.println("Average: " + sum / t.length);
		System.out.println("Display Tests");
		
		for (int i = 0; i < t.length; i++) 
		{
			System.out.println(t[i] + " ");
		}
		
		System.out.println();
		System.out.print("Display Tests in Reverse");
		
		for (int i = 0; i >= 0; i--)
		{
			System.out.println(t[i] + " ");
		}
		
		System.out.println("Lowest Test Grade");
		
		int lowest = t[0];
		
		for (int i = 1; i < t.length; i++) 
		{
			if (t[i] < lowest)
			{
				lowest = t[i];
			}
		}
		
		System.out.println(lowest);
		
		for (int x : t)
		{
			System.out.println(x);
		}
	}
}