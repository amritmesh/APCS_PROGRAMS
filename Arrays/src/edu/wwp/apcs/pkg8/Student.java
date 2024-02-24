package edu.wwp.apcs.pkg8;

public class Student 
{

	// the student's full name
	private String name;
	// the student ID
	private String id;
	// the amount of credits for study taken so far
	private int credits;

	public Student() 
	{
		name = "Jane Doe";
		id = "89078";
		credits = 0;
	}
	/**
	 * Create a new student with a given name and ID number.
	 */
	public Student(String fullName, String studentID, int cred) 
	{
		name = fullName;
		id = studentID;
		credits = cred;
	}
	/**
	 * Return the full name of this student.
	 */
	public String getName() 
	{
		return name;
	}
	/**
	 * Set a new name for this student.
	 */
	public void changeName(String replacementName) 
	{
		name = replacementName;
	}
	/**
	 * Return the student ID of this student.
	 */
	public String getStudentID() 
	{
		return id;
	}
	/**
	 * Add some credit points to the student's accumulated credits.
	 */
	public void addCredits(int additionalPoints) 
	{
		credits += additionalPoints;
		// credits = credits + additionalPoints;
	}

	/**
	 * 7. Return the number of credit points this student has accumulated.
	 */
	public int getCredits() 
	{
		return credits;
	}
}
