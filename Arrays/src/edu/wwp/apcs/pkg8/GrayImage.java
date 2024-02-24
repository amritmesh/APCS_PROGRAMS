package edu.wwp.apcs.pkg8;

public class GrayImage 
{
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	private int[][] pixelValues;
	
	public int countWhitePixels()
	{
		int numWhitePixels = 0;
		
		for (int i = 0; i < pixelValues.length; i++)
		{
			for (int j = 0; j < pixelValues[i].length; j++)
			{
				if (pixelValues[i][j] == WHITE)
				{
					numWhitePixels++;
				}
			}
		}
		
		return numWhitePixels;
	}
	
	public void processImage()
	{
		for (int i = 0; i < pixelValues.length - 2; i++)
		{
			for (int j = 0; j < pixelValues[i].length - 2; j++)
			{
				pixelValues[i][j] -= pixelValues[i + 2][j + 2];
				if (pixelValues[i][j] < BLACK)
				{
					pixelValues[i][j] = BLACK;
				}
			}
		}
	}
}
