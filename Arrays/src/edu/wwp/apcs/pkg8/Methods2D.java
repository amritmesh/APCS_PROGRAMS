package edu.wwp.apcs.pkg8;

public class Methods2D 
{
	// 1. This will create an nxn multiplication table
	//multTable[3][7] ==> 31
	//multTable[4][3] ==> 12
	public static double [][] multTable(int n)
	{
		double multTable[][] = new double[n][n];
		return multTable;
	}

	// display method for multiplicationTable and powerTable 	
	public static void display(double[][] x) {
		for (int r = 0; r < x.length; r++) {
			for (int c = 0; c < x[r].length; c++) {
				System.out.printf("%5.0f", x[r][c]);
			}
			System.out.println();
		}
	}

	//2. returns an array of strings from words that are 
	//more than 5 letters
	public static String[] vocab(String[][] words)
	{
		int i = 0;
		
		for (String[] j : words)
		{
			for (String x : j)
			{
				if (x.length() > 5)
				{
					i++;
				}
			}
		}
		
		String[] vocab = new String[i];
		int j = 0;
		
		for (String[] x : words)
		{
			for (String y : x)
			{
				if (y.length() > 5)
				{
					vocab[j++] = y;
				}
			}
		}
		
		return vocab;
	}
	//display method for  vocab	
	public static void display(String[] x)
	{
		for (String a:x)
				System.out.print(a + " ");
		System.out.println();
	}
	//3. returns a boolean array of true/false values for corresponding
	//values of  2 dim int array  x;
	public static boolean[][] isOdd(int[][] x)
	{
		boolean[][] i = new boolean[x.length][x[0].length];
		
		for (int a = 0; a < x.length; a++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				if (x[a][j] % 2 == 1)
				{
					i[a][j] = true;
				}
			}
		}
		
		return i;
	}

	//display method for isOdd	
	public static void display(boolean[][] x) 
	{
		for (int r = 0; r < x.length; r++) {
			for (int c = 0; c < x[r].length; c++) {
				System.out.printf("%7b",x[r][c]);
			}
			System.out.println();
		}
	}

	/* 4. Write a program that creates an integer power table where each element is equal to the row number raised to the power of the column number. The array returned  after buildTable(6,4)   will look like:     (4 points)     (125 = 5^3   5th row 3rd col)
	1		0		  0		0
	1		1		  1		1
	1		2		  4		8
	1		3		  9		27
	1		4		16		64
	1		5		25		125*/
	public static double[][] powerTable(int r, int c)
	{
		double[][] table = new double[r][c];
		
		for (int x = 0; x < table.length; x++)
		{
			for (int y = 0; y < table[x].length; y++)
			{
				table[x][y] = Math.pow(x,  y);
			}
		}
		
		return table;
	}

	public static void main(String[] args) 
	{
		display (multTable(9));
		System.out.println();
		
		String[][] fruits = {{"apple", "watermelon","kiwi"},
							{"lime", "banana", "apricot"},
							{"lemon", "papaya", "grapefruit"},
							{"pear", "mango", "starfruit"}};
		display(vocab(fruits));
		System.out.println();
		
		int[][] temp = {{1,2,3},
						{4,5,6},
						{7,8,9},
						{10,11,12}};
		display(isOdd(temp));
		System.out.println();
		
		display(powerTable(8,4));
	}

	/*
	OUTPUT:
	0    0    0    0    0    0    0    0    0
	0    1    2    3    4    5    6    7    8
	0    2    4    6    8   10   12   14   16
	0    3    6    9   12   15   18   21   24
	0    4    8   12   16   20   24   28   32
	0    5   10   15   20   25   30   35   40
	0    6   12   18   24   30   36   42   48
	0    7   14   21   28   35   42   49   56
	0    8   16   24   32   40   48   56   64

	watermelon banana apricot papaya grapefruit starfruit 

	true  false   true
	false   true  false
	true  false   true
	false   true  false

	1    0    0    0
	1    1    1    1
	1    2    4    8
	1    3    9   27
	1    4   16   64
	1    5   25  125
	1    6   36  216
	1    7   49  343

	*/
}
