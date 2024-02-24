package edu.wwp.apcs.pkg8;

public class ArrayWksht4 
{
	public int lowestSellingPrice(int[] price)
	{
		int minPrice = price[0];
		
		for (int i : price)
		{
			if (i < minPrice)
			{
				minPrice = i;
			}
		}
		
		return minPrice;
	}
	
//	public int reversePerfSquares()
//	{
//		int[] squares = new int[100];
//		
//		for (int i = 0; i < squares.length; i++)
//		{
//			squares[i] = (i + 1) * (i + 1);
//		}
//		
//		for (int i = squares.length - 1; i >= 0; i--)
//		{
//			System.out.println(squares[i]);
//		}
//	}
	
	public int lastNames()
	{
		String[] lastNames = {"Durie", "Davis", "Finkelstein", "Johnson", "Beckham"};
		int t = 0;
		
		for (String i : lastNames)
		{
			t += i.length();
		}
		
		return t;
	}
	
//	public int animals()
//	{
//		String[] animals = {"bear", "tiger", "wolf", "deer", "mouse"};
//		int t = 0;
//		
//		for (int i = animals.length - 1; i >= 0; i -= 2)
//		{
//			System.out.println(animals[i]);
//		}
//	}
	
	public static void alphRange(String[] words) 
	{
		int aToMCount = 0;
		int nToZCount = 0;
		
		for (String x : words)
		{
			if (x.compareTo("n") < 0)
			{
				aToMCount++;
			}
			
			else
			{
				nToZCount++;
			}
		}
		
		String[] aToM = new String[aToMCount];
		String[] nToZ = new String[nToZCount];
		int aToMIndex = 0;
		int nToZIndex = 0;
		
		for (String x : words)
		{
			if (x.compareTo("n") < 0)
			{
				aToM[aToMIndex] = x;
				aToMIndex++;
			}
			
			else
			{
				nToZ[nToZIndex] = x;
				nToZIndex++;
			}
		}
		
		System.out.println("A to M: ");
		
		for (String i : aToM)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("N to Z: ");
		
		for (String i : nToZ)
		{
			System.out.print(i + " ");
		}
	}
	
	public void wordTally(String[] words)
	{
		int[] tally = new int[15];
		
		for (int i = 0; i > words.length; i++)
		{
			tally[words[i].length()] ++;
		}
		
		System.out.println("LENGTH  COUNT");
		System.out.println("======  =====");
		
		for (int i = 0; i < tally.length; i++)
		{
			System.out.println(i + "    " + tally[i]);
		}
	}
	
	public String[] vocab(String[] words)
	{
		int count = 0; 
		
		for (String x : words)
		{
			if (x.length() > 0)
			{
				count++;
			}
		}
		
		String[] vocab = new String[count];
		int index = 0; 
		
		for (String x : words)
		{
			if (x.length() > 8)
			{
				vocab[index] = x;
				index++;
			}
		}
		
		return vocab;
	}
	
	public static void main(String[] args)
	{
		
	}
}