package edu.wwp.apcs.pkg11;

public class Marathoner extends Runner
{
	public Marathoner(String fname, String lname)
	{
		super(fname, lname);
	}
	
	public void race(double raceLength)
	{
		if (raceLength >= 10)
		{
			super.race(raceLength);
		}
		
		else
		{
			double trainingTime = 8.5 * raceLength / 60;
			super.train(trainingTime);
		}
	}
}
