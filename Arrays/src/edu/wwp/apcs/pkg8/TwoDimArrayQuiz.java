package edu.wwp.apcs.pkg8;

public class TwoDimArrayQuiz 
{
	//1. returns a 1-dimensional array of strings from words that are more than 5 letters
	public static String[] vocab(String[][] words)
	{
		int spaceCounter = 0;
		String[] greaterWords = new String[spaceCounter];
		
		for (String[] x : words)
		{
			for (String y : x)
			{
				if (y.length() > 5)
				{
					spaceCounter++;
					greaterWords[spaceCounter - 1] = y;
				}
			}
		}
		
		return greaterWords;
	}
	
	double evaluate (int[][] poly, int x)
	{
		double total = 0;
		int check = 0;
		
		for (int[] term : poly)
		{
			for (int y : term)
			{
				check++;
				
				if (check < term.length)
				{
					total += (y * Math.pow(x, (term[y + 1])));
				}
				
				else
				{
					check = 0;
				}
			}
		}
		
		return total;
	}
	
	//3. sales[][] contains integer values
	//return true if every element in sales[][] is positive (> 0). Return false otherwise
	public boolean areAllPositive(int[][] sales)
	{
		boolean allPosOrNot = true;
		
		for (int[] x : sales)
		{
			for (int y : x)
			{
				if (y <= 0)
				{
					allPosOrNot = false;
					break;
				}
			}
			
			break;
		}
		
		return allPosOrNot;
	}
}
