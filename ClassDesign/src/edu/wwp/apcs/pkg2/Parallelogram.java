package edu.wwp.apcs.pkg2;

public class Parallelogram 
{
	private int base;
	private int height;
	private String position;
	
	public Parallelogram(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public double average()
	{
		return (double)(base + height)/2;
	}
	
	public void doubleParams()
	{
		base *= 2;
		height *= 2;
	}
	
	public void changeParams(int newBase, int newHeight)
	{
		base = newBase;
		height = newHeight;
	}
	
	public void changePos()
	{
		position = "(0, 0)";
	}
	
	public String toString()
	{
		return "Base: " + base + "\nHeight: " + height + "\nPosition: " + position;
	}
	
	public static void main(String[] args)
	{
		Parallelogram one = new Parallelogram(4, 5);
		
		System.out.println(one);
				
		System.out.println();
		
		one.changePos();
		System.out.println("Position: " + one.getPosition());
		
		
		System.out.println();

		one.doubleParams();
		System.out.println(one);

		System.out.println();
		
		System.out.println("Average: " + one.average());
		System.out.println("Height: " + one.getHeight());
		
		System.out.println();
		
		one.changeParams(6, 8);
		System.out.println(one.toString());
	}
}
