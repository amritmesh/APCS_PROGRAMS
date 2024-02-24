package edu.wwp.apcs.pkg2;

public class CashRegister 
{
	private String cashierName;
	private double total;
	
	public CashRegister()
	{
		cashierName = "Bob";
		total = 0;
	}
	
	public CashRegister(String name, double initialTotal)
	{
		cashierName = name;
		total = initialTotal;
	}
	
	public void addToRegister(double totalSale)
	{
		total += totalSale;
	}
	
	public void changeName(String otherCashier)
	{
		cashierName = otherCashier;
	}
	
	public void setTotal(double newTotal)
	{
		total = newTotal;
	}
	
	public void combineRegister(CashRegister other)
	{
		total += other.total;
		other.total = 0;
	}
	
	public String getName()
	{
		return cashierName;
	}
	
	public double getTotal()
	{
		return total;
	}
	
	public double makeChange(double totalSale, double amountTendered)
	{
		this.addToRegister(totalSale);
		return amountTendered - totalSale;
	}
	
	public String toString()
	{
		return "Cashier: " + getName() + "\nTotal: " + "$" + getTotal();
	}
	
	public static void main(String[] args) 
	{
		CashRegister one = new CashRegister("Max", 56.10);
		
		one.addToRegister(14.25);
		one.changeName("Hank");
		one.setTotal(43.75);
		System.out.println(one.toString());
		
		System.out.println();
		
		CashRegister two = new CashRegister("Blake", 75.86);
		
		one.combineRegister(two);
		System.out.println("Name: " + one.getName());
		System.out.println("Total: " + "$" + one.getTotal());
		System.out.println("Change due: " + "$" + one.makeChange(23.75, 50.00));
	}
}
