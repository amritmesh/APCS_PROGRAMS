package edu.wwp.apcs.pkg5;

public class NestedLoops 
{
	public static void Nest(int x, int y, int z) 
	{
		for (int d = 0; d < z; d++) 
		{
			for(int a = 0; a < (2 * z + x); a++) 
			{
				System.out.print("-");
			}
			
			System.out.println();
		}
		
		for (int d = 0; d < y; d++) 
		{
			for(int a = 0; a < z; a++) 
			{
				System.out.print("-");
			}
			
			for(int b = 0; b < x; b++) 
			{
				System.out.print("*");
			}
			
			for(int c = 0; c < z; c++) 
			{
				System.out.print("-");
			}
			
			System.out.println();
		}
		
		for (int d = 0; d < z; d++) 
		{
			for(int e = 0; e < (2 * z + x); e++) 
			{
				System.out.print("-");
			}
			
			System.out.println();
		}
	}
	
	public static boolean isHarshadNumber(int n) 
	{
		int s = 0;
		String num = Integer.toString(n);
		
		for(int i = 0; i < num.length(); i++) 
		{
			s += Integer.parseInt(num.substring(i, i + 1));
		}
		
		if (n % s == 0) 
		{
			return true;
		}
		
		return false;
	}
	
	public static void main(String [] args) 
	{
		NestedLoops one = new NestedLoops();
		
		one.Nest(3, 4, 2);
		System.out.println();
		System.out.println(one.isHarshadNumber(43));
	}
}