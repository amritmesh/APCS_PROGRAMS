package edu.wwp.apcs.pkg9;

public class City
{	
	private int population;
	private String name;
	
	public City(int newPop, String newName)
	{
		population = newPop;
		name=newName;
	}
	
	public String getName()
	{
	    return name;
	}
	
	public int getPopulation()
	{
	    return population;
	}
	
	public String toString()
	{
		return getName()+ ":   " + getPopulation();
	}
}

