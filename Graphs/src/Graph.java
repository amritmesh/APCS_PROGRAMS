import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean yahOrNay;

	public Graph(String line)
	{
		map = new TreeMap<String, String>();
		String[] list = line.split(" ");
		
		for (String piece : list)
		{
			String first = piece.substring(0, 1);
			String second = piece.substring(1, 2);
			
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

	public void check(String first, String second, String placesUsed)
	{
		System.out.println("TC: " + placesUsed);
		
		if (first.equals(second))
		{
			yahOrNay = true;
		}
		else
		{
			String conList = map.get(first);
			
			for(int i = 0; i < conList.length(); i++)
			{
				if (placesUsed.indexOf(conList.substring(i, i + 1)) < 0)
				{
					check(conList.substring(1, i + 1), second, placesUsed + first);
				}
			}
		}
	}

	public String toString()
	{
		if (yahOrNay)
		{
			return "CONNECTS";
		}
		
		return "DOES NOT CONNECT";
	}
}
