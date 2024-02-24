package edu.wwp.apcs.pkg11;

public class Patient 
{
	String name;
	long enterTime;
	long exitTime;
	
	public Patient(String myName)
	{
		name = myName;
		enterTime = 0;
		exitTime = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public long getEnterTime()
	{
		return enterTime;
	}
	
	public void setEnterTime(long newEnterTime)
	{
		enterTime = newEnterTime;
	}
	
	public long getExitTime()
	{
		return exitTime;
	}
	
	public void setExitTime(long newExitTime)
	{
		exitTime = newExitTime;
	}
	
	public long getWaitTime()
	{
		return (System.currentTimeMillis() - enterTime) / 1000;
	}
	
	public long getTotalTime()
	{
		return exitTime - enterTime;
	}
	
	public String toString()
	{
		return "Patient: " + name + " \nEnter time: " + enterTime + " \nExitTime: " + exitTime;
	}
	
	public static void main(String[] args)
	{
		Patient tc = new Patient("Connolly");
		tc.setEnterTime(System.currentTimeMillis());
		
		
		int t = 14;
		int s = 0;
		
		while (s != t)
		{
			s = (int)(Math.random() * 100000);
		}
		
		System.out.println(tc.getWaitTime());
	}
}
