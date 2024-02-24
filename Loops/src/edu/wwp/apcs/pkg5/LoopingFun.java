package edu.wwp.apcs.pkg5;
//import java.awt.Scanner;

public class LoopingFun 
{
	public static String printFactors(int n)
	{
		String result = "";
		
		for (int i = 1; i <= n; i++)
		{
			if (n % i == 0)
			{
				result += (i + " ");
			}
		}
		
		return result;
	}
	
	public static int sumInts(int n)
	{
		int x = 0;
		
		for (int i = 0; i <= n; i++)
		{
			x += i;
		}
		
		return x;
	}
	
	public static long factorial(int n)
	{
		int x = 1;
		
		for (int i = 1; i <= n; i++)
		{
			x *= i;
		}
		
		return x;
	}
	
	public static boolean isEven(int n)
	{
		return n % 2 == 0;
	}
	
	public static boolean isPrime(int n)
	{
		int f = 0;
		
		for (int i = 1; i <= n; i++)
		{
			if (n % i == 0)
			{
				f++;
			}
		}
		
		if (f > 2)
		{
			return false;
		}
		
		else
		{
			return true;
		}
	}
	
	public static int lcm(int a, int b)
	{		
		for (int i = 1; i <= b; i++)
		{
			if (a * i % b == 0)
			{
				return a * i; 
			}
		}
		
		return a * b;
	}
	
	public static int gcm(int a, int b)
	{		
		for (int i = Math.min(a, b); i >= 1; i--)
		{
			if ((a % i == 0) && (b % i == 0))
			{
				return i; 
			}
		}
		
		return a;
	}
	
	public static int sumDigits(int n)
	{
		String num = Integer.toString(n);
		int v = 0;
		
		for (int i = 0; i < num.length(); i++)
		{
			v += Integer.parseInt(num.substring(i, i + 1));
		}
		
		return v;
	}
	
	public static void primeNumberList(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			if (isPrime(i) == true)
			{
				System.out.print(i + " ");
			}
		}
	}
	
	public static int reverseNum(int n)
	{
		String num = Integer.toString(n);
		String newNum = "";
		
		for (int i = num.length(); i > 0; i--)
		{
			newNum += num.substring(i - 1, i);
		}
		
		return Integer.parseInt(newNum);
	}
	
	public static int countDigits(int n)
	{
		return Integer.toString(n).length();
	}

	public static void fibonacci(int n)
	{
		System.out.print("0, 1, ");
		
		int x = 0;
		int y = 1;
		int sum = 0;
		
		for (int i = 0; i < n - 2; i++)
		{
			sum = x + y;
			System.out.print(sum + ", ");
			x = y;
			y = sum;
		}
	}

	public static boolean isPerfect(int n) 
	{
		int order = 0;
		int sum = 0;
		
		while (sum < n) 
		{
			order++;
			sum += order;
		}
		
		if (sum == n) 
		{
			return true;
		} 
		
		else 
		{
			return false;
		}
	}
	
	public static void primeFactorization(int n)
	{
		for (int div = 2; div <= n; div++)
		{
			while (n % div == 0)
			{
				System.out.print(div + " ");
				n = n / div;
			}
		}
	}
	
	public static void pyramid(int n)
	{
		int line, blanks, stars, temp;
		
		System.out.println();
		
		for (line = 1; line <= n; line++) 
		{
			blanks = n - line;
			stars = line * 2 - 1;
			
			for (temp = 1; temp <= blanks; temp++)
			{
				System.out.print(" ");
			}
			
			for (temp = 1; temp <= stars; temp++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static int binary(int n)
	{
		int bin = 0;
		int powOf2 = 256;
		
		while (powOf2 >= 1) 
		{
			if (n >= powOf2) 
			{
				bin = bin * 10 + 1;
				n -= powOf2;
			} 
			
			else 
			{
				bin *= 10;
			}
			
			powOf2 /= 2;
		}
		
		return bin;
	}
	
	public static void main(String[] args)
	{
		System.out.println(printFactors(24));
		System.out.println(sumInts(10));
		System.out.println(factorial(5));
		System.out.println(isEven(9));
		System.out.println(isPrime(12));
		System.out.println(lcm(8, 6));
		System.out.println(gcm(12, 16));
		System.out.println(sumDigits(123));
		primeNumberList(13);
		System.out.println();
		System.out.println(reverseNum(12));
		System.out.println(countDigits(321));
		fibonacci(6);
		System.out.println();
		System.out.println(isPerfect(6));
		primeFactorization(100);
		System.out.println();
		pyramid(16);
		System.out.println();
		System.out.println(binary(17));
	}
}
