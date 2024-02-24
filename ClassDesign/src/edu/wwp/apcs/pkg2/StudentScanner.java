package edu.wwp.apcs.pkg2;
import java.util.Scanner;

public class StudentScanner 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		System.out.print("Enter name of student: ");
		String name = key.next();
		
		System.out.print("Enter ID # of student: ");
		String ID = key.next();
		
		System.out.print("Enter # of credits to be added: ");
		int credits = key.nextInt();
		
		Student x = new Student();
		
		x.setName(name);
		x.setID(ID);
		x.addCredits(credits);
		
		System.out.println();
		
		System.out.println(x.toString());
	}
}
