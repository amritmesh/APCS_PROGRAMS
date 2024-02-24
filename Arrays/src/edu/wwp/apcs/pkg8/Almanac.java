package edu.wwp.apcs.pkg8;

public class Almanac 
{
	/**
	 * Almanac contains an Array of City objects
	 */
	City[] list;

	public Almanac() 
	{
		list = new City[5];

		list[0] = new City(1547000, "Philadelphia");
		list[1] = new City(443775, "Atlanta");
		list[2] = new City(636470, "Boston");
		list[3] = new City(8336000, "New York");
		list[4] = new City(277347, "Newark");
	}

	public Almanac(int x) 
	{
		list = new City[x];
	}

	/**
	 * Displays List of Cities  
	 */
	public void printList() 
	{
		for (City c : list)
		{
			System.out.println(c.getName() + " \t" + c.getPopulation());
		}
	}

	/**
	 * Find the city with the smallest population return the name.
	 */
	public String smallestPop() 
	{
		City smallest = list[0];
		
		for (City c : list)
		{
			if (c.getPopulation() < smallest.getPopulation())
			{
				smallest = c;
			}
		}
		
		return smallest.getName();
	}	

	/**
	 * Find the average population of the list.
	 */
	public double averagePop() 
	{
		double tot = 0;
		
		for (City c : list)
		{
			tot+= c.getPopulation();
		}
		
		return tot / list.length;
	}

	/**
* Find the city searchName.  Change the population to newPopulation. Return true if  *searchName is found
	 */
	public boolean changePop(String searchName, int newPopulation) 
	{
		for (City c : list)
		{
			if (c.getName().equals(searchName))
			{
				c.setPopulation(newPopulation);
				
				return true;
			}
		}
		
		return false;
	}

/**
	* this method will add rate% to each population in the list
	*/
	public void increasePop(double rate) 
	{
        for(City c: list) 
        {
            double p = c.getPopulation() * rate/100 + c.getPopulation();
            c.setPopulation((int)(p + .5));
        }
    }

	public static void main(String[] args) 
	{
		Almanac tc = new Almanac();
		tc.printList();
		System.out.println("Average Population: " + tc.averagePop());
		System.out.println("Smallest: " + tc.smallestPop());
		System.out.println(tc.changePop("Newark", 1111111));
		System.out.println("After Change");
		tc.printList();
		tc.increasePop(3);
		System.out.println("After Increase");
		tc.printList();
	}
}