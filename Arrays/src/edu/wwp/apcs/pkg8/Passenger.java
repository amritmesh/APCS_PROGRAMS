package edu.wwp.apcs.pkg8;

public class Passenger 
{
	String name;
	int miles;
	
	public Passenger(String name, int miles)
	{
		this.name = name;
		this.miles = miles;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		name = this.name;
	}
	
	public int getMiles() 
	{
		return miles;
	}
	
	public void setMiles(int miles)
	{
		miles = this.miles;
	}
}
