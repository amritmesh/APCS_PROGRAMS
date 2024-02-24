package edu.wwp.apcs.pkg3;

public class ConeVolume 
{
	public static double coneVolume(int rad, int ht)
	{
		return (1.0 / 3.0) * (Math.PI) * Math.pow((double) rad, 2) * (double) ht;
	}
}
