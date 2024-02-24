package edu.wwp.apcs.pkg10;

public class Maze 
{
	char[][] m;
	char[][] pMaze;
	char i = 'A';
	
	public Maze(char[][] maze)
	{
		m = maze;
		pMaze=maze;
	}
	
	public void display() 
	{
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[0].length; j++)
			{
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	private boolean escape(int y, int x, int exitY, int exitX)
	{
		pMaze = m;
		char[][] clean = m;
		
		if (y == exitY && x == exitX) 
		{
			pMaze[y][x] = i;
			return true;
		}
		
		if (pMaze[y][x-1] == ' ') 
		{
			pMaze[y][x-1] = i;
			i++;
			m = pMaze;
			
			if (escape(y, x-1, exitY, exitX)) 
			{
				return true;
			}
		}
		
		else if (pMaze[y+1][x] == ' ') 
		{
			pMaze[y+1][x] = i;
			i++;
			m = pMaze;

			if (escape(y + 1, x, exitY, exitX)) 
			{
				return true;
			}
		}
		
		else if (pMaze[y-1][x] == ' ') 
		{
			pMaze[y-1][x] = i;
			i++;
			m = pMaze;

			if (escape(y - 1, x, exitY, exitX)) 
			{
				return true;
			}
		}
		
		else if (pMaze[y][x+1] == ' ') 
		{
			pMaze[y][x+1] = i;
			i++;
			m = pMaze;

			if (escape(y, x + 1, exitY, exitX)) 
			{
				return true;
			}
		}
		
		System.out.print("No solution found");
		pMaze = clean;
		i = 'A';
		
		return false;
	}
	
	public static void main(String[] args)
	{
		char[][] maze = {
			      {'*', ' ', '*', '*', '*', '*', '*', '*', '*'}, 
			      {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'}, 
			      {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'}, 
			      {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'}, 
			      {'*', ' ', '*', ' ', '*', '*', '*', ' ', '*'}, 
			      {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'}, 
			      {'*', '*', '*', ' ', '*', ' ', '*', ' ', '*'}, 
			      {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'}, 
			      {'*', '*', '*', '*', '*', '*', '*', '*', '*'}};
		
		maze[4][3]='@';
		
		Maze test = new Maze(maze);
		test.display();
		test.escape(4, 3, 0, 1);
		
		System.out.println();
		test.display();
	}
}