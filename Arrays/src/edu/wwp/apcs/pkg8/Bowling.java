package edu.wwp.apcs.pkg8;

public class Bowling 
{
	// Each Row is 1 bowlers score.  Each column is 1 game
	public int[][] scores = {{290, 203, 235},
                             {215, 200, 225},
                             {130, 235, 242},
                             {245, 251, 254}, 
                             {220, 235, 268},
                             {275, 280, 289}};  
	
    // Constructor for objects of class Bowling
	public Bowling()
	{
		// BLANK
	}   
    
	public int getScore(int player) 
	{
		int sum = 0;
		
		for (int y : scores[player])
		{
			sum += y;
		}
		
		return sum;
	}
     
	public int findWinner()
	{
		int winner = 0;
		int winnerSum = 0;
		int count = 0;
		
		for (int[] x : scores)
		{
			int sum = 0;
			count++;
			
			for (int y : x)
			{
				sum += y;
			}
			
			if (sum > winnerSum)
			{
				winner = count;
				winnerSum = sum;
			}
		}
		
		return winner;
	}

	public double averageGame(int game)
	{
		double total = 0;
		
		for (int y : scores[game])
		{
			total += y;
		}
		
		return total / scores[game].length;
	}

	public int maxScore() 
	{
		int maxAvg = 0;
		
		for(int[] x : scores)
		{	
			int total = 0;
			
			for (int y : x)
			{
				total += y;
			}
			
			int avg = total / x.length;
			
			if (avg > maxAvg)
			{
				maxAvg = avg;
			}
		}
		
		return maxAvg;
	}  
            
	public double average()
	{
		double scoreTotal = 0;
		
		for(int[] x : scores)
		{		
			int total = 0;

			for (int y : x)
			{
				total += y;
			}
			
			int avg = total / x.length;
			
			scoreTotal += avg;
		}
		
		return scoreTotal / 6;
	}           
  
	public void displayScores()
	{
		for (int[] x : scores)
		{
			for (int y : x)
			{
				System.out.print(y + " ");
			}
			
			System.out.println();
		}
	}    
}
