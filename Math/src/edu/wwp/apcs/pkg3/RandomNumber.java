package edu.wwp.apcs.pkg3;

public class RandomNumber 
{
	public static int randomNumber(int start, int end)
	{
		return (int)(Math.random() * (end - start - 1) + start + 1);
	}
}