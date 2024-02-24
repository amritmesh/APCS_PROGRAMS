package edu.wwp.apcs.pkg2;

public class Auto 
{
	int yearModel;
	String make;
	int speed;
	
	public Auto(int yearModel, String make)
	{
		this.yearModel = yearModel;
		this.make = make;
		speed = 0;
	}
	
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void accelerate()
	{
		speed += 5;
	}
	
	public void brake()
	{
		speed -= 5;
	}
	
	public static void main (String[] args)
	{
		Auto a = new Auto(2020, "Bugatti Chiron");
		Auto b = new Auto(2020, "Lamborghini Aventador");
		
		a.accelerate();
		System.out.println("New speed: " + a.getSpeed());
		a.accelerate();
		System.out.println("New speed: " + a.getSpeed());
		a.accelerate();
		System.out.println("New speed: " + a.getSpeed());
		a.accelerate();
		System.out.println("New speed: " + a.getSpeed());
		a.accelerate();
		System.out.println("After accelerating 5 times: ");
		System.out.println(a.getSpeed());

		a.brake();
		System.out.println("New speed: " + a.getSpeed());
		a.brake();
		System.out.println("New speed: " + a.getSpeed());
		a.brake();
		System.out.println("New speed: " + a.getSpeed());
		a.brake();
		System.out.println("New speed: " + a.getSpeed());
		a.brake();
		System.out.println("After braking 5 times: ");
		System.out.println(a.getSpeed());
	}
}