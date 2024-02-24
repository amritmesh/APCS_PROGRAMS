package edu.wwp.apcs.pkg8;

public class NSidedDie 
{
	private int numberOfSides;
	
	public NSidedDie()
	{
		numberOfSides =6;
	}
	
	public NSidedDie(int n)
	{
		numberOfSides = n;
	}
	
	/** Returns an integer value between 1 and numberOfSides inclusive
	*/
	public int toss()
	{
		return  (int) ((Math.random() * numberOfSides) + 1);
	}
	
	/** Returns an array of the values obtained by tossing a number die numTosses
	* times.
	* @param die a NSidedDie
	* @param numTosses the number of tosses to be recorded
	* Precondition: numTosses &gt; 0
	* @return an array of numTosses values
	*/
	public static int[] getCubeTosses(NSidedDie die, int numTosses)
	{
	    int[] vals = new int[numTosses];
	    
		for (int i = 0; i < vals.length; i++) 
		{
			vals[i] = die.toss();
		}
		
		return vals;
	}
	
	/** Returns the starting index of a longest run of two or more consecutive * * *
	* repeated values
	* in the array values.
	* @param values an array of integer values representing a series of number cube
	* tosses
	* Precondition: values.length &gt; 0
	* @return the starting index of a run of maximum size;
	* -1 if there is no run
	*/
	public static int getLongestRun(int[] values)
	{
		int max = -1;
		
		for (int i = 1; i < values.length; i++) 
		{
			if (values[i] > values[i - 1]) 
			{
				max = i;
			}
		}
		
		return max;
	}
	
	// Helper method that prints the values in the array
	public static void printRolls(int[] rolls)
	{
		for (int i = 0; i < rolls.length; i++) 
		{
			System.out.println(i + " ");
		}
	}
	
	/*
	* Write a tester method that tosses a 4 sided die 20 times. Display the tosses.
	* Print out the index of the longest run.
	*
	* Your output should look something like this
	*
	* [1 2 1 4 4 2 2 4 2 1 3 4 3 4 1 1 1 4 2 3 ]
	* Longest Run starts at index 14
	*/
	public static void main(String[] args) 
	{
		NSidedDie x = new NSidedDie (4);
		int[] rolls = getCubeTosses (x, 20);
		printRolls(rolls);
		
		System.out.println("Longest run start index: " + getLongestRun(rolls));
	}
}