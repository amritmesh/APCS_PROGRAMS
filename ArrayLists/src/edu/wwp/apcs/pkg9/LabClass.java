package edu.wwp.apcs.pkg9;

import java.util.ArrayList;
import java.util.ListIterator;

public class LabClass 
{
	private String timeAndDay;
	private String room;
	private ArrayList<Student> students;
	private String instructor;
	
	public LabClass()
	{
		instructor = "unknown";
		room = "unknown";
		timeAndDay = "unknown";
		students = new ArrayList<Student>();
	}
		
	public void enrollStudent(Student newStudent)
	{
		int x = 0;
		
		for (int i = 0; i < students.size(); i++)
		{
			if (((students.get(i)).getStudentID()).compareTo(newStudent.getStudentID()) < 0)
			{
				x++;
			}
		}
		
		students.add(x, newStudent);
	}
	
	public int numberOfStudents()
	{
		return students.size();
	}
	
	public void printList()
	{
		ListIterator<Student> participantsIterator = students.listIterator();
		
		System.out.println("Time: " + timeAndDay + " Room: " + room + " Instructor name: " + instructor);
		
		while(participantsIterator.hasNext()) 
		{
			System.out.println(participantsIterator.next().toString());
		}
	}
	
	public void remove(String IDNum)
	{
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).getStudentID().equals(IDNum))
			{
				students.remove(i);
			}
		}
	}
	
	public void setInstructor(String instructorName)
	{
		instructor = instructorName;
	}
	
	public void setRoom(String roomNumber)
	{
		room = roomNumber;
	}
	
	public void setTime(String timeAndDayString)
	{
		timeAndDay = timeAndDayString;
	}
	
	public Student search(String lookForID)
	{
		for (int i = 0; i < students.size(); i++)
		{
			Student x = students.get(i);
			
			if (x.getStudentID().equals(lookForID))
			{
				return x;
			}
		}
		
		return null;
	}
	
	public double averageCredits()
	{
		double total = 0;
		
		for (Student i : students)
		{
			total += i.getCredits();
		}
		
		return total / students.size();
	}
	
	public Student maxCredits()
	{
		if (students.size() == 0)
		{
			return null;
		}
			
		Student max = (Student) students.get(0);
			
		for (int i = 1; i < students.size(); i++) 
		{
			Student x = (Student) students.get(i);
			
			if (x.getCredits() > max.getCredits())
			{
				max = x;
			}
		}
		
		return max;
	}
	
	public ArrayList<Student> underList(int cred)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		ListIterator<Student> participantsIterator = students.listIterator();
		
		while(participantsIterator.hasNext()) 
		{
			if(participantsIterator.next().getCredits() < cred) 
			{
				list.add(participantsIterator.next());
			}
		}
		
		return list;
	}
}
