import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class GuidanceGroup 
{
	private TreeSet<SatStudent> group;
	
	/**
	* Default Constructor for objects of class GuidanceGroup
	*/
	public GuidanceGroup() 
	{
		group = new TreeSet<SatStudent> ();
		load();
	}
	
	public void load()
	{
		File one = new File("SATData.txt");
		String name;
		int math, verbal, writing;
		try
		{
			Scanner in = new Scanner(one);
			while (in.hasNext())
			{  
			     name = (in.next());  
			     math = (in.nextInt()); 
			     verbal = (in.nextInt()); 
			     writing = (in.nextInt());      
			     group.add(new SatStudent(name, math, verbal, writing));
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public SatStudent getLowest()
	{
		if (group.isEmpty()) 
		{
			return null;
		}
		
		return group.first();
	}
	
	public SatStudent getHighest()
	{
		if (group.isEmpty()) 
		{
			return null;
		}
		
		return group.last();
	}
	
	public double getAverage()
	{
		double total = 0;
		
		for (SatStudent x : group)
		{
			total += (x.getMath() + x.getVerbal() + x.getWriting());
		}
		
		return total / group.size();
	}
	
	public String toString()
	{
		return group.toString();
	}
	
	public static void main(String[] args)
	{
		GuidanceGroup one = new GuidanceGroup();
		
		one.load();
		System.out.println(one.toString());
		System.out.println();
		System.out.println("Size: " + one.group.size());
		System.out.println("Lowest: " + one.getLowest());
		System.out.println("Highest: " + one.getHighest());
		System.out.println("Average: " + one.getAverage());
	}
}
