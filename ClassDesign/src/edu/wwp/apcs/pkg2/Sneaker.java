package edu.wwp.apcs.pkg2;

public class Sneaker 
{
	String brand;
	double cost;
	int quantity;
	
	public Sneaker(String brand, double cost, int quantity)
	{
		this.brand = brand;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public double totalVal()
	{
		return quantity*cost;
	}
	
	public void sell(int numSneakers)
	{
		quantity -= numSneakers;
	}
	
	public void buy(int numSneakers)
	{
		quantity += numSneakers;
	}
}
