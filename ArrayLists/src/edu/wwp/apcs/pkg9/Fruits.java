package edu.wwp.apcs.pkg9;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class Fruits 
{
	private ArrayList<String> bowl;

	// 1. Default constructor. Create the ArrayList with 5 fruits
	public Fruits() 
	{
		bowl = new ArrayList<String>();
		bowl.add("banana");
		bowl.add("lemon");
		bowl.add("pear");
		bowl.add(0, "apple");
		bowl.add(4, "watermelon");
	}

	// use the toString of the ArrayList class
	public void display() 
	{
		System.out.println(bowl);
	}

	// use the index of the elements
	public void display2() 
	{
		for (int i = 0; i < bowl.size(); i++)
		{
			System.out.println(bowl.get(i));
		}
	}

	// use for each loop
	public void display3() 
	{
		for (String f : bowl)
		{
			System.out.println(f);
		}
	}

	// Use ListIterator
	public void display4() 
	{
		ListIterator<String> pointer = bowl.listIterator();
		
		while (pointer.hasNext())
		{
			System.out.println(pointer.next());
		}
	}

	//2. This method will print every other fruit in the list starting with the first one.
	public void displayEveryOtherFruit() 
	{
		for (int i = 0; i < bowl.size(); i += 2)
		{
			System.out.println(bowl.get(i));
		}
	}

	//3. This method will print the list in reverse starting with the last.
	public void displayReverse() 
	{
		for (int i = 0; i < bowl.size(); i--)
		{
			System.out.println(bowl.get(i));
		}
	}

	//4. This method will display the first letter of all of the fruits.
	public void printFirstLetter() 
	{
		for (String x : bowl)
		{
			System.out.print(x.charAt(0));
		}
	}

	//5. Check if lookFor is in the arrayList.
	public boolean contains(String lookFor) 
	{
		return bowl.contains(lookFor);
	}
	
	//6. Remove every other fruit in the bowl
	// Note: the indexes dynamically change whenever you remove an element
	public void removeEveryOther() 
	{
		for (int i = 0; i < bowl.size(); i++)
		{
			bowl.remove(i);
		}
	}

	//7. Assume the list is in alphabetical order.  
	//This method will insert a String newFruit in the 
	//correct place in the list 
	public void insert(String newFruit) 
	{
		char firstLetter = newFruit.charAt(0);
		int newFruitLength = newFruit.length();
		
		for (int i = 0; i < bowl.size(); i++)
		{
			if (firstLetter < bowl.get(i).charAt(0))
			{
				bowl.add(i,  newFruit);
			}
			
			else if (firstLetter == bowl.get(i).charAt(0))
			{
				int currentFruitLength = bowl.get(i).length();
				
				if (currentFruitLength <= newFruitLength)
				{
					for (int j = 1; j < currentFruitLength; j++)
					{
						if (newFruit.charAt(j) < bowl.get(i).charAt(j))
						{
							bowl.add(i, newFruit);
						}
					}
				}
				
				else
				{
					for (int j = 1; j < newFruitLength; j++)
					{
						if (newFruit.charAt(j) < bowl.get(i).charAt(j))
						{
							bowl.add(i, newFruit);
						}
					}
				}
			}
		}
	}
	
	public void insert2(String newFruit) 
	{
		int index = 0;
		
		for (int i = 0; i < bowl.size(); i++)
		{
			if (newFruit.compareTo(bowl.get(i)) > 0)
			{
				index++;
			}
		}
		
		bowl.add(index, newFruit);
	}

	public static void main(String[] args) 
	{
		Fruits one = new Fruits();
		one.display();
		
		one.displayEveryOtherFruit();
		one.displayReverse();
		one.printFirstLetter();
		one.removeEveryOther();
		one.display();

		one.insert("kiwi");
		one.insert("acai berry");
		one.insert("yellow pear");
		one.display();
	}
}