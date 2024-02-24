import java.util.TreeMap;

public class ShortestPathGraph 
{
	private TreeMap<String, String> map;
	private boolean yahOrNay;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<String, String>();
		shortest = Integer.MAX_VALUE;
		String[] list = line.split(" ");
		
		for (String section : list)
		{
			String first = section.substring(0, 1);
			String second = section.substring(1, 2);
			
			if (map.get(first) == null)
			{
				map.put(first,  "");
			}
			if (map.get(second) == null)
			{
				map.put(second, "");
			}
			
			map.put(first, map.get(first) + second);
			map.put(second, map.get(second) + first);
		}
		
		yahOrNay = false;
		System.out.println(map);
	}

	public boolean contains(String letter)
	{
		if (map.get(letter) == null)
		{
			return false;
		}
		
		return true;
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
		System.out.println("TC: " + placesUsed + " " + steps);
		
		if (first.equals(second) && steps < shortest)
		{
			yahOrNay = true;
			shortest = steps;
		}
		else
		{
			String conList = map.get(first);
			
			for(int i = 0; i < conList.length(); i++)
			{
				if (placesUsed.indexOf(conList.substring(i, i + 1)) < 0)
				{
					check(conList.substring(1, i + 1), second, placesUsed + first, steps + 1);
				}
			}
		}
	}

	public String toString()
	{
		if (yahOrNay)
		{
			return "yes in" + shortest + " steps";
		}
		
		return "DOES NOT CONNECT";
	}
}
