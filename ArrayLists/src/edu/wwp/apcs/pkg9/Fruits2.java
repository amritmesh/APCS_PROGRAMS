package edu.wwp.apcs.pkg9;

import java.util.* ;

public class Fruits2 
{
	 ArrayList<String>  bowl;

	//1. Default constructor. Create the ArrayList with 5 fruits
	public Fruits2()
	{
		bowl = new ArrayList<String>();
		bowl.add("apple");
		bowl.add("banana");
		bowl.add("citrus");
		bowl.add("date");			
		bowl.add("strawberry");
	}
	
	// 2. This method will print every other fruit in the list starting with the last one.
	public void displayEveryOtherFruitReverse()
	{
			for (int i = bowl.size() - 1; i >= 0; i-=2) 
			{
				System.out.print(bowl.get(i) + " ");
			}
	}
	
	//3.  This method will remove every other String in bowl starting with the first
	public void removeEveryOther ()
	{
		for (int i = 0; i < bowl.size(); i+=2) 
		{
			bowl.remove(i);
		}
	}
}
