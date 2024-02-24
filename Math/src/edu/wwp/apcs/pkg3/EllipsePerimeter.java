package edu.wwp.apcs.pkg3;

public class EllipsePerimeter 
{
	public static double ellipsePerimeter(int hAxis, int vAxis)
	{
		double a = (double)(hAxis) / 2.0;
		double b = (double)(vAxis) / 2.0;
		
		return 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
	}
}
