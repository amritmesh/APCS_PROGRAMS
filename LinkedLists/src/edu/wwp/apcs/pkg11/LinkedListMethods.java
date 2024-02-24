package edu.wwp.apcs.pkg11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods 
{
	//1. return a newLL a at the end of b
	public static LinkedList<String> append (LinkedList<String> a, LinkedList<String> b)
	{
		LinkedList<String> c = new LinkedList<String>();

		ListIterator<String> iteratorA = a.listIterator();
		ListIterator<String> iteratorB = b.listIterator();
		
		while (iteratorA.hasNext())
		{
			c.add(iteratorA.next());
		}
		
		while (iteratorB.hasNext())
		{
			c.add(iteratorB.next());
		}
		
		return c;
	}
		
	//2. return a newLL of alternating values
	public static LinkedList<String> alternateMerge (LinkedList<String> a, LinkedList<String> b)
	{
		LinkedList<String> c = new LinkedList<String>();

		ListIterator<String> iteratorA = a.listIterator();
		ListIterator<String> iteratorB = b.listIterator();
		
		while (iteratorA.hasNext() || iteratorB.hasNext()) 
		{
	        if (iteratorA.hasNext())
	        {
	        	c.add(iteratorA.next());
	        }
	        
	        if (iteratorB.hasNext())
        	{
	        	c.add(iteratorB.next());
        	}
	    }
		
		return c;
	}
				
	//3. return a newLL of reverse values		
	public static LinkedList<String> reverse (LinkedList<String> staff)
	{
		LinkedList<String> c = new LinkedList<String>();
		
		ListIterator<String> iteratorStaff = staff.listIterator(staff.size());

		while (iteratorStaff.hasPrevious())
		{
        	c.add(iteratorStaff.previous());
		}

		return c;
	}
	
	//4. return a newLL with a duplicate of each item (HTJW will become HHTTJJWW)
	public static LinkedList<String> duplicate (LinkedList<String> staff)
	{
		LinkedList<String> c = new LinkedList<String>();
		
		for (String i : staff)
		{
        	c.add(i);
        	c.add(i);
		}
		
		return c;
	}
	
	//5. return a newLL with a repeat of the list at the end (HTJW will become HTJWHTJW)
	public static LinkedList<String> repeat (LinkedList<String> staff)
	{
		LinkedList<String> c = new LinkedList<String>();
		
		for (int i = 0; i < 2; i++)
		{
			for (String j : staff)
			{
	        	c.add(j);
			}
		}
		
		return c;
	}
			
	//6. Write a method that will search for and delete an inputted string    
	public static void delete (LinkedList<String> staff, String searchFor)
	{		
		for (int i = 0; i < staff.size(); i++)
		{
			if (staff.get(i).equals(searchFor))
			{
				staff.remove(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		
		LinkedList<String> a = new LinkedList<String>(Arrays.asList("a","b","c"));
		LinkedList<String> b = new LinkedList<String>(Arrays.asList("d","e","f","g","h"));
		
		System.out.println(append(a,b));
		System.out.println(alternateMerge(a,b));

		System.out.println(reverse(a));
		System.out.println(duplicate(a));
		System.out.println(repeat(a));
		delete(b,"g");
		System.out.println(b);
		
		
		//[a, b, c, d, e, f, g, h]
		//[a, d, b, e, c, f, g, h]
		//[c, b, a]
		//[a, a, b, b, c, c]
		//[a, b, c, a, b, c]
		//[d, e, f, h]
	}
}
