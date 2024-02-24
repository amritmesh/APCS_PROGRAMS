import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ZooRecords 
{
	//the key is the height
	//the value is a Set of the animals with that height
	private TreeMap<Integer, TreeSet<String>> heightChart;  

	public ZooRecords() 
	{
		heightChart = new TreeMap<Integer, TreeSet<String>>();
	}

    //adds a new animal of height to the map
	public void add(int height, String name)  
	{
		Set<Integer> keys = heightChart.keySet();
		
		if (!(keys.contains(height)))
		{
			TreeSet<String> x = new TreeSet<String>();
			x.add(name);
			heightChart.put(height, x);
		}
		else
		{
			TreeSet<String> x = heightChart.get(height);
			x.add(name);
		}
	}
	
	//returns the ht of the tallest animal
	private Integer getTallestAnimal()   
	{ 
		int tallest = 0;
		
		for (Integer x : heightChart.keySet())
		{
			if (tallest < x)
			{
				tallest = x;
			}
		}
		
		return tallest;
	}
	
	//returns the names of the tallest animals
	public Set<String> getTallestAnimals()   
	{
		int tallest = getTallestAnimal();
		
		return heightChart.get(tallest);
	}

	//returns the names of all animals with a height >= ht
	public Set<String> getSomeAnimals(int ht)   
	{
		TreeSet<String> result = new TreeSet<String>();
		
		for (Integer x : heightChart.keySet())
		{
			if (x >= ht)
			{
				result.addAll(heightChart.get(x));
			}
		}
		
		return result;
	}

	//returns the total number of animals 
	public int getAnimalCount() 
	{
		int total = 0;
		
		for (Integer x : heightChart.keySet())
		{
			total += heightChart.get(x).size();
		}
		
		return total;
	}
	
	public static void main(String[] args)
	{
		ZooRecords tc = new ZooRecords();
 
		tc.add(12, "giraffe");
		tc.add(7, "bear");
		tc.add(7, "orangutan");
		tc.add(1, "prarie dog");
		tc.add(1, "rabbit");
		tc.add(3, "lemur");

		System.out.println("Max Height: " + tc.getTallestAnimal());
		System.out.println("Tallest Set: " + tc.getTallestAnimals());
		System.out.println("Animals bigger than 4: " + tc.getSomeAnimals(4));
		System.out.println("Count: " + tc.getAnimalCount());
	}
}
