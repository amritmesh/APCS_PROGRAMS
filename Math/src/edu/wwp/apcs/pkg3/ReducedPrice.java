package edu.wwp.apcs.pkg3;

public class ReducedPrice 
{
	public static double reducedPrice(double price, int percent)
	{		
		return (price) * (1 - percent / 100.0);
	}
}
