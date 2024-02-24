package edu.wwp.apcs.pkg8;

public class Flight 
{
	public int distance;
	public Passenger[][] seats;
	
	//4. return the average miles of the all of passengers on the flight
	public double averageMiles()
	{
		int total = 0;
		int passCount = 0;
		
		for (Passenger[] x : seats)
		{
			for (Passenger y : x)
			{
				passCount++;
				
				if (y != null)
				{
					total += y.getMiles();
				}
			}
		}
		
		return total / passCount;
	}
	
	//5. This method determines if there are any window seats available. 
	//(Any open seats in the first or last column)
	//Return true if yes, false otherwise.
	public boolean isWindowSeatAvailable()
	{
		boolean windSeatsOrNot = false;
		
		for (Passenger[] x : seats)
		{
			int passCount = 0;

			for (Passenger y : x)
			{
				passCount++;
				
				if (passCount == 1 || passCount == x.length)
				{
					if (y != null)
					{
						windSeatsOrNot = false;
					}
					
					else
					{
						windSeatsOrNot = true;
						break;
					}
				}
			}
			
			break;
		}
		
		return windSeatsOrNot;
	}
	
	//6.This method will increase each passenger's total miles by the 
	//distance of the flight based on the following criteria. Add the 
	//distance to all passengers unless the passenger is a gold member 
	//(more than 100,000 miles) then add 3 times the distance.  
	public void updateMiles () 
	{
		for (Passenger[] x : seats)
		{
			for (Passenger y : x)
			{
				if (y != null)
				{
					if (y.getMiles() > 100000)
					{
						y.setMiles(y.getMiles() + (3 *distance));
					}
					
					else
					{
						y.setMiles(y.getMiles() + distance);
					}
				}
			}
		}
	}

}
