package edu.wwp.apcs.pkg11;

import java.util.ArrayList;

//Tester class for person Hierarchy
public class BackToSchool
{
	public static void main (String args[])
	{
		Person bob = new Person("Coach Bob", 27, "M");
		Person lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
		Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
		Person ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(bob);
		people.add(lynne);
		people.add(mrJava);
		people.add(ima);
		
		double tot = 0;
		
		for( Person x: people)
		{
			System.out.println(x); 
			tot += x.getAge();
		}
		
		System.out.println("AverageAge: "+ tot/people.size());  
	}
}