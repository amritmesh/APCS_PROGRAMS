package edu.wwp.apcs.pkg3;

public class Square 
{
	double side;
	
	public Square(double side) 
	{
		side = this.side;
	}
	
	public double area() 
	{
		return Math.pow(side, 2);
	}
	
	public double perimeter() 
	{
		return 4 * side;
	}
	
	public double diagonal() 
	{
		return Math.sqrt(2 * Math.pow(side, 2));
	}
	
	public static void main(String [] args) 
	{
		Square one = new Square(6);
		System.out.println("Perimeter: " + one.perimeter());
		System.out.println("Area: " + one.area());
		System.out.println("Length of diagonal: " + one.diagonal());
	}
}