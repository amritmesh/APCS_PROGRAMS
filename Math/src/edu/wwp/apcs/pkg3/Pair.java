package edu.wwp.apcs.pkg3;

public class Pair 
{
	double first;
	double second;
	
	public Pair(double aFirst, double aSecond) 
	{
		first = aFirst;
		second = aSecond;
	}
	
	public double getSum() 
	{
		return first + second;
	}
	
	public double getDifference() 
	{
		return first - second;
	}
	
	public double getProduct() 
	{
		return first * second;
	}
	
	public double getAverage() 
	{
		return (double)(getSum()) / 2;
	}
	
	public double getDistance() 
	{
		return Math.abs(getDifference());
	}
	
	public double getMax() 
	{
		return Math.max(first, second);
	}
	
	public double getMin() 
	{
		return Math.min(first, second);
	}
	
	public static void main(String[] args)
	{
		Pair one = new Pair(5, 8);
		System.out.println("Sum: " + one.getSum());
		System.out.println("Difference: " + one.getDifference());
		System.out.println("Product: " + one.getProduct());
		System.out.println("Average: " + one.getAverage());
		System.out.println("Distance: " + one.getDistance());
		System.out.println("Maximum: " + one.getMax());
		System.out.println("Minimum: " + one.getMin());
	}
}