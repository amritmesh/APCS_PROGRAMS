package edu.wwp.apcs.pkg2;

public class Employee 
{
	String name;
	Double salary;
	
	public Employee()
	{
		name = "Elon Musk";
		salary = 100.0;
	}
	
	public Employee(String myName, double mySalary)
	{
		this.name = myName;
		this.salary = mySalary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void changeName(String newName)
	{
		name = newName;
	}
	
	public Double getSalary()
	{
		return salary;
	}
	
	public void changeSalary(Double newSalary)
	{
		salary = newSalary;
	}
	
	public String toString()
	{
		return "Employee: \n Name: " + getName() + "\n Salary: " + getSalary();
	}
	
	public void calcRaise(int byPercent)
	{
		salary =  salary + salary * (byPercent / 100.0);
	}
	
	public static void main(String[] args) 
	{
		Employee one = new Employee("Tim Cook", 12.75);
		
		System.out.println("NAME: " + one.getName());
		System.out.println("PAY: " + one.getSalary());
		
		one.changeName("Mark Zuckerberg");
		one.changeSalary(50.0);
		one.calcRaise(75);
		
		System.out.println();
		
		System.out.println("New salary: " + one.getSalary());
		
		System.out.println();
		
		System.out.println(one);
	}
}
