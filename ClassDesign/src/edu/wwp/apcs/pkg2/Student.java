package edu.wwp.apcs.pkg2;

public class Student 
{
	private String name;
	private String ID;
	private int credits;
	
	public Student()
	{
		name = "Bryce";
		ID = "93545227";
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setID(String ID)
	{
		this.ID = ID;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public void addCredits(int numCredits)
	{
		credits += numCredits;
	}
	
	public int getCredits()
	{
		return credits;
	}
	
	public String toString()
	{
		return("Name: " + name + "\n" + "ID #: " + ID + "\n" + "Credits: " + credits);
	}
	
	public static void main (String[] args)
	{
		Student one = new Student();
		
		System.out.println("Student 1");
		System.out.println("---------");
		System.out.println("Name: " + one.getName());
		System.out.println("ID: " + one.getID());
		System.out.println("Credits: " + one.getCredits());
		
		one.setName("Rob");
		one.setID("95632887");
		one.addCredits(25);
		
		System.out.println();

		System.out.println("New Student 1");
		System.out.println("---------");
		System.out.println("Name: " + one.getName());
		System.out.println("ID: " + one.getID());
		System.out.println("Credits: " + one.getCredits());
	}
}
