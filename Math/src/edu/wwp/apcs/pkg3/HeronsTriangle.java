package edu.wwp.apcs.pkg3;

public class HeronsTriangle 
{
	private int a, b, c;
	
	public HeronsTriangle()
	{
		a = 3;
		b = 4;
		c = 5;		
	}
	
	public HeronsTriangle(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int largestSide() 
	{
		return Math.max(a, Math.max(b, c));
	}
	
	public void scaleFactor(int x) 
	{
		a *=  x;
		b *= x;
		c *= x;
	}
	
	public double area() 
	{
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s-a) *(s-b) * (s-c));
	}
	
	public double height()
	{
		return 2 * area() / largestSide();
	}
	
	public String toString()
	{
		return "Largest side: " + largestSide() + "\nArea: " + area() + "\nHeight: " + height();
	}
	
	public static void main (String [] args) 
	{
		HeronsTriangle one = new HeronsTriangle(3, 5, 7);
		System.out.println("Largest side: " + one.largestSide());
		System.out.println("Area: " + one.area());
		System.out.println("Height: " + one.height());
		
		System.out.println();
		
		one.scaleFactor(2);
		System.out.println("After applying scale factor: ");
		System.out.println(one.toString());
	}
}