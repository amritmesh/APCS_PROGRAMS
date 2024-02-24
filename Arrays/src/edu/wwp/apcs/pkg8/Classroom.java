package edu.wwp.apcs.pkg8;

import java.util.Random;

public class Classroom 
{
	//1. return the average credits of the class		
	public static double getAverageCredits(Student[][] myChart)
	{
		double sum = 0;
		
		for (int i = 0; i < myChart.length; i++)
		{
			for (int j = 0; j < myChart[0].length; j++)
			{
				sum += myChart[i][j].getCredits();
			}
		}
		
		return sum / myChart.length / myChart[0].length;
	}

	//2. returns the maximum value for credits in the class
	public static int getMaxCredits(Student[][] myChart)
	{
		int max = 0;
		
		for (Student[] x : myChart)
		{
			for (Student y : x)
			{
				if (y.getCredits() > max)
				{
					max = y.getCredits();
				}
			}
		}
		
		return max;
	}
	
	//3.  return the Student object with fullNme
	public static Student lookUp(Student[][] myChart, String fullName) 
	{	
		for (Student[] row : myChart)
		{
			for (Student x : row)
			{
				if (x.getName().equals(fullName))
				{
					return x;
				}
			}
		}
		
		return null;
	}

	//4. add additionaCredits to the Student with fullName. Return true if change is made. 
	//return false if Student is not in myChart
	public boolean addCredits (Student[][] myChart, String fullName, int additionalCredits)
	{
		for (Student[] row : myChart)
		{
			for (Student x : row)
			{
				if (x.getName().equals(fullName))
				{
					x.addCredits(additionalCredits);
					return true;
				}
			}
		}
		
		return false;	
	}
	
	//5. returns a one dimensional array of Student objects with zero credits
	public static Student[] getZeroCredits(Student[][] myChart)
	{
		int x = 0;
		
		for (int i = 0; i < myChart.length; i++)
		{
			for (int j = 0; j < myChart[0].length; j++)
			{
				if (myChart[i][j].getCredits() == 0)
				{
					x++;
				}
			}
		}
		
		Student[] zeroCredStudent = new Student[x];
		int y = 0;
		
		for (Student[] i : myChart)
		{
			for (Student j : i)
			{
				if (j.getCredits() == 0)
				{
					zeroCredStudent[y++] = j;
				}
			}
		}
		
		return zeroCredStudent;
	};
	
	public static void main(String[] args) 
	{
//		Student a = new Student("Mary Smith", "11011", 0);
//		Student b = new Student("Jorge Gonzalez", "21011", 32);
//		Student c = new Student("Arushi Patel", "31011", 32);
//		Student d = new Student("Dan Ye", "41011", 32);
//		Student e = new Student("Samhith Gupta", "51011", 32);
//		Student f = new Student("Jacob Evers", "61011", 42);
//		Student g = new Student("Sven Millers", "71011", 32);
//		Student h = new Student("Jackie Lu", "81011", 0);
//		Student i = new Student("Pooja Shah", "91011", 0);
//		Student[][]chart = new Student[][]{{a,b,c},{d,e,f},{g,h,i}};
//		
//		System.out.println("Avg: "+getAverageCredits(chart));
//		System.out.println("Max: "+getMaxCredits(chart));
//		System.out.println(addCredits(chart, "Dan Ye", 17));
//		System.out.println(lookUp(chart, "Dan Ye"));
//		Student[] freshman = getZeroCredits(chart);
//		for (Student x: freshman)
//			System.out.println (x);
//		display(chart);	
	}
}
