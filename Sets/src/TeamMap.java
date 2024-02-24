import java.util.HashMap;

public class TeamMap
{
	HashMap<Wrestler, Integer> x;
	
	public TeamMap() 
	{
		x = new HashMap<Wrestler, Integer>();
	}
	
	public int get(Wrestler wrestler) 
	{
		return x.get(wrestler);
	}

	public void changeWeightGroup(Wrestler wrestler, int i) 
	{
		x.replace(wrestler, i);
	}

	public void display() 
	{
		for (Wrestler key: x.keySet())
		{  
			System.out.println(key + "--> Weight Group " + x.get(key));
		} 
	}

	public void add(Wrestler wrestler) 
	{
		if (wrestler.getWeight() >= 100 && wrestler.getWeight() < 110)
		{
			x.put(wrestler, 0);
		}
		else if (wrestler.getWeight() >= 110 && wrestler.getWeight() < 120)
		{
			x.put(wrestler, 1);
		}
		else if (wrestler.getWeight() >= 120 && wrestler.getWeight() < 130)
		{
			x.put(wrestler, 2);
		}		
		else if (wrestler.getWeight() >= 130 && wrestler.getWeight() < 140)
		{
			x.put(wrestler, 3);
		}		
		else if (wrestler.getWeight() >= 140 && wrestler.getWeight() < 150)
		{
			x.put(wrestler, 4);
		}		
		else if (wrestler.getWeight() >= 150 && wrestler.getWeight() < 160)
		{
			x.put(wrestler, 5);
		}		
		else if (wrestler.getWeight() >= 160 && wrestler.getWeight() < 170)
		{
			x.put(wrestler, 6);
		}		
		else if (wrestler.getWeight() >= 170 && wrestler.getWeight() < 180)
		{
			x.put(wrestler, 7);
		}		
		else if (wrestler.getWeight() >= 180 && wrestler.getWeight() < 190)
		{
			x.put(wrestler, 8);
		}
		else if (wrestler.getWeight() >= 190 && wrestler.getWeight() < 200)
		{
			x.put(wrestler, 9);
		}
	}
}
