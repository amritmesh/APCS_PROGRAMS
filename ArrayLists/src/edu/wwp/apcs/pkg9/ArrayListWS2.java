package edu.wwp.apcs.pkg9;
import java.util.ArrayList;

public class ArrayListWS2 
{
	//1. Create an ArrayList with 5 Strings. 
	public static ArrayList<String> create()
	{
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("Chicago");
		city.add("New York");
		city.add("Newark");
		city.add("Philadephia");
		city.add("Austin");

		return city;
	}
	
	//2. This method will print every other string in the ArrayList temp starting with the first.
	public static void displayEveryOther (ArrayList<String> temp)
	{
		for (int i = 0; i < temp.size(); i += 2)
		{
			System.out.println(temp.get(i));
		}
	}
	
	//3. This method will search for a String lookFor in the ArrayList temp. Return true/false
	public static boolean search (ArrayList<String> temp, String lookFor  )
	{
		return temp.contains(lookFor);
	}
	
	//4. Creates the ArrayList that contains the first 225 perfect squares starting with 1.  …(1,4,9,…n2.)
	public static ArrayList<Integer> perfectSquares () 
	{
		ArrayList<Integer> perfSquares = new ArrayList<Integer>();
		
		for (int i = 1; i <= 25; i++)
		{
			perfSquares.add(i * i);
		}
		
		return perfSquares;
	}  
	
	//5. This method calculates the average of ArrayList<Integer> temp..   
	public static double average (ArrayList<Integer> temp)
	{
		double total = 0;
		
		for (Integer x : temp)
		{
			total += x;
		}
		
		return total / temp.size();
	}

	//6. This method removes the odd numbers from the array temp   
	public static ArrayList<Integer> removeOdds (ArrayList<Integer> temp)
	{
		int i = 0;
		
		while (i < temp.size())
		{
			if (temp.get(i) % 2 == 1)
			{
				temp.remove(i);
				i--;
			}
			
			i++;
		}
		
		return temp;
	} 
}
