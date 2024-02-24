package edu.wwp.apcs.pkg2;

public class SodaCan 
{
	double surfaceArea;
	double volume;
	double height = 12.2;
	double radius = 3.25;
	
	public void getSurfaceArea()
	{
		surfaceArea = (2 * Math.PI * radius * height) + (2 + Math.PI * Math.pow(radius, 2));
	}
	
	public void getVolume()
	{
		volume = (Math.PI * Math.pow(radius, 2) * height);
	}
}
