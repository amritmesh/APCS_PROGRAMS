package edu.wwp.apcs.pkg2;

public class RetailItem 
{
	String description;
	int unitsOnHand;
	double price;
	
	public RetailItem(String description, int unitsOnHand, double price)
	{
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	
	public void setUnitsOnHand(int unitsOnHand)
	{
		this.unitsOnHand = unitsOnHand;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public static void main (String[] args)
	{
		RetailItem one = new RetailItem("Jacket", 12, 59.95);
		RetailItem two = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem three = new RetailItem("Shirt", 20, 24.95);
	}
}
