package edu.wwp.apcs.pkg9;

import java.util.*;

public class Almanac 
{

	ArrayList<City> cities;

	public Almanac() 
	{
		cities = new ArrayList<City>();
	}
	
	public void addCityInOrderByName() 
	{
		for(int i = 0; i < cities.size() - 1; i++) 
		{
			City alpha = cities.get(i);
			
			for(int j = i + 1; j < cities.size(); i++) 
			{
				if ( cities.get(j).getName().compareTo(alpha.getName()) > 0) 
				{
					alpha = cities.get(j);
				}
			}
			
			cities.add(0, alpha);
		}
	}


	public void displayData() 
	{
		for (int i = 0; i < cities.size(); i++)
		{
			System.out.println(cities.get(i) + " ");
		}
	}

	public int getMinimumPopulation() 
	{
		if (cities.size() == 0)
		{
			return (Integer) null;
		}
			
	City min = (City) cities.get(0);
	
	for (int i = 0; i < cities.size(); i++)
	{
		City x = (City) cities.get(i);
	
		if (x.getPopulation() < min.getPopulation())
		{
			min = x;
		}
	}
	
	return min.getPopulation();
	}
	
//	public void changePopulation(String cityName, int newPop) 
//	{
//		for(int i = 0; i < cities.size(); i++) 
//		{
//			if (cities.get(i).getName().equals(cityName)) 
//			{
//				cities.remove(i);
//				cities.add(i, (cityName, newPop));
//			}
//		}
//	}
}
