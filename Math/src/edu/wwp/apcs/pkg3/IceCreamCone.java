package edu.wwp.apcs.pkg3;

public class IceCreamCone 
{
	double height;
	double radius;
	
	public IceCreamCone() 
	{
		height = 8.0;
		radius = 2.0;
	}
	
	public double getSurfaceArea() 
	{
		return Math.PI * radius * (Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}
	
	public double getVolume() 
	{
		return (1 / 3) * Math.PI * Math.pow(radius, 2) * height;
	}
	
	public static void main(String[] args) 
	{
		IceCreamCone one = new IceCreamCone();
		System.out.println("Surface area: " + one.getSurfaceArea());
		System.out.println("Volume: " + one.getVolume());
	}
}