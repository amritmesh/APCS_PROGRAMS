package edu.wwp.apcs.pkg9;

import java.util.ArrayList;

public class Fib
{
	ArrayList<Integer> data;
	
   	//4.  Constructor creates the ArrayList data that contains the first n integer Fibonacci.  (1,1,2,3,5,…
   	public Fib( int n) 
   	{
    	data = new ArrayList<Integer>();
    	
		data.add(1);
		data.add(1);
		
		for (int i = 2; i < n; i++) 
		{
			data.add( (i - 2) + (i - 1) );
		}
	}

   	//5. This method calculates the average of all of the number stored in ArrayList data.   
 	public double average()
 	{
   		double sum = 0;
   		
   		for( double x : data)
   		{
   			sum += x;
   		} 
   		
   		return sum/data.size();
 	 } 

 	//6. This method removes the even numbers from data.  Return true if any number is removed. Return false if nothing is removed
 
 	public boolean removeEvens()
 	{
		int place = 0;
		while (place < data.size()) 
		{
			if ( data.get(place) % 2 == 0) 
			{
				data.remove(place);
				place = -1;
				
				return true;
			}
			place++;
		}
		
		return false;
 	} 
}
