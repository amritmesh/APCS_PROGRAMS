package edu.wwp.apcs.pkg8;

public class ArrayExample 
{
	private int[] numbArray;
	
	// 1. Constructs a default array of size 10
	public ArrayExample() 
	{
	numbArray = new int[10];
	numbArray[0] = 1;
	numbArray[1] = 3;
	numbArray[2] = 7;
	numbArray[3] = 19;
	numbArray[4] = 15;
	numbArray[5] = 19;
	numbArray[6] = 7;
	numbArray[7] = 3;
	numbArray[8] = 19;
	numbArray[9] = 48;
	}
	
	// 2. Constructs an array of random numbers (0-24) array of size count
	public ArrayExample(int count) 
	{
		numbArray = new int[count];
		
		for (int i = 0; i <= count - 1; i++)
		{
			numbArray[i] = (int)(Math.random() * 25);
		}
	}
	
	// 3. This method prints all of the elements of the array in list form
	public void display() 
	{
		for (int i = 0; i < numbArray.length; i++)
		{
			System.out.print(numbArray[i] + " ");
		}
		
		System.out.println();
	}
	
	// 4. This method prints all of the elements in reverse order
	public void displayReverse() 
	{
        for (int i = numbArray.length - 1; i >= 0; i--) 
        {
            System.out.println(numbArray[i] + " ");
        }
        
		System.out.println();
	}
	
	// 5. This method calculates and returns the average of all of the elements
	// The average of the default array is 14.1
	public double average()
	{
		double sum = 0; 
		
		for (int i = 0; i < numbArray.length; i++)
		{
			sum += numbArray[i];
		}
		
		return sum / numbArray.length;
	}
	
	// 6. This method returns the maximum value of all of the elements
	// The max of the default array is 48.
	public int findMax() 
	{
		int max = numbArray[0];
		
		for (int i = 1; i < numbArray.length; i++)
		{
			if (numbArray[i] > max)
			{
				max = numbArray[i];
			}
		}
		
		return max;
	}
	
	// 7. This method returns the index number of the first instance of int lookFor
	// returns -1 if not in the list
	// ex. Using the default array findIndex(15) will return 4
	public int linearSearch(int lookFor) 
	{
		for (int i = 0; i < numbArray.length; i++)
		{
			if (lookFor == numbArray[i])
			{
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	* 8. This method will print the elements and the tally. The list with the
	* default constructor will be
	* Number Frequency
	* LIST REVERSE AVERAGE
	*/
	public void tallyList()
	{
		int[] list = new int[findMax() + 1];
		
		for (int i = 0; i < numbArray.length; i++)
		{
			list[numbArray[i]]++;
		}
		
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] > 0)
			{
				System.out.println(i + "    " + list[i]);
			}
		}
	}
	
	/**
	9. This method will print a column of numbers in the original order,
	a column of numbers in reverse order, and the average of the two.
	default constructor will be
	LIST REVERSE AVERAGE
	1 48 24.5
	3 19 11.0
	7 3 5.0
	19 7 13.0
	15 19 17.0
	19 15 17.0
	7 19 13.0
	3 7 5.0
	19 3 11.0
	48 1 24.5 
	*/
	public void listReverseAvg() 
	{
		
	}
	
	// 10. This method will sort the array in ascending order
	//
	public void sort() 
	{
		for (int i = 0; i < numbArray.length; i++)
		{
			for (int j = i + 1; j < numbArray.length; j++)
			{
				if (numbArray[j] < numbArray[i])
				{
					int temp = numbArray[j];
					numbArray[j] = numbArray[i];
					numbArray[i] = temp;
				}
			}
		}
	}
	
	public void bubbleSort()
	{
		for (int i = 0; i < numbArray.length; i++)
		{
			for (int j = 0; j < numbArray.length - 1 - i; j++)
			{
				if (numbArray[j] > numbArray[j + 1])
				{
					int temp = numbArray[j];
					numbArray[j] = numbArray[j + 1];
					numbArray[j + 1] = temp;
				}
			}
		}
	}
	
	// 11. Binary Search. This method returns the index number of the first instance of int lookFor
	// returns -1 if not in the list. The Array must be sorted to use the Binary search
	// ex. Using the default array findIndex(15) will return 4
	public int binarySearch(int lookFor)
	{
		int low = 0; 
		int high  = numbArray.length - 1;
		
		while (low <= high)
		{
			int mid = low + (high - low) / 2;
			
			int diff = numbArray[mid] - lookFor;
			
			if (diff == 0)
			{
				return mid;
			}
			
			else if (diff < 0)
			{
				low = mid + 1;
			}
			
			else
			{
				high = mid - 1;
			}
		}
		
		return -1;
	}
	
	public void swap(int i, int j)
	{
		int temp = numbArray[i];
		numbArray[i] = numbArray[j];
		numbArray[j] = temp;
	}
	
    //#8  Create an array of 75 random integers between 1000 and 2000.  
    //After the array is created search through the list and count the even and odd numbers
	public static void randInts()
	{
		int e = 0;
		int o = 0; 
		
		int[] x = new int[75];
		
		for (int i = 0; i < x.length; i++)
		{
			x[i] = (int) ( Math.random() * (2001 - 100 + 1) + 100);
			
			if (x[i] % 2 ==0)
			{
				e++;
			}
			
			else
			{
				o++;
			}
			
			System.out.println("Even: " + e);
			System.out.println("Odd: " + o);
		}
	}
	
	//#9  Create an array of the first 20 prime numbers.  Print out the 5th and 10th
	public static void primes()
	{
		int c = 0;
		int primeC = 0;
		
		int[] x = new int[20];
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; i < x[i]; j++)
			{
				if (c % j == 0)
				{
					
					x[i] = c;
				}
			}
			
			System.out.println(x[i] + " ");
		}
	}
	
	public static int[] getOdds(int n)
	{
		int odd = 1;
		int[] odds = new int[n];
		
		for (int i = 0; i < n; i++) 
		{
			odds[i] = odd;
			odd += 2;
		}
		
		return odds;
	}
	
	public static int getMax(int[] numbers) 
	{
		int max = numbers[0];
		
		for (int x : numbers)
		{
			if (x > max)
			{
				max = x;
			}
		}
		
		return max;
	}
	
	public static String getMin(String[] words) 
	{
		String min = words[0];
		
		for (String x : words)
		{
			if (x.compareTo(min) < 0)
			{
				min = x;
			}
		}
		
		return min;
	}
	
	public boolean allPositive(double[] numbers) 
	{
		for (double x : numbers)
		{
			if (x < 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public int[] fibonacci(int n) 
	{
		int[] fib = new int[n];
		
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i = 2; i < n; i++)
		{
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		
		return fib;
	}
	
	// 12. Write a tester that will create a random array of size 50 and test all of these methods
	//
	public static void main(String[] args) 
	{
		ArrayExample one = new ArrayExample();
		
		ArrayExample two = new ArrayExample(5000);
		
		one.display();
		one.displayReverse();
		System.out.println(one.average());
		System.out.println(one.findMax());
		System.out.println(one.linearSearch(15));
		one.tallyList();
		one.swap(0, 9);
		one.sort();
		one.bubbleSort();
		
		randInts();
		
//		for (int i : fibonacci(7))
//		{
//			System.out.println(i + " ");
//		}
	}
}