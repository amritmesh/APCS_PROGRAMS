import java.util.HashSet;

public class Coin 
{
	double value;
	String name;
	
	public Coin(double myValue, String myName)
	{
		value = myValue;
		name = myName;
	}
	
	public void setValue(double newValue)
	{
		value = newValue;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return name + " " + value;
	}
	
	public int hashCode()
	{
		int h1 = name.hashCode();
		Double temp = value;
		int h2 = temp.hashCode();
		final int HASH_MULTIPLIER = 31;
		int h = HASH_MULTIPLIER * h1 + h2;
		return h;
	}
	
	public boolean equals(Object otherObject)
	{
		if (otherObject == null)
		{
			return false;
		}
		if (getClass() != otherObject.getClass())
		{
			return false;
		}
		
		Coin other = (Coin) otherObject;
		
		return value == other.value && name.equals(other.name);
	}
	
	public static void main(String[] args)
	{
		Coin coin1 = new Coin(0.25, "quarter");
		Coin coin2 = new Coin(0.25, "quarter");
		Coin coin3 = new Coin(0.05, "nickel");
		Coin coin4 = new Coin(0.10, "dime");
		Coin coin5 = new Coin(0.01, "penny");
		Coin coin6 = new Coin(0.25, "quarter");

		HashSet<Coin> purse = new HashSet<Coin>();
		purse.add(coin1);
		purse.add(coin2);
		purse.add(coin3);
		purse.add(coin4);
		purse.add(coin5);
		purse.add(coin6);

		for(Coin x : purse)
		{
			System.out.println(x);
		}
		
		System.out.println(purse);
		System.out.println(purse.size());
		System.out.println(purse.contains(new Coin(0.25, "quarter")));
		System.out.println(purse.contains(coin6));
	}
}
