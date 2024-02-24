package edu.wwp.apcs.pkg3;
import java.awt.Color;

public class MathFuncts2 
{
	// This method finds the average of q1,q2,q3
	public static double average(int q1, int q2, int q3) 
	{
		return (double)(q1 + q2 + q3) / 3.0;
	}
	
	// This method converts an inputed Celsius temperature
	// into fahrenheit temperature
	// F = 9/5 C +32
	public static double convertToFar(int celsTemp) 
	{
		return (double)((9/5)*celsTemp + 32);
	}
	
	// This method will return the max number of quarters needed
	// to correctly make change
	// howManyQuarters( .78 ) =======&gt; 3
	public static int howManyQuarters(double change) 
	{
		return (int)(change / 0.25);
	}
	
	// This method rounds x to the tens place.
	public static int roundToTensPlace(double x) 
	{
		return (int)Math.round(x / 10.0) * 10;
	}
	
	// This method will find the minimum value of 3 integers
	public static double findMin(int a, int b, int c) 
	{
		double firstTest = Math.min(a, b);
		return Math.min(firstTest, c);
	}
	
	// This method returns the thousandth digit
	// whatIsTheThousandthDigit(123.456789) ===========&gt; 6
	public static int whatIsTheThousandthDigit(double number) 
	{
		return (int)(number/1000) % 10;
	}

	// This method will return a random color
	public static Color randColor() 
	{
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		return new Color(r, g, b);
	}

	// This method will return the total value of a coin bank
	// We round to 2 decimals to avoid roundoff errors
	public static double total(int pennies, int nickels, int dimes, int quarters) 
	{
		double amt = pennies*0.01 + nickels*0.05 + dimes*0.10 + quarters*0.25;
		return Math.round(amt*100.0) / 100.0;
	}
	
	// This method will return the midpoint of segment with endpoints (x1,y1)
	// and (x2,y2)
	// The midpoint will be returned at a String)
	public static String segmentMidPoint(int x1, int y1, int x2, int y2) 
	{
		double xVal = (double)(x1 + x2) / 2;
		double yVal = (double)(y1 + y2) / 2;
		return "(" + xVal + "," + " " + yVal + ")";
	}

	// This method will return the slope of a line through points (x1,y1) and
	// (x2,y2)
	public static double slope(int x1, int y1, int x2, int y2) 
	{
		return (double)(y2 - y1) / (x2  - x1);
	}

	// This method will return the length of the segment with endpoints (x1,y1)
	// and (x2,y2)
	public double getLength(int x1, int y1, int x2, int y2) 
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	// This method will return hundreds digit of a number
	// assume number is greater than 100
	// whatIsTheHundredDigit( 1234.567 )=======&gt; 2
	public static int whatIsTheHundredDigit(double number) 
	{
		return (int)(number/100) % 10;
	}
	
	// This method will return the volume of a sphere with given radius
	// V = 4/3PIr3
	public static double sphereVolume(int radius) 
	{
		return (4.0 / 3)*(Math.PI)*(Math.pow(radius, 3));
	}
	
	// This method will round x to the nearest thousandthPlace
	// roundToThousandthPlace(12.9756) =======&gt; 12.976
	public static double roundToThousandthPlace(double x) 
	{
		return Math.round(x/1000.0) * 1000.0;
	}
}
