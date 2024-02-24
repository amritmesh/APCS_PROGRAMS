package edu.wwp.apcs.pkg10;

public class KnightsTour 
{
	private long calls;
	private int[][] board;
	//int rows;
	//int cols;
	
	public KnightsTour(int size) 
	{
		board = new int[size][size];
		calls = 0;
	}
	
	public long getCalls() 
	{
		return calls;
	}
	
	public int[][] getBoard() 
	{
		return board;
	}
	
	public void displayBoard() 
	{
		for (int[] row : board) 
		{
			for (int col : row)
			System.out.printf("%,3d", col);
			System.out.println();
		}
		
		System.out.println();
	}
	
	private boolean placeKnight(int startX, int startY) 
	{
		return placeKnight(startX, startY, 1);
	}

	/**
	* - outside of grid?
	* 		return false;
	* - not empty?
	* 		return false;
	* - record next move
	* - board full?
	* 		return true;
	* - try 8 moves
	* 		recursive call
	* 		placeKnight (r - 2, c - 1, moveNum++)
	* 		if move words return true
	* - all 8 possiblities are taken ... backtrack
	* - nothing works
	* 		return false
	*/
	
	//position (r,c), moveNum – order of knight placement
	private boolean placeKnight(int r, int c, int moveNum) 
	{
		int[] horizMove = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int[] vertMove = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int x = 0;
		int y = 0;
		
		if (r < 0 || c < 0 ||r >= board.length || c >= board.length)
		{
			return false;
		}
		
		if (board[r][c] != 0)
		{
			return false;
		}
		
		board[r][c] = moveNum;
		
		if (moveNum == board.length * board.length)
		{
			return true;
		}
		
		for (int i = 0; i < board.length; ++i)
		{
			x = r + horizMove[i];
			y = c + vertMove[i];
			
			board[x][y] = moveNum;
				
			if (placeKnight(x, y, moveNum + 1))
			{
				return true;
			}
				
			board[x][y] = 0;
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		KnightsTour one = new KnightsTour(8);
		one.placeKnight(0, 0);
		one.displayBoard();
		
		System.out.print("Recursive method call count: ");
		System.out.printf("%,d", +one.getCalls());
		System.out.println();
	}
}