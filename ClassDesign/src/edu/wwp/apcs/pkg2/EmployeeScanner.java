package edu.wwp.apcs.pkg2;
import java.util.Scanner;

public class EmployeeScanner 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter name of employee: ");
		String name = key.next();
		
		System.out.print("Enter salary of employee: ");
		double salary = key.nextDouble();
		
		System.out.println();
		
		Employee x = new Employee(name, salary);
		System.out.println(x);
		
		System.out.println();

		System.out.print("Enter percent raise of employee (as an int): ");
		int raise = key.nextInt();
		
		System.out.println();

		x.calcRaise(raise);
		System.out.println(x);
		key.close();
	}
}
