import java.util.HashSet;

public class TeamSet
{
	HashSet<Wrestler> x = new HashSet<Wrestler>();;
	
	public TeamSet() {}

	public HashSet<Wrestler> lightweights() 
	{
		HashSet<Wrestler> z = new HashSet<Wrestler>();;

		for (Wrestler y : x)
		{
			if (y.getWeight() < 120)
			{
				z.add(y);
			}
		}
		
		return z;
	}

	public double avgWeight() 
	{
		double total = 0;
		
		for (Wrestler y : x)
		{
			total += y.getWeight();
		}
		
		return total / x.size();
	}

	public void display() 
	{
		for (Wrestler y : x)
		{
			System.out.println(y.getName() + " " + y.getWeight());
		}
	}

	public void add(Wrestler wrestler) 
	{
		x.add(wrestler);
	}	
}
