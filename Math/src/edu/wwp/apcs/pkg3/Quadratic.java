package edu.wwp.apcs.pkg3;

public class Quadratic 
{
	int a;
	int b;
	int c;
	
	public Quadratic()
	{
		a = 4;
		b = 6;
		c = 2;
	}
	
	public Quadratic(int m, int n, int o)
	{
		a = m;
		b = n;
		c = o;
	}
	
	public boolean discriminant()
	{
		if (Math.pow(b, 2) - 4*a*c >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	public boolean discriminant1()
//	{
//		return (Math.pow(b, 2) - 4*a*c >= 0);
//	}
	
	public double root1()
	{
		return (double)((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
	}
	
	public double root2()
	{
		return (double)((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
	}
	
//	public static void main(String[] args)
//	{   
//	 Quadratic myEquation1 = new Quadratic(1,1,3); 
//	 Quadratic myEquation2 = new Quadratic(1,2,-24); 
//	 Quadratic myEquation3 = new Quadratic(2,7,-3); 
//	 if (myEquation1.discriminant())
//	  {
//	     System.out.println("The solutions of Equation 1 are "+myEquation1.root1());
//	     System.out.println("and  "+myEquation1.root2());   
//	  }
//	else
//	  {
//	      System.out.println("Equation 1 has No Real Solutions");     
//	  }
//
//	  if (myEquation2.discriminant())
//	 {
//	     System.out.println("The solutions of Equation 2 are "+myEquation2.root1());
//	     System.out.println("and  "+myEquation2.root2());   
//	  }
//	  else
//	  {
//	      System.out.println("Equation 2 has No Real Solutions");     
//	  }
//
//	  if (myEquation3.discriminant())
//	 {
//	     System.out.println("The solutions of Equation 3 are "+myEquation3.root1());
//	     System.out.println("and  "+myEquation3.root2());   
//	  }
//	  else
//	  {
//	      System.out.println("Equation 3 has No Real Solutions");     
//	  }
//	}
	
	public static void main(String[] args)
	{
		Quadratic one = new Quadratic(1, 3, -5);
		System.out.println("Has real solutions? " + one.discriminant());
		if (Boolean.compare(one.discriminant(), true) == 0)
		{
			System.out.println("Root 1: " + one.root1());
			System.out.println("Root 2: " + one.root2());
		}
		
		System.out.println();
		
		Quadratic two = new Quadratic(-1, 4, -7);
		System.out.println("Has real solutions? " + two.discriminant());
		if (Boolean.compare(two.discriminant(), true) == 0)
		{
			System.out.println("Root 1: " + two.root1());
			System.out.println("Root 2: " + two.root2());
		}
	}
}