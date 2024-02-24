public class Wrestler
{
	String name;
	int weight;
	
	/**
	* Constructor for objects of class Wrestler
	*/
	public Wrestler(String theName, int theWeight)
	{
		name = theName;
		weight = theWeight;
	}
	public int getWeight()
	{
		return weight;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return name + " " + weight;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrestler other = (Wrestler) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
}
