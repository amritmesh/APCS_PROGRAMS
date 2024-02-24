package edu.wwp.apcs.pkg8;

public class SatStudent 
{
	private String name;
	private int math;
	private int verbal;
	private int writing;

	public SatStudent(String myName, int myMath, int myVerbal, int myWriting)
	{
		name = myName;
		math = myMath;
		verbal = myVerbal;
		writing = myWriting;
	}
	
	public SatStudent()
	{
		this("Connolly", 670, 680, 700);
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMath()
	{
		return math;
	}
	
	public int getVerbal()
	{
		return verbal;
	}
	
	public int getWriting()
	{
		return writing;
	}
	
	public void setName(String myName)
	{
		name = myName;
	}
	
	public void setMath(int myMath)
	{
		math = myMath;
	}
	
	public void setVerbal(int myVerbal)
	{
		verbal = myVerbal;
	}
	
	public void setWriting(int myWriting)
	{
		writing = myWriting;
	}
	
	public int total()
	{
		return getMath() + getVerbal() + getWriting();
	}
	
	public String toString()
	{
		return "Math: " + getMath() + "\nVerbal: " + getVerbal() + "\nWriting: " + getWriting() + "\nTotal: " + total();
	}
}
