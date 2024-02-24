import java.util.HashSet;
import java.util.Iterator;

public class FruitSet 
{
	HashSet<String> bowl;
	
	public FruitSet()
	{
		bowl = new HashSet<String>();
		bowl.add("apple");
		bowl.add("strawberry");
		bowl.add("pear");
		bowl.add("cherry");
		System.out.println(bowl.add("peach"));
		System.out.println(bowl.add("peach"));
		System.out.println(bowl);
		bowl.add("Aa");
		bowl.add("pineapple");
		bowl.add("BB"); // same hashcodes crash. Java looks to equals method
	}
	
	public void display()
	{
		Iterator<String> i = bowl.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public void display2()
	{
		for (String x : bowl)
		{
			System.out.println(x);
		}
	}
	
	public void display3()
	{
		System.out.println(bowl);
	}
	
	public void remove(String fruit)
	{
		System.out.println(bowl.remove(fruit));
	}
	
	public int myHashCode(String current)
	{
		int h = 0;
		int len = current.length();
		
		for (int i = 0; i < len; i++) 
		{
			h = 31 * h + current.charAt(i);
		}
		
		return h;
	}
	
	public void testHashCodes()
	{
		for (String x : bowl)
		{
			System.out.println(x + " " + x.hashCode() + " " + myHashCode(x));
		}
	}
	
	// Use a set to find all of the prime numbers less than number
	// Add the numbers 2 to number in the set
	// Remove multiples of numbers that are contained in the set
	// Display all print the count.
	public static void eratosthenes(int number)
	{
		HashSet<Integer> x = new HashSet<Integer>();
		
		for (int i = 2; i <= number; i++) 
		{
			x.add(i);
		}
		
		for (int k = 2; k * k <= number; k++)
		{
			if (x.contains(k))
			{
				for (int i = k; i * k <= number; i++)
				{
					x.remove(i * k);
				}
			}
		}
		
		System.out.println(x);
		System.out.println("count: " + x.size());
	}
	
	public static void main(String[] args) 
	{
		FruitSet ar = new FruitSet();
		ar.display();
		ar.remove("pear");
		ar.remove("lemon");
		ar.testHashCodes();
		eratosthenes(1000);
	}
}
