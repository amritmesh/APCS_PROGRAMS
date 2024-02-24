package edu.wwp.apcs.pkg2;

public class Rabbit 
{
	int totalPairs;
	double currentMonth;
	
	public Rabbit()
	{
		totalPairs = 1;
		currentMonth = 1;
	}

	public double getPairs()
	{
		return totalPairs;
	}
	
	public void waitAMonth()
	{
		currentMonth += 1;
		totalPairs = (int)(((Math.pow(((1 + Math.sqrt(5)) / 2), currentMonth)) - 
					 (Math.pow(((1 - Math.sqrt(5)) / 2), currentMonth)))
					 / (Math.sqrt(5)));
	}
	
	public static void main (String[] args)
	{
		Rabbit population = new Rabbit();
		
		System.out.println("Initial number of rabbit pairs: " + population.getPairs());
		
		population.waitAMonth();
		System.out.println("Number of rabbit pairs: " + population.getPairs());
		
		population.waitAMonth();
		System.out.println("Number of rabbit pairs: " + population.getPairs());
		
		population.waitAMonth();
		System.out.println("Number of rabbit pairs: " + population.getPairs());
		
		population.waitAMonth();
		System.out.println("Number of rabbit pairs: " + population.getPairs());
	}
}
