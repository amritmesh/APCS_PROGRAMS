package roster;

public class Wrestler 
{
	private String name;
	private int weight;
	
	public Wrestler(String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		return name + weight;
	}
	
	public int compareTo(Wrestler y)
	{
		if (getWeight() <= y.getWeight())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}

