package edu.wwp.apcs.pkg3;

public class Line 
{
	public int a;
	public int b;
	public int c;
	
	public Line(int a, int b, int c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double slope()
	{
		return ((-1.0 * a) / (double) b);
	}
	
	public boolean isOnLine(int x, int y) 
	{
		if((a * x + b * y + c) == 0) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return a + "x + " + b + "y + " + c + " = 0";
	}
	
	public static void main(String [] args) 
	{
		Line line1 = new Line(5, 4, -17);
		System.out.println("Equation: " + line1);
		double slope1 = line1.slope(); // slope1 is assigned -1.25
		System.out.println("Slope of line 1: " + slope1);
		boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0
		System.out.println("Is the point on line 1? " + onLine1);
		
		System.out.println();
		
		Line line2 = new Line(-25, 40, 30);
		System.out.println("Equation: " + line2);
		double slope2 = line2.slope(); // slope2 is assigned 0.625
		System.out.println("Slope of line 2: " + slope2);
		boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 != 0
		System.out.println("Is the point on line 2? " + onLine2);
	}
}
