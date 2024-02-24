package edu.wwp.apcs.pkg11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Fruits 
{
	private LinkedList<String> bowl;

	public Fruits() 
	{
		bowl = new LinkedList<String>();
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		bowl.addLast("watermelon");
	}
	
	public void displayFruit()
	{
		System.out.println(bowl);
	}
	
	public void displayFruit2()
	{
		for (String t : bowl)
		{
			System.out.print(t + " ");
		}
	}
	
	public void displayFruit3()
	{
		ListIterator<String> iterator = bowl.listIterator();
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}
	}
	
	public void displayEveryOtherFruit()
	{
		ListIterator<String> x = bowl.listIterator();
		
		while (x.hasNext())
		{
			System.out.println(x.next() + " ");
			
			if (x.hasNext())
			{
				x.next();
			}
		}
	}
	
	public void removeEveryOtherFruit()
	{
		ListIterator<String> x = bowl.listIterator();
		
		while (x.hasNext())
		{
			x.next();
			x.remove();
			
			if (x.hasNext())
			{
				x.next();
			}
		}
		
		System.out.println();
	}
	
	public void delete(String firstLett)
	{
		ListIterator<String> x = bowl.listIterator();
		
		while (x.hasNext())
		{
			String y = x.next();
			
			if ((y.substring(0, 1)).equals(firstLett))
			{
				x.remove();
			}
		}
	}
	
	public void removeLastTwoFruit()
	{
		bowl.removeLast();
		bowl.removeLast();
	}
	
	public void insert(String fruit)
	{
		ListIterator<String> x = bowl.listIterator();
		
		while(x.hasNext())
		{
			if (fruit.compareTo(x.next()) <= 0)
			{
				x.previous();
				x.add(fruit);
				
				return;
			}
		}
		
		x.add(fruit);
	}
	
	public void displayReverse()
	{
		ListIterator<String> x = bowl.listIterator();
		
		while (x.hasNext())
		{
			x.next();
		}
		
		while (x.hasPrevious())
		{
			System.out.println(x.previous() + " ");
		}
		
		System.out.println();
	}
	
	public void displayReverse2()
	{
		Iterator<String> x = bowl.descendingIterator();
	}
	
	public void testIterator()
	{
		ListIterator<String> x =  bowl.listIterator();
		x.next();
		x.previous();
		x.remove();
		displayFruit();
	}
	
	public static void main(String[] args)
	{
		Fruits x = new Fruits();
		x.displayFruit();
		x.displayFruit2();
		x.displayFruit3();
		System.out.println("Every other fruit: ");
		x.displayEveryOtherFruit();
		System.out.println("Every other fruit removed: ");
		x.removeEveryOtherFruit();
	}
}
