package edu.wwp.apcs.pkg3;

public class Segment 
{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Segment()
	{
		x1 = 0;
		y1 = 0;
		x2 = 3;
		y2 = 4;
	}
	
	public Segment(int X1, int Y1, int X2, int Y2)
	{
		x1 = X1;
		y1 = Y1;
		x2 = X2;
		y2 = Y2;
	}
	
	public double length()
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public String midpoint()
	{
		double xVal = (double)(x1 + x2) / 2;
		double yVal = (double)(y1 + y2) / 2;
		
		return "(" + xVal + "," + " " + yVal + ")";
	}
	
	public double slope()
	{
		return (double)(y2 - y1) / (x2  - x1);
	}
	
	public static void main(String[] args)
	{
		Segment one = new Segment(-11, 2, 3, 3);
		System.out.println("Slope: " + one.slope());
		System.out.println();
		System.out.println("Midpoint: " + one.midpoint());
		System.out.println();
		System.out.println("Length: " + one.length());
	}
}
