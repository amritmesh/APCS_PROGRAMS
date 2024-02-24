package edu.wwp.apcs.pkg8;

public class City 
{
	private String name;
	private int population;
	
	public City(int newPop, String newName)
	{
		population = newPop;
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPopulation()
	{
		return population;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setPopulation(int newPop)
	{
		population = newPop;
	}
	
	public String toString()
	{
		String output = String.format("%-14s %10d", name, population);
		return output;
	}
}