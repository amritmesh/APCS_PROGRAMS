package edu.wwp.apcs.pkg10;

import java.util.ArrayList;

public class MartinAndTheDragon 
{
	public static boolean anyOdd(ArrayList<Integer> numbers)
	{
		if (numbers.size() == 0) // no numbers, so no odds
		{
			return false;
		}
		
		if (numbers.get(0) % 2 == 1) // not divisible by 2 means odd
		{
			return true;
		}
		
		else
		{
			numbers.remove(0);
			return anyOdd(numbers);
		}
	}
	
	public static boolean find(char lookFor, String lookIn)
	{
		if (lookIn.length() == 0) // is string empty?
		{
			return false;
		}
		
		if (lookIn.charAt(0) == lookFor) // is it first letter?
		{
			return true;
		}
		
		else
		{
			lookIn = lookIn.substring(1); // remove first letter
			return find(lookFor, lookIn); // search again
		}
	}
}
