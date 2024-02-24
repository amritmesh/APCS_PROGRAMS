package edu.wwp.apcs.pkg10;

public class TowerOfHanoi 
{
	
	public static int count = 0;
	
	public static void move(int n, int startPeg, int endPeg, int midPeg)
	{
		if (n == 1)
		{
			System.out.println("Move disc " + n + " from peg " + startPeg + " to peg " + endPeg);
			count++;
			return;
		}
				
		move(n - 1, startPeg, midPeg, endPeg);
		
		System.out.println("Move disc " + n + " from peg " + startPeg + " to peg " + endPeg);
	
		move(n - 1, midPeg, endPeg, startPeg);

		count++;
	}
	
	public static void main(String[] args)
	{
		move(4, 1, 3, 2);
		System.out.println(count + " total moves");
	}
}