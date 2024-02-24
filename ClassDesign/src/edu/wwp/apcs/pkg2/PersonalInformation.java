package edu.wwp.apcs.pkg2;

public class PersonalInformation 
{
	String name;
	String address;
	int age;
	String phoneNumber;
	
	public PersonalInformation(String name, String address, int age, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public static void main (String[] args)
	{
		PersonalInformation personal = new PersonalInformation("Amrit", "9 Hampton Court, West Windsor Township, NJ", 16, "609-275-5975");
		PersonalInformation family = new PersonalInformation("Navein", "14 Springford Rd, Limerick Township, PA", 16, "609-841-9397");
		PersonalInformation friend = new PersonalInformation("Vinay", "7 Hampton Court, West Windsor Township, NJ", 18, "609-472-5873");
	}
}
