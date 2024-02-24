package edu.wwp.apcs.pkg10;
import java.util.ArrayList;

public class Recursion 
{
	public static long factorial(int y)
	{
		// iterative solution
		
		long ans = 1;
		
		for (long i = y; i >= 2; i--)
		{
			ans *= i;
		}
		
		return ans;
	}
	
	public static long factorial2(int y)
	{
		// recursive solution
		
		if (y == 1)
		{
			return 1;
		}
		
		return y * factorial2(y - 1);
	}
	
	public static long powerOfTwo(int y)
	{
		if (y == 1)
		{
			return 2;
		}
	
		return powerOfTwo(y - 1) * 2;
	}
	
	public static int sumDigits(int n)
	{
		if (n < 10)
		{
			return n;
		}
		
		return n % 10 + sumDigits(n / 10);
	}
	
	public static String reverse(String s)
	{
		if(s.length() == 1)
		{
			return s;
		}
		
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}
	
	public static double birthdayGift(int year)
	{
		if (year == 1)
		{
			return .01;
		}
		
		return birthdayGift(year - 1) * 2;
	}
	
	public static int fib(int y)
	{
		if (y == 1)
		{
			return 1;
		}
		
		else if (y == 2)
		{
			return 1;
		}
		
		else
		{
			return fib(y - 1) + fib(y - 2);
		}
	}
	
	public static int multiply(int a, int b)
	{
		if (b == 1)
		{
			return a;
		}
		
		else
		{
			return a + multiply(a, b - 1);
		}
	}
	
	public static int square(int y)
	{
		if (y == 1)
		{
			return 1;
		}
		
		else
		{
			return square(y - 1) + 2 * (y - 1) + 1;
		}
	}
}
