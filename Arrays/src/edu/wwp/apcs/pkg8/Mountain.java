package edu.wwp.apcs.pkg8;

public class Mountain 
{
	public static boolean isIncreasing(int[] array, int stop) 
	{
		for (int i = 0; i < stop; i++) 
		{
			if (array[i] > array[i + 1]) 
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isDecreasing(int[] array, int start) 
	{
		for (int i = start; i < array.length - 1; i++) 
		{
			if (array[i] < array[i + 1]) 
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static int getPeakIndex(int[] array) 
	{
		for (int i = 1; i < (array.length - 1); i++) 
		{
			if ((array[i] > array[i - 1]) && (array[i] > array[i + 1])) 
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static boolean isMountain(int[] array) 
	{
		int top = getPeakIndex(array);
		
		if (isIncreasing(array, top) && isDecreasing(array, top)) 
		{
			return true;
		}
		
		else if (top == -1)
		{
			return false;
		}
		
		return false;
	}
	
	public static void main(String [] args) 
	{
		int[] vals = {1, 2, 1, 2, 1};
		
		System.out.println(Mountain.isMountain(vals));
		System.out.println(Mountain.isIncreasing(vals, 1));
		System.out.println(Mountain.isDecreasing(vals, 5));
		System.out.println(Mountain.getPeakIndex(vals));
	}
}