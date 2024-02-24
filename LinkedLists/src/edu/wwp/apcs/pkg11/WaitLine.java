package edu.wwp.apcs.pkg11;

import java.util.LinkedList;
import java.util.Scanner;

public class WaitLine 
{
	LinkedList<Patient> queue;
	
	public WaitLine()
	{
		queue = new LinkedList<Patient>();
	}
	
	public void addPatient(Patient a)
	{
		a.setEnterTime(System.currentTimeMillis());
		queue.addLast(a);
	}
	
	public void addPatient(String name)
	{
		Patient a = new Patient(name);
		a.setEnterTime(System.currentTimeMillis());
		queue.addLast(a);
	}
	
	public Patient nextInLine()
	{
		return queue.getFirst();
	}
	
	public void removePatient()
	{
		Patient a = queue.removeFirst();
		a.setExitTime(System.currentTimeMillis());
		System.out.println("Patient: " + a.getName());
		System.out.println("Wait Time: " + a.getWaitTime());
	}
	
	public long getAverageTime()
	{
		long total = 0;
		
		for (Patient a : queue)
		{
			total += a.getWaitTime();
		}
		
		return total / (long)queue.size();
	}
	
	public void displayQueue()
	{
		int c = 1;
		
		for (Patient x : queue)	
		{
			System.out.println(c++ + ". " + x);
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		WaitLine one = new WaitLine();
		Scanner key = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 5)
		{
			System.out.println("Menu");
			System.out.println("1. Add Patient");
			System.out.println("2. Remove Patient");
			System.out.println("3. Average Wait Time");
			System.out.println("4. Display Queue");
			System.out.println("5. End");
			System.out.println();
			System.out.print("Type 1, 2, 3, or 4: ");
			choice = key.nextInt();
			
			key.nextLine();
			
			if (choice == 1)
			{
				System.out.println();
				System.out.print("Enter Name: ");
				String name = key.nextLine();
				one.addPatient(new Patient(name));
				System.out.println("Patient added to end of queue");
				System.out.println();
			}
			
			else if (choice == 2)
			{
				System.out.println();
				System.out.println("The next patient is ");
				one.removePatient();
				System.out.println();
			}
			
			else if (choice == 3)
			{
				System.out.println();
				System.out.println("Average Wait Time: " + one.getAverageTime());
				System.out.println();
			}
			
			else if (choice == 4)
			{
				System.out.println();
				one.displayQueue();
			}
			
			else
			{
				break;
			}
		}
		
		key.close();
	}
}
