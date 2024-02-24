package edu.wwp.apcs.pkg9;

public class SelfDivisor
{
	public static boolean isSelfDivisor(int number)
	{
		int x = number;
		
		while(x > 0)
		{
			int digit = x % 10;
			
			if (digit == 0 || number % digit != 0)
			{
				return false;
			}
			
			x /= 10;
		}
		
		return true;
	}
	
	public static int[] firstNumSelfDivisors(int start, int num)
	{
		int[] selfs = new int[num];
		int numStored = 0;
		int nextNumber = start;
		
		while(numStored < num)
		{
			if (isSelfDivisor(nextNumber))
			{
				selfs[numStored] = nextNumber;
				numStored++;
			}
			
			nextNumber++;
		}
		
		return selfs;
	}
}