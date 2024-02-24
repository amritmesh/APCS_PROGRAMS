package edu.wwp.apcs.pkg8;

public class CombineArrays {
	// displays the array
	public static void display(int[] a)
	{
		for (int x : a)
		{
			System.out.print(x + " ");
		}
	}
	
	// returns a new array where b is appended to the end of a
	public static int[] append (int[] a , int[] b)
	{
		int[] c = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		
		int bIndex = 0;
		
		for (int i = a.length; i < c.length; i++)
		{
			c[i] = b[bIndex++];
		}
		
		return c;
	}
	
	// returns a new array with alternating values from a and b
	public static int[] alternate(int[]a, int[] b)
	{
		int c[] = new int[a.length + b.length];
		int cIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		
		while (cIndex < a.length + b.length)
		{
			if (aIndex >= a.length)
			{
				c[cIndex++] = b[bIndex++];
			}
			
			else if (bIndex >= b.length)
			{
				c[cIndex++] = a[aIndex++];
			}
			
			else
			{
				c[cIndex++] = a[aIndex++];
				c[cIndex++] = b[bIndex++];
			}
		}
		
		return c;
	}
	
	//returns an array in reverse order
	public static int[] reverse(int[]a)
	{
		for (int i = a.length - 1; i >= 0; i--)
		{
			System.out.print(a[i] + " ");
		}
		
		return a;
	}
	
	//returns a new ordered array
	// prerequisite a and b must be ordered
	//do not sort
	public static int[] merge(int[]a, int[] b)
	{
		int c[] = new int[a.length + b.length];
		int cIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		
		while (aIndex < a.length || bIndex < b.length)
		{
			if (aIndex >= a.length)
			{
				c[cIndex] = b[bIndex];
				bIndex++;
			}
			
			else if (a[aIndex] <= b[bIndex])
			{
				c[cIndex] = a[aIndex];
				aIndex++;
;			}
			
			else if (b[bIndex] < a[aIndex])
			{
				c[cIndex] = b[bIndex];
				bIndex++;
			}
			
			cIndex++;
		}
		
		return c;
	}
	public static void main(String[] args) 
	{
		int[] a = new int[]{1,7,13,24,25};
		int[] b = new int[] {3,10,21,26};
		System.out.println("APPEND") ;
		display(append(a,b));
		System.out.println() ;
		System.out.println("ALTERNATE") ;
		display(alternate(b,a));
		System.out.println() ;
		System.out.println("MERGE") ;
		display(merge(b,a));
		System.out.println("Reverse") ;
//		display(reverse(b,a));
	}
}