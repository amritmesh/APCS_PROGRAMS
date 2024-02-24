package edu.wwp.apcs.pkg9;

public class Student 
{
	private String name;
	private String ID;
	private int credits;
	
	public Student(String fullName, String studentID)
	{
		name = fullName;
		ID = studentID;
		credits = 0;
	}
	
	public void addCredits(int additionalPoints)
	{
		credits += additionalPoints;
	}
	
	public void changeName(String replacementName)
	{
		name = replacementName;
	}
	
	public int getCredits()
	{
		return credits;
	}
	
	public String getLoginName()
	{
		return name.substring(0, 2) + " " + ID.substring(0, 2);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getStudentID()
	{
		return ID;
	}
	
	public String toString()
	{
		return name + "(" + ID + ")" + " " + credits + " credits";
	}
}
