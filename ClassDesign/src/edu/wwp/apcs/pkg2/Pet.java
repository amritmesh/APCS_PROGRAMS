package edu.wwp.apcs.pkg2;
import java.util.Scanner;

public class Pet 
{
	String name;
	String type;
	int age;
	
	public Pet(String name, String type, int age)
	{
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of your pet: ");
		String name = input.next();
		
		System.out.print("Enter the type of your pet: ");
		String type = input.next();
		
		System.out.print("Enter the age of your pet: ");
		int age = input.nextInt();
		
		Pet pet = new Pet(name, type, age);
		
		System.out.println();
		System.out.println("Pet Information");
		System.out.println("---------------");		
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Age: " + age);
	}
}
