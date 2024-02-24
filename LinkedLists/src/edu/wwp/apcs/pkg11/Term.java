package edu.wwp.apcs.pkg11;

public class Term 
{
	private int coefficient;
	private int power;
	
	public Term (int myCoefficient, int myPower)
	{
		coefficient = myCoefficient;
		power = myPower;
	}
	
	public int getCoefficient()
	{
		return coefficient;
	}
	
	public int getPower()
	{
		return power;
	}
	
	public void setCoefficient(int newCoefficient)
	{
		coefficient = newCoefficient;
	}
	
	public void setPower(int newPower)
	{
		power = newPower;
	}
	
	public static Term add(Term a, Term b)
	{
		Term sum = new Term(a.getCoefficient() + b.getCoefficient(), a.getPower());
		return sum;
	}

	public static Term multiply(Term a, Term b)
	{
		Term product = new Term(a.getCoefficient() * b.getCoefficient(), a.getPower() + b.getPower());
		return product;
	}
	
	public String toString()
	{
		return coefficient + "x^" + power;
	}

	// if negative, passed term is greater power; if positive, passed term is lower power
	public int compareTo(Term other) 
	{
		return this.getPower() - (other).getPower();
	}
}
