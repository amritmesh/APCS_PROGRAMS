package edu.wwp.apcs.pkg2;

public class RightTri 
{
	private int base;
	private int height;
	private String color;

	public RightTri(int base, int height)
	{
		this.base = base;
		this.height = height;
		color = "Blue";
	}
	
	public void changeVals(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
		
	public int getHeight()
	{
		return height;
	}
	
	public double getArea()
	{
		double area = (1/2)*(height)*(base);
		return area;
	}
	
	public void setColor()
	{
		color = "Northern Knight Blue";
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void switchVals()
	{
		int temp = base;
		height = base;
		base = temp;
	}
	
	public void sum()
	{
		int sum = base + height;
		base = sum;
		height = sum;
	}
	
	public String toString()
	{
		return "Base: " + base + "\n Height: " + height + "\n Color: " + color;
	}
	
	public static void main(String[] args)
	{
		RightTri triangle = new RightTri(4, 6);
				
		System.out.println("Color: " + triangle.getColor());		
		System.out.println("Area: " + triangle.getArea());
		System.out.println(triangle);
		triangle.changeVals(3, 4);
		System.out.println("New Values: ");
		System.out.println(triangle);
		triangle.switchVals();
		triangle.setColor();
		System.out.println("New Values: ");
		System.out.println(triangle);
	}
}
