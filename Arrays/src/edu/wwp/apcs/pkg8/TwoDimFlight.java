package edu.wwp.apcs.pkg8;

public class TwoDimFlight 
{
	//This class works as intended. Implementation not shown
	public class Passenger 
	{
		String name;
		int miles;
		
		public Passenger(String name, int miles) 
		{
			name = this.name;
			miles = this.miles;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			name = this.name;
		}
		public int getMiles() 
		{
			return miles;
		}
		public void setMiles(int miles) 
		{
			miles = this.miles;
		}
	}
		
	public class Flight 
	{
		public int distance;
		public Passenger[][] seats;
		
		//This method will add to each passenger's miles the distance of the flight
		//The flight might not be full
		public void updateMiles() 
		{
			for (Passenger[] x : seats)
			{
				for (Passenger y : x)
				{
					if (y != null)
					{
						y.setMiles(y.getMiles() + distance);
					}
				}
			}
		}
		
		//If the seat is open at the [row][col] position add the passenger	
		//If the seat is occupied find the first available seat.  (Use row major order)
		//return true if the passenger is added
		//return false if the passenger is not added (Plane is full)
		public boolean assignSeat(String name, int miles, int row,  int col)
		{
			if (seats[row][col] == null)
			{
				seats[row][col] = new Passenger (name, miles);
				return true;
			}
			
			for (int i = 0; i < seats.length; i++)
			{
				for (int y = 0; y < seats[i].length; y++)
				{
					if (seats[i][y] == null)
					{
						seats[i][y] = new Passenger(name, miles);
						return true;
					}
				}
			}
			
			return false;
		}
	}
}
