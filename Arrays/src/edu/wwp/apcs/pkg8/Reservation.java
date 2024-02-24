package edu.wwp.apcs.pkg8;

public class Reservation
{
    private String name;   // last name of the person reserving the room
    private double rate;  // room rate for 1 night's stay

    public Reservation()
    {
        name = "Connolly";
        rate = 99.99;
    }

    public Reservation(String myName, double myRate)
    {
    	name = myName;
    	rate = myRate;
    }
    
    public void setRate(double rate)
    {
    	this.rate = rate;
    }
    
    public double getRate()
    {
    	return rate;
    }

    public String getName()
    {
    	return name;
    }

	public String toString()
	{
		return getName() + " " + getRate();
	}
}