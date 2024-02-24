package edu.wwp.apcs.pkg9;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Bill");
		names.add("Alice");
		names.add("Chris");
		names.add("Mister");
		names.add(0, "Pat");
		names.add(0, "Juan");

		System.out.println(names);
		System.out.println(names.add("Jen"));
		System.out.println(names);
		System.out.println(names.set(1, "Yash"));
		System.out.println(names);
		System.out.println(names.size());

		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i).charAt(0));
		}
	}
}
