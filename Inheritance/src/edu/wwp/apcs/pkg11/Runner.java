package edu.wwp.apcs.pkg11;

public class Runner extends Athlete
{
	private int numberOfRaces;
	private double milesRaced;
	
	public Runner(String f, String l)
	{
		super(f, l, "Running");
		numberOfRaces = 0;
		milesRaced = 0;
	}
	
	public void race(double raceLength)
	{
		numberOfRaces++;
		milesRaced += raceLength;
	}
	
	public void setRaces(int races)
	{
		numberOfRaces = races;
	}
	
	public void setMilesRaced(int miles)
	{
		milesRaced = miles;
	}
	
	public int getRaces()
	{
		return numberOfRaces;
	}
	
	public double getMilesRaced()
	{
		return milesRaced;
	}
	
	public String toString()
	{
		return super.toString() + " \n" + numberOfRaces + " races and " + milesRaced + " miles.";
	}
}
