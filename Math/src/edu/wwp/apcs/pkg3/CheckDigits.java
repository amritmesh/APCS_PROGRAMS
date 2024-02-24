package edu.wwp.apcs.pkg3;

public class CheckDigits 
{
	public static int checkDigits(int number)
	{
		return (number % 10) + (number / 1000000);
	}
}