import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClubMap 
{
	TreeMap<String, TreeSet<ClubStudent>> mapping;
	
	public ClubMap()
	{
		mapping = new TreeMap<String, TreeSet<ClubStudent>>();
	}

	public void add(String club, ClubStudent student) 
	{
		Set<String> keys = mapping.keySet();
		
		if (!(keys.contains(club)))
		{
			TreeSet<ClubStudent> x = new TreeSet<ClubStudent>();
			x.add(student);
			mapping.put(club, x);
		}
		else
		{
			TreeSet<ClubStudent> x = mapping.get(club);
			x.add(student);
		}
	}

	public void printMap() 
	{
		System.out.println(mapping);
	}

	public void printRoster(String string) 
	{
		for (String x : mapping.keySet())
		{
			if (string.equals(x))
			{
				System.out.println(mapping.get(x));
			}
		}
	}

	public int size() 
	{
		int i = 0;
		
		for (String keys : mapping.keySet())
		{
			i = i + mapping.get(keys).size();
		}
		
		return i;
	}
}
