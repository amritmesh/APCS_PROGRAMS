package edu.wwp.apcs.pkg2;

public class StoreTester 
{
	public static void main(String[] args) 
	{
		Sneaker one = new Sneaker("Nike", 110.75, 68);
		System.out.printf("Current total value: $%.2f", one.totalVal());
		one.sell(5);
		one.buy(15);
		System.out.println();
		System.out.printf("Final total value: $%.2f", one.totalVal());
	}
}
