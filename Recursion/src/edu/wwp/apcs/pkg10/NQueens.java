package edu.wwp.apcs.pkg10;

public class NQueens 
{

	char[][] board;
			
	public NQueens(int size) 
	{
		board = new char[size][size];
		
		for (int i=0; i<board.length; i++)
		{
			for (int j=0; j<board[0].length; j++) 
			{
				board[i][j] = '^';
			}
		}
	}
	
	public char[][] getBoard() 
	{
		return board;
	}
	
	public void display() 
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[0].length; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			
			System.out.println();
		}
	}
			
	// put a queen in column 0
	public void start()
	{
		placeQueen(0);
	}
		
	// Look in the column col for a valid place to put the queen 
	// If no valid place backtrack
	private boolean placeQueen(int col) 
	{
		if (col == board.length)
		{
			return true;
		}
		
		for (int row = 0; row < board[0].length; row++)
		{
			if (isValid(row, col) == true)
			{
				board[row][col] = 'Q';
				
				if (placeQueen(col + 1) == true)
				{
					return true;
				}
				
				board[row][col] = '^';
			}
			
		}
		
		return false;
	}
					
	//Check if this is a valid spot for a queen.  Check row and both diagonals.		
	private boolean isValid(int row, int col)
	{	
		// check elements to the left side in this row
		for (int i = 0; i < col; i++)
		{
			if (board[row][i] == 'Q')
			{
				return false;
			}
		}
		
		// check elements on upward-facing left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if (board[i][j] == 'Q')
            {
                return false;
            }
        }
  
        // check elements on downward-facing left diagonal
        for (int i = row, j = col; j >= 0 && i < board[0].length; i++, j--)
        {
            if (board[i][j] == 'Q')
            {
                return false;
            }
        }
		
        // if no queen can attack, spot is valid
		return true;
	}
	
	public static void main(String[] args) 
	{
		NQueens one = new NQueens(8);
		one.start();
		one.display();
	}
}