package edu.wwp.apcs.pkg2;

public class RoachPopulation 
{
	int roaches;
	
	public RoachPopulation(int roaches)
	{
		this.roaches = roaches;
	}
	
	public int getRoaches()
	{
		return roaches;
	}
	
	public void setRoaches(int roaches)
	{
		this.roaches = roaches;
	}
	
	public void breed()
	{
		roaches *= 2;
	}
	
	public void spray()
	{
		roaches -= (roaches * 0.10);
	}
	
	public static void main (String[] args)
	{
		RoachPopulation population = new RoachPopulation(10);
		
		population.breed();
		population.spray();
		System.out.println("Roach count: " + population.getRoaches());
		
		population.breed();
		population.spray();
		System.out.println("Roach count: " + population.getRoaches());
		
		population.breed();
		population.spray();
		System.out.println("Roach count: " + population.getRoaches());
		
		population.breed();
		population.spray();
		System.out.print("Roach count: " + population.getRoaches());
	}
}
