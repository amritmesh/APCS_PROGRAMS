import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBook 
{
	private ArrayList<PhoneEntry>[] myHashTable;
	
	public PhoneBook()
	{
		this(4);
	}
	
	public PhoneBook(int numSlots)
	{
		myHashTable = new ArrayList[numSlots];
		
		for (int i = 0; i < numSlots; i++) 
		{
			myHashTable[i] = new ArrayList<PhoneEntry>();
		}
	}
	
	public void add(PhoneEntry x) 
	{
        int bucket = Math.abs(x.getName().hashCode()) % myHashTable.length;
        int index = 0;

		for (PhoneEntry y : myHashTable[bucket]) 
		{
			if (y.compareTo(x) < 0)
			{
				index++;
			}
		}
		
		myHashTable[bucket].add(index, x);
    }
	
	public void display()
	{
		for (int i = 0; i < myHashTable.length; i++)
		{
			System.out.println(i + " " + myHashTable[i]);
		}
	}
	
	public int getBucketCount()
	{
		return myHashTable.length;
	}
	
	public int getSize()
	{
		int total = 0;
		
		for (int i = 0; i < myHashTable.length; i++)
		{
			for (PhoneEntry x : myHashTable[i])
			{
				total++;
			}
		}
		
		return total;
	}
	
	public void loadFile()
	{
		Scanner inFile;
		
		try 
		{
			File file = new File("phonebook.txt");
			String name, phone, initial;
			inFile = new Scanner(file);
			
			while (inFile.hasNext()) 
			{
				initial = inFile.next();
				name = inFile.next();
				phone = inFile.next();
				add(new PhoneEntry(initial, name, phone));
			}
		}
		catch (IOException exception)
		{
			System.out.println("File in wrong directory: " + exception);
		}
	}
	
	public int getNumberNulls()
	{
		int count = 0;
		
		for (int i = 0; i < myHashTable.length; i++)
		{
			if (myHashTable[i] == null)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public int getLongestList()
	{
		int x = 0;
		
		for (int i = 0; i < myHashTable.length; i++)
		{
			if (myHashTable[i].size() > x)
			{
				x = myHashTable[i].size();
			}
		}
		
		return x;
	}
	
	public PhoneEntry find(String initial, String lastName)
	{
		int low = 0;
        int high = myHashTable.length - 1;
        int mid = 0;
        int bucket = 0;
        
		PhoneEntry y = new PhoneEntry(initial, lastName, "12345");
		
		for (int i = 0; i < myHashTable.length; i++) 
		{
			if (myHashTable[i].get(0).hashCode() < y.hashCode() && y.hashCode() < myHashTable[i].get(myHashTable.length - 1).hashCode())
			{
				bucket = i;
			}
		}
		        
        while (low <= high)
        {
        	mid = (low + high) / 2;
          
    		if (myHashTable[bucket].get(mid).getInitial().equals(initial) && myHashTable[bucket].get(mid).getName().equals(lastName))
    		{
    			return myHashTable[bucket].get(mid);
    		}
    		else
        	{
    			if (initial.compareTo(myHashTable[bucket].get(mid).getInitial()) > 0 && lastName.compareTo(myHashTable[bucket].get(mid).getName()) > 0)
    			{
    				low = mid + 1;
    			}
    			else
    			{
    				high = mid - 1;
    			}
        	}
        }
        
        return null;
	}
	
	public String lookup(String initial, String lastName)
	{
		PhoneEntry y = new PhoneEntry("", "", "12345");
		
		for (int i = 0; i < myHashTable.length; i++)
		{
			for (PhoneEntry x : myHashTable[i])
			{
				if (x.getInitial().equals(initial) && x.getName().equals(lastName))
				{
					y = x;
				}
			}
		}
		
		return "" + y.getNumber();
	}
	
	public String reverseLookup(String number)
	{
		String name = "";
		String initial = "";
		
		for (int i = 0; i < myHashTable.length; i++)
		{
			for (PhoneEntry x : myHashTable[i])
			{
				if (x.getNumber().equals(number))
				{
					name = x.getName();
					initial = x.getInitial();
				}
			}
		}
		
		return name + " " + initial + ".";
	}
	
	public boolean changeNumber(String initial, String lastName, String newNum)
	{
		PhoneEntry y = new PhoneEntry("", "", "12345");

		for (int i = 0; i < myHashTable.length; i++)
		{
			for (PhoneEntry x : myHashTable[i])
			{
				if (x.getInitial().equals(initial) && x.getName().contentEquals(lastName))
				{
					x.setNumber(newNum);
					return true;
				}
			}
		}
				
		return false;
	}
	
	public static void main(String[] args)
	{
		PhoneBook x = new PhoneBook();
		
		x.loadFile();
		x.display();
		System.out.println();
		x.add(new PhoneEntry("S", "Bobby", "9810219"));
		System.out.println("Bucket Count: " + x.getBucketCount());
		System.out.println("Size: " + x.getSize());
		System.out.println("Number of Null Buckets: " + x.getNumberNulls());
		System.out.println("Longest List: " + x.getLongestList());
		System.out.println("Finding 'Beamer': " + x.find("T", "Beamer"));
		System.out.println("Looking Up 'Beamer': " + x.lookup("T", "Beamer"));
		System.out.println("Reverse-Looking-Up '9810514': " + x.reverseLookup("9810514"));
		System.out.println("Changing Number of 'Beamer' to 9810236: " + x.changeNumber("T", "Beamer", "9810236"));
		System.out.println("Looking Up 'Beamer': " + x.lookup("T", "Beamer"));
	}
}
