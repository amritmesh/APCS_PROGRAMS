import java.awt.Color;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class MapTester
{
	// This program tests a program that maps names to colors
	
	public static void main(String[] args)
	{
		HashMap<String, Color> favoriteColors = new HashMap<String, Color>();
		
		favoriteColors.put("TC", Color.YELLOW);
		favoriteColors.put("Romeo", Color.GREEN);
		favoriteColors.put("Adam", Color.BLUE);
		favoriteColors.put("Eve", Color.PINK);
		favoriteColors.put("Eve", Color.BLUE);
		favoriteColors.put("Juliet", Color.PINK);
		
		System.out.println(favoriteColors); // no order no repeats; eve's color is replaced
		
		System.out.println(favoriteColors.size());
		
		System.out.println("? " + favoriteColors.put("John", Color.MAGENTA));
		System.out.println("? " + favoriteColors.put("Adam", Color.YELLOW)); // returns object being replaced
		
		Set<String> keySet = favoriteColors.keySet();
		System.out.println(keySet);
		
		System.out.println(favoriteColors.values());
		
		// traverse the mapping
		Iterator<String> iter = favoriteColors.keySet().iterator();
		while(iter.hasNext())
		{
			String key = iter.next();
			Color value = favoriteColors.get(key);
			System.out.println(key + "->" + value);
		}
		
		// for each
		System.out.println();
		System.out.println("COLORS");
		for (String x : favoriteColors.keySet())
		{
			System.out.println(x + " " + favoriteColors.get(x));
		}
		
		System.out.println(favoriteColors.remove("Adam"));
		System.out.println(favoriteColors.remove("MAdam"));
	}
}
