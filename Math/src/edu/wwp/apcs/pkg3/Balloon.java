package edu.wwp.apcs.pkg3;

public class Balloon 
{
	double air;
	
	public Balloon()
	{
		air = 0;
	}
	
	public void addAir(double amount) 
	{
		air += amount;
	}
	
	public double getVolume() 
	{
		return air;
	}
	
	public double getSurfaceArea() 
	{
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}
	
	// Math.cbrt takes the cube root of its parameter
	public double getRadius() 
	{
		return Math.cbrt((3.0 * air) / (4.0 * Math.PI));
	}
	
	public static void main(String [] args) {
		Balloon one = new Balloon();
		System.out.println("First Iteration");
		System.out.println("---------------");
		System.out.println();
		one.addAir(100);
		System.out.println("Volume: " + one.getVolume());
		System.out.println("Radius: " + one.getRadius());
		System.out.println("Surface area: " + one.getSurfaceArea());
		System.out.println("Second Iteration");
		System.out.println("---------------");
		System.out.println();
		one.addAir(100);
		System.out.println("Volume: " + one.getVolume());
		System.out.println("Radius: " + one.getRadius());
		System.out.println("Surface area: " + one.getSurfaceArea());
	}
}